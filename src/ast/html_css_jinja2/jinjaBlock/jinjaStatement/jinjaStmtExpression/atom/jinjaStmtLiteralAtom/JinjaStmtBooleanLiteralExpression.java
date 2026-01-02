package ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.helper_abstract.JinjaStmtLiteral;

public class JinjaStmtBooleanLiteralExpression extends JinjaStmtLiteral {

    public boolean value;

    public JinjaStmtBooleanLiteralExpression(int line, boolean value) {
        super("StmtBooleanLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + String.valueOf(value);
    }
}