package ast.python_flask.expressions_roles.operators;

import ast.python_flask.expressions_roles.ExpressionNode;
import ast.python_flask.expressions_roles.UnaryExpressionNode;

public class NotExpressionNode extends UnaryExpressionNode {
    public NotExpressionNode(int line, ExpressionNode exp) {
        super("NotExpression", line,  "not",exp);
    }
}