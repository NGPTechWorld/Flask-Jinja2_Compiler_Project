package ast.python_flask.atom;

import ast.BaseNode;
import java.util.ArrayList;
import java.util.List;

public class ListAtomNode extends BaseNode {
    public List<BaseNode> elements = new ArrayList<>();

    public ListAtomNode(int line) {
        super("ListAtom", line);
    }

    public void add(BaseNode e) {
        elements.add(e);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
