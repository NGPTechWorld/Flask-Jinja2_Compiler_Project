package ast.html_css_jinja2.Jinja2;

import java.util.ArrayList;
import java.util.List;

//! @Osama_Zerkawi important to understand
public class Jinja2CallExpressionNode extends Jinja2Node {
    public Jinja2Node callee; // The function being called
    public List<Jinja2Node> arguments = new ArrayList<>();

    public Jinja2CallExpressionNode(int line, Jinja2Node callee) {
        super("Jinja2CallExpression", line);
        this.callee = callee;
    }

    public void addArgument(Jinja2Node arg) {
        this.arguments.add(arg);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append("\n").append(" ".repeat(indent + 2)).append("Callee:").append(callee.toString(indent + 4));
        if (!arguments.isEmpty()) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Arguments:");
            for (Jinja2Node arg : arguments) {
                sb.append("\n").append(arg.toString(indent + 4));
            }
        }
        return sb.toString();

    }

}
