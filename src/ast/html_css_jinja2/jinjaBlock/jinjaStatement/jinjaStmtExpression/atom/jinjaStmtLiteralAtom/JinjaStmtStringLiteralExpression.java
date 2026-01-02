package ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.helper_abstract.JinjaStmtLiteral;

public class JinjaStmtStringLiteralExpression extends JinjaStmtLiteral {

    public String value;

    public JinjaStmtStringLiteralExpression(int line, String value) {
        super("StmtStringLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + value;
    }
}