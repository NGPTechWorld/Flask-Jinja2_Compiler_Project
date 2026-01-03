package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;

public class CssPercentageTermNode extends CssTermNode {
    int line;
    String text;

    public CssPercentageTermNode(String name, int line, String text) {
        super(name, line);
        this.line = line;
        this.text = text;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString(int indent) {
        return text;
    }

}
