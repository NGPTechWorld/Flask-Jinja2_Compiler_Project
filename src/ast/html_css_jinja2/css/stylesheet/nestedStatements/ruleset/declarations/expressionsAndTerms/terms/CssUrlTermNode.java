package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.urlAndFunctionalPseudoNodes.CssUrlNode;

// url() function term.
public class CssUrlTermNode extends CssTermNode {

    int line;
    CssUrlNode url;

    public CssUrlTermNode(String name, int line, CssUrlNode url) {
        super(name, line);
        this.line = line;
        this.url = url;
    }
    
    @Override
    public String toString(int indent) {
        return url.toString(0);
    }

}
