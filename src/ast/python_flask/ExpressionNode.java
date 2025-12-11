package ast.python_flask;

import ast.BaseNode;

public abstract class ExpressionNode extends BaseNode {
    public ExpressionNode(String name, int line) {
        super(name, line);
    }
}
