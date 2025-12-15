package ast.python_flask.simple_statement.expression_stat.argument;

import java.util.ArrayList;
import java.util.List;

public class ArgListNode {

    public List<ArgumentNode> arguments = new ArrayList<>();

    public void add(ArgumentNode arg) {
        arguments.add(arg);
    }
}