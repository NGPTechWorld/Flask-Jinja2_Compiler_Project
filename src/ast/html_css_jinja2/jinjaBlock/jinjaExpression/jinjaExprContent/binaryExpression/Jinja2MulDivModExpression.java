package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression.helper_abstract.JinjaBinaryExpression;

public class Jinja2MulDivModExpression extends JinjaBinaryExpression {

    public Jinja2MulDivModExpression(int line, JinjaExpression left, String op, JinjaExpression right) {
        super(" Jinja2MulDivModExpression ", line, op, left, right);
    }

}
