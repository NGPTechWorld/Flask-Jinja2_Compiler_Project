package visitor.python_flask;

import ast.BaseNode;
import ast.python_flask.ProgramNode;
import ast.python_flask.simple_statement.ReturnStatementNode;

public class ASTPrinter {

    public static void print(BaseNode node, int indent) {
        System.out.println(" ".repeat(indent) + node);

        if (node instanceof ProgramNode p) {
            p.statements.forEach(s -> print(s, indent + 2));
        }

        if (node instanceof ReturnStatementNode r && r.value != null) {
            print(r.value, indent + 2);
        }

        // مستقبلاً:
        // if (node instanceof IfStatementNode i) { ... }
    }
}
