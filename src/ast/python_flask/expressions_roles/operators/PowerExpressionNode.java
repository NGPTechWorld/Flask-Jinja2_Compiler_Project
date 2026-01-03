package ast.python_flask.expressions_roles.operators;

import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class PowerExpressionNode extends BinaryExpressionNode{

    public PowerExpressionNode( int line, ExpressionNode left, ExpressionNode right) {
        super("PowerExpression", line, left, "**", right);
    }
    
}
