package ast.python_flask.compound_statement.function_defintion.param;

import ast.python_flask.expressions_roles.literal.IdentifierExpression;

public class KwVarArgParamNode extends ParamNode {
    public IdentifierExpression name;

    public KwVarArgParamNode(int line, IdentifierExpression name) {
        super("KwVarArgParam", line);
        this.name = name;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent) + "**");
        sb.append("\n").append(name.toString(indent + 2));
        return sb.toString();
    }
}

