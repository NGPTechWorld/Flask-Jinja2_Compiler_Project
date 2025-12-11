package ast.python_flask.atom;

import ast.BaseNode;

public class KeyValueNode extends BaseNode {
    public BaseNode key;
    public BaseNode value;

    public KeyValueNode(BaseNode key, BaseNode value, int line) {
        super("KeyValue", line);
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " : " + value;
    }
}
