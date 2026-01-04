package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.property.helper_abstract;

import ast.html_css_jinja2.css.helper_abstract.CssNode;

public abstract class CssPropertyNode extends CssNode {
    // public CssPropertyNode(String name, int line) {
    //     super(name, line);
    // }

    protected String name;

    public CssPropertyNode(String name, int line) {
        super(name, line);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
