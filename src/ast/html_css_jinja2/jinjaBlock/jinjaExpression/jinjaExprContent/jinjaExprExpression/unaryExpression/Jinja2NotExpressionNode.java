package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.unaryExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;

public class Jinja2NotExpressionNode extends JinjaUnaryExpression {

    public Jinja2NotExpressionNode(int line, String op, JinjaExpression operand) {
        super(" Jinja2NotExpressionNode ", line, op, operand);
    }

}
