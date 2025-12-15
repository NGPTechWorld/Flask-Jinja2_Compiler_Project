package ast.python_flask.simple_statement.expression_stat.expressions;

import ast.python_flask.simple_statement.expression_stat.BinaryExpressionNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class IsNotExpressionNode extends BinaryExpressionNode {
    public IsNotExpressionNode(int line, ExpressionNode l, ExpressionNode r) {
        super("IsNotExpression", line, l, "is not", r);
    }
}