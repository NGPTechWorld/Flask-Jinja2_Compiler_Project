package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.CssExpressionNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.terms.helper_abstract.CssTermNode;

// a generic CSS function term like rgb(), rgba(), translateX(),
public class CssFunctionTermNode extends CssTermNode {
    int line;
    String name; // The function name, e.g., 'rgb', 'translateX'
    CssExpressionNode parameters; // The expressions inside the parentheses

    public CssFunctionTermNode(String name, int line, CssExpressionNode parameters) {
        super(name, line);
        this.line = line;
        this.name = name;
        this.parameters = parameters;
    }
    //TODO indent
    @Override
    public String toString() {
        return "CssFunctionTermNode{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                '}';
    }

}
