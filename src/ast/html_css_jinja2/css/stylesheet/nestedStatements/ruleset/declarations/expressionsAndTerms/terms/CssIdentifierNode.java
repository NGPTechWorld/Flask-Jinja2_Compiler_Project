package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;

public class CssIdentifierNode extends CssTermNode {
    int line;
    String name;

    public CssIdentifierNode(String name, int line) {
        super(name, line);
        this.line = line;
        this.name = name;
    }

    @Override
    public String toString(int indent) {
        return name;
    }

}
