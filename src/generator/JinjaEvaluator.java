package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ast.BaseNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.helper_abstract.JinjaBinaryExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.unaryExpression.JinjaUnaryExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.JinjaListLiteral;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaExprTrailer.JinjaAttributeAccess;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaExprTrailer.JinjaSubscriptExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaBooleanLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaDoubleLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaIdentifier;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaIntLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaNullLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaStringLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtBooleanLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtDoubleLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtIdentifier;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtIntLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtNullLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtStringLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.binaryExpression.helper_abstract.JinjaStmtBinaryExpression;
import generator.runtime.Scope;

public class JinjaEvaluator {
    private final List<String> warnings = new ArrayList<>();

    public List<String> getWarnings() {
        return warnings;
    }

    private void warn(String message) {
        warnings.add(message);
    }

    public Object eval(BaseNode node, Scope scope) {
        if (node == null)
            return null;
        if (node instanceof JinjaIdentifier id) { // {{ products }}
            return lookup(id.name, scope, id.line);
        }
        if (node instanceof JinjaStmtIdentifier id) { // {% if products %}
            return lookup(id.name, scope, id.line);
        }
        if (node instanceof JinjaStringLiteralExpression s)
            return s.value;
        if (node instanceof JinjaStmtStringLiteralExpression s)
            return s.value;
        if (node instanceof JinjaIntLiteralExpression i)
            return i.value;
        if (node instanceof JinjaStmtIntLiteralExpression i)
            return i.value;
        if (node instanceof JinjaDoubleLiteralExpression d)
            return d.value;
        if (node instanceof JinjaStmtDoubleLiteralExpression d)
            return d.value;
        if (node instanceof JinjaBooleanLiteralExpression b)
            return b.value;
        if (node instanceof JinjaStmtBooleanLiteralExpression b)
            return b.value;
        if (node instanceof JinjaNullLiteralExpression)
            return null;
        if (node instanceof JinjaStmtNullLiteralExpression)
            return null;

        // ---- product.name ----------------------------------------
        if (node instanceof JinjaAttributeAccess access) {
            Object base = eval(access.base, scope);
            if (base == null) {
                warn("line " + access.line + ": cannot read '" + access.attribute
                        + "' of an undefined value");
                return null;
            }
            return member(base, access.attribute, access.line);
        }

        // ---- product['name'] / items[0] ---------------------------
        if (node instanceof JinjaSubscriptExpression sub) {
            Object base = eval(sub.base, scope);
            Object idx = eval(sub.index, scope);
            if (base == null) {
                warn("line " + sub.line + ": cannot index an undefined value");
                return null;
            }
            return index(base, idx, sub.line);
        }

        // ---- [1, 2, 3] ---------------------------------------------
        if (node instanceof JinjaListLiteral list) {
            List<Object> out = new ArrayList<>();
            for (JinjaExpression element : list.elements) {
                out.add(eval(element, scope));
            }
            return out;
        }

        // ---- not x , -x -------------------------------------------
        if (node instanceof JinjaUnaryExpression unary) {
            Object operand = eval(unary.operand, scope);
            String op = unary.operator == null ? "" : unary.operator.trim();
            if (op.equals("not"))
                return !truthy(operand);
            if (op.equals("-"))
                return negate(operand, unary.line);
            if (op.equals("+"))
                return operand;
            warn("line " + unary.line + ": unsupported unary operator '" + op + "'");
            return operand;
        }

        // ---- a + b , a == b , a and b ------------------------------
        // Both families expose the same operator/left/right shape.
        if (node instanceof JinjaBinaryExpression bin) {
            return binary(bin.operator, bin.left, bin.right, scope, bin.line);
        }
        if (node instanceof JinjaStmtBinaryExpression bin) {
            return binary(bin.operator, bin.left, bin.right, scope, bin.line);
        }

        // Operators arrive in part two.
        warn("line " + node.line + ": unsupported expression "
                + node.getClass().getSimpleName());
        return null;

    }

    private Object lookup(String name, Scope scope, int line) {
        if (!scope.isDefined(name)) {
            warn("line " + line + ": '" + name
                    + "' is not in the render context, rendered as empty");
            return null;
        }
        return scope.get(name);
    }

    private Object member(Object base, String attribute, int line) {
        if (base instanceof Map<?, ?> map) {
            if (!map.containsKey(attribute)) {
                warn("line " + line + ": key '" + attribute + "' is missing from the data");
                return null;
            }
            return map.get(attribute);
        }
        if (base instanceof List<?> list && (attribute.equals("length") || attribute.equals("size"))) {
            return list.size();
        }
        warn("line " + line + ": cannot read '" + attribute + "' of " + typeName(base));
        return null;
    }

    private Object index(Object base, Object idx, int line) {
        if (base instanceof Map<?, ?> map) {
            return map.get(String.valueOf(idx));
        }
        if (base instanceof List<?> list) {
            if (!(idx instanceof Number n)) {
                warn("line " + line + ": '" + idx + "' is not a valid list index");
                return null;
            }
            int i = n.intValue();
            if (i < 0)
                i += list.size();
            if (i < 0 || i >= list.size()) {
                warn("line " + line + ": index " + idx + " is out of range (size " + list.size() + ")");
                return null;
            }
            return list.get(i);
        }
        warn("line " + line + ": " + typeName(base) + " does not support indexing");
        return null;
    }

    private static String typeName(Object value) {
        if (value == null)
            return "undefined";
        if (value instanceof Map)
            return "dict";
        if (value instanceof List)
            return "list";
        return value.getClass().getSimpleName().toLowerCase();
    }

    /** Python / Jinja truthiness: empty containers and zero are false. */
    public static boolean truthy(Object value) {
        if (value == null)
            return false;
        if (value instanceof Boolean b)
            return b;
        if (value instanceof Number n)
            return n.doubleValue() != 0;
        if (value instanceof String s)
            return !s.isEmpty();
        if (value instanceof List<?> l)
            return !l.isEmpty();
        if (value instanceof Map<?, ?> m)
            return !m.isEmpty();
        return true;
    }

    /** How a value appears inside the generated HTML. */
    public static String stringify(Object value) {
        if (value == null) {
            return ""; // undefined renders as nothing, like Jinja
        }
        if (value instanceof Boolean b) {
            return b ? "True" : "False"; // Python spelling, as Jinja prints it
        }
        if (value instanceof Double d && d == Math.floor(d) && !d.isInfinite()) {
            return String.valueOf(d.longValue()); // 450.0 -> "450"
        }
        return String.valueOf(value);
    }

    private Object binary(String rawOperator, BaseNode leftNode, BaseNode rightNode,
            Scope scope, int line) {
        String op = rawOperator == null ? "" : rawOperator.trim();

        // Short-circuit before touching the right-hand side, like Python.
        if (op.equals("and")) {
            Object left = eval(leftNode, scope);
            return truthy(left) ? eval(rightNode, scope) : left;
        }
        if (op.equals("or")) {
            Object left = eval(leftNode, scope);
            return truthy(left) ? left : eval(rightNode, scope);
        }

        Object left = eval(leftNode, scope);
        Object right = eval(rightNode, scope);

        switch (op) {
            case "==":
            case "is":
                return equalValues(left, right);
            case "!=":
            case "is not":
                return !equalValues(left, right);
            case "<":
                return compare(left, right, line) < 0;
            case "<=":
                return compare(left, right, line) <= 0;
            case ">":
                return compare(left, right, line) > 0;
            case ">=":
                return compare(left, right, line) >= 0;
            case "+":
                return add(left, right, line);
            case "-":
                return arithmetic(left, right, '-', line);
            case "*":
                return arithmetic(left, right, '*', line);
            case "%":
                return arithmetic(left, right, '%', line);
            case "/":
                return divide(left, right, line);
            default:
                warn("line " + line + ": unsupported operator '" + op + "'");
                return null;
        }
    }

    private Object add(Object left, Object right, int line) {
        if (left instanceof String || right instanceof String) {
            return stringify(left) + stringify(right); // Python's string +
        }
        return arithmetic(left, right, '+', line);
    }

    private Object arithmetic(Object left, Object right, char op, int line) {
        Double a = toNumber(left);
        Double b = toNumber(right);
        if (a == null || b == null) {
            warn("line " + line + ": '" + op + "' needs numbers but got "
                    + typeName(left) + " and " + typeName(right));
            return null;
        }
        double result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                result = 0;
                break;
        }
        return narrow(result, isIntegral(left) && isIntegral(right));
    }

    private Object divide(Object left, Object right, int line) {
        Double a = toNumber(left);
        Double b = toNumber(right);
        if (a == null || b == null) {
            warn("line " + line + ": '/' needs numbers");
            return null;
        }
        if (b == 0) {
            warn("line " + line + ": division by zero, rendered as empty");
            return null;
        }
        return a / b; // Python's '/' is always a float
    }

    private Object negate(Object value, int line) {
        Double n = toNumber(value);
        if (n == null) {
            warn("line " + line + ": cannot negate " + typeName(value));
            return null;
        }
        return narrow(-n, isIntegral(value));
    }

    private int compare(Object left, Object right, int line) {
        Double a = toNumber(left);
        Double b = toNumber(right);
        if (a != null && b != null)
            return Double.compare(a, b);
        if (left instanceof String x && right instanceof String y)
            return x.compareTo(y);
        warn("line " + line + ": cannot compare " + typeName(left) + " with " + typeName(right));
        return 0;
    }

    private boolean equalValues(Object left, Object right) {
        if (left == null || right == null)
            return left == right;
        Double a = toNumber(left);
        Double b = toNumber(right);
        if (a != null && b != null)
            return a.doubleValue() == b.doubleValue();
        return left.equals(right);
    }

    private static Double toNumber(Object value) {
        if (value instanceof Number n)
            return n.doubleValue();
        if (value instanceof Boolean b)
            return b ? 1.0 : 0.0;
        if (value instanceof String s) {
            try {
                return Double.valueOf(s.trim());
            } catch (NumberFormatException notANumber) {
                return null;
            }
        }
        return null;
    }

    private static boolean isIntegral(Object value) {
        return value instanceof Integer || value instanceof Long || value instanceof Boolean;
    }

    /** Keeps integer maths integral, so 450 + 50 prints "500" and not "500.0". */
    private static Object narrow(double result, boolean preferInteger) {
        if (preferInteger && result == Math.floor(result) && !Double.isInfinite(result)) {
            long asLong = (long) result;
            if (asLong >= Integer.MIN_VALUE && asLong <= Integer.MAX_VALUE) {
                return (int) asLong;
            }
            return asLong;
        }
        return result;
    }

    // ============================================================
    // Jinja inside a raw attribute value:  href="/product/{{ product.id }}"
    // The parser keeps attribute values as plain text, so the {{ }} parts
    // are found and evaluated here instead of coming in as AST nodes.
    // ============================================================

    public String interpolate(String raw, Scope scope, int line) {
        if (raw == null || !raw.contains("{{")) {
            return raw;
        }
        StringBuilder out = new StringBuilder();
        int i = 0;
        while (i < raw.length()) {
            int open = raw.indexOf("{{", i);
            if (open < 0) {
                out.append(raw, i, raw.length());
                break;
            }
            int close = raw.indexOf("}}", open);
            if (close < 0) {
                warn("line " + line + ": unterminated '{{' in an attribute value");
                out.append(raw, i, raw.length());
                break;
            }
            out.append(raw, i, open);
            out.append(stringify(evalPath(raw.substring(open + 2, close).trim(), scope, line)));
            i = close + 2;
        }
        return out.toString();
    }

    /** Evaluates a plain path: name, product.image, product['name'], items[0].name */
    private Object evalPath(String expr, Scope scope, int line) {
        int i = 0;
        int n = expr.length();

        int start = i;
        while (i < n && isNameChar(expr.charAt(i))) i++;
        if (start == i) {
            warn("line " + line + ": cannot evaluate '" + expr + "' inside an attribute");
            return null;
        }
        String root = expr.substring(start, i);
        if (!scope.isDefined(root)) {
            warn("line " + line + ": '" + root + "' is not in the render context");
            return null;
        }
        Object value = scope.get(root);

        while (i < n && value != null) {
            char c = expr.charAt(i);
            if (c == '.') {
                i++;
                start = i;
                while (i < n && isNameChar(expr.charAt(i))) i++;
                value = member(value, expr.substring(start, i), line);
            } else if (c == '[') {
                int close = expr.indexOf(']', i);
                if (close < 0) {
                    warn("line " + line + ": unterminated '[' in '" + expr + "'");
                    return null;
                }
                String key = expr.substring(i + 1, close).trim();
                if (key.length() >= 2
                        && (key.charAt(0) == '\'' || key.charAt(0) == '"')
                        && key.charAt(key.length() - 1) == key.charAt(0)) {
                    value = index(value, key.substring(1, key.length() - 1), line);
                } else {
                    try {
                        value = index(value, Integer.valueOf(key), line);
                    } catch (NumberFormatException notANumber) {
                        value = index(value, key, line);
                    }
                }
                i = close + 1;
            } else {
                warn("line " + line + ": '" + expr + "' is too complex for an attribute value");
                return null;
            }
        }
        return value;
    }

    private static boolean isNameChar(char c) {
        return Character.isLetterOrDigit(c) || c == '_';
    }

}
