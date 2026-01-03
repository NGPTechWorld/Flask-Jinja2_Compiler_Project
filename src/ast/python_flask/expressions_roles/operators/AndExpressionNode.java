package ast.python_flask.expressions_roles.operators;

import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class AndExpressionNode extends BinaryExpressionNode {
    public AndExpressionNode(int line, ExpressionNode l, ExpressionNode r) {
        super("AndExpression", line, l, "and", r);
    }
}