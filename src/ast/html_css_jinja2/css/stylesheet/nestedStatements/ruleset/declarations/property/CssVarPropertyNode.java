package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.property;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.property.helper_abstract.CssPropertyNode;

//'--main-color'.
public class CssVarPropertyNode extends CssPropertyNode {
    int line;
    String name; // The name without the '--'

    public CssVarPropertyNode(String name, int line) {
        super(name, line);
        this.line = line;
        this.name = name;
    }
    //REVIEW
    @Override
    public String toString(int indent) {
        return "--" + name;
    }

}
