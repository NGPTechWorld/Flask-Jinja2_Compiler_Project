package ast.html_css_jinja2.jinjaBlock.jinjaExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;

public class JinjaAttributeAccess extends JinjaExpression {
    public JinjaExpression base;
    public String attribute;

    public JinjaAttributeAccess(int line, JinjaExpression base, String attribute) {
        super("JinjaAttributeAccess", line);
        this.base = base;
        this.attribute = attribute;
    }
}
