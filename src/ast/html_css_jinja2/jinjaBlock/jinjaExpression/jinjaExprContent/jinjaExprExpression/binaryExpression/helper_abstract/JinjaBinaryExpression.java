package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.helper_abstract;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;

public class JinjaBinaryExpression extends JinjaExpression {
    public String operator;
    public JinjaExpression left;
    public JinjaExpression right;

    public JinjaBinaryExpression(
            String name,
            int line,
            String operator,
            JinjaExpression left,
            JinjaExpression right) {
        super(name, line);
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + operator + "\n" + left.toString(indent + 2) + "\n" + right.toString(indent + 2);
    }

}
