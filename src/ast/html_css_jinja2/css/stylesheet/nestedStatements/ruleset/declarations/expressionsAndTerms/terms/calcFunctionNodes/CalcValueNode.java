package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.calcFunctionNodes;

import ast.html_css_jinja2.css.helper_abstract.CssNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.CssDimensionTermNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.CssNumberNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.CssPercentageTermNode;

/**
 * Represents a single value within a calc() expression.
 * Can be a number, dimension, percentage, or a nested calc sum.
 */

public class CalcValueNode extends CssNode {
    int line;
    CssNumberNode number;
    CssDimensionTermNode dimension;
    CssPercentageTermNode percentage;
    CalcSumNode nestedCalc;

    // public CalcValueNode(String name, int line) {
    // super(name, line);
    // }

    // Private constructor to enforce use of static factory methods
    private CalcValueNode(int line) {
        super("CalcValueNode", line);
        this.line = line;
        this.number = null;
        this.dimension = null;
        this.percentage = null;
        this.nestedCalc = null;
    }

    public static CalcValueNode fromNumber(CssNumberNode number) {
        CalcValueNode node = new CalcValueNode(number.getLine());
        node.number = number;
        return node;
    }

    public static CalcValueNode fromDimension(CssDimensionTermNode dimension) {
        CalcValueNode node = new CalcValueNode(dimension.getLine());
        node.dimension = dimension;
        return node;
    }

    public static CalcValueNode fromPercentage(CssPercentageTermNode percentage) {
        CalcValueNode node = new CalcValueNode(percentage.getLine());
        node.percentage = percentage;
        return node;
    }

    public static CalcValueNode fromNestedCalc(CalcSumNode nestedCalc) {
        CalcValueNode node = new CalcValueNode(nestedCalc.getLine());
        node.nestedCalc = nestedCalc;
        return node;
    }

    // TODO indent
    @Override
    public String toString() {
        return "CalcValueNode{" +
                "number=" + number +
                ", dimension=" + dimension +
                ", percentage=" + percentage +
                ", nestedCalc=" + nestedCalc +
                '}';
    }
}
