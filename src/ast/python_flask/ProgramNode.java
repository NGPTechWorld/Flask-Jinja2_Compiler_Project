package ast.python_flask;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;

public class ProgramNode extends BaseNode {

    public List<StatementNode> statements = new ArrayList<>();

    public ProgramNode(int line) {
        super("Program", line);
    }

    public void addStatement(StatementNode stmt) {
        statements.add(stmt);
    }
    
}