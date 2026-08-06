package generator;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Map;

import org.antlr.v4.runtime.misc.Pair;

import ast.BaseNode;

public class AstJsonWriter {

    /** Guards against a malformed tree turning into runaway recursion. */
    private static final int MAX_DEPTH = 200;

    private final StringBuilder out = new StringBuilder();

    /** Renders one AST as a JSON document. */
    public static String toJson(BaseNode root) {
        AstJsonWriter writer = new AstJsonWriter();
        writer.writeValue(root, 0);
        return writer.out.toString();
    }

    /** Renders several named ASTs as one JSON object: file name -> tree. */
    public static String toJson(Map<String, ? extends BaseNode> trees) {
        AstJsonWriter writer = new AstJsonWriter();
        writer.out.append("{\n");
        boolean first = true;
        for (Map.Entry<String, ? extends BaseNode> entry : trees.entrySet()) {
            if (!first) {
                writer.out.append(",\n");
            }
            writer.indent(1).append(writer.quote(entry.getKey())).append(": ");
            writer.writeValue(entry.getValue(), 1);
            first = false;
        }
        writer.out.append("\n}");
        return writer.out.toString();
    }

    /** Dispatches one value to the right JSON shape. */
    private void writeValue(Object value, int depth) {
        if (depth > MAX_DEPTH) {
            out.append("\"<max depth reached>\"");
            return;
        }
        if (value == null) {
            out.append("null");
        } else if (value instanceof BaseNode node) {
            writeNode(node, depth);
        } else if (value instanceof Collection<?> items) {
            writeArray(items, depth);
        } else if (value instanceof Map<?, ?> map) {
            writeMap(map, depth);
        } else if (value instanceof Pair<?, ?> pair) {
            writePair(pair, depth);
        } else if (value instanceof Number || value instanceof Boolean) {
            out.append(value);
        } else {
            out.append(quote(String.valueOf(value)));
        }
    }

    /** Writes one AST node: its class, then every public field it declares. */
    private void writeNode(BaseNode node, int depth) {
        out.append("{\n");
        indent(depth + 1).append("\"node\": ").append(quote(node.getClass().getSimpleName()));
        out.append(",\n");
        indent(depth + 1).append("\"line\": ").append(node.line);

        for (Field field : publicFields(node.getClass())) {
            if (field.getName().equals("line") || field.getName().equals("name")) {
                continue;                       // already written above
            }
            Object fieldValue;
            try {
                fieldValue = field.get(node);
            } catch (IllegalAccessException unreachable) {
                continue;                       // public fields are always readable
            }
            out.append(",\n");
            indent(depth + 1).append(quote(field.getName())).append(": ");
            writeValue(fieldValue, depth + 1);
        }
        out.append("\n");
        indent(depth).append("}");
    }

    /** Writes a list of children as a JSON array. */
    private void writeArray(Collection<?> items, int depth) {
        if (items.isEmpty()) {
            out.append("[]");
            return;
        }
        out.append("[\n");
        boolean first = true;
        for (Object item : items) {
            if (!first) {
                out.append(",\n");
            }
            indent(depth + 1);
            writeValue(item, depth + 1);
            first = false;
        }
        out.append("\n");
        indent(depth).append("]");
    }

    /** Writes a map as a JSON object, stringifying its keys. */
    private void writeMap(Map<?, ?> map, int depth) {
        if (map.isEmpty()) {
            out.append("{}");
            return;
        }
        out.append("{\n");
        boolean first = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!first) {
                out.append(",\n");
            }
            indent(depth + 1).append(quote(String.valueOf(entry.getKey()))).append(": ");
            writeValue(entry.getValue(), depth + 1);
            first = false;
        }
        out.append("\n");
        indent(depth).append("}");
    }

    /** ANTLR's Pair is used for elif branches and dict entries. */
    private void writePair(Pair<?, ?> pair, int depth) {
        out.append("{\n");
        indent(depth + 1).append("\"a\": ");
        writeValue(pair.a, depth + 1);
        out.append(",\n");
        indent(depth + 1).append("\"b\": ");
        writeValue(pair.b, depth + 1);
        out.append("\n");
        indent(depth).append("}");
    }

    /** Collects the public instance fields of a class and its superclasses. */
    private static java.util.List<Field> publicFields(Class<?> type) {
        java.util.List<Field> fields = new java.util.ArrayList<>();
        for (Field field : type.getFields()) {
            if (!Modifier.isStatic(field.getModifiers()) && !field.isSynthetic()) {
                fields.add(field);
            }
        }
        return fields;
    }

    /** Appends two spaces per level and returns the buffer for chaining. */
    private StringBuilder indent(int depth) {
        return out.append("  ".repeat(depth));
    }

    /** Escapes a string so it is valid inside a JSON document. */
    private String quote(String text) {
        StringBuilder quoted = new StringBuilder("\"");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '"':  quoted.append("\\\"");  break;
                case '\\': quoted.append("\\\\");  break;
                case '\n': quoted.append("\\n");   break;
                case '\r': quoted.append("\\r");   break;
                case '\t': quoted.append("\\t");   break;
                default:
                    if (c < 0x20) {
                        quoted.append(String.format("\\u%04x", (int) c));
                    } else {
                        quoted.append(c);
                    }
            }
        }
        return quoted.append("\"").toString();
    }
}
