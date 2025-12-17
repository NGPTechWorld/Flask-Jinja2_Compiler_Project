// Generated from ./src/antlr/python_flask/PythonParser.g4 by ANTLR 4.13.2

package antlr.python_flask.generated;

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
	 * Enter a parse tree produced by {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(PythonParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(PythonParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(PythonParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(PythonParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(PythonParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(PythonParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importModule}.
	 * @param ctx the parse tree
	 */
	void enterImportModule(PythonParser.ImportModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importModule}.
	 * @param ctx the parse tree
	 */
	void exitImportModule(PythonParser.ImportModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStatement(PythonParser.GlobalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStatement(PythonParser.GlobalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#passStatement}.
	 * @param ctx the parse tree
	 */
	void enterPassStatement(PythonParser.PassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#passStatement}.
	 * @param ctx the parse tree
	 */
	void exitPassStatement(PythonParser.PassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PythonParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PythonParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(PythonParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(PythonParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PythonParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PythonParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PythonParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PythonParser.ParamContext ctx);
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
	 * Enter a parse tree produced by the {@code VarTarget}
	 * labeled alternative in {@link PythonParser#target}.
	 * @param ctx the parse tree
	 */
	void enterVarTarget(PythonParser.VarTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarTarget}
	 * labeled alternative in {@link PythonParser#target}.
	 * @param ctx the parse tree
	 */
	void exitVarTarget(PythonParser.VarTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubscriptTarget}
	 * labeled alternative in {@link PythonParser#target}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptTarget(PythonParser.SubscriptTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubscriptTarget}
	 * labeled alternative in {@link PythonParser#target}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptTarget(PythonParser.SubscriptTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeTarget}
	 * labeled alternative in {@link PythonParser#target}.
	 * @param ctx the parse tree
	 */
	void enterAttributeTarget(PythonParser.AttributeTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeTarget}
	 * labeled alternative in {@link PythonParser#target}.
	 * @param ctx the parse tree
	 */
	void exitAttributeTarget(PythonParser.AttributeTargetContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#augmentedAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAugmentedAssignment(PythonParser.AugmentedAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#augmentedAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAugmentedAssignment(PythonParser.AugmentedAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(PythonParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(PythonParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(PythonParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(PythonParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotExpression(PythonParser.IsNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotExpression(PythonParser.IsNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(PythonParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(PythonParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(PythonParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(PythonParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(PythonParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(PythonParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpressionAt}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpressionAt(PythonParser.AtomExpressionAtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpressionAt}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpressionAt(PythonParser.AtomExpressionAtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(PythonParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(PythonParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(PythonParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(PythonParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivModExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModExpression(PythonParser.MulDivModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivModExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModExpression(PythonParser.MulDivModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpression(PythonParser.AtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpression(PythonParser.AtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubscriptTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptTrailer(PythonParser.SubscriptTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubscriptTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptTrailer(PythonParser.SubscriptTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterAttributeTrailer(PythonParser.AttributeTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitAttributeTrailer(PythonParser.AttributeTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenAtom(PythonParser.ParenAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenAtom(PythonParser.ParenAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDictAtom(PythonParser.DictAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDictAtom(PythonParser.DictAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterLiteralAtom(PythonParser.LiteralAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitLiteralAtom(PythonParser.LiteralAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#keyValueList}.
	 * @param ctx the parse tree
	 */
	void enterKeyValueList(PythonParser.KeyValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#keyValueList}.
	 * @param ctx the parse tree
	 */
	void exitKeyValueList(PythonParser.KeyValueListContext ctx);
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
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(PythonParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(PythonParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(PythonParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(PythonParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(PythonParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(PythonParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FStringLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFStringLiteral(PythonParser.FStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FStringLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFStringLiteral(PythonParser.FStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(PythonParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(PythonParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(PythonParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(PythonParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierLiteral(PythonParser.IdentifierLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierLiteral}
	 * labeled alternative in {@link PythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierLiteral(PythonParser.IdentifierLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(PythonParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(PythonParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PythonParser.ArgumentContext ctx);
}