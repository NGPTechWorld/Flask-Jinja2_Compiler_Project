package ast.python_flask.simple_statement.expression_stat.expressions;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.literal.IdentifierExpression;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;
import ast.python_flask.simple_statement.expression_stat.trailer.TrailerNode;

public class AtomExpressionNode extends ExpressionNode {

    public ExpressionNode atom;
    public IdentifierExpression identifier;
    public List<TrailerNode> trailers = new ArrayList<>(); 

    public AtomExpressionNode(int line, ExpressionNode atom) {
        super("AtomExpression", line);
        this.atom = atom;
    }

    public AtomExpressionNode(int line,  IdentifierExpression identifier,List<TrailerNode> trailers) {
        super("AtomExpression", line);
        this.identifier = identifier;
        this.trailers = trailers;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        if(atom != null){
            sb.append(atom.toString(indent+2));
        }else{
            sb.append(identifier +" ");
            for(TrailerNode t : trailers){
                sb.append(t.toString(indent+2));
            }
        }
        return sb.toString();
    }
}