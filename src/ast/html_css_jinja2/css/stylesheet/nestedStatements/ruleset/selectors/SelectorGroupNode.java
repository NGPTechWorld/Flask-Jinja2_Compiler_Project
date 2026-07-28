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

    // REVIEW  (solve 0 indent)

   @Override
public String toString(int indent) {
    StringBuilder sb = new StringBuilder(super.toString(indent));  // prints "(line X) SelectorGroupNode " with proper indent
    // now append the selector list
    for (int i = 0; i < selectors.size(); i++) {
        sb.append(selectors.get(i).toString(0));
        if (i < selectors.size() - 1) {
            sb.append(", ");
        }
    }
    return sb.toString();
}
}
