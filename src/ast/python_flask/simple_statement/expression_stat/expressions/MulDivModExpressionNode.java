package ast.python_flask.simple_statement.expression_stat.expressions;

import ast.python_flask.simple_statement.expression_stat.BinaryExpressionNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class MulDivModExpressionNode extends BinaryExpressionNode {

    public MulDivModExpressionNode(int line, ExpressionNode left, String op, ExpressionNode right) {
        super("MulDivModExpression", line, left, op, right);
    }

}
