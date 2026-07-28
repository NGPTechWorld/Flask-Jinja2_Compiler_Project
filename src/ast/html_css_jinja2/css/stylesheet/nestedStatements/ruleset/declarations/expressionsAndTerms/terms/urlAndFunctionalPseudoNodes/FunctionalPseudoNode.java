package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.urlAndFunctionalPseudoNodes;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.CssExpressionNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.helper_abstract.CssSelectorComponentNode;

/**
 * Represents a functional pseudo-class or pseudo-element, like
 * :nth-child(2n+1).
 */
public class FunctionalPseudoNode extends CssSelectorComponentNode {
    int line;
    String name; // e.g., 'nth-child'
    CssExpressionNode expression; // The arguments to the function

    public FunctionalPseudoNode(String name, int line, CssExpressionNode expression) {
        super(name, line);
        this.line = line;
        this.name = name;
        this.expression = expression;
    }



    @Override
    public String toString(int indent) {
        return ":" + name + "(" + expression.toString(0) + ")";
    }
}
