package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.terms.helper_abstract.CssTermNode;

public class CssPercentageTermNode extends CssTermNode {
    int line;
    String text;

    public CssPercentageTermNode(String name, int line, String text) {
        super(name, line);
        this.line = line;
        this.text = text;
    }
      public int getLine() { return line; }


    // ! TODO indent
    @Override
    public String toString() {
        return "CssPercentageTermNode{text='" + text + "'}";
    }

}
