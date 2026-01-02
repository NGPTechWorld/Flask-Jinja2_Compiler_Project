package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.unaryExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;

public class JinjaUnaryExpression extends JinjaExpression {

    public String operator;
    public JinjaExpression operand;

    public JinjaUnaryExpression(String name,
            int line,
            String operator,
            JinjaExpression operand) {
        super("JinjaUnaryExpression", line);
        this.operator = operator;
        this.operand = operand;
    }

    @Override
    public String toString(int indent) {
        return " ".repeat(indent) + "(line " + line + ") Unary(" + operator + ")\n"
                + operand.toString(indent + 2);
    }
}
