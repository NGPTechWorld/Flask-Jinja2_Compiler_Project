package Symbol_table;
import java.util.*;

public class Scope {
    // Insertion-ordered so a written report is stable between runs.
    private Map<String, Symbol> symbols = new LinkedHashMap<>();
    private String name;

    public Scope(String name) {
        this.name = name;
    }

    public String get_name() {
        return name;
    }

    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol resolve(String symbol_name) {
        return symbols.get(symbol_name);
    }

    /** This scope rendered as text, for compiler_output/symbol_table.txt. */
    public List<String> toLines() {
        List<String> lines = new ArrayList<>();
        lines.add("Scope " + name + ":");
        if (symbols.isEmpty()) {
            lines.add("   is Empty");
            return lines;
        }
        for (Symbol s : symbols.values()) {
            lines.add("   " + s);
        }
        return lines;
    }

    public void printSymbols() {
        for (String line : toLines()) {
            System.out.println(line);
        }
    }
}

