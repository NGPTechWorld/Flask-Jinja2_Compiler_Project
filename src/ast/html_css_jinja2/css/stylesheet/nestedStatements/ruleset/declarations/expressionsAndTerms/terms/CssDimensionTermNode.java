package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;

//'10px', '1.5em', '2rem'.
public class CssDimensionTermNode extends CssTermNode {
    int line;
    String text;

    public CssDimensionTermNode(String name, int line, String text) {
        super(name, line);
        this.line = line;
        this.text = text;
    }

      public int getLine() { return line; }

    // TODO
    @Override
    public String toString() {
        return "CssDimensionTermNode{text='" + text + "'}";
    }
}
