package semantic.html_css_jinja2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.misc.Pair;

import ast.BaseNode;
import ast.html_css_jinja2.HtmlDocumentRuleNode;
import ast.html_css_jinja2.helper_abstract.HtmlElementsJinjaBlockTemplate;
import ast.html_css_jinja2.htmlElements.HtmlAttributeNode;
import ast.html_css_jinja2.htmlElements.html_content.HtmlElementNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.JinjaListLiteral;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaExprTrailer.JinjaAttributeAccess;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaExprTrailer.JinjaCallExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaExprTrailer.JinjaSubscriptExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaIdentifier;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.helper_abstract.JinjaBinaryExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.unaryExpression.JinjaUnaryExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaBodyNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaForNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaIfNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtIdentifier;
import semantic.SemanticError;

/**
 * Semantic Analysis phase for the HTML / CSS / Jinja2 AST.
 *
 * Mirrors the Python analyzer: it is a fully separate pass that walks the AST
 * built by {@code ASTBuilderVisitor2} and produces every diagnostic itself. The
 * builder only produces the AST and the symbol tables; it performs no checks.
 *
 * Detected issues:
 *   1. Duplicate HTML id.
 *   2. CSS class used in markup but never defined by a CSS rule.
 *   3. Undefined Jinja2 variable (scope-aware: backend context + for-loop vars).
 *   4. Mismatched closing tag.
 *   5. Missing closing tag.
 */
public class SemanticAnalyzer {

    private static final Set<String> JINJA_BUILTINS = new HashSet<>(Arrays.asList(
            "loop", "range", "namespace", "dict", "lipsum", "cycler", "none", "true", "false"));

    private final List<SemanticError> errors = new ArrayList<>();
    private final Set<String> seenIds = new HashSet<>();
    private Set<String> definedCssClasses = new HashSet<>();

    // Scope stack for Jinja variable resolution (innermost last).
    private final Deque<Set<String>> jinjaScopes = new ArrayDeque<>();

    /**
     * @param root           the built HTML/CSS/Jinja2 tree
     * @param definedClasses class names defined by the CSS rules (from the builder)
     * @param backendData    context variables exported by the Python side (data link)
     */
    public List<SemanticError> analyze(HtmlDocumentRuleNode root,
                                       Set<String> definedClasses,
                                       Set<String> backendData) {
        if (definedClasses != null) {
            this.definedCssClasses = definedClasses;
        }

        // Global Jinja scope = backend context + Jinja builtins.
        Set<String> global = new HashSet<>(JINJA_BUILTINS);
        if (backendData != null) {
            global.addAll(backendData);
        }
        jinjaScopes.push(global);

        if (root != null) {
            for (HtmlElementsJinjaBlockTemplate child : root.children) {
                walk(child);
            }
        }

        jinjaScopes.pop();
        errors.sort((a, b) -> Integer.compare(a.line, b.line));
        return errors;
    }

    public List<SemanticError> getErrors() {
        return errors;
    }

    // ============================================================
    // Structural walk
    // ============================================================
    private void walk(BaseNode node) {
        if (node == null) {
            return;
        }

        if (node instanceof HtmlElementNode e) {
            checkAttributes(e);
            checkClosingTag(e);
            for (BaseNode child : e.children) {
                walk(child);
            }
        } else if (node instanceof JinjaForNode f) {
            walkFor(f);
        } else if (node instanceof JinjaIfNode i) {
            walkIf(i);
        } else if (node instanceof JinjaBodyNode b) {
            walkBody(b);
        } else if (node instanceof JinjaExpression expr) {
            // a bare {{ expression }} embedded in the markup
            checkJinjaExpr(expr);
        }
        // HtmlTextNode, comments, stylesheet: nothing to check here
    }

    private void walkBody(JinjaBodyNode body) {
        if (body != null) {
            for (BaseNode child : body.children) {
                walk(child);
            }
        }
    }

    private void walkFor(JinjaForNode f) {
        // iterable is evaluated in the OUTER scope
        checkJinjaExpr(f.iterable);

        // loop variables (and `loop`) are visible in the filter + body
        Set<String> scope = new HashSet<>(f.variables);
        scope.add("loop");
        pushScope(scope);
        if (f.ifCondition != null) {
            checkJinjaExpr(f.ifCondition);
        }
        for (BaseNode child : f.body) {
            walk(child);
        }
        popScope();

        // else body runs when the iterable is empty: outer scope
        for (BaseNode child : f.elseBody) {
            walk(child);
        }
    }

    private void walkIf(JinjaIfNode i) {
        checkJinjaExpr(i.ifCondition);
        walkBody(i.bodyIf);
        for (Pair<JinjaExpression, JinjaBodyNode> elif : i.elseIfStat) {
            checkJinjaExpr(elif.a);
            walkBody(elif.b);
        }
        walkBody(i.bodyElse);
    }

    // ============================================================
    // HTML attribute checks (duplicate id + undefined css class)
    // ============================================================
    private void checkAttributes(HtmlElementNode e) {
        for (HtmlAttributeNode attr : e.attributes) {
            if (attr.name == null || attr.value == null) {
                continue;
            }
            if (attr.name.equalsIgnoreCase("id")) {
                if (!seenIds.add(attr.value)) {
                    errors.add(SemanticError.error(
                            "HTML",
                            "Duplicate id '" + attr.value + "' (already declared)",
                            attr.line));
                }
            } else if (attr.name.equalsIgnoreCase("class")) {
                for (String c : attr.value.split("\\s+")) {
                    if (!c.isEmpty() && !definedCssClasses.contains(c)) {
                        errors.add(SemanticError.warning(
                                "CSS",
                                "Class '" + c + "' is used but not defined in any CSS rule",
                                attr.line));
                    }
                }
            }
        }
    }

    private void checkClosingTag(HtmlElementNode e) {
        if (e.selfClosing) {
            return;
        }

        // endTagName is "No End Tag" or "<name> <line>" (see ASTBuilderVisitor2)
        if (e.endTagName == null || e.endTagName.equals("No End Tag")) {
            errors.add(SemanticError.error(
                    "HTML",
                    "Missing closing tag for '<" + e.tagName + ">'",
                    e.line));
            return;
        }

        String[] parts = e.endTagName.trim().split("\\s+");
        String closeName = parts[0];
        int closeLine = e.line;
        if (parts.length > 1) {
            try {
                closeLine = Integer.parseInt(parts[1]);
            } catch (NumberFormatException ignored) {
                // keep the opening line
            }
        }

        if (!closeName.equals(e.tagName)) {
            errors.add(SemanticError.error(
                    "HTML",
                    "Mismatched closing tag: '<" + e.tagName + ">' is closed by '</" + closeName + ">'",
                    closeLine));
        }
    }

    // ============================================================
    // Jinja expression checks (undefined variable, scope-aware)
    // ============================================================
    private void checkJinjaExpr(JinjaExpression expr) {
        if (expr == null) {
            return;
        }

        if (expr instanceof JinjaIdentifier id) {
            checkName(id.name, id.line);
        } else if (expr instanceof JinjaStmtIdentifier sid) {
            checkName(sid.name, sid.line);
        } else if (expr instanceof JinjaAttributeAccess a) {
            checkJinjaExpr(a.base); // the attribute name itself is not a variable
        } else if (expr instanceof JinjaSubscriptExpression s) {
            checkJinjaExpr(s.base);
            checkJinjaExpr(s.index);
        } else if (expr instanceof JinjaCallExpression c) {
            checkJinjaExpr(c.callee);
            for (JinjaExpression arg : c.arguments) {
                checkJinjaExpr(arg);
            }
        } else if (expr instanceof JinjaBinaryExpression b) {
            checkJinjaExpr(b.left);
            checkJinjaExpr(b.right);
        } else if (expr instanceof JinjaUnaryExpression u) {
            checkJinjaExpr(u.operand);
        } else if (expr instanceof JinjaListLiteral l) {
            for (JinjaExpression el : l.elements) {
                checkJinjaExpr(el);
            }
        }
        // plain literals: nothing to resolve
    }

    private void checkName(String name, int line) {
        if (name == null || isInScope(name)) {
            return;
        }
        errors.add(SemanticError.warning(
                "Jinja",
                "Variable '" + name + "' is not defined",
                line));
    }

    // ============================================================
    // Jinja scope helpers
    // ============================================================
    private void pushScope(Collection<String> names) {
        jinjaScopes.push(new LinkedHashSet<>(names));
    }

    private void popScope() {
        jinjaScopes.pop();
    }

    private boolean isInScope(String name) {
        for (Set<String> scope : jinjaScopes) {
            if (scope.contains(name)) {
                return true;
            }
        }
        return false;
    }
}
