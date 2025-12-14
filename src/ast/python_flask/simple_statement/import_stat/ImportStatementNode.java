package ast.python_flask.simple_statement.import_stat;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.StatementNode;

public class ImportStatementNode extends StatementNode {
    public List<ImportItem> items = new ArrayList<>();
    public ImportModule fromModule;

    public ImportStatementNode(int line) {
        super("ImportStatement", line);
    }

    public void addImportItem(ImportItem item) {
        items.add(item);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));

        if (fromModule != null) {
            sb.append("from ").append(fromModule).append(" import ");
        } else {
            sb.append("import ");
        }

        for (int i = 0; i < items.size(); i++) {
            sb.append(items.get(i).toString(indent));
            if (i < items.size() - 1)
                sb.append(", ");
        }
        return sb.toString();
    }

}
