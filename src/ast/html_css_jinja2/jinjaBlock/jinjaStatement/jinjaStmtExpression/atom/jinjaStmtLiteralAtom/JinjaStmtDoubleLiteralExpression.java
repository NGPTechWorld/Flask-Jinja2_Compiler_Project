package ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom;

import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.helper_abstract.JinjaStmtLiteral;

public class JinjaStmtDoubleLiteralExpression extends JinjaStmtLiteral {

    public double value;

    public JinjaStmtDoubleLiteralExpression(int line, double value) {
        super("StmtDoubleLiteral", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + String.valueOf(value);
    }
}