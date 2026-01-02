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
        StringBuilder sb = new StringBuilder();
        
        sb.append("Symbol: ").append(name)
          .append(" | Type: ").append(type)
          .append(" | Line: ").append(lineNumber);
        
        if (value != null) {
            switch (type) {
                case "parameter":
                    sb.append(" | default value: ").append(value);
                    break;
                case "function":
                    sb.append(" | return type: ").append(value);
                    break;
                case "class":
                    // لا نضيف معلومات إضافية للـ class
                    break;
                default:
                    sb.append(" | value: ").append(value);
                    break;
            }
        }
        
        return sb.toString();
    }
}
