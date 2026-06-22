package generator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.misc.Pair;

import ast.python_flask.BodyNode;
import ast.python_flask.ProgramNode;
import ast.python_flask.StatementNode;
import ast.python_flask.compound_statement.ClassDefintionNode;
import ast.python_flask.compound_statement.ForStatementNode;
import ast.python_flask.compound_statement.IfStatementNode;
import ast.python_flask.compound_statement.WhileStatementNode;
import ast.python_flask.compound_statement.function_defintion.FunctionDefNode;
import ast.python_flask.expressions_roles.ArgumentNode;
import ast.python_flask.expressions_roles.AtomExpressionNode;
import ast.python_flask.expressions_roles.BinaryExpressionNode;
import ast.python_flask.expressions_roles.ExpressionNode;
import ast.python_flask.expressions_roles.UnaryExpressionNode;
import ast.python_flask.expressions_roles.atom.DictAtomNode;
import ast.python_flask.expressions_roles.atom.ListAtomNode;
import ast.python_flask.expressions_roles.atom.LiteralAtomNode;
import ast.python_flask.expressions_roles.atom.ParenAtomNode;
import ast.python_flask.expressions_roles.literal.StringLiteralExpression;
import ast.python_flask.expressions_roles.trailer.CallTrailerNode;
import ast.python_flask.expressions_roles.trailer.SubscriptTrailerNode;
import ast.python_flask.expressions_roles.trailer.TrailerNode;
import ast.python_flask.simple_statement.ExpressionStatementNode;
import ast.python_flask.simple_statement.ReturnStatementNode;
import ast.python_flask.simple_statement.assignment_stat.AssignmentStatementNode;

/**
 * The "Generator" data-link step (requirement #2).
 *
 * It walks the Python/Flask AST, finds every {@code render_template(...)} call
 * and records, per template, the context variables Flask hands to it, e.g.
 *
 *   render_template('products.html', products=products)
 *      -> "products.html" : { "products" }
 *
 * The resulting map is fed into the Jinja2 tree as its "backend data" so the
 * second AST is validated against the data the Python side actually exports,
 * instead of a hard-coded guess.
 */
public class DataLinkExtractor {

    /** template file name -> set of context variable names exported to it. */
    private final Map<String, Set<String>> templateContext = new LinkedHashMap<>();

    public Map<String, Set<String>> extract(ProgramNode program) {
        if (program != null) {
            walkStatements(program.statements);
        }
        return templateContext;
    }

    /** Context variables for a template, matched by file name (path-insensitive). */
    public Set<String> contextFor(String templatePathOrName) {
        if (templatePathOrName == null) {
            return new LinkedHashSet<>();
        }
        String wanted = baseName(templatePathOrName);
        for (Map.Entry<String, Set<String>> e : templateContext.entrySet()) {
            if (baseName(e.getKey()).equalsIgnoreCase(wanted)) {
                return e.getValue();
            }
        }
        return new LinkedHashSet<>();
    }

    private static String baseName(String path) {
        String p = path.replace('\\', '/');
        int slash = p.lastIndexOf('/');
        return slash >= 0 ? p.substring(slash + 1) : p;
    }

    // ============================================================
    // Statement walk
    // ============================================================
    private void walkStatements(List<StatementNode> stmts) {
        if (stmts == null) {
            return;
        }
        for (StatementNode s : stmts) {
            walkStatement(s);
        }
    }

    private void walkBody(BodyNode body) {
        if (body != null) {
            walkStatements(body.statements);
        }
    }

    private void walkStatement(StatementNode s) {
        if (s == null) {
            return;
        }
        if (s instanceof AssignmentStatementNode a) {
            for (ExpressionNode v : a.values) {
                scanExpr(v);
            }
        } else if (s instanceof ExpressionStatementNode e) {
            if (e.expressions != null) {
                for (ExpressionNode ex : e.expressions) {
                    scanExpr(ex);
                }
            }
        } else if (s instanceof ReturnStatementNode r) {
            if (r.expressions != null) {
                for (ExpressionNode ex : r.expressions) {
                    scanExpr(ex);
                }
            }
        } else if (s instanceof FunctionDefNode f) {
            walkBody(f.body);
        } else if (s instanceof ClassDefintionNode c) {
            walkBody(c.body);
        } else if (s instanceof ForStatementNode fr) {
            if (fr.iterables != null) {
                for (ExpressionNode it : fr.iterables) {
                    scanExpr(it);
                }
            }
            walkBody(fr.body);
        } else if (s instanceof WhileStatementNode w) {
            scanExpr(w.iterable);
            walkBody(w.body);
        } else if (s instanceof IfStatementNode i) {
            scanExpr(i.ifCondition);
            walkBody(i.bodyIf);
            for (Pair<ExpressionNode, BodyNode> p : i.elseIfStat) {
                scanExpr(p.a);
                walkBody(p.b);
            }
            walkBody(i.bodyElse);
        }
    }

    // ============================================================
    // Expression scan: find render_template(...) calls
    // ============================================================
    private void scanExpr(ExpressionNode expr) {
        if (expr == null) {
            return;
        }

        if (expr instanceof AtomExpressionNode ae) {
            if (ae.identifier != null && "render_template".equals(ae.identifier.name)) {
                recordRenderTemplate(ae);
            } else if (ae.atom != null) {
                scanExpr(ae.atom);
            }
            // also scan inside call arguments / subscripts (nested calls)
            if (ae.trailers != null) {
                for (TrailerNode tr : ae.trailers) {
                    if (tr instanceof CallTrailerNode ct) {
                        for (ExpressionNode arg : ct.arguments) {
                            scanExpr(arg);
                        }
                    } else if (tr instanceof SubscriptTrailerNode st) {
                        scanExpr(st.exp);
                    }
                }
            }
            return;
        }

        if (expr instanceof BinaryExpressionNode bin) {
            scanExpr(bin.left);
            scanExpr(bin.right);
        } else if (expr instanceof UnaryExpressionNode un) {
            scanExpr(un.expr);
        } else if (expr instanceof ParenAtomNode par) {
            for (ExpressionNode e : par.expressions) {
                scanExpr(e);
            }
        } else if (expr instanceof ListAtomNode la) {
            for (ExpressionNode e : la.elements) {
                scanExpr(e);
            }
        } else if (expr instanceof DictAtomNode da) {
            for (Pair<ExpressionNode, ExpressionNode> entry : da.entries) {
                scanExpr(entry.a);
                scanExpr(entry.b);
            }
        } else if (expr instanceof ArgumentNode arg) {
            scanExpr(arg.value);
        }
    }

    private void recordRenderTemplate(AtomExpressionNode ae) {
        CallTrailerNode call = null;
        if (ae.trailers != null) {
            for (TrailerNode tr : ae.trailers) {
                if (tr instanceof CallTrailerNode ct) {
                    call = ct;
                    break;
                }
            }
        }
        if (call == null) {
            return;
        }

        String templateName = null;
        Set<String> context = new LinkedHashSet<>();

        for (ExpressionNode argExpr : call.arguments) {
            if (!(argExpr instanceof ArgumentNode arg)) {
                continue;
            }
            if (arg.nameArg != null) {
                // keyword argument: products=products  ->  context var "products"
                context.add(arg.nameArg.name);
            } else if (templateName == null) {
                // first positional string literal is the template file name
                String s = stringValueOf(arg.value);
                if (s != null) {
                    templateName = s;
                }
            }
        }

        if (templateName != null) {
            templateContext
                    .computeIfAbsent(templateName, k -> new LinkedHashSet<>())
                    .addAll(context);
        }
    }

    private String stringValueOf(ExpressionNode expr) {
        if (expr instanceof LiteralAtomNode lit && lit.literal instanceof StringLiteralExpression s) {
            return s.value;
        }
        return null;
    }

    // Kept for callers that want a flat view of every exported template.
    public List<String> templateNames() {
        return new ArrayList<>(templateContext.keySet());
    }
}
