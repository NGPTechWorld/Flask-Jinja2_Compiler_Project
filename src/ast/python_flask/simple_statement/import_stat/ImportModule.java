package ast.python_flask.simple_statement.import_stat;

import java.util.List;
import ast.BaseNode;

public class ImportModule extends BaseNode {

    public List<String> parts;

    public ImportModule(int line, List<String> parts) {
        super("ImportModule", line);
        this.parts = parts;
    }

    @Override
    public String toString(int indent) {
        return String.join(".", parts);
    }
}
