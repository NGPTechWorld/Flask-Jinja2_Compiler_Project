package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.helper_abstract.JinjaBinaryExpression;

public class Jinja2LogicalExpressionNode extends JinjaBinaryExpression {

    public Jinja2LogicalExpressionNode (int line, JinjaExpression left, String op, JinjaExpression right) {
        super(" Jinja2LogicalExpressionNode ", line, op, left, right);
    }

}
