package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.terms.helper_abstract.CssTermNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.terms.urlAndFunctionalPseudoNodes.CssUrlNode;

// url() function term.
public class CssUrlTermNode extends CssTermNode {

    int line;
    CssUrlNode url;

    public CssUrlTermNode(String name, int line, CssUrlNode url) {
        super(name, line);
        this.line = line;
        this.url = url;
    }
    //TODO indent
    @Override
    public String toString() {
        return "CssUrlTermNode{url=" + url + "}";
    }

}
