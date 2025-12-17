package ast.python_flask.simple_statement.expression_stat.expressions;

import ast.python_flask.simple_statement.expression_stat.BinaryExpressionNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class AndExpressionNode extends BinaryExpressionNode {
    public AndExpressionNode(int line, ExpressionNode l, ExpressionNode r) {
        super("AndExpression", line, l, "and", r);
    }
}