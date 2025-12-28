package visitor.html_css_jinja2;

import ast.BaseNode;
import ast.html_css_jinja2.TemplateProgramNode;

public class ASTPrinter2 {

    public static void print(BaseNode node, int indent) {
        if (node == null)
            return;
        System.out.println(node.toString(indent));

        // if (node instanceof TemplateProgramNode p) {
        //     for (BaseNode s : p.children) {
        //         print(s, indent + 2);
        //     }
        // }

    }

}
