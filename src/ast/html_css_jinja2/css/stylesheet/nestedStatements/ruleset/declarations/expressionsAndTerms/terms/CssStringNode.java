package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;

public class CssStringNode extends CssTermNode {
    int line;
    String value; // The string without quotes

    public CssStringNode(String name, int line, String value) {
        super(name, line);
        this.line = line;
        this.value = value;
    }
    //TODO indent
    @Override
    public String toString() {
        return "CssStringNode{value='" + value + "'}";
    }

}
