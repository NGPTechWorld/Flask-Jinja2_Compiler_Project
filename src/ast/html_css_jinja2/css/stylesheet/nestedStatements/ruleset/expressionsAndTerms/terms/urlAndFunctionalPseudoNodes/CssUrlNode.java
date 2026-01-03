package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.terms.urlAndFunctionalPseudoNodes;

import ast.html_css_jinja2.css.helper_abstract.CssNode;

public class CssUrlNode extends CssNode {
    int line;
    String url; // The URL string, without quotes.
    boolean wasQuoted; // To know if the original source had quotes

    public CssUrlNode(String name, int line, String url, boolean wasQuoted) {
        super(name, line);
        this.line = line;
        this.url = url;
        this.wasQuoted = wasQuoted;
    }

    // TODO indent
    @Override
    public String toString() {
        return "CssUrlNode{url='" + url + "', wasQuoted=" + wasQuoted + "}";
    }
}
