package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.helper_abstract.CssSelectorComponentNode;

public class CssIdSelectorNode extends CssSelectorComponentNode {
    int line;
    String id;

    public CssIdSelectorNode(int line, String id) {
        super("CssIdSelectorNode", line);
        this.id = id;
    }

    
    @Override
    public String toString(int indent) {
        return "#" + id;
    }

}
