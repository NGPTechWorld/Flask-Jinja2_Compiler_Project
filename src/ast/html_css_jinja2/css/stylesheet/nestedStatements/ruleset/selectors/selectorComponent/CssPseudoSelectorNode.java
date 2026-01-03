package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.CssExpressionNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.helper_abstract.CssSelectorComponentNode;

public class CssPseudoSelectorNode extends CssSelectorComponentNode {

    int line;
    String name; // e.g., 'hover', 'before'
    boolean isElement; // true for '::', false for ':'
    CssExpressionNode expression; // null if not a functional pseudo

    public CssPseudoSelectorNode(String name, int line, boolean isElement, CssExpressionNode expression) {
        super(name, line);
        this.name = name;
        this.line = line;
        this.isElement = isElement;
        this.expression = expression;
    }

    // TODO indent
    @Override
    public String toString() {
        return "CssPseudoSelectorNode{" +
                "name='" + name + '\'' +
                ", isElement=" + isElement +
                ", expression=" + expression +
                '}';
    }
}
