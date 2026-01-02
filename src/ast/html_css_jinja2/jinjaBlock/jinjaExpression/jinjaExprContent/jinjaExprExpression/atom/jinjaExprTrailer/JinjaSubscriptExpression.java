package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaExprTrailer;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;

public class JinjaSubscriptExpression extends JinjaExpression {
    public JinjaExpression base;
    public JinjaExpression index;

    public JinjaSubscriptExpression(int line, JinjaExpression base, JinjaExpression index) {
        super("JinjaSubscript", line);
        this.base = base;
        this.index = index;
    }

}
