package ast.python_flask.expressions;

import ast.python_flask.ExpressionNode;

public class PowerExpressionNode extends ExpressionNode {

    public ExpressionNode expression;

    public PowerExpressionNode(ExpressionNode expression, int line) {
        super("PowerExpression", line);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "(** " + expression + ")";
    }
}
