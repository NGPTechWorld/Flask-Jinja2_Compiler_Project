package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.calcFunctionNodes;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;

/**
 * Represents the top level of a calc() expression, handling addition and
 * subtraction.
 * e.g., (100% - 80px)
 */

public class CalcSumNode extends CssNode {
    int line;
    List<CalcProductNode> products = new ArrayList<>();
    List<String> operators = new ArrayList<>(); // '+' or '-'

    public CalcSumNode(String name, int line) {
        super(name, line);
        this.line = line;
    }

    public void addProduct(CalcProductNode product) {
        this.products.add(product);
    }

    public void addOperatorAndProduct(String operator, CalcProductNode product) {
        this.operators.add(operator);
        this.products.add(product);
    }

    public int getLine() {
        return line;
    }

    // REVIEW indent
    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            sb.append(products.get(i).toString(0));
            if (i < operators.size()) {
                sb.append(" ").append(operators.get(i)).append(" ");
            }
        }
        return sb.toString();
    }

}
