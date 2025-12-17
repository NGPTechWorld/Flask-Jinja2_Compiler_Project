package ast.python_flask.simple_statement.assignment_stat.target;
import ast.python_flask.literal.IdentifierExpression;
import ast.python_flask.simple_statement.assignment_stat.TargetNode;

public class AttributeTargetNode extends TargetNode {
    public TargetNode targetNode;
    public IdentifierExpression attribute;

    public AttributeTargetNode(int line, IdentifierExpression attribute,TargetNode targetNode) {
        super("AttributeTarget", line);
        this.attribute = attribute;
        this.targetNode = targetNode;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent)+".");
        sb.append("\n").append(targetNode.toString(indent+2));
        sb.append("\n").append(attribute.toString(indent+2));
        return sb.toString();
    }
}
