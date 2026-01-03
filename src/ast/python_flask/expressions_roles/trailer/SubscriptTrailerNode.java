package ast.python_flask.expressions_roles.trailer;

import ast.python_flask.expressions_roles.ExpressionNode;

public class SubscriptTrailerNode extends TrailerNode {

    public ExpressionNode exp;

    public SubscriptTrailerNode(int line, ExpressionNode exp) {
        super("SubscriptTrailer", line);
        this.exp = exp;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent)+"[]");
        sb.append("\n").append(exp.toString(indent + 2));
        return sb.toString();
    }
}
