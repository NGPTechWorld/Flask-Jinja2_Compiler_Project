package ast.html_css_jinja2.css;

import ast.html_css_jinja2.css.helper_abstract.CssNode;

public abstract class CssRuleNode extends CssNode {
    public CssRuleNode(String name, int line) {
        super(name, line);
    }
}
