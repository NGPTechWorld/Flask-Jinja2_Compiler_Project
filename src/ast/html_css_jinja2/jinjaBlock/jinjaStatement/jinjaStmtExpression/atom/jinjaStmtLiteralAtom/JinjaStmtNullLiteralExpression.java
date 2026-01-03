package ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.helper_abstract.JinjaStmtLiteral;

public class JinjaStmtNullLiteralExpression extends JinjaStmtLiteral {

    public JinjaStmtNullLiteralExpression(int line) {
        super("StmtNullLiteral", line);
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + "null";
    }
}