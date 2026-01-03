package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;

public class CssExpressionNode extends CssNode {
    int line;
    List<CssTermNode> terms = new ArrayList<>();
    List<String> operators = new ArrayList<>(); // '/', ',', or ' '

    public CssExpressionNode(String name, int line) {
        super(name, line);
    }

    public void addTerm(CssTermNode term) {
        this.terms.add(term);
    }

    public void addOperatorAndTerm(String operator, CssTermNode term) {
        this.operators.add(operator);
        this.terms.add(term);
    }

    // TODO
    @Override
    public String toString() {
        return "CssExpressionNode{" +
                "terms=" + terms +
                ", operators=" + operators +
                '}';
    }

}
