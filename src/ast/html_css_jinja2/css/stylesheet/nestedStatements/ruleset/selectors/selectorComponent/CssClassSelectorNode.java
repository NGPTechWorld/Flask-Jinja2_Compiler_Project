package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.helper_abstract.CssSelectorComponentNode;

public class CssClassSelectorNode extends CssSelectorComponentNode {
    int line;
    String name; // The name without the '.'

    public CssClassSelectorNode(String name, int line) {
        super(name, line);
        this.name = name;
    }

    
    @Override
    public String toString(int indent) {
        return "." + name;
    }

}
