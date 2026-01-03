package ast.python_flask.compound_statement.function_defintion;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.BodyNode;
import ast.python_flask.StatementNode;
import ast.python_flask.compound_statement.function_defintion.param.ParamNode;
import ast.python_flask.expressions_roles.ExpressionNode;
import ast.python_flask.expressions_roles.literal.IdentifierExpression;

public class FunctionDefNode extends StatementNode {

    public List<DecoratorNode> decorators = new ArrayList<>();
    public IdentifierExpression nameFun;
    public List<ParamNode> parameters = new ArrayList<>();
    public ExpressionNode returnType; // optional
    public BodyNode body;

    public FunctionDefNode(int line) {
        super("FunctionDef", line);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));

        if (!decorators.isEmpty()) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Decorators:");
            for (var d : decorators)
                sb.append("\n").append(d.toString(indent + 4));
        }

        sb.append("\n").append(" ".repeat(indent + 2)).append("Name:");
        sb.append("\n").append(nameFun.toString(indent + 4));
        if (!parameters.isEmpty()) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Params:");
            for (var p : parameters)
                sb.append("\n").append(p.toString(indent + 4));

        }

        if (returnType != null) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Return:");
            sb.append("\n").append(returnType.toString(indent + 4));
        }

        sb.append("\n").append(body.toString(indent + 2));

        return sb.toString();
    }
}
