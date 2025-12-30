package ast.python_flask.expressions_roles.target;

import ast.python_flask.expressions_roles.ExpressionNode;

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
