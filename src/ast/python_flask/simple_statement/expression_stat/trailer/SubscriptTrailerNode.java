package ast.python_flask.simple_statement.expression_stat.trailer;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

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
