package ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.binaryExpression;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.binaryExpression.helper_abstract.JinjaStmtBinaryExpression;

public class Jinja2StmtComparisonExpressionNode extends JinjaStmtBinaryExpression {

    public Jinja2StmtComparisonExpressionNode(int line, JinjaExpression left, String op, JinjaExpression right) {
        super("Jinja2StmtComparisonExpressionNode", line, op, left, right);
    }
}
