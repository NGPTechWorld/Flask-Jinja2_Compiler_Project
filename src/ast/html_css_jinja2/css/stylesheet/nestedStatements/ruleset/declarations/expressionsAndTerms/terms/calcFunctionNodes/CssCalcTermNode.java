package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.calcFunctionNodes;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;

/**
 * A wrapper node for the entire calc() expression.
 */

public class CssCalcTermNode extends CssTermNode {
    int line;
    CalcSumNode expression;

    public CssCalcTermNode(String name, int line, CalcSumNode expression) {
        super(name, line);
        this.line = line;
        this.expression = expression;
    }

    @Override
    public String toString(int indent) {
        return "calc(" + expression.toString(0) + ")";
    }
}
