package ast.html_css_jinja2.Jinja2;

import java.util.ArrayList;
import java.util.List;

public class Jinja2ExpressionNode extends Jinja2Node {
    public List<Jinja2Node> expressions = new ArrayList<>();

    public Jinja2ExpressionNode(int line) {
        super("Jinja2Expression", line);
    }

    public void addExpression(Jinja2Node expr) {
        this.expressions.add(expr);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        for (Jinja2Node expr : expressions) {
            sb.append("\n").append(expr.toString(indent + 2));
        }
        return sb.toString();
    }
}
