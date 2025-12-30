package ast.html_css_jinja2.archive.Jinja2;
// package ast.html_css_jinja2.Jinja2;

// import java.util.ArrayList;
// import java.util.List;

// public class Jinja2StatementNode extends Jinja2Node {
//     public String statementType;
//     public List<Jinja2Node> children = new ArrayList<>();

//     public Jinja2StatementNode(int line, String statementType) {
//         super("Jinja2Statement", line);
//         this.statementType = statementType;
//     }

//     public void addChild(Jinja2Node node) {
//         this.children.add(node);
//     }

//     @Override
//     public String toString(int indent) {
//         StringBuilder sb = new StringBuilder(super.toString(indent) + "[" + statementType + "]");
//         for (Jinja2Node child : children) {
//             sb.append("\n").append(child.toString(indent + 2));
//         }
//         return sb.toString();
//     }
// }
