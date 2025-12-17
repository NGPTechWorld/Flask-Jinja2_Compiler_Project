package ast.python_flask.simple_statement.expression_stat.expressions;

import ast.python_flask.simple_statement.expression_stat.BinaryExpressionNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class OrExpressionNode extends BinaryExpressionNode {
    public OrExpressionNode(int line, ExpressionNode l, ExpressionNode r) {
        super("OrExpression", line, l, "or", r);
    }
}