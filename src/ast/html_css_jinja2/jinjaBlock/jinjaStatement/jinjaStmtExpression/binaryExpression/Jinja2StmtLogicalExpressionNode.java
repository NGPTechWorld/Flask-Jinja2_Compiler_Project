package ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.binaryExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.binaryExpression.helper_abstract.JinjaStmtBinaryExpression;

public class Jinja2StmtLogicalExpressionNode extends JinjaStmtBinaryExpression {

    public Jinja2StmtLogicalExpressionNode(int line, JinjaExpression left, String op, JinjaExpression right) {
        super("Jinja2StmtLogicalExpressionNode", line, op, left, right);
    }
}
