package ast.python_flask.compound_statement.function_defintion;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;
import ast.python_flask.argument.ArgumentNode;
import ast.python_flask.literal.IdentifierExpression;

public class DecoratorNode extends BaseNode {

    public List<IdentifierExpression> path = new ArrayList<>();
    public List<ArgumentNode> arguments;

    public DecoratorNode(int line) {
        super("Decorator", line);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append("\n").append(" ".repeat(indent + 2)).append("Path:");
        for (var p : path) {
            sb.append("\n").append(p.toString(indent + 4));
        }
        if (arguments != null) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Args:");
            for (var a : arguments) {
                sb.append("\n").append(a.toString(indent + 4));
            }
        }
        return sb.toString();
    }
}
