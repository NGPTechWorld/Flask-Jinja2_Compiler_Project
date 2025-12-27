package ast.python_flask.simple_statement.assignment_stat.target;

import ast.python_flask.simple_statement.assignment_stat.TargetNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class SubscriptTargetNode extends TargetNode {
    public TargetNode targetNode;
    public ExpressionNode exp;

    public SubscriptTargetNode(int line, ExpressionNode exp, TargetNode targetNode) {
        super("SubscriptTarget", line);
        this.exp = exp;
        this.targetNode = targetNode;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append("\n").append(targetNode.toString(indent + 2));
        sb.append("\n").append(" ".repeat(indent + 2)).append("[");
        sb.append("\n").append(exp.toString(indent + 2));
        sb.append("\n").append(" ".repeat(indent + 2)).append("]");
        return sb.toString();
    }
}
