package ast.python_flask.compound_statement;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.BodyNode;
import ast.python_flask.StatementNode;
import ast.python_flask.expressions_roles.ExpressionNode;
import ast.python_flask.expressions_roles.target.TargetNode;

public class ForStatementNode extends StatementNode {
    public List<TargetNode> targets = new ArrayList<>();
    public List<ExpressionNode> iterables = new ArrayList<>();
    public BodyNode body;

    public ForStatementNode(int line, List<TargetNode> targets, List<ExpressionNode> iterables, BodyNode body) {
        super("ForStatement", line);
        this.targets = targets;
        this.iterables = iterables;
        this.body = body;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent) + "for");
        for (var t : targets) {
            sb.append("\n").append(t.toString(indent + 2));
        }
        sb.append("\n").append(" ".repeat(indent + 2)).append("in");
        for (var iterable : iterables) {
            sb.append("\n").append(iterable.toString(indent + 4));

        }
        sb.append("\n").append(body.toString(indent + 2));
        return sb.toString();
    }
}
