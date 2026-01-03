package ast.python_flask.expressions_roles.atom;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.expressions_roles.ExpressionNode;

public class ListAtomNode extends AtomNode {

    public List<ExpressionNode> elements = new ArrayList<>();

    public ListAtomNode(int line, List<ExpressionNode> elements) {
        super("ListAtom", line);
        this.elements = elements;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append("\n").append(" ".repeat(indent + 2)).append("[");
        for (var e : elements) {
            sb.append("\n").append(e.toString(indent + 4));
        }
        sb.append("\n").append(" ".repeat(indent + 2)).append("]");
        return sb.toString();
    }

}
