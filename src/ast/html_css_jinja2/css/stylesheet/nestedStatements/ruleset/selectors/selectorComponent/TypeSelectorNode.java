package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.helper_abstract.CssSelectorComponentNode;

public class TypeSelectorNode extends CssSelectorComponentNode {
    int line;
    String name;
    String namespacePrefix; // Can be null

    public TypeSelectorNode(String name, int line, String namespacePrefix) {
        super(name, line);
        this.name = name;
        this.namespacePrefix = namespacePrefix;
    }

    // REVIEW
    @Override
    public String toString(int indent) {
        return (namespacePrefix != null ? namespacePrefix + "|" : "") + name;
    }
}
