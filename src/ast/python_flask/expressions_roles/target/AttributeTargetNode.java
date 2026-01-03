package ast.python_flask.expressions_roles.target;
import ast.python_flask.expressions_roles.literal.IdentifierExpression;

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
