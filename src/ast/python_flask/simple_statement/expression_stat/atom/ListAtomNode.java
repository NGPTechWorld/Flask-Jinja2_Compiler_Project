package ast.python_flask.simple_statement.expression_stat.atom;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class ListAtomNode extends AtomNode {

    public List<ExpressionNode> elements = new ArrayList<>();

    public ListAtomNode(int line, List<ExpressionNode> elements) {
        super("ListAtom", line);
        this.elements = elements;
    }
    
    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append("[ ");
        if (elements != null) {
            for (var e : elements)
                sb.append(e.toString(indent + 2));
        }
        sb.append(" ]");
        return sb.toString();
    }
}
