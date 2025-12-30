package ast.html_css_jinja2.jinjaBlock.jinjaExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaBlockNode;

public class Jinja2ExpressionNode extends jinjaBlockNode {
    public String expression;

    public Jinja2ExpressionNode(int line, String expression) {
        super("JinjaExpression", line);
        this.expression = expression;
    }
}
