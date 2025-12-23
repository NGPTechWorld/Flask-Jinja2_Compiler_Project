package ast.python_flask.compound_statement;

import java.util.List;
import ast.BaseNode;
import ast.python_flask.StatementNode;

public class BodyNode extends BaseNode {

    public List<StatementNode> statements;

    public BodyNode(int line, List<StatementNode> statements) {
        super("Body", line);
        this.statements = statements;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));

        sb.append("\n").append(" ".repeat(indent + 2)).append("Start Body");
        for (var s : statements) {
            sb.append("\n").append(s.toString(indent + 4));
        }
        sb.append("\n").append(" ".repeat(indent + 2)).append("End Body");

        return sb.toString();
    }
}