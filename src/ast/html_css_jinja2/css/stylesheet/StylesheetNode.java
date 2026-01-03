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

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));

        if (!imports.isEmpty()) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Imports:");
            for (CssImportNode importNode : imports) {
                sb.append("\n").append(importNode.toString(indent + 4));
            }
        }

        if (!statementsCss.isEmpty()) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Statements:");
            for (CssNestedStatement stmt : statementsCss) {
                sb.append("\n").append(stmt.toString(indent + 4));
            }
        }
        return sb.toString();
    }

}
