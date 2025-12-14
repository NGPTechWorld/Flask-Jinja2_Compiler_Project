package ast;

public class BaseNode {
    public String name;
    public int line;

    public BaseNode(String name, int line) {
        this.name = name;
        this.line = line;
    }

    @Override
    public String toString() {
        return "(line " + line + ") " + name + " ";
    }
}
