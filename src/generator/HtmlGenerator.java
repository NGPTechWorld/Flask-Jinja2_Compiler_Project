package generator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.misc.Pair;

import ast.BaseNode;
import ast.html_css_jinja2.HtmlDocumentRuleNode;
import ast.html_css_jinja2.htmlElements.HtmlAttributeNode;
import ast.html_css_jinja2.htmlElements.html_content.HtmlCommentNode;
import ast.html_css_jinja2.htmlElements.html_content.HtmlElementNode;
import ast.html_css_jinja2.htmlElements.html_content.HtmlTextNode;
import ast.html_css_jinja2.jinjaBlock.Jinja2_comment.Jinja2CommentNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaBodyNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaForNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaIfNode;
import generator.runtime.Scope;


public class HtmlGenerator {
    /** Inline tags stay on the same line as the text around them. */
    private static final Set<String> INLINE = Set.of(
            "a", "span", "i", "b", "strong", "em", "small", "code",
            "label", "br", "img", "sup", "sub", "u", "s");

    private final JinjaEvaluator evaluator = new JinjaEvaluator();
    private final RouteMap routes = new RouteMap();
    private final List<String> log = new ArrayList<>();

    public List<String> getLog() {
        return log;
    }

    public List<String> getWarnings() {
        return evaluator.getWarnings();
    }

    public String generate(HtmlDocumentRuleNode document, Scope context) {
        StringBuilder out = new StringBuilder();
        // The AST drops the DTD token, so it is re-emitted here.
        out.append("<!DOCTYPE html>");
        for (BaseNode child : document.children) {
            render(child, context, out, 0);
        }
        return out.toString();
    }

    private void render(BaseNode node, Scope scope, StringBuilder out, int depth) {
        if (node == null) {
            return;
        }

        // ---- plain text -------------------------------------------
        if (node instanceof HtmlTextNode text) {
            out.append(text.text);
            return;
        }

        // ---- <div class="x"> ... </div> ---------------------------
        if (node instanceof HtmlElementNode element) {
            renderElement(element, scope, out, depth);
            return;
        }

        // ---- <!-- kept in the output --> --------------------------
        if (node instanceof HtmlCommentNode comment) {
            out.append(comment.content);
            return;
        }

        // ---- {# dropped from the output #} ------------------------
        if (node instanceof Jinja2CommentNode) {
            return;
        }

        // ---- {% for %} --------------------------------------------
        if (node instanceof JinjaForNode loop) {
            renderFor(loop, scope, out, depth);
            return;
        }

        // ---- {% if %} ---------------------------------------------
        if (node instanceof JinjaIfNode branch) {
            renderIf(branch, scope, out, depth);
            return;
        }

        // ---- a body wrapper ---------------------------------------
        if (node instanceof JinjaBodyNode body) {
            for (BaseNode child : body.children) {
                render(child, scope, out, depth);
            }
            return;
        }

        // ---- {{ anything }} : every expression class lands here ----
        if (node instanceof JinjaExpression expression) {
            out.append(escape(JinjaEvaluator.stringify(evaluator.eval(expression, scope))));
            return;
        }

        log.add("line " + node.line + ": skipped "
                + node.getClass().getSimpleName() + " (not handled by the generator)");
    }

    private void renderElement(HtmlElementNode element, Scope scope, StringBuilder out, int depth) {
        boolean block = !INLINE.contains(element.tagName.toLowerCase());
        if (block) {
            newlineIndent(out, depth);
        }

        out.append("<").append(element.tagName);
        for (HtmlAttributeNode attribute : element.attributes) {
            out.append(" ").append(attribute.name);
            if (attribute.value != null) {
                String value = evaluator.interpolate(attribute.value, scope, attribute.line);
                out.append("=\"").append(escapeAttribute(route(attribute.name, value, attribute.line)))
                        .append("\"");
            }
        }

        if (element.selfClosing) {
            out.append(" />");
            return;
        }
        out.append(">");

        // Break the line only when a child is itself a block element.
        boolean multiline = block && hasBlockChild(element.children);
        for (BaseNode child : element.children) {
            render(child, scope, out, multiline ? depth + 1 : depth);
        }
        if (multiline) {
            newlineIndent(out, depth);
        }
        // NOTE: endTagName carries the line number appended to it, so the
        // closing tag is rebuilt from tagName.
        out.append("</").append(element.tagName).append(">");
    }

    /** Maps a Flask route onto the static file this generator emits. */
    private String route(String attributeName, String value, int line) {
        String rewritten;
        if (attributeName.equalsIgnoreCase("href")) {
            rewritten = routes.rewriteNavigation(value);
        } else if (attributeName.equalsIgnoreCase("action")) {
            rewritten = routes.rewriteSubmission(value);
        } else {
            return value;
        }
        if (!rewritten.equals(value)) {
            log.add("line " + line + ": route " + value + " -> " + rewritten);
        }
        return rewritten;
    }

    /** A for/if block can expand into block elements, so it counts as one. */
    private boolean hasBlockChild(List<BaseNode> children) {
        for (BaseNode child : children) {
            if (child instanceof HtmlElementNode e && !INLINE.contains(e.tagName.toLowerCase())) {
                return true;
            }
            if (child instanceof JinjaForNode || child instanceof JinjaIfNode) {
                return true;
            }
        }
        return false;
    }

    private void newlineIndent(StringBuilder out, int depth) {
        if (out.length() > 0) {
            out.append("\n");
        }
        out.append("  ".repeat(depth));
    }

    private void renderFor(JinjaForNode loop, Scope scope, StringBuilder out, int depth) {
        Object iterable = evaluator.eval(loop.iterable, scope);
        List<Object> items = toList(iterable);

        if (items.isEmpty()) {
            for (BaseNode child : loop.elseBody) {
                render(child, scope, out, depth);
            }
            log.add("line " + loop.line + ": for-loop over an empty value, else branch used");
            return;
        }

        int emitted = 0;
        for (int i = 0; i < items.size(); i++) {
            Scope iteration = scope.child(); // a fresh scope per pass
            bindLoopVariables(loop, items.get(i), iteration);
            iteration.set("loop", loopMetadata(i, items.size()));

            // {% for p in products if p.price > 100 %}
            if (loop.ifCondition != null
                    && !JinjaEvaluator.truthy(evaluator.eval(loop.ifCondition, iteration))) {
                continue;
            }
            for (BaseNode child : loop.body) {
                render(child, iteration, out, depth);
            }
            emitted++;
        }
        log.add("line " + loop.line + ": expanded for-loop " + emitted + " time(s)");
    }

    private void bindLoopVariables(JinjaForNode loop, Object item, Scope target) {
        if (loop.variables.size() == 1) {
            target.set(loop.variables.get(0), item);
            return;
        }
        // {% for key, value in ... %}
        List<Object> parts = toList(item);
        for (int v = 0; v < loop.variables.size(); v++) {
            target.set(loop.variables.get(v), v < parts.size() ? parts.get(v) : null);
        }
    }

    /** Supports loop.index, loop.first, loop.last ... just like real Jinja. */
    private Map<String, Object> loopMetadata(int i, int total) {
        Map<String, Object> meta = new LinkedHashMap<>();
        meta.put("index", i + 1);
        meta.put("index0", i);
        meta.put("first", i == 0);
        meta.put("last", i == total - 1);
        meta.put("length", total);
        return meta;
    }

    private void renderIf(JinjaIfNode branch, Scope scope, StringBuilder out, int depth) {
        if (JinjaEvaluator.truthy(evaluator.eval(branch.ifCondition, scope))) {
            renderBody(branch.bodyIf, scope, out, depth);
            return;
        }
        for (Pair<JinjaExpression, JinjaBodyNode> elif : branch.elseIfStat) {
            if (JinjaEvaluator.truthy(evaluator.eval(elif.a, scope))) {
                renderBody(elif.b, scope, out, depth);
                return;
            }
        }
        if (branch.bodyElse != null) {
            renderBody(branch.bodyElse, scope, out, depth);
        }
    }

    private void renderBody(JinjaBodyNode body, Scope scope, StringBuilder out, int depth) {
        if (body == null) {
            return;
        }
        for (BaseNode child : body.children) {
            render(child, scope, out, depth);
        }
    }

    private List<Object> toList(Object value) {
        if (value instanceof List<?> list) {
            return new ArrayList<>(list);
        }
        if (value instanceof Map<?, ?> map) {
            return new ArrayList<>(map.keySet()); // Python iterates dict keys
        }
        List<Object> single = new ArrayList<>();
        if (value != null) {
            single.add(value);
        }
        return single;
    }

    /** Jinja auto-escapes .html templates; mirror that. */
    private static String escape(String text) {
        return text.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
    }

    private static String escapeAttribute(String text) {
        return escape(text).replace("\"", "&quot;");
    }
}
