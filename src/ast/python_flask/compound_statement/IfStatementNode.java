package ast.python_flask.compound_statement;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.Pair;

import ast.python_flask.BodyNode;
import ast.python_flask.StatementNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class IfStatementNode extends StatementNode {
    public ExpressionNode ifCondition;
    public BodyNode bodyIf;
    public List<Pair<ExpressionNode, BodyNode>> elseIfStat = new ArrayList<>();
    public BodyNode bodyElse;

    public IfStatementNode(
            int line,
            ExpressionNode ifCondition,
            BodyNode bodyIf,
            List<Pair<ExpressionNode, BodyNode>> elseIfStat,
            BodyNode bodyElse) {

        super("IfStatement", line);
        this.ifCondition = ifCondition;
        this.bodyIf = bodyIf;
        this.elseIfStat = elseIfStat;
        this.bodyElse = bodyElse;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent) + "if ");
        sb.append("\n").append(ifCondition.toString(indent + 2));
        sb.append("\n").append(bodyIf.toString(indent + 2));
        
        if (elseIfStat.size() != 0) {
            for (var stst : elseIfStat) {
                sb.append("\n").append(" ".repeat(indent + 2)).append("else if");
                sb.append("\n").append(stst.a.toString(indent + 4));
                sb.append("\n").append(stst.b.toString(indent + 4));
            }
        }
        if(bodyElse != null){
            sb.append("\n").append(" ".repeat(indent + 2)).append("else ");
            sb.append("\n").append(bodyElse.toString(indent + 2));
        }
            
        return sb.toString();
    }
}
