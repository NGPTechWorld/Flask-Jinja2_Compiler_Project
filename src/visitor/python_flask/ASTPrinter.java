package visitor.python_flask;

import ast.BaseNode;
import ast.python_flask.ProgramNode;
import ast.python_flask.simple_statement.ReturnStatementNode;

public class ASTPrinter {

    public static void print(BaseNode node, int indent) {
        System.out.println(node.toString(indent));

        if (node instanceof ProgramNode p) {
            for (var s : p.statements) {
                print(s, indent + 2);
            }
        }

        if (node instanceof ReturnStatementNode r && r.value != null) {
            print(r.value, indent + 2);
        }
    }
}
