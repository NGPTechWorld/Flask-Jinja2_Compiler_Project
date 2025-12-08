package ast.html_css_jinja2;

public interface AstNode {

    String toJson(int indent);

    default String toJson() {
        return toJson(0);
    }
}