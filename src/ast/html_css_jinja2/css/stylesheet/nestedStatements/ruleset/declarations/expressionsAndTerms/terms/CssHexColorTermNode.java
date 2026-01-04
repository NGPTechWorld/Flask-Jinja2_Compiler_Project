package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;

// a hexadecimal color value, e.g., '#ffffff' or '#fff'.
public class CssHexColorTermNode extends CssTermNode {

    int line;
    String value; // The hex value without the '#'

    public CssHexColorTermNode(String name, int line, String value) {
        super(name, line);
        this.line = line;
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return "#" + value;
    }

}
