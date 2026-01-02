package ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.helper_abstract.JinjaStmtLiteral;

public class JinjaStmtIntLiteralExpression extends JinjaStmtLiteral {

    public int value;

    public JinjaStmtIntLiteralExpression(int line, int value) {
        super("StmtIntLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + String.valueOf(value);
    }
}