package ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.helper_abstract.JinjaBinaryExpression;

public class Jinja2AddSubExpression extends JinjaBinaryExpression {

    public Jinja2AddSubExpression(int line, JinjaExpression left, String op, JinjaExpression right) {
        super(" Jinja2AddSubExpression ", line, op, left, right);
    }

}
