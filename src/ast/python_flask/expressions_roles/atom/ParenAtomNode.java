package ast.python_flask.expressions_roles.atom;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.expressions_roles.ExpressionNode;

public class ParenAtomNode extends AtomNode {

    public List<ExpressionNode> expressions = new ArrayList<>();

    public ParenAtomNode(int line, List<ExpressionNode> expressions) {
        super("ParenAtom", line);
          if (expressions != null)
            this.expressions = expressions;
    }
    
    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent)+"()");
        if (expressions != null) {
            for (var e : expressions)
                sb.append("\n").append(e.toString(indent + 4));
        }
        return sb.toString();
    }
}
