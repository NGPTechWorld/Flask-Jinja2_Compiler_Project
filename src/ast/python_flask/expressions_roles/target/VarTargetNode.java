package ast.python_flask.expressions_roles.target;
import ast.python_flask.expressions_roles.literal.IdentifierExpression;

public class VarTargetNode extends TargetNode {
    public IdentifierExpression attribute;

    public VarTargetNode(int line, IdentifierExpression attribute) {
        super("VarTarget", line);
        this.attribute = attribute;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent)+"\n");
        sb.append(attribute.toString(indent+2));
        return sb.toString();
    }
}
