package ast.html_css_jinja2.css.stylesheet.nestedStatements.media.groupRuleBody;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.helper_abstract.CssNestedStatement;

public class GroupRuleBodyNode extends CssNode {

    int line;
    List<CssNestedStatement> statements = new ArrayList<>();

    public GroupRuleBodyNode(String name, int line) {
        super(name, line);
    }

    public void addStatement(CssNestedStatement statement) {
        this.statements.add(statement);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append(" {");
        for (CssNestedStatement statement : statements) {
            sb.append("\n").append(statement.toString(indent + 2));
        }
        sb.append("\n").append(" ".repeat(indent)).append("}");
        return sb.toString();
    }

}
