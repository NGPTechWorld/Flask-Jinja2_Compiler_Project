package ast.python_flask.compound_statement;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.StatementNode;
import ast.python_flask.literal.IdentifierExpression;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class ClassDefintionNode extends StatementNode {
    public IdentifierExpression nameClass;
    public List<ExpressionNode> arguments = new ArrayList<>();
    public BodyNode body;

    public ClassDefintionNode(int line, IdentifierExpression nameClass, List<ExpressionNode> arguments, BodyNode body) {
        super("ClassDefintion", line);
        this.nameClass = nameClass;
        this.arguments = arguments;
        this.body = body;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent) + "class ");
        sb.append("\n").append(nameClass.toString(indent + 2));
        if (arguments.size() != 0) {
            for (var arg : arguments) {
                sb.append("\n").append(arg.toString(indent + 2));
            }
        }
        sb.append("\n").append(body.toString(indent + 2));
        return sb.toString();
    }
}
