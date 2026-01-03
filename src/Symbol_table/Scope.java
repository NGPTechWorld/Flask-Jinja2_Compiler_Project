package Symbol_table;
import java.util.*;

public class Scope {
    private Map<String, Symbol> symbols = new HashMap<>();
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

    public void printSymbols() {
        System.out.println("Scope " + name + ":");
        if(symbols.isEmpty()) {
            System.out.println("is Empty");
            return;
        }
        for (Symbol s : symbols.values()) {
            System.out.println("   " + s);
        }
    }
}

