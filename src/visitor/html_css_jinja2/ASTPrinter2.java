package visitor.html_css_jinja2;

import ast.BaseNode;
import ast.html_css_jinja2.HtmlDocument;

public class ASTPrinter2 {

    public static void print(BaseNode node, int indent) {
        System.out.println(node.toString(indent));

        if (node instanceof HtmlDocument p) {
            for (var s : p.statements) {
                print(s, indent + 2);
            }
        }

    }

}
