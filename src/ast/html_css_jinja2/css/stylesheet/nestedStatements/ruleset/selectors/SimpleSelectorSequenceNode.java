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

    public SimpleSelectorSequenceNode(String name, int line, TypeSelectorNode typeSelector) {
        super(name, line);
        this.line = line;
        this.typeSelector = typeSelector;
    }

    public void addComponent(CssSelectorComponentNode component) {
        this.components.add(component);
    }

    // TODO indent
    @Override
    public String toString() {
        return "SimpleSelectorSequenceNode{" +
                "typeSelector=" + typeSelector +
                ", components=" + components +
                '}';
    }
}
