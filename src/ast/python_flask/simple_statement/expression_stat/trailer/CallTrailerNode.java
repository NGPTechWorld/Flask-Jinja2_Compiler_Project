package ast.python_flask.simple_statement.expression_stat.trailer;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class CallTrailerNode extends TrailerNode {

    public List<ExpressionNode> arguments = new ArrayList<>();

    public CallTrailerNode(int line, List<ExpressionNode> arguments) {
        super("CallTrailer", line);
          if (arguments != null)
            this.arguments = arguments;
    }
    
     @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent)+"()");
        for (var arg : arguments) {
            sb.append("\n").append(arg.toString(indent + 2));
        }
        return sb.toString();
    }
}
