package visitor.python_flask;

import ast.BaseNode;
import ast.python_flask.ProgramNode;

public class ASTPrinter {

    public static void print(BaseNode node, int indent) {
        System.out.println(node.toString(indent));
        if (node instanceof ProgramNode p ) {
            if(p.statements != null)
            for (var s : p.statements) {
                print(s, indent + 2);
            }
        }
    }
}
