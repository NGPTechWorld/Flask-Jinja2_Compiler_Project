package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.property;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.property.helper_abstract.CssPropertyNode;

public class CssIdPropertyNode extends CssPropertyNode {
    int line;
    String name;

    public CssIdPropertyNode(String name, int line) {
        super(name, line);
    }
    //TODO indent
    @Override
    public String toString() {
        return "CssIdPropertyNode{name='" + name + "'}";
    }
}
