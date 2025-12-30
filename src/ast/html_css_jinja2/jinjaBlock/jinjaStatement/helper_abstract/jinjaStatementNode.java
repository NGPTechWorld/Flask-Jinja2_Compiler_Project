package ast.html_css_jinja2.jinjaBlock.jinjaStatement.helper_abstract;

import ast.html_css_jinja2.jinjaBlock.jinjaBlockNode;

public class jinjaStatementNode extends jinjaBlockNode {

    public String statement;

    public jinjaStatementNode(int line, String statement) {
        super("JinjaStatement", line);
        this.statement = statement;
    }
}
