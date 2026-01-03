package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;

public class SelectorGroupNode extends CssNode {

    int line;
    List<SelectorNode> selectors = new ArrayList<>();

    public SelectorGroupNode(int line) {
        super("SelectorGroupNode", line);
    }

    public void addSelector(SelectorNode selector) {
        this.selectors.add(selector);
    }

    // TODO INDent
    @Override
    public String toString() {
        return "SelectorGroupNode{" + "selectors=" + selectors + '}';
    }
}
