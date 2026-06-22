package semantic.html_css_jinja2;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;
import ast.html_css_jinja2.HtmlDocumentRuleNode;
import ast.html_css_jinja2.helper_abstract.HtmlElementsJinjaBlockTemplate;
import ast.html_css_jinja2.htmlElements.html_content.HtmlElementNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaBodyNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaForNode;
import semantic.SemanticError;

/**
 * Semantic Analysis phase for the HTML / CSS / Jinja2 AST.
 *
 * It runs as a separate phase AFTER the AST + symbol tables are built:
 *   - structural, scope-free checks are computed here by walking the built tree
 *     (mismatched / missing closing tags),
 *   - scope-sensitive checks that were naturally produced while the Jinja symbol
 *     table was being built (duplicate HTML id, undefined Jinja variable) are
 *     read back from the builder and merged in, so this phase is the single
 *     place that reports every diagnostic.
 */
public class SemanticAnalyzer {

    private final List<SemanticError> errors = new ArrayList<>();

    /**
     * @param root            the built HTML/CSS/Jinja2 tree
     * @param builderFindings semantic findings already collected during AST build
     */
    public List<SemanticError> analyze(HtmlDocumentRuleNode root, List<SemanticError> builderFindings) {
        if (builderFindings != null) {
            errors.addAll(builderFindings);
        }
        if (root != null) {
            for (HtmlElementsJinjaBlockTemplate child : root.children) {
                walk(child);
            }
        }
        errors.sort((a, b) -> Integer.compare(a.line, b.line));
        return errors;
    }

    public List<SemanticError> getErrors() {
        return errors;
    }

    // ============================================================
    // Tree walk: structural HTML checks
    // ============================================================
    private void walk(BaseNode node) {
        if (node == null) {
            return;
        }

        if (node instanceof HtmlElementNode e) {
            checkClosingTag(e);
            for (BaseNode child : e.children) {
                walk(child);
            }
        } else if (node instanceof JinjaForNode f) {
            for (BaseNode child : f.body) {
                walk(child);
            }
            for (BaseNode child : f.elseBody) {
                walk(child);
            }
        } else if (node instanceof JinjaBodyNode b) {
            for (BaseNode child : b.children) {
                walk(child);
            }
        }
        // HtmlTextNode / Jinja expressions: leaves for this structural check
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
}
