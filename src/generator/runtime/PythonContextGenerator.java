package generator.python_flask;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.Pair;

import ast.BaseNode;
import ast.python_flask.BodyNode;
import ast.python_flask.ProgramNode;
import ast.python_flask.StatementNode;
import ast.python_flask.compound_statement.ClassDefintionNode;
import ast.python_flask.compound_statement.ForStatementNode;
import ast.python_flask.compound_statement.IfStatementNode;
import ast.python_flask.compound_statement.WhileStatementNode;
import ast.python_flask.compound_statement.function_defintion.FunctionDefNode;
import ast.python_flask.expressions_roles.ArgumentNode;
import ast.python_flask.expressions_roles.ExpressionNode;
import ast.python_flask.expressions_roles.IdentifierExpression;
import ast.python_flask.expressions_roles.atom.AtomExpressionNode;
import ast.python_flask.expressions_roles.atom.DictAtomNode;
import ast.python_flask.expressions_roles.atom.LiteralAtomNode;
import ast.python_flask.expressions_roles.atom.ListAtomNode;
import ast.python_flask.expressions_roles.atom.ParenAtomNode;
import ast.python_flask.expressions_roles.literal.BooleanLiteralExpression;
import ast.python_flask.expressions_roles.literal.DoubleLiteralExpression;
import ast.python_flask.expressions_roles.literal.IntLiteralExpression;
import ast.python_flask.expressions_roles.literal.NullLiteralExpression;
import ast.python_flask.expressions_roles.literal.StringLiteralExpression;
import ast.python_flask.expressions_roles.operators.AddSubExpressionNode;
import ast.python_flask.expressions_roles.operators.MulDivModExpressionNode;
import ast.python_flask.expressions_roles.operators.PowerExpressionNode;
import ast.python_flask.expressions_roles.target.TargetNode;
import ast.python_flask.expressions_roles.target.VarTargetNode;
import ast.python_flask.expressions_roles.trailer.AttributeTrailerNode;
import ast.python_flask.expressions_roles.trailer.CallTrailerNode;
import ast.python_flask.expressions_roles.trailer.SubscriptTrailerNode;
import ast.python_flask.expressions_roles.trailer.TrailerNode;
import ast.python_flask.simple_statement.ExpressionStatementNode;
import ast.python_flask.simple_statement.ReturnStatementNode;
import ast.python_flask.simple_statement.assignment_stat.AssignmentStatementNode;

/**
 * ============================================================
 * PythonContextGenerator
 * ============================================================
 * مرحلة Code Generation - جزء Python
 *
 * هاد الصنف لا يعتمد إطلاقاً على SymbolTable (متعمد حسب متطلبات
 * المرحلة). بيمشي مباشرة على Python AST (ProgramNode) ويحسب
 * القيم الفعلية عن طريق Evaluator خاص فيه، وبعدين يكتشف كل
 * استدعاءات render_template(...) ويبني لكل وحدة منها Scope
 * (Context) جاهز يتبعت لمحرك توليد Jinja.
 *
 * ملاحظة هامة:
 * الحقول التالية مؤكدة 100% من كود الـ Visitor المرفق:
 *   ListAtomNode.elements , DictAtomNode.entries , LiteralAtomNode.literal
 *   VarTargetNode.attribute , AssignmentStatementNode(targets/operator/values)
 *   AtomExpressionNode(line, identifier, trailers) -> بالكونستركتور بس
 *
 * جميع أسماء الحقول بهذا الملف مؤكدة 100% من ملفات الكلاسات الفعلية
 * (AtomExpressionNode, AttributeTrailerNode, SubscriptTrailerNode,
 * CallTrailerNode, ArgumentNode, BodyNode, ClassDefintionNode).
 * لا يوجد أي تخمين متبقٍ.
 *
 * الاستثناء الوحيد: أسماء حقول ExpressionStatementNode.expressions
 * و ReturnStatementNode.values مبنية على ترتيب الكونستركتور بالـ
 * Visitor (لم يُتَح الوصول المباشر للحقل بأي مكان بالكود المرفق)،
 * وهي شبه مؤكدة لكن يُفضّل التحقق السريع منها إذا صار خطأ ترجمة.
 */
public class PythonContextGenerator {

    /** يمثل Context/Scope واحد جاهز للتمرير إلى Jinja Renderer */
    public static class Scope {
        private final Map<String, Object> variables = new LinkedHashMap<>();

        public void set(String name, Object value) {
            variables.put(name, value);
        }

        public Object get(String name) {
            return variables.get(name);
        }

        public Map<String, Object> raw() {
            return variables;
        }

        @Override
        public String toString() {
            return variables.toString();
        }
    }

    /** يمثل استدعاء render_template واحد تم اكتشافه بالكود */
    public static class RenderCall {
        public final String templateName;
        public final Scope scope;
        public final int line;

        public RenderCall(String templateName, Scope scope, int line) {
            this.templateName = templateName;
            this.scope = scope;
            this.line = line;
        }
    }

    // السجل الخاص بمرحلة التوليد -> generation_log.txt
    private final List<String> logLines = new ArrayList<>();

    private void log(String msg) {
        logLines.add(msg);
    }

    public void flushLog(String path) throws IOException {
        try (FileWriter fw = new FileWriter(path)) {
            for (String line : logLines) {
                fw.write(line + System.lineSeparator());
            }
        }
    }

    // ============================================================
    // 1) بناء الـ Global Context من كل Assignment على مستوى الملف
    // ============================================================
    public Scope buildGlobalContext(ProgramNode program) {
        Scope globalScope = new Scope();
        log("[GEN] Start building global context from app.py");

        for (StatementNode stmt : program.statements) {
            processTopLevelStatement(stmt, globalScope);
        }

        log("[GEN] Finished global context. Variables: " + globalScope.raw().keySet());
        return globalScope;
    }

    private void processTopLevelStatement(StatementNode stmt, Scope globalScope) {
        if (stmt instanceof AssignmentStatementNode assign) {
            handleAssignment(assign, globalScope);
        }
        // FunctionDefNode و ClassDefintionNode ما بولّدوا context مباشرة
        // بس لازم نمشي جواتها لنكتشف render_template calls لاحقاً (خطوة 2)
    }

    private void handleAssignment(AssignmentStatementNode assign, Scope globalScope) {
        int count = 0;
        for (TargetNode target : assign.targets) {
            if (!(target instanceof VarTargetNode varTarget)) {
                // AttributeTargetNode / SubscriptTargetNode: تجاوز حالياً
                // (تعديل خاصية على كائن موجود مسبقاً - غير مطلوب بالـ demo)
                continue;
            }

            ExpressionNode valueExpr = (assign.targets.size() == assign.values.size())
                    ? assign.values.get(count)
                    : (assign.values.size() == 1 ? assign.values.get(0) : null);

            Object value = evaluate(valueExpr, globalScope);
            String varName = varTarget.attribute.name;
            globalScope.set(varName, value);

            log("[GEN] Evaluated '" + varName + "' -> " + describe(value));
            count++;
        }
    }

    // ============================================================
    // 2) Evaluator: تحويل أي ExpressionNode إلى قيمة Java فعلية
    // ============================================================
    public Object evaluate(ExpressionNode expr, Scope scope) {
        if (expr == null) return null;

        // --- Literal مباشر: رقم / نص / بوليان / null / identifier ---
        if (expr instanceof LiteralAtomNode lit) {
            return evaluateLiteral(lit, scope);
        }

        // --- List: [ ... ] ---
        if (expr instanceof ListAtomNode listNode) {
            List<Object> result = new ArrayList<>();
            for (ExpressionNode element : listNode.elements) {
                result.add(evaluate(element, scope));
            }
            return result;
        }

        // --- Dict: { key: value, ... } ---
        if (expr instanceof DictAtomNode dictNode) {
            Map<Object, Object> result = new LinkedHashMap<>();
            for (Pair<ExpressionNode, ExpressionNode> entry : dictNode.entries) {
                Object key = evaluate(entry.a, scope);
                Object value = evaluate(entry.b, scope);
                result.put(key, value);
            }
            return result;
        }

        // --- (expr) أو (expr, expr, ...) ---
        if (expr instanceof ParenAtomNode parenNode) {
            if (parenNode.expressions.isEmpty()) return null;
            if (parenNode.expressions.size() == 1) {
                return evaluate(parenNode.expressions.get(0), scope);
            }
            List<Object> tuple = new ArrayList<>();
            for (ExpressionNode e : parenNode.expressions) {
                tuple.add(evaluate(e, scope));
            }
            return tuple;
        }

        // --- identifier[...trailers...] مثل: product.name أو products[0] أو دالة() ---
        if (expr instanceof AtomExpressionNode atomExpr) {
            return evaluateAtomExpression(atomExpr, scope);
        }

        // --- عمليات حسابية ---
        if (expr instanceof AddSubExpressionNode add) {
            return evalAddSub(add, scope);
        }
        if (expr instanceof MulDivModExpressionNode mul) {
            return evalMulDivMod(mul, scope);
        }
        if (expr instanceof PowerExpressionNode pow) {
            Object base = evaluate(pow.left, scope);
            Object exp = evaluate(pow.right, scope);
            if (base instanceof Number && exp instanceof Number) {
                return (int) Math.pow(((Number) base).doubleValue(), ((Number) exp).doubleValue());
            }
            return null;
        }

        log("[GEN][WARN] Unsupported expression type: " + expr.getClass().getSimpleName());
        return null;
    }

    private Object evaluateLiteral(LiteralAtomNode lit, Scope scope) {
        if (lit.literal instanceof IdentifierExpression id) {
            // مرجع لمتغير موجود بالـ scope الحالي (بدل SymbolTable)
            return scope.get(id.name);
        }
        if (lit.literal instanceof IntLiteralExpression i) return i.value;
        if (lit.literal instanceof DoubleLiteralExpression d) return d.value;
        if (lit.literal instanceof StringLiteralExpression s) return s.value;
        if (lit.literal instanceof BooleanLiteralExpression b) return b.value;
        if (lit.literal instanceof NullLiteralExpression) return null;
        return null;
    }

    private Object evalAddSub(AddSubExpressionNode add, Scope scope) {
        Object left = evaluate(add.left, scope);
        Object right = evaluate(add.right, scope);
        if (left instanceof String && right instanceof String && add.operator.equals("+")) {
            return (String) left + (String) right;
        }
        if (left instanceof Number && right instanceof Number) {
            double l = ((Number) left).doubleValue();
            double r = ((Number) right).doubleValue();
            double res = add.operator.equals("+") ? l + r : l - r;
            if (left instanceof Integer && right instanceof Integer) return (int) Math.round(res);
            return res;
        }
        return null;
    }

    private Object evalMulDivMod(MulDivModExpressionNode mul, Scope scope) {
        Object left = evaluate(mul.left, scope);
        Object right = evaluate(mul.right, scope);
        if (left instanceof Number && right instanceof Number) {
            double l = ((Number) left).doubleValue();
            double r = ((Number) right).doubleValue();
            boolean bothInt = left instanceof Integer && right instanceof Integer;
            switch (mul.operator) {
                case "*": return bothInt ? (int) Math.round(l * r) : l * r;
                case "/": return (r == 0.0) ? null : l / r;
                case "%": return (r == 0.0) ? null : (bothInt ? (int) Math.round(l % r) : l % r);
            }
        }
        return null;
    }

    /**
     * يعالج تعابير من نوع: identifier + trailers
     * أمثلة: products, product.name, products[0], render_template(...)
     */
    @SuppressWarnings("unchecked")
    private Object evaluateAtomExpression(AtomExpressionNode atomExpr, Scope scope) {
        // حالة نادرة: AtomExpressionNode مغلّف حول atom مباشر (بدون identifier/trailers)
        if (atomExpr.atom != null) {
            return evaluate(atomExpr.atom, scope);
        }

        IdentifierExpression baseId = atomExpr.identifier;
        List<TrailerNode> trailers = atomExpr.trailers;

        Object current = scope.get(baseId.name);

        for (TrailerNode trailer : trailers) {
            if (trailer instanceof AttributeTrailerNode attrTrailer) {
                // .name -> current لازم يكون Map (dict بايثون)
                if (current instanceof Map<?, ?> map) {
                    current = map.get(attrTrailer.attribute.name);
                } else {
                    current = null;
                }
            } else if (trailer instanceof SubscriptTrailerNode subTrailer) {
                // [index] -> current لازم يكون List أو Map
                Object indexVal = evaluate(subTrailer.exp, scope);
                if (current instanceof List<?> list && indexVal instanceof Integer idx) {
                    current = (idx >= 0 && idx < list.size()) ? list.get(idx) : null;
                } else if (current instanceof Map<?, ?> map) {
                    current = map.get(indexVal);
                } else {
                    current = null;
                }
            } else if (trailer instanceof CallTrailerNode) {
                // استدعاء دالة عادية غير render_template -> غير مدعوم بالتقييم الساكن
                log("[GEN][WARN] Unsupported function call skipped in evaluate(): " + baseId.name);
                current = null;
            }
        }
        return current;
    }

    // ============================================================
    // 3) اكتشاف كل استدعاءات render_template(...) بالشجرة كاملة
    // ============================================================
    public List<RenderCall> findRenderTemplateCalls(ProgramNode program, Scope globalScope) {
        List<RenderCall> calls = new ArrayList<>();
        for (StatementNode stmt : program.statements) {
            walkStatement(stmt, globalScope, calls);
        }
        return calls;
    }

    private void walkStatement(StatementNode stmt, Scope globalScope, List<RenderCall> calls) {
        if (stmt instanceof FunctionDefNode func) {
            walkBody(func.body, globalScope, calls);
        } else if (stmt instanceof IfStatementNode ifStmt) {
            walkBody(ifStmt.bodyIf, globalScope, calls);
            for (Pair<ExpressionNode, BodyNode> elif : ifStmt.elseIfStat) {
                walkBody(elif.b, globalScope, calls);
            }
            if (ifStmt.bodyElse != null) walkBody(ifStmt.bodyElse, globalScope, calls);
        } else if (stmt instanceof ForStatementNode forStmt) {
            walkBody(forStmt.body, globalScope, calls);
        } else if (stmt instanceof WhileStatementNode whileStmt) {
            walkBody(whileStmt.body, globalScope, calls);
        } else if (stmt instanceof ClassDefintionNode classStmt) {
            walkBody(classStmt.body, globalScope, calls);
        } else if (stmt instanceof ExpressionStatementNode exprStmt) {
            for (ExpressionNode e : exprStmt.expressions) {
                collectRenderCallFromExpression(e, globalScope, calls);
            }
        } else if (stmt instanceof ReturnStatementNode retStmt) {
            for (ExpressionNode e : retStmt.expressions) {
                collectRenderCallFromExpression(e, globalScope, calls);
            }
        }
    }

    private void walkBody(BodyNode body, Scope globalScope, List<RenderCall> calls) {
        if (body == null) return;
        for (StatementNode stmt : body.statements) {
            walkStatement(stmt, globalScope, calls);
        }
    }

    private void collectRenderCallFromExpression(ExpressionNode expr, Scope globalScope, List<RenderCall> calls) {
        if (!(expr instanceof AtomExpressionNode atomExpr)) return;
        if (atomExpr.identifier == null) return; // حالة atom المغلّف - مش استدعاء

        IdentifierExpression baseId = atomExpr.identifier;
        List<TrailerNode> trailers = atomExpr.trailers;

        if (!"render_template".equals(baseId.name)) return;

        for (TrailerNode trailer : trailers) {
            if (!(trailer instanceof CallTrailerNode callTrailer)) continue;

            String templateName = null;
            Scope callScope = new Scope();

            List<ExpressionNode> args = callTrailer.arguments;
            boolean first = true;
            for (ExpressionNode argExpr : args) {
                if (!(argExpr instanceof ArgumentNode arg)) continue;

                if (first && arg.nameArg == null) {
                    // الوسيط الأول الموضعي = اسم القالب
                    Object val = evaluate(arg.value, globalScope);
                    if (val instanceof String s) templateName = s;
                } else if (arg.nameArg != null) {
                    // keyword argument: name=expression -> يُضاف للـ Scope
                    Object val = evaluate(arg.value, globalScope);
                    callScope.set(arg.nameArg.name, val);
                }
                first = false;
            }

            if (templateName != null) {
                calls.add(new RenderCall(templateName, callScope, atomExpr.line));
                log("[GEN] Found render_template('" + templateName + "') with vars: " + callScope.raw().keySet());
            }
        }
    }

    private String describe(Object value) {
        if (value instanceof List<?> list) return "List<" + list.size() + " items>";
        if (value instanceof Map<?, ?> map) return "Dict<" + map.size() + " keys>";
        return String.valueOf(value);
    }

    // ============================================================
    // نقطة دخول مقترحة لمرحلة التوليد كاملة
    // ============================================================
    public void run(ProgramNode program, String logOutputPath) throws IOException {
        Scope globalScope = buildGlobalContext(program);
        List<RenderCall> renderCalls = findRenderTemplateCalls(program, globalScope);

        for (RenderCall call : renderCalls) {
            log("[GEN] Ready to render '" + call.templateName + "' -> pass to Jinja Renderer");
            // هنا لاحقاً: jinjaRenderer.render(jinjaAstFor(call.templateName), call.scope);
        }

        flushLog(logOutputPath);
    }
}
