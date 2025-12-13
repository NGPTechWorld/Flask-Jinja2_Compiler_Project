package ast.python_flask.atom;

import ast.BaseNode;
import java.util.ArrayList;
import java.util.List;

public class DictAtomNode extends BaseNode {
    public List<KeyValueNode> items = new ArrayList<>();

    public DictAtomNode(int line) {
        super("DictAtom", line);
    }

    public void addPair(KeyValueNode kv) {
        items.add(kv);
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
