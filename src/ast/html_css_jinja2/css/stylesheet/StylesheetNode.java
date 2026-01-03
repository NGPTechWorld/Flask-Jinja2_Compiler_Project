package ast.html_css_jinja2.css.stylesheet;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;
import ast.html_css_jinja2.css.stylesheet.imports.CssImportNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.helper_abstract.CssNestedStatement;

public class StylesheetNode extends CssNode {
    int line;
    List<CssImportNode> imports = new ArrayList<>();
    List<CssNestedStatement> statementsCss = new ArrayList<>();

    public StylesheetNode(int line) {
        super("Stylesheet", line);
    }

    public void addImport(CssImportNode importNode) {
        this.imports.add(importNode);
    }

    public void addStatement(CssNestedStatement stmt) {
        statementsCss.add(stmt);
    }

    // @Override
    // public String toString(int indent) {
    // StringBuilder sb = new StringBuilder(" ".repeat(indent));
    // sb.append("(line ").append(line).append(") Stylesheet");
    // for (var stmt : statementsCss) {
    // sb.append("\n").append(stmt.toString(indent + 2));
    // }
    // return sb.toString();
    // }
    // TODO indent
    @Override
    public String toString() {
        return "StylesheetNode{" +
                "imports=" + imports +
                ", statements=" + statementsCss +
                '}';
    }

}
