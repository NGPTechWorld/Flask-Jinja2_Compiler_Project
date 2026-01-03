package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.helper_abstract.CssSelectorComponentNode;

public class CssIdSelectorNode extends CssSelectorComponentNode {
    int line;
    String id;

    public CssIdSelectorNode(String name, int line, String id) {
        super(name, line);
        this.id = id;
    }

    // TODO indent
    @Override
    public String toString() {
        return "CssIdSelectorNode{id='" + id + "'}";
    }

}
