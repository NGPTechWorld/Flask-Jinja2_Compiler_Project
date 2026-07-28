package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.calcFunctionNodes;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;

/**
 * Represents the multiplication and division level within a calc() expression.
 * e.g., (2 * 50px)
 */

public class CalcProductNode extends CssNode {
    int line;
    List<CalcValueNode> values = new ArrayList<>();
    List<String> operators = new ArrayList<>(); // '*' or '/'

    public CalcProductNode(String name, int line) {
        super(name, line);
        this.line = line;
    }

    public void addValue(CalcValueNode value) {
        this.values.add(value);
    }

    public void addOperatorAndValue(String operator, CalcValueNode value) {
        this.operators.add(operator);
        this.values.add(value);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            sb.append(values.get(i).toString(0));
            if (i < operators.size()) {
                sb.append(" ").append(operators.get(i)).append(" ");
            }
        }
        return sb.toString();
    }

}