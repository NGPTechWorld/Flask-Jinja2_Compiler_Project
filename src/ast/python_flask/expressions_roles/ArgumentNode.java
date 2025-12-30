package ast.python_flask.expressions_roles;

import ast.python_flask.expressions_roles.literal.IdentifierExpression;

public class ArgumentNode extends ExpressionNode {

    public IdentifierExpression nameArg;
    public ExpressionNode value;
    public boolean isPower;

    public ArgumentNode(int line, IdentifierExpression nameArg, ExpressionNode value) {
        super("Argument", line);
        this.nameArg = nameArg;
        this.value = value;
        this.isPower = false;
    }

    public ArgumentNode(int line, ExpressionNode value) {
        super("Argument", line);
        this.value = value;
        this.isPower = true;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        if (nameArg != null)
            sb.append("\n").append(nameArg.toString(indent+2)).append(" =");
        if (isPower)
            sb.append("**");
        sb.append("\n").append(value.toString(indent + 2));
        return sb.toString();
    }
}