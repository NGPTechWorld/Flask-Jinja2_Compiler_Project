package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.terms.calcFunctionNodes;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.terms.helper_abstract.CssTermNode;

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

    // TODO indent
    @Override
    public String toString() {
        return "CssCalcTermNode{expression=" + expression + "}";
    }
}
