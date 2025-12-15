package ast.python_flask.simple_statement.expression_stat.expressions;

import ast.python_flask.simple_statement.expression_stat.BinaryExpressionNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class IsExpressionNode extends BinaryExpressionNode {
    public IsExpressionNode(int line, ExpressionNode l, ExpressionNode r) {
        super("IsExpression", line, l, "is", r);
    }
}