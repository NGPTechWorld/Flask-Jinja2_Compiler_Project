package ast.python_flask.simple_statement.expression_stat.atom;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.misc.Pair;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class DictAtomNode extends AtomNode{

    public List<Pair<ExpressionNode, ExpressionNode>> entries = new ArrayList<>();


    public DictAtomNode(int line) {
        super("DictAtom", line);
    }
      @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent)+"{}");
        if (entries != null) {
            for (var e : entries) {
                sb.append("\n").append(e.a.toString(indent+2)).append(" :");
                sb.append("\n").append(e.b.toString(indent +2)).append(" ,");
            }
        }
        return sb.toString();
    }
}
