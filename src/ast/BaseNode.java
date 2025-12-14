package ast;

public abstract class BaseNode {
    public String name;
    public int line;

    public BaseNode(String name, int line) {
        this.name = name;
        this.line = line;
    }

    public String toString(int indent) {
        return " ".repeat(indent) + "(line " + line + ") " + name+" ";
    }

    @Override
    public String toString() {
        return toString(0);
    }
}
