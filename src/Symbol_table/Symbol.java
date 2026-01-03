package Symbol_table;

public class Symbol {
    private String name;
    private String type;
    private int lineNumber;
    private Object value;

    public Symbol(String name, String type, int lineNumber) {
        this.name = name;
        this.type = type;
        this.lineNumber = lineNumber;
        this.value = null;
    }

    public Symbol(String name, String type, int lineNumber, Object value) {
        this.name = name;
        this.type = type;
        this.lineNumber = lineNumber;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        String extra = "";

        if (value != null) {
            switch (type) {
                case "parameter":
                    extra = "default = " + value;
                    break;
                case "function":
                    extra = "returns " + value;
                    break;
                case "class":
                    extra = "";
                    break;
                default:
                    extra = "value = " + value;
            }
        }

        return String.format(
                "| %-25s | %-10s | %-5d | %-20s |",
                name,
                type,
                lineNumber,
                extra);
    }
}
