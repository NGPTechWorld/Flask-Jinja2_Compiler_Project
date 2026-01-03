package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;

public class CssNumberNode extends CssTermNode {
    int line;
    String text; // i set it string to preserve original format (e.g., 10, 10.0, .5)

    public CssNumberNode(String name, int line, String text) {
        super(name, line);
        this.line = line;
        this.text = text;
    }
      public int getLine() { return line; }

    // TODO indent
    @Override
    public String toString() {
        return "CssNumberNode{text='" + text + "'}";
    }

}
