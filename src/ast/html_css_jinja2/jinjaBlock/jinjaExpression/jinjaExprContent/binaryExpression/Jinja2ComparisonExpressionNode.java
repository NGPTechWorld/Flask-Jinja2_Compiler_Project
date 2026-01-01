package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression.helper_abstract.JinjaBinaryExpression;

public class Jinja2ComparisonExpressionNode extends JinjaBinaryExpression {

    public Jinja2ComparisonExpressionNode (int line, JinjaExpression left, String op, JinjaExpression right) {
        super(" Jinja2ComparisonExpressionNode ", line, op, left, right);
    }

}
