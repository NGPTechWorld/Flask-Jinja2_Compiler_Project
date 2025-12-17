package ast.python_flask.simple_statement.expression_stat.expressions;

import ast.python_flask.simple_statement.expression_stat.BinaryExpressionNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class ComparisonExpressionNode extends BinaryExpressionNode {

    public ComparisonExpressionNode (int line, ExpressionNode left, String op, ExpressionNode right) {
        super("ComparisonExpression", line, left, op, right);
    }

}
