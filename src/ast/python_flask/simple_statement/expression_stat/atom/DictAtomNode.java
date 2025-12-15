package ast.python_flask.simple_statement.expression_stat.atom;

import java.util.Map;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class DictAtomNode extends AtomNode{

    public Map<String, ExpressionNode> entries;

    public DictAtomNode(int line) {
        super("DictAtom", line);
    }
      @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append("{ ");
        if (entries != null) {
            for (var e : entries.entrySet()) {
                sb.append(e.getKey().toString());
                sb.append(e.getValue().toString(indent +2));
            }
        }
        sb.append(" }");
        return sb.toString();
    }
}
