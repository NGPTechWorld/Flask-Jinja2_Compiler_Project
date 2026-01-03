package ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.helper_abstract.JinjaStmtLiteral;

public class JinjaStmtIdentifier extends JinjaStmtLiteral {

    public String name;

    public JinjaStmtIdentifier(int line, String name) {
        super("StmtIdentifier", line);
        this.name = name;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + name;
    }
}