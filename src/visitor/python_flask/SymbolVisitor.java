package visitor.python_flask;

import javax.management.OperationsException;

import org.antlr.v4.runtime.atn.ATN;

import Symbol_table.Symbol;
import Symbol_table.SymbolTable;
import antlr.python_flask.generated.PythonParserBaseVisitor;
import antlr.python_flask.generated.PythonParser.DoubleLiteralContext;
import ast.BaseNode;
import ast.python_flask.BodyNode;
import ast.python_flask.ProgramNode;
import ast.python_flask.StatementNode;
import ast.python_flask.expressions_roles.*;
import ast.python_flask.expressions_roles.atom.*;
import ast.python_flask.expressions_roles.trailer.*;
import ast.python_flask.compound_statement.ClassDefintionNode;
import ast.python_flask.compound_statement.ForStatementNode;
import ast.python_flask.compound_statement.IfStatementNode;
import ast.python_flask.compound_statement.WhileStatementNode;
import ast.python_flask.compound_statement.function_defintion.DecoratorNode;
import ast.python_flask.compound_statement.function_defintion.FunctionDefNode;
import ast.python_flask.compound_statement.function_defintion.param.KwVarArgParamNode;
import ast.python_flask.compound_statement.function_defintion.param.NormalParamNode;
import ast.python_flask.compound_statement.function_defintion.param.ParamNode;
import ast.python_flask.compound_statement.function_defintion.param.VarArgParamNode;
import ast.python_flask.expressions_roles.literal.*;
import ast.python_flask.simple_statement.BreakStatementNode;
import ast.python_flask.simple_statement.ContinueStatementNode;
import ast.python_flask.simple_statement.ExpressionStatementNode;
import ast.python_flask.simple_statement.GlobalStatementNode;
import ast.python_flask.simple_statement.PassStatementNode;
import ast.python_flask.simple_statement.ReturnStatementNode;
import ast.python_flask.simple_statement.assignment_stat.AssignmentOperator;
import ast.python_flask.simple_statement.assignment_stat.AssignmentStatementNode;
import ast.python_flask.expressions_roles.operators.*;
import ast.python_flask.expressions_roles.target.*;
import ast.python_flask.simple_statement.import_stat.ImportItem;
import ast.python_flask.simple_statement.import_stat.ImportStatementNode;

public class SymbolVisitor extends PythonParserBaseVisitor<BaseNode> {
    private SymbolTable table = new SymbolTable();

    // ============================================================
    // Program // ✔️
    // ============================================================
    public void visitProgram(ProgramNode program) {
        table.pushScope("global");
        for (StatementNode stmt : program.statements) {
            this.visitStatement(stmt);
        }
        table.popScope();
    }

    // ============================================================
    // Statement
    // ============================================================
    private void visitStatement(StatementNode stmt) {
        if (stmt instanceof ExpressionStatementNode e) {
            visitExpressionStatement(e);
        }

        else if (stmt instanceof AssignmentStatementNode a) {
            visitAssignment(a);
        }

        else if (stmt instanceof ClassDefintionNode c) {
            visitClassDef(c);
        }

        else if (stmt instanceof FunctionDefNode f) {
            visitFunctionDef(f);
        }

        else if (stmt instanceof ForStatementNode f) {
            visitFor(f);
        }
         else if (stmt instanceof WhileStatementNode w) {
            visitWhile(w);
        }
         else if (stmt instanceof IfStatementNode i) {
            visitIf(i);
        }
        else if (stmt instanceof ImportStatementNode imp) {
            visitImport(imp);
        }
    }

    // ============================================================
    // Expression Statement // ✔️
    // ============================================================
    private void visitExpressionStatement(ExpressionStatementNode e) {
        for (ExpressionNode exp : e.expressions) {
            visitExpression(exp);
        }
    }

    // ============================================================
    // Expression
    // ============================================================
    private void visitExpression(ExpressionNode expr) {

        if (expr == null)
            return;

        if (expr instanceof IdentifierExpression id) {
            table.resolve(id.name);
            return;
        }

        if (expr instanceof ListAtomNode list) {
            for (ExpressionNode e : list.elements) {
                visitExpression(e);
            }
            return;
        }

        if (expr instanceof DictAtomNode dict) {
            for (var pair : dict.entries) {
                visitExpression(pair.a); // key
                visitExpression(pair.b); // value
            }
            return;
        }

        if (expr instanceof ParenAtomNode par) {
            for (ExpressionNode e : par.expressions) {
                visitExpression(e);
            }
            return;
        }

        if (expr instanceof AtomExpressionNode atom) {

            if (atom.atom != null) {
                visitExpression(atom.atom);
                return;
            }

            if (atom.identifier != null) {
                table.resolve(atom.identifier.name);
            }

            for (TrailerNode t : atom.trailers) {
                visitTrailer(t);
            }

            return;
        }

        if (expr instanceof BinaryExpressionNode bin) {
            visitExpression(bin.left);
            visitExpression(bin.right);
            return;
        }

        if (expr instanceof UnaryExpressionNode un) {
            visitExpression(un.expr);
            return;
        }
    }

    private void visitTrailer(TrailerNode trailer) {
        if (trailer instanceof CallTrailerNode callTrailer) {
            // زيارة وسائط استدعاء الدالة
            for (ExpressionNode arg : callTrailer.arguments) {
                visitExpression(arg);
            }
        } else if (trailer instanceof SubscriptTrailerNode subscriptTrailer) {
            // زيارة التعبير داخل الأقواس المربعة
            visitExpression(subscriptTrailer.exp);
        } else if (trailer instanceof AttributeTrailerNode attributeTrailer) {
            // obj.attribute - لا يتم تسجيل رمز جديد
            // يمكن تسجيل استخدام السمة هنا إذا أردت
            // attributeTrailer.attribute.name يحتوي على اسم السمة
        }
    }

    // ============================================================
    // Assignment
    // ============================================================
    private void visitAssignment(AssignmentStatementNode a) {
        switch (a.operator.getOp()) {
            case "=":
                handleAssing(a);
                break;
            case "+=":
                handleAddAssign(a);
                break;
            case "-=":
                handleSubAssign(a);
                break;
            case "*=":
                handleMulAssign(a);
                break;
            case "/=":
                handleDevAssign(a);
                break;
            case "%=":
                handleModAssign(a);
                break;
            case "**=":
                handlePowAssign(a);
                break;
        }
    }

    private void handleAssing(AssignmentStatementNode a) {

        Object literalValue = null;
        int count = 0;

        for (TargetNode t : a.targets) {

            if (a.targets.size() == a.values.size()) {
                literalValue = extractLiteralValue(a.values.get(count++));
                
            } else {
                literalValue = null;
            }

            if (t instanceof VarTargetNode v) {

                table.define(new Symbol(
                        v.attribute.name,
                        "variable",
                        v.line,
                        literalValue));
            }

            else if (t instanceof AttributeTargetNode attr) {
                visitTarget(attr.targetNode);
            }

            else if (t instanceof SubscriptTargetNode sub) {
                visitTarget(sub.targetNode);
                visitExpression(sub.exp);
            }
        }

        for (ExpressionNode value : a.values) {
            visitExpression(value);
        }
    }

    private void handleAddAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    // String + String
                    if (oldVal instanceof String && newVal instanceof String) {
                        result = (String) oldVal + (String) newVal;
                    }
                    // Number + Number
                    else if (oldVal instanceof Number && newVal instanceof Number) {
                        double leftNum = ((Number) oldVal).doubleValue();
                        double rightNum = ((Number) newVal).doubleValue();
                        double sum = leftNum + rightNum;

                        if (oldVal instanceof Integer && newVal instanceof Integer) {
                            result = (int) Math.round(sum);
                        } else if (oldVal instanceof Double || newVal instanceof Double) {
                            result = sum;
                        } else if (oldVal instanceof Float || newVal instanceof Float) {
                            result = (float) sum;
                        } else if (oldVal instanceof Long || newVal instanceof Long) {
                            result = (long) sum;
                        } else {
                            result = sum;
                        }
                    }

                    if (result != null) {
                        table.define(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private void handleSubAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    // Number - Number
                    if (oldVal instanceof Number && newVal instanceof Number) {
                        double leftNum = ((Number) oldVal).doubleValue();
                        double rightNum = ((Number) newVal).doubleValue();
                        double sub = leftNum - rightNum;

                        if (oldVal instanceof Integer && newVal instanceof Integer) {
                            result = (int) Math.round(sub);
                        } else if (oldVal instanceof Double || newVal instanceof Double) {
                            result = sub;
                        } else if (oldVal instanceof Float || newVal instanceof Float) {
                            result = (float) sub;
                        } else if (oldVal instanceof Long || newVal instanceof Long) {
                            result = (long) sub;
                        } else {
                            result = sub;
                        }
                    }

                    if (result != null) {
                        table.define(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private void handleMulAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    // Number * Number
                    if (oldVal instanceof Number && newVal instanceof Number) {
                        double leftNum = ((Number) oldVal).doubleValue();
                        double rightNum = ((Number) newVal).doubleValue();
                        double mul = leftNum * rightNum;

                        if (oldVal instanceof Integer && newVal instanceof Integer) {
                            result = (int) Math.round(mul);
                        } else if (oldVal instanceof Double || newVal instanceof Double) {
                            result = mul;
                        } else if (oldVal instanceof Float || newVal instanceof Float) {
                            result = (float) mul;
                        } else if (oldVal instanceof Long || newVal instanceof Long) {
                            result = (long) mul;
                        } else {
                            result = mul;
                        }
                    }

                    if (result != null) {
                        table.define(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private void handleDevAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    // Number / Number
                    if (oldVal instanceof Number && newVal instanceof Number) {
                        double leftNum = ((Number) oldVal).doubleValue();
                        double rightNum = ((Number) newVal).doubleValue();
                        double dev = leftNum / rightNum;
                        result = dev;
                    }

                    if (result != null) {
                        table.define(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private void handleModAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    // Number % Number
                    if (oldVal instanceof Number && newVal instanceof Number) {
                        double leftNum = ((Number) oldVal).doubleValue();
                        double rightNum = ((Number) newVal).doubleValue();
                        double mod = leftNum % rightNum;

                        if (oldVal instanceof Integer && newVal instanceof Integer) {
                            result = (int) Math.round(mod);
                        } else if (oldVal instanceof Double || newVal instanceof Double) {
                            result = mod;
                        } else if (oldVal instanceof Float || newVal instanceof Float) {
                            result = (float) mod;
                        } else if (oldVal instanceof Long || newVal instanceof Long) {
                            result = (long) mod;
                        } else {
                            result = mod;
                        }
                    }

                    if (result != null) {
                        table.define(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private void handlePowAssign(AssignmentStatementNode a) {
        for (TargetNode t : a.targets) {
            if (t instanceof VarTargetNode v) {
                Symbol old = table.resolve(v.attribute.name);
                Object oldVal = old != null ? old.getValue() : null;

                Object newVal = extractLiteralValue(a.values.get(0));

                if (oldVal != null && newVal != null) {
                    Object result = null;

                    if (oldVal instanceof Integer && newVal instanceof Integer) {
                        int base = ((Integer) oldVal).intValue();
                        int exponent = ((Integer) newVal).intValue();

                        if (base == 0 && exponent < 0) {
                            result = null;
                        } else if (base == 0 && exponent == 0) {
                            result = null;
                        } else {
                            int powResult = (int) Math.pow(base, exponent);
                            result = powResult;
                        }
                    }

                    if (result != null) {
                        table.define(new Symbol(v.attribute.name, "variable", v.line, result));
                    }
                }
            }
        }
    }

    private Object extractLiteralValue(ExpressionNode expr) {

        // -------------------------
        // Add / Sub
        // -------------------------
        if (expr instanceof AddSubExpressionNode add) {
            Object L = extractLiteralValue(add.left);
            Object R = extractLiteralValue(add.right);

            if (L != null && R != null) {
                // String + String
                if (L instanceof String && R instanceof String) {
                    if (add.operator.equals("+")) {
                        return (String) L + (String) R;
                    }
                }

                // Number + Number
                if (L instanceof Number && R instanceof Number) {
                    double leftNum = ((Number) L).doubleValue();
                    double rightNum = ((Number) R).doubleValue();

                    double result = add.operator.equals("+")
                            ? leftNum + rightNum
                            : leftNum - rightNum;
                    if (L instanceof Integer && R instanceof Integer) {
                        return (int) Math.round(result);
                    } else if (L instanceof Double || R instanceof Double) {
                        return result;
                    } else if (L instanceof Float || R instanceof Float) {
                        return (float) result;
                    } else if (L instanceof Long || R instanceof Long) {
                        return (long) result;
                    }
                    return result;
                }
            }
            return null;
        }

        // -------------------------
        // Mul / Div / Mod
        // -------------------------
        if (expr instanceof MulDivModExpressionNode mul) {
            Object L = extractLiteralValue(mul.left);
            Object R = extractLiteralValue(mul.right);

            if (L != null && R != null) {
                if (L instanceof Number && R instanceof Number) {
                    double left = ((Number) L).doubleValue();
                    double right = ((Number) R).doubleValue();

                    // /0
                    if ((mul.operator.equals("/") || mul.operator.equals("%")) && right == 0.0) {
                        return null;
                    }

                    double result = 0;

                    switch (mul.operator) {
                        case "*":
                            result = left * right;
                            if (L instanceof Integer && R instanceof Integer) {
                                return (int) Math.round(result);
                            } else if (L instanceof Float || R instanceof Float) {
                                return (float) result;
                            } else if (L instanceof Long || R instanceof Long) {
                                return (long) result;
                            }
                            break;
                        case "%":
                            result = left % right;
                            if (L instanceof Integer && R instanceof Integer) {
                                return (int) Math.round(result);
                            } else if (L instanceof Float || R instanceof Float) {
                                return (float) result;
                            } else if (L instanceof Long || R instanceof Long) {
                                return (long) result;
                            }
                            break;
                        case "/":
                            result = left / right;
                            break;
                    }
                    

                    return result;
                }
            }
            return null;
        }

        // -------------------------
        // Power (**)
        // -------------------------
        if (expr instanceof PowerExpressionNode pow) {

            Object L = extractLiteralValue(pow.left);
            Object R = extractLiteralValue(pow.right);

            if (L instanceof Integer && R instanceof Integer) {
                int result = (int) Math.pow(((Integer) L).intValue(), ((Integer) R).intValue());
                return result;
            }
            return null;
        }

        // -------------------------
        // LiteralAtomNode
        // -------------------------
        if (expr instanceof LiteralAtomNode lit) {
            // Identifier literal
            if (lit.literal instanceof IdentifierExpression id) {
                Symbol symbol = table.resolve(id.name);
                if (symbol != null && symbol.getValue() != null) {
                    return symbol.getValue();
                }
            }

            // Int
            if (lit.literal instanceof IntLiteralExpression i) {
                return i.value;
            }

            // Double
            if (lit.literal instanceof DoubleLiteralExpression d) {
                return d.value;
            }

            // String
            if (lit.literal instanceof StringLiteralExpression s) {
                return s.value;
            }

            // Boolean
            if (lit.literal instanceof BooleanLiteralExpression b) {
                return b.value;
            }

            // Null
            if (lit.literal instanceof NullLiteralExpression n) {
                return null;
            }
        }

        if (expr instanceof ParenAtomNode par) {
            if (par.expressions.size() != 0) {
                return extractLiteralValue(par.expressions.get(0));
            }
        }

        return null;
    }

    private void visitTarget(TargetNode t) {

        if (t instanceof VarTargetNode v) {
            table.define(new Symbol(
                    v.attribute.name,
                    "variable",
                    v.line));
        }

        else if (t instanceof AttributeTargetNode attr) {
            visitTarget(attr.targetNode);
            table.resolve(attr.attribute.name);
        }

        else if (t instanceof SubscriptTargetNode sub) {
            visitTarget(sub.targetNode);
            visitExpression(sub.exp);
        }
    }

    // ============================================================
    // Class
    // ============================================================
    private void visitClassDef(ClassDefintionNode c) {
        table.define(new Symbol(
                c.nameClass.name,
                "class",
                c.line));

        for (ExpressionNode arg : c.arguments) {
            visitExpression(arg);
        }

        table.pushScope("class " + c.nameClass.name);
        visitBody(c.body);
        table.popScope();
    }

    private void visitBody(BodyNode body) {
        if (body == null)
            return;

        for (StatementNode stmt : body.statements) {
            visitStatement(stmt);
        }
    }

    // ============================================================
    // Function
    // ============================================================
    private void visitFunctionDef(FunctionDefNode f) {

        table.define(new Symbol(
                f.nameFun.name,
                "function",
                f.line,
                extractReturnType(f.returnType)));
        for (DecoratorNode d : f.decorators) {
            visitDecorator(d);
        }

        table.pushScope("function " + f.nameFun.name);

        boolean can_set_dv = true;
        for (int i = f.parameters.size() - 1; i >= 0; i--) {
            ParamNode p = f.parameters.get(i);
            // Normal parameter
            if (p instanceof NormalParamNode np) {
                if (np.defaultValue != null && can_set_dv) {
                    table.define(new Symbol(
                            np.name.name,
                            "parameter",
                            np.line,
                            extractLiteralValue(np.defaultValue)));
                } else {
                    table.define(new Symbol(
                            np.name.name,
                            "parameter",
                            np.line));
                    can_set_dv = false;
                }
            }

            // *args
            else if (p instanceof VarArgParamNode vp) {
                table.define(new Symbol(
                        vp.name.name,
                        "vararg",
                        vp.line));
            }

            // **kwargs
            else if (p instanceof KwVarArgParamNode kp) {
                table.define(new Symbol(
                        kp.name.name,
                        "kwvararg",
                        kp.line));
            }
        }

        if (f.returnType != null)
            visitExpression(f.returnType);

        visitBody(f.body);

        table.popScope();
    }

    private Object extractReturnType(ExpressionNode expr) {
        if (expr instanceof LiteralAtomNode lit) {
            if (lit.literal instanceof IdentifierExpression id) {
                return id.name;
            }
        }
        return null;
    }

    private void visitDecorator(DecoratorNode d) {

        for (IdentifierExpression id : d.path) {
            table.resolve(id.name);
        }

        if (d.arguments != null) {
            for (ArgumentNode arg : d.arguments) {
                visitArgument(arg);
            }
        }
    }

    private void visitArgument(ArgumentNode arg) {

        if (arg.nameArg != null) {
            table.resolve(arg.nameArg.name);
        }

        if (arg.value != null) {
            visitExpression(arg.value);
        }
    }

    // ============================================================
    // For
    // ============================================================
    private void visitFor(ForStatementNode f) {

        for (ExpressionNode iterable : f.iterables) {
            visitExpression(iterable);
        }

        for (TargetNode t : f.targets) {

            if (t instanceof VarTargetNode v) {
                table.define(new Symbol(
                        v.attribute.name,
                        "variable",
                        v.line));
            }

            else if (t instanceof AttributeTargetNode attr) {
                visitTarget(attr.targetNode);
            }

            else if (t instanceof SubscriptTargetNode sub) {
                visitTarget(sub.targetNode);
                visitExpression(sub.exp);
            }
        }

        visitBody(f.body);
    }

    private void visitWhile(WhileStatementNode w) {
        visitExpression(w.iterable);
        visitBody(w.body);
    }

    private void visitIf(IfStatementNode i) {

        if (checkCondition(i.ifCondition)) {
            visitBody(i.bodyIf);
            return;
        }
        else {
            for (var pair : i.elseIfStat) {
                ExpressionNode cond = pair.a;
                BodyNode body = pair.b;

                if (checkCondition(cond)){
                    visitBody(body);
                    return;
                } 
            }
        }

        if (i.bodyElse != null) {
            visitBody(i.bodyElse);
        }
    }

    private boolean checkCondition(ExpressionNode expr) {

        if (expr instanceof ComparisonExpressionNode cmp) {
    
            Object L = extractLiteralValue(cmp.left);
            Object R = extractLiteralValue(cmp.right);
    
            if (L == null || R == null)
                return false;
    
            if (isNumber(L) && isNumber(R)) {
    
                double left = toDouble(L);
                double right = toDouble(R);
    
                return switch (cmp.operator) {
                    case ">"  -> left > right;
                    case "<"  -> left < right;
                    case ">=" -> left >= right;
                    case "<=" -> left <= right;
                    case "==" -> left == right;
                    case "!=" -> left != right;
                    default   -> false;
                };
            }
    
            if (L instanceof String && R instanceof String) {
    
                String left = (String) L;
                String right = (String) R;
    
                return switch (cmp.operator) {
                    case "==" -> left.equals(right);
                    case "!=" -> !left.equals(right);
                    default   -> false; 
                };
            }
    
            return false;
        }
    
        return false;
    }

    private boolean isNumber(Object o) {
        if (o instanceof Integer || o instanceof Double)
            return true;
    
        if (o instanceof String s) {
            try {
                Double.parseDouble(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    
        return false;
    }
    

    private double toDouble(Object o) {
        if (o instanceof Integer i)
            return i.doubleValue();
    
        if (o instanceof Double d)
            return d;
    
        if (o instanceof String s)
            return Double.parseDouble(s);
    
        throw new RuntimeException("Not a number: " + o);
    }
    
    
    

    private void visitImport(ImportStatementNode imp) {

        // 1) إذا كان import عادي (بدون from)
        if (imp.fromModule == null) {

            for (ImportItem item : imp.items) {

                // import module
                if (item.idRight == null) {
                    table.define(new Symbol(
                            item.idLeft,
                            "module",
                            item.line));
                }

                // import module as alias
                else {
                    table.define(new Symbol(
                            item.idRight, // alias
                            "module",
                            item.line));
                }
            }
        }

        // 2) from module import ...
        else {

            // زيارة اسم الموديول (resolve فقط)
            for (String part : imp.fromModule.parts) {
                table.resolve(part);
            }

            for (ImportItem item : imp.items) {

                // from X import name
                if (item.idRight == null) {
                    table.define(new Symbol(
                            item.idLeft,
                            "import",
                            item.line));
                }

                // from X import name as alias
                else {
                    table.define(new Symbol(
                            item.idRight, // alias
                            "import",
                            item.line));
                }
            }
        }
    }

    private void visitGlobal(GlobalStatementNode g) {

        for (String name : g.names) {
            table.resolve(name); // يشير إلى أن الاسم global
        }
    }

    // ============================================================
    // Print Table
    // ============================================================
    public void printSymbols() {
        table.printTable();
    }

}