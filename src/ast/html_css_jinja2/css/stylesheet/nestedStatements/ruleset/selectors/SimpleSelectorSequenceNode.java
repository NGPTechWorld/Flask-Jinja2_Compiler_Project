package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.TypeSelectorNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.helper_abstract.CssSelectorComponentNode;

public class SimpleSelectorSequenceNode extends CssNode {
    int line;
    TypeSelectorNode typeSelector; // Can be null
    List<CssSelectorComponentNode> components = new ArrayList<>();

    public SimpleSelectorSequenceNode(int line, TypeSelectorNode typeSelector) {
        super("SimpleSelectorSequenceNode", line);
        this.line = line;
        this.typeSelector = typeSelector;
    }

    public void addComponent(CssSelectorComponentNode component) {
        this.components.add(component);
    }


    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        if (typeSelector != null) {
            sb.append(typeSelector.toString(0));
        }
        for (CssSelectorComponentNode component : components) {
            if (component != null) { // Add null check
                sb.append(component.toString(0)); // Components are printed without extra indent
            }
        }
        return sb.toString();
    }
}
