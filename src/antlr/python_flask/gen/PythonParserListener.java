// Generated from D:/Projects/Java/Antlr/Compiler1Project/src/antlr/python_flask/PythonParser.g4 by ANTLR 4.13.2
package antlr.python_flask.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable(PythonParser.IterableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable(PythonParser.IterableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(PythonParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(PythonParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(PythonParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(PythonParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elifStatement}.
	 * @param ctx the parse tree
	 */
	void enterElifStatement(PythonParser.ElifStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elifStatement}.
	 * @param ctx the parse tree
	 */
	void exitElifStatement(PythonParser.ElifStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(PythonParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(PythonParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PythonParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PythonParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#compOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompOperator(PythonParser.CompOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#compOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompOperator(PythonParser.CompOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PythonParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PythonParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(PythonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(PythonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(PythonParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(PythonParser.KeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PythonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PythonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDouble(PythonParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDouble(PythonParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterInteger(PythonParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitInteger(PythonParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(PythonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(PythonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(PythonParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(PythonParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(PythonParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(PythonParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBool(PythonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBool(PythonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNull(PythonParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNull(PythonParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#targetList}.
	 * @param ctx the parse tree
	 */
	void enterTargetList(PythonParser.TargetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#targetList}.
	 * @param ctx the parse tree
	 */
	void exitTargetList(PythonParser.TargetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(PythonParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(PythonParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(PythonParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(PythonParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PythonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PythonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PythonParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PythonParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#augmentedAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAugmentedAssignment(PythonParser.AugmentedAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#augmentedAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAugmentedAssignment(PythonParser.AugmentedAssignmentContext ctx);
}