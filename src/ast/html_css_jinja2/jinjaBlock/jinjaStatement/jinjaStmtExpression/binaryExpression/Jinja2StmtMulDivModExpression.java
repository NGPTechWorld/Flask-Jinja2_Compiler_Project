package ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.binaryExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.binaryExpression.helper_abstract.JinjaStmtBinaryExpression;

public class Jinja2StmtMulDivModExpression extends JinjaStmtBinaryExpression {

    public Jinja2StmtMulDivModExpression(int line, JinjaExpression left, String op, JinjaExpression right) {
        super("Jinja2StmtMulDivModExpression", line, op, left, right);
    }
}
