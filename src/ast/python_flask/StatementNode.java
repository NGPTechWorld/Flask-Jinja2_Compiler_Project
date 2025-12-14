package ast.python_flask;

import ast.BaseNode;

public abstract class StatementNode extends BaseNode {
    public StatementNode(String name, int line) {
        super(name, line);
    }
    
}
