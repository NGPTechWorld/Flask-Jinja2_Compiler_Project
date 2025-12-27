package ast.python_flask.compound_statement.function_defintion.param;

import ast.BaseNode;

public abstract class ParamNode extends BaseNode {
    public ParamNode(String name, int line) {
        super(name, line);
    }
}
