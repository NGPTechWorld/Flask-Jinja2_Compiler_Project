package ast.python_flask.simple_statement.expression_stat.expressions;

import ast.python_flask.simple_statement.expression_stat.BinaryExpressionNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class PowerExpressionNode extends BinaryExpressionNode{

    public PowerExpressionNode( int line, ExpressionNode left, ExpressionNode right) {
        super("PowerExpression", line, left, "**", right);
    }
    
}
