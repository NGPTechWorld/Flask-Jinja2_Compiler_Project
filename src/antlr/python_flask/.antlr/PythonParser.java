// Generated from d:/Projects/Compiler1Project/src/antlr/python_flask/PythonParser.g4 by ANTLR 4.13.1

package antlr.python_flask.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, INDENT=2, DEDENT=3, WS=4, IF=5, ELIF=6, ELSE=7, FOR=8, IN=9, 
		RANGE=10, CONTINUE=11, BREAK=12, DEF=13, RETURN=14, IMPORT=15, FROM=16, 
		AS=17, GLOBAL=18, IS=19, AND=20, OR=21, NOT=22, PASS=23, CLASS=24, WHILE=25, 
		LKB=26, RKB=27, LSB=28, RSB=29, LPAREN=30, RPAREN=31, COLON=32, COMMA=33, 
		ARROW=34, POWER=35, AT=36, DOT=37, INT=38, DOUBLE=39, STRING=40, TRUE=41, 
		FALSE=42, NULL=43, FSTRING=44, IDENTIFIER=45, EQUAL=46, PLUS=47, MINUS=48, 
		STAR=49, DIV=50, MOD=51, PLUS_EQUAL=52, MINUS_EQUAL=53, STAR_EQUAL=54, 
		DIV_EQUAL=55, MOD_EQUAL=56, EQ=57, NEQ=58, LT=59, LTE=60, GT=61, GTE=62, 
		ISNOT=63, COMMENT=64;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simpleStatement = 2, RULE_compoundStatement = 3, 
		RULE_returnStatement = 4, RULE_breakStatement = 5, RULE_continueStatement = 6, 
		RULE_importStatement = 7, RULE_importItem = 8, RULE_importModule = 9, 
		RULE_globalStatement = 10, RULE_passStatement = 11, RULE_classDef = 12, 
		RULE_body = 13, RULE_funcdef = 14, RULE_decorators = 15, RULE_decorator = 16, 
		RULE_dottedName = 17, RULE_parameters = 18, RULE_param = 19, RULE_forStatement = 20, 
		RULE_whileStatement = 21, RULE_ifStatement = 22, RULE_assignmentStatement = 23, 
		RULE_targetList = 24, RULE_target = 25, RULE_expressionList = 26, RULE_augmentedAssignment = 27, 
		RULE_expression = 28, RULE_atomExpression = 29, RULE_trailer = 30, RULE_atom = 31, 
		RULE_keyValueList = 32, RULE_keyValue = 33, RULE_literal = 34, RULE_arglist = 35, 
		RULE_argument = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simpleStatement", "compoundStatement", "returnStatement", 
			"breakStatement", "continueStatement", "importStatement", "importItem", 
			"importModule", "globalStatement", "passStatement", "classDef", "body", 
			"funcdef", "decorators", "decorator", "dottedName", "parameters", "param", 
			"forStatement", "whileStatement", "ifStatement", "assignmentStatement", 
			"targetList", "target", "expressionList", "augmentedAssignment", "expression", 
			"atomExpression", "trailer", "atom", "keyValueList", "keyValue", "literal", 
			"arglist", "argument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'if'", "'elif'", "'else'", "'for'", "'in'", 
			"'range'", "'continue'", "'break'", "'def'", "'return'", "'import'", 
			"'from'", "'as'", "'global'", "'is'", "'and'", "'or'", "'not'", "'pass'", 
			"'class'", "'while'", "'{'", "'}'", "'['", "']'", "'('", "')'", "':'", 
			"','", "'->'", "'**'", "'@'", "'.'", null, null, null, "'True'", "'False'", 
			"'None'", null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'is not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "INDENT", "DEDENT", "WS", "IF", "ELIF", "ELSE", "FOR", 
			"IN", "RANGE", "CONTINUE", "BREAK", "DEF", "RETURN", "IMPORT", "FROM", 
			"AS", "GLOBAL", "IS", "AND", "OR", "NOT", "PASS", "CLASS", "WHILE", "LKB", 
			"RKB", "LSB", "RSB", "LPAREN", "RPAREN", "COLON", "COMMA", "ARROW", "POWER", 
			"AT", "DOT", "INT", "DOUBLE", "STRING", "TRUE", "FALSE", "NULL", "FSTRING", 
			"IDENTIFIER", "EQUAL", "PLUS", "MINUS", "STAR", "DIV", "MOD", "PLUS_EQUAL", 
			"MINUS_EQUAL", "STAR_EQUAL", "DIV_EQUAL", "MOD_EQUAL", "EQ", "NEQ", "LT", 
			"LTE", "GT", "GTE", "ISNOT", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70164058339618L) != 0)) {
				{
				{
				setState(74);
				statement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
			case CONTINUE:
			case BREAK:
			case RETURN:
			case IMPORT:
			case FROM:
			case GLOBAL:
			case NOT:
			case PASS:
			case LKB:
			case LSB:
			case LPAREN:
			case INT:
			case DOUBLE:
			case STRING:
			case TRUE:
			case FALSE:
			case NULL:
			case FSTRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				simpleStatement();
				}
				break;
			case IF:
			case FOR:
			case DEF:
			case CLASS:
			case WHILE:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				compoundStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public PassStatementContext passStatement() {
			return getRuleContext(PassStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleStatement);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				importStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				globalStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				passStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				breakStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70095279751168L) != 0)) {
					{
					setState(93);
					expressionList();
					}
				}

				setState(96);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compoundStatement);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				whileStatement();
				}
				break;
			case DEF:
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				funcdef();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				classDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(RETURN);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70095279751168L) != 0)) {
				{
				setState(107);
				expressionList();
				}
			}

			setState(110);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PythonParser.BREAK, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(BREAK);
			setState(113);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(PythonParser.CONTINUE, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CONTINUE);
			setState(116);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public ImportModuleContext importModule() {
			return getRuleContext(ImportModuleContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importStatement);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(IMPORT);
				setState(119);
				importItem();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					importItem();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(NEWLINE);
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(FROM);
				setState(130);
				importModule();
				setState(131);
				match(IMPORT);
				setState(132);
				importItem();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(133);
					match(COMMA);
					setState(134);
					importItem();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PythonParser.IDENTIFIER, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IDENTIFIER);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(145);
				match(AS);
				setState(146);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportModuleContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PythonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public ImportModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importModule; }
	}

	public final ImportModuleContext importModule() throws RecognitionException {
		ImportModuleContext _localctx = new ImportModuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importModule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IDENTIFIER);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(150);
				match(DOT);
				setState(151);
				match(IDENTIFIER);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStatementContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(PythonParser.GLOBAL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PythonParser.IDENTIFIER, i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(GLOBAL);
			setState(158);
			match(IDENTIFIER);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(159);
				match(COMMA);
				setState(160);
				match(IDENTIFIER);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PassStatementContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public PassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passStatement; }
	}

	public final PassStatementContext passStatement() throws RecognitionException {
		PassStatementContext _localctx = new PassStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_passStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(PASS);
			setState(169);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(CLASS);
			setState(172);
			match(IDENTIFIER);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(173);
				match(LPAREN);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70129639489536L) != 0)) {
					{
					setState(174);
					arglist();
					}
				}

				setState(177);
				match(RPAREN);
				}
			}

			setState(180);
			match(COLON);
			setState(181);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(INDENT);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				statement();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 70164058339618L) != 0) );
			setState(189);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(PythonParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(191);
				decorators();
				}
			}

			setState(194);
			match(DEF);
			setState(195);
			match(IDENTIFIER);
			setState(196);
			match(LPAREN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 598168685248512L) != 0)) {
				{
				setState(197);
				parameters();
				}
			}

			setState(200);
			match(RPAREN);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(201);
				match(ARROW);
				setState(202);
				expression(0);
				}
			}

			setState(205);
			match(COLON);
			setState(206);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorsContext extends ParserRuleContext {
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorators; }
	}

	public final DecoratorsContext decorators() throws RecognitionException {
		DecoratorsContext _localctx = new DecoratorsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				decorator();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(AT);
			setState(214);
			dottedName();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(215);
				match(LPAREN);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70129639489536L) != 0)) {
					{
					setState(216);
					arglist();
					}
				}

				setState(219);
				match(RPAREN);
				}
			}

			setState(222);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DottedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PythonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public DottedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedName; }
	}

	public final DottedNameContext dottedName() throws RecognitionException {
		DottedNameContext _localctx = new DottedNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dottedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(IDENTIFIER);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(225);
				match(DOT);
				setState(226);
				match(IDENTIFIER);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			param();
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(COMMA);
					setState(234);
					param();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(240);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KwVarArgParamContext extends ParamContext {
		public TerminalNode POWER() { return getToken(PythonParser.POWER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public KwVarArgParamContext(ParamContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarArgParamContext extends ParamContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public VarArgParamContext(ParamContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalParamContext extends ParamContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NormalParamContext(ParamContext ctx) { copyFrom(ctx); }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new NormalParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(IDENTIFIER);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(244);
					match(EQUAL);
					setState(245);
					expression(0);
					}
				}

				}
				break;
			case STAR:
				_localctx = new VarArgParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(STAR);
				setState(249);
				match(IDENTIFIER);
				}
				break;
			case POWER:
				_localctx = new KwVarArgParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(POWER);
				setState(251);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public TargetListContext targetList() {
			return getRuleContext(TargetListContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(FOR);
			setState(255);
			targetList();
			setState(256);
			match(IN);
			setState(257);
			expressionList();
			setState(258);
			match(COLON);
			setState(259);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(WHILE);
			setState(262);
			expression(0);
			setState(263);
			match(COLON);
			setState(264);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IF);
			setState(267);
			expression(0);
			setState(268);
			match(COLON);
			setState(269);
			body();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(270);
				match(ELIF);
				setState(271);
				expression(0);
				setState(272);
				match(COLON);
				setState(273);
				body();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(280);
				match(ELSE);
				setState(281);
				match(COLON);
				setState(282);
				body();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TargetListContext targetList() {
			return getRuleContext(TargetListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AugmentedAssignmentContext augmentedAssignment() {
			return getRuleContext(AugmentedAssignmentContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			targetList();
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_EQUAL:
			case MINUS_EQUAL:
			case STAR_EQUAL:
			case DIV_EQUAL:
			case MOD_EQUAL:
				{
				setState(286);
				augmentedAssignment();
				}
				break;
			case EQUAL:
				{
				setState(287);
				match(EQUAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(290);
			expressionList();
			setState(291);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TargetListContext extends ParserRuleContext {
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TargetListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetList; }
	}

	public final TargetListContext targetList() throws RecognitionException {
		TargetListContext _localctx = new TargetListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_targetList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			target(0);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				target(0);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TargetContext extends ParserRuleContext {
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
	 
		public TargetContext() { }
		public void copyFrom(TargetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarTargetContext extends TargetContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public VarTargetContext(TargetContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptTargetContext extends TargetContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode LSB() { return getToken(PythonParser.LSB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSB() { return getToken(PythonParser.RSB, 0); }
		public SubscriptTargetContext(TargetContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeTargetContext extends TargetContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public AttributeTargetContext(TargetContext ctx) { copyFrom(ctx); }
	}

	public final TargetContext target() throws RecognitionException {
		return target(0);
	}

	private TargetContext target(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TargetContext _localctx = new TargetContext(_ctx, _parentState);
		TargetContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_target, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VarTargetContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(302);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptTargetContext(new TargetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_target);
						setState(304);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(305);
						match(LSB);
						setState(306);
						expression(0);
						setState(307);
						match(RSB);
						}
						break;
					case 2:
						{
						_localctx = new AttributeTargetContext(new TargetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_target);
						setState(309);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(310);
						match(DOT);
						setState(311);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			expression(0);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(318);
				match(COMMA);
				setState(319);
				expression(0);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AugmentedAssignmentContext extends ParserRuleContext {
		public TerminalNode PLUS_EQUAL() { return getToken(PythonParser.PLUS_EQUAL, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(PythonParser.MINUS_EQUAL, 0); }
		public TerminalNode STAR_EQUAL() { return getToken(PythonParser.STAR_EQUAL, 0); }
		public TerminalNode DIV_EQUAL() { return getToken(PythonParser.DIV_EQUAL, 0); }
		public TerminalNode MOD_EQUAL() { return getToken(PythonParser.MOD_EQUAL, 0); }
		public AugmentedAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augmentedAssignment; }
	}

	public final AugmentedAssignmentContext augmentedAssignment() throws RecognitionException {
		AugmentedAssignmentContext _localctx = new AugmentedAssignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_augmentedAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 139611588448485376L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PythonParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PythonParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(PythonParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PythonParser.LTE, 0); }
		public TerminalNode GT() { return getToken(PythonParser.GT, 0); }
		public TerminalNode GTE() { return getToken(PythonParser.GTE, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNotExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ISNOT() { return getToken(PythonParser.ISNOT, 0); }
		public IsNotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(PythonParser.POWER, 0); }
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public IsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(PythonParser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExpressionAtContext extends ExpressionContext {
		public AtomExpressionContext atomExpression() {
			return getRuleContext(AtomExpressionContext.class,0);
		}
		public AtomExpressionAtContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(PythonParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PythonParser.MOD, 0); }
		public MulDivModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LKB:
			case LSB:
			case LPAREN:
			case INT:
			case DOUBLE:
			case STRING:
			case TRUE:
			case FALSE:
			case NULL:
			case FSTRING:
			case IDENTIFIER:
				{
				_localctx = new AtomExpressionAtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(328);
				atomExpression();
				}
				break;
			case NOT:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				match(NOT);
				setState(330);
				expression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(334);
						match(POWER);
						setState(335);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(337);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(338);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(340);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(341);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(343);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079256848778919936L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(344);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(346);
						match(IS);
						setState(347);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(348);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(349);
						match(ISNOT);
						setState(350);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(351);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(352);
						match(AND);
						setState(353);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(355);
						match(OR);
						setState(356);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public AtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpression; }
	}

	public final AtomExpressionContext atomExpression() throws RecognitionException {
		AtomExpressionContext _localctx = new AtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atomExpression);
		try {
			int _alt;
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(IDENTIFIER);
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(364);
						trailer();
						}
						} 
					}
					setState(369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrailerContext extends ParserRuleContext {
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
	 
		public TrailerContext() { }
		public void copyFrom(TrailerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeTrailerContext extends TrailerContext {
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public AttributeTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptTrailerContext extends TrailerContext {
		public TerminalNode LSB() { return getToken(PythonParser.LSB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSB() { return getToken(PythonParser.RSB, 0); }
		public SubscriptTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallTrailerContext extends TrailerContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public CallTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_trailer);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new CallTrailerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(LPAREN);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70129639489536L) != 0)) {
					{
					setState(373);
					arglist();
					}
				}

				setState(376);
				match(RPAREN);
				}
				break;
			case LSB:
				_localctx = new SubscriptTrailerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(LSB);
				setState(378);
				expression(0);
				setState(379);
				match(RSB);
				}
				break;
			case DOT:
				_localctx = new AttributeTrailerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(DOT);
				setState(382);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictAtomContext extends AtomContext {
		public TerminalNode LKB() { return getToken(PythonParser.LKB, 0); }
		public TerminalNode RKB() { return getToken(PythonParser.RKB, 0); }
		public KeyValueListContext keyValueList() {
			return getRuleContext(KeyValueListContext.class,0);
		}
		public DictAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAtomContext extends AtomContext {
		public TerminalNode LSB() { return getToken(PythonParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(PythonParser.RSB, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ListAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenAtomContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ParenAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralAtomContext extends AtomContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atom);
		int _la;
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParenAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(LPAREN);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70095279751168L) != 0)) {
					{
					setState(386);
					expressionList();
					}
				}

				setState(389);
				match(RPAREN);
				}
				break;
			case LKB:
				_localctx = new DictAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(LKB);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70095279751170L) != 0)) {
					{
					setState(391);
					keyValueList();
					}
				}

				setState(394);
				match(RKB);
				}
				break;
			case LSB:
				_localctx = new ListAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(LSB);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70095279751168L) != 0)) {
					{
					setState(396);
					expressionList();
					}
				}

				setState(399);
				match(RSB);
				}
				break;
			case INT:
			case DOUBLE:
			case STRING:
			case TRUE:
			case FALSE:
			case NULL:
			case FSTRING:
			case IDENTIFIER:
				_localctx = new LiteralAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyValueListContext extends ParserRuleContext {
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public KeyValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValueList; }
	}

	public final KeyValueListContext keyValueList() throws RecognitionException {
		KeyValueListContext _localctx = new KeyValueListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_keyValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(403);
				match(NEWLINE);
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			keyValue();
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					match(COMMA);
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(411);
						match(NEWLINE);
						}
						}
						setState(416);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(417);
					keyValue();
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(423);
				match(COMMA);
				}
			}

			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(426);
				match(NEWLINE);
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyValueContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			expression(0);
			setState(433);
			match(COLON);
			setState(434);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends LiteralContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FStringLiteralContext extends LiteralContext {
		public TerminalNode FSTRING() { return getToken(PythonParser.FSTRING, 0); }
		public FStringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierLiteralContext extends LiteralContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public IdentifierLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends LiteralContext {
		public TerminalNode INT() { return getToken(PythonParser.INT, 0); }
		public IntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLiteralContext extends LiteralContext {
		public TerminalNode DOUBLE() { return getToken(PythonParser.DOUBLE, 0); }
		public DoubleLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends LiteralContext {
		public TerminalNode NULL() { return getToken(PythonParser.NULL, 0); }
		public NullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(DOUBLE);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(STRING);
				}
				break;
			case FSTRING:
				_localctx = new FStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				match(FSTRING);
				}
				break;
			case TRUE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				match(FALSE);
				}
				break;
			case NULL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(442);
				match(NULL);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(443);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			argument();
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(447);
					match(COMMA);
					setState(448);
					argument();
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(454);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public TerminalNode POWER() { return getToken(PythonParser.POWER, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_argument);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case LKB:
			case LSB:
			case LPAREN:
			case INT:
			case DOUBLE:
			case STRING:
			case TRUE:
			case FALSE:
			case NULL:
			case FSTRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(457);
					match(IDENTIFIER);
					setState(458);
					match(EQUAL);
					}
					break;
				}
				setState(461);
				expression(0);
				}
				break;
			case POWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(POWER);
				setState(463);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return target_sempred((TargetContext)_localctx, predIndex);
		case 28:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean target_sempred(TargetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u01d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"U\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002_\b\u0002\u0001\u0002"+
		"\u0003\u0002b\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"m\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007{\b\u0007\n\u0007\f\u0007~\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u0088\b\u0007\n\u0007\f\u0007\u008b\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u008f\b\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0094\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u0099\b\t\n\t\f\t\u009c\t"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a2\b\n\n\n\f\n\u00a5\t\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00b0\b\f\u0001\f\u0003\f\u00b3\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0004\r\u00ba\b\r\u000b\r\f\r\u00bb\u0001\r\u0001"+
		"\r\u0001\u000e\u0003\u000e\u00c1\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00c7\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00cc\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0004\u000f\u00d2\b\u000f\u000b\u000f\f\u000f\u00d3\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00da\b\u0010\u0001\u0010"+
		"\u0003\u0010\u00dd\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00e4\b\u0011\n\u0011\f\u0011\u00e7\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00ec\b\u0012\n\u0012\f\u0012"+
		"\u00ef\t\u0012\u0001\u0012\u0003\u0012\u00f2\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00f7\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00fd\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0114\b\u0016\n\u0016\f\u0016\u0117\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u011c\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0121\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0129\b\u0018\n\u0018"+
		"\f\u0018\u012c\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0139\b\u0019\n\u0019\f\u0019\u013c\t\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0141\b\u001a\n\u001a\f\u001a"+
		"\u0144\t\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u014c\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0166\b\u001c\n\u001c"+
		"\f\u001c\u0169\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u016e\b\u001d\n\u001d\f\u001d\u0171\t\u001d\u0003\u001d\u0173\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0177\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0180\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0184\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0189\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u018e\b\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0192\b\u001f\u0001 \u0005 \u0195\b \n \f \u0198\t \u0001 \u0001"+
		" \u0001 \u0005 \u019d\b \n \f \u01a0\t \u0001 \u0005 \u01a3\b \n \f \u01a6"+
		"\t \u0001 \u0003 \u01a9\b \u0001 \u0005 \u01ac\b \n \f \u01af\t \u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u01bd\b\"\u0001#\u0001#\u0001#\u0005#\u01c2\b"+
		"#\n#\f#\u01c5\t#\u0001#\u0003#\u01c8\b#\u0001$\u0001$\u0003$\u01cc\b$"+
		"\u0001$\u0001$\u0001$\u0003$\u01d1\b$\u0001$\u0000\u000228%\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFH\u0000\u0004\u0001\u000048\u0001\u000013\u0001\u0000"+
		"/0\u0001\u00009>\u01fc\u0000M\u0001\u0000\u0000\u0000\u0002T\u0001\u0000"+
		"\u0000\u0000\u0004a\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000\u0000"+
		"\bj\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\fs\u0001\u0000"+
		"\u0000\u0000\u000e\u008e\u0001\u0000\u0000\u0000\u0010\u0090\u0001\u0000"+
		"\u0000\u0000\u0012\u0095\u0001\u0000\u0000\u0000\u0014\u009d\u0001\u0000"+
		"\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000"+
		"\u0000\u0000\u001a\u00b7\u0001\u0000\u0000\u0000\u001c\u00c0\u0001\u0000"+
		"\u0000\u0000\u001e\u00d1\u0001\u0000\u0000\u0000 \u00d5\u0001\u0000\u0000"+
		"\u0000\"\u00e0\u0001\u0000\u0000\u0000$\u00e8\u0001\u0000\u0000\u0000"+
		"&\u00fc\u0001\u0000\u0000\u0000(\u00fe\u0001\u0000\u0000\u0000*\u0105"+
		"\u0001\u0000\u0000\u0000,\u010a\u0001\u0000\u0000\u0000.\u011d\u0001\u0000"+
		"\u0000\u00000\u0125\u0001\u0000\u0000\u00002\u012d\u0001\u0000\u0000\u0000"+
		"4\u013d\u0001\u0000\u0000\u00006\u0145\u0001\u0000\u0000\u00008\u014b"+
		"\u0001\u0000\u0000\u0000:\u0172\u0001\u0000\u0000\u0000<\u017f\u0001\u0000"+
		"\u0000\u0000>\u0191\u0001\u0000\u0000\u0000@\u0196\u0001\u0000\u0000\u0000"+
		"B\u01b0\u0001\u0000\u0000\u0000D\u01bc\u0001\u0000\u0000\u0000F\u01be"+
		"\u0001\u0000\u0000\u0000H\u01d0\u0001\u0000\u0000\u0000JL\u0003\u0002"+
		"\u0001\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PQ\u0005\u0000\u0000\u0001Q\u0001\u0001\u0000"+
		"\u0000\u0000RU\u0003\u0004\u0002\u0000SU\u0003\u0006\u0003\u0000TR\u0001"+
		"\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0003\u0001\u0000\u0000"+
		"\u0000Vb\u0003.\u0017\u0000Wb\u0003\u000e\u0007\u0000Xb\u0003\u0014\n"+
		"\u0000Yb\u0003\u0016\u000b\u0000Zb\u0003\b\u0004\u0000[b\u0003\n\u0005"+
		"\u0000\\b\u0003\f\u0006\u0000]_\u00034\u001a\u0000^]\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0005\u0001"+
		"\u0000\u0000aV\u0001\u0000\u0000\u0000aW\u0001\u0000\u0000\u0000aX\u0001"+
		"\u0000\u0000\u0000aY\u0001\u0000\u0000\u0000aZ\u0001\u0000\u0000\u0000"+
		"a[\u0001\u0000\u0000\u0000a\\\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000"+
		"\u0000b\u0005\u0001\u0000\u0000\u0000ci\u0003,\u0016\u0000di\u0003(\u0014"+
		"\u0000ei\u0003*\u0015\u0000fi\u0003\u001c\u000e\u0000gi\u0003\u0018\f"+
		"\u0000hc\u0001\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000he\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000i\u0007"+
		"\u0001\u0000\u0000\u0000jl\u0005\u000e\u0000\u0000km\u00034\u001a\u0000"+
		"lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000no\u0005\u0001\u0000\u0000o\t\u0001\u0000\u0000\u0000pq\u0005\f"+
		"\u0000\u0000qr\u0005\u0001\u0000\u0000r\u000b\u0001\u0000\u0000\u0000"+
		"st\u0005\u000b\u0000\u0000tu\u0005\u0001\u0000\u0000u\r\u0001\u0000\u0000"+
		"\u0000vw\u0005\u000f\u0000\u0000w|\u0003\u0010\b\u0000xy\u0005!\u0000"+
		"\u0000y{\u0003\u0010\b\u0000zx\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0001\u0000"+
		"\u0000\u0080\u008f\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0010\u0000"+
		"\u0000\u0082\u0083\u0003\u0012\t\u0000\u0083\u0084\u0005\u000f\u0000\u0000"+
		"\u0084\u0089\u0003\u0010\b\u0000\u0085\u0086\u0005!\u0000\u0000\u0086"+
		"\u0088\u0003\u0010\b\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0001\u0000\u0000\u008d\u008f"+
		"\u0001\u0000\u0000\u0000\u008ev\u0001\u0000\u0000\u0000\u008e\u0081\u0001"+
		"\u0000\u0000\u0000\u008f\u000f\u0001\u0000\u0000\u0000\u0090\u0093\u0005"+
		"-\u0000\u0000\u0091\u0092\u0005\u0011\u0000\u0000\u0092\u0094\u0005-\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0011\u0001\u0000\u0000\u0000\u0095\u009a\u0005-\u0000\u0000"+
		"\u0096\u0097\u0005%\u0000\u0000\u0097\u0099\u0005-\u0000\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0013"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\u0012\u0000\u0000\u009e\u00a3\u0005-\u0000\u0000\u009f\u00a0\u0005"+
		"!\u0000\u0000\u00a0\u00a2\u0005-\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0001\u0000"+
		"\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0017\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0001\u0000\u0000\u00aa\u0017\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0018\u0000\u0000\u00ac\u00b2\u0005-\u0000\u0000"+
		"\u00ad\u00af\u0005\u001e\u0000\u0000\u00ae\u00b0\u0003F#\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b3\u0005\u001f\u0000\u0000\u00b2\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005 \u0000\u0000\u00b5\u00b6\u0003"+
		"\u001a\r\u0000\u00b6\u0019\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u0002"+
		"\u0000\u0000\u00b8\u00ba\u0003\u0002\u0001\u0000\u00b9\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0005\u0003\u0000\u0000\u00be\u001b\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c1\u0003\u001e\u000f\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005\r\u0000\u0000\u00c3\u00c4\u0005-\u0000"+
		"\u0000\u00c4\u00c6\u0005\u001e\u0000\u0000\u00c5\u00c7\u0003$\u0012\u0000"+
		"\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0005\u001f\u0000\u0000"+
		"\u00c9\u00ca\u0005\"\u0000\u0000\u00ca\u00cc\u00038\u001c\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005 \u0000\u0000\u00ce\u00cf"+
		"\u0003\u001a\r\u0000\u00cf\u001d\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003"+
		" \u0010\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u001f\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005$\u0000"+
		"\u0000\u00d6\u00dc\u0003\"\u0011\u0000\u00d7\u00d9\u0005\u001e\u0000\u0000"+
		"\u00d8\u00da\u0003F#\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0005\u001f\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005\u0001\u0000\u0000\u00df!\u0001\u0000\u0000\u0000\u00e0\u00e5\u0005"+
		"-\u0000\u0000\u00e1\u00e2\u0005%\u0000\u0000\u00e2\u00e4\u0005-\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6#\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ed\u0003&\u0013\u0000\u00e9\u00ea\u0005!\u0000\u0000\u00ea\u00ec"+
		"\u0003&\u0013\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f2\u0005!\u0000\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2%\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f6\u0005-\u0000\u0000\u00f4\u00f5\u0005.\u0000\u0000\u00f5"+
		"\u00f7\u00038\u001c\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u00fd\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u00051\u0000\u0000\u00f9\u00fd\u0005-\u0000\u0000\u00fa\u00fb\u0005#"+
		"\u0000\u0000\u00fb\u00fd\u0005-\u0000\u0000\u00fc\u00f3\u0001\u0000\u0000"+
		"\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\'\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\b\u0000\u0000"+
		"\u00ff\u0100\u00030\u0018\u0000\u0100\u0101\u0005\t\u0000\u0000\u0101"+
		"\u0102\u00034\u001a\u0000\u0102\u0103\u0005 \u0000\u0000\u0103\u0104\u0003"+
		"\u001a\r\u0000\u0104)\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u0019"+
		"\u0000\u0000\u0106\u0107\u00038\u001c\u0000\u0107\u0108\u0005 \u0000\u0000"+
		"\u0108\u0109\u0003\u001a\r\u0000\u0109+\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005\u0005\u0000\u0000\u010b\u010c\u00038\u001c\u0000\u010c\u010d"+
		"\u0005 \u0000\u0000\u010d\u0115\u0003\u001a\r\u0000\u010e\u010f\u0005"+
		"\u0006\u0000\u0000\u010f\u0110\u00038\u001c\u0000\u0110\u0111\u0005 \u0000"+
		"\u0000\u0111\u0112\u0003\u001a\r\u0000\u0112\u0114\u0001\u0000\u0000\u0000"+
		"\u0113\u010e\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000"+
		"\u0116\u011b\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0005\u0007\u0000\u0000\u0119\u011a\u0005 \u0000\u0000\u011a"+
		"\u011c\u0003\u001a\r\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c-\u0001\u0000\u0000\u0000\u011d\u0120\u0003"+
		"0\u0018\u0000\u011e\u0121\u00036\u001b\u0000\u011f\u0121\u0005.\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u00034\u001a\u0000"+
		"\u0123\u0124\u0005\u0001\u0000\u0000\u0124/\u0001\u0000\u0000\u0000\u0125"+
		"\u012a\u00032\u0019\u0000\u0126\u0127\u0005!\u0000\u0000\u0127\u0129\u0003"+
		"2\u0019\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b1\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0006\u0019\uffff\uffff\u0000\u012e\u012f\u0005-\u0000"+
		"\u0000\u012f\u013a\u0001\u0000\u0000\u0000\u0130\u0131\n\u0002\u0000\u0000"+
		"\u0131\u0132\u0005\u001c\u0000\u0000\u0132\u0133\u00038\u001c\u0000\u0133"+
		"\u0134\u0005\u001d\u0000\u0000\u0134\u0139\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\n\u0001\u0000\u0000\u0136\u0137\u0005%\u0000\u0000\u0137\u0139"+
		"\u0005-\u0000\u0000\u0138\u0130\u0001\u0000\u0000\u0000\u0138\u0135\u0001"+
		"\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b3\u0001\u0000"+
		"\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0142\u00038\u001c"+
		"\u0000\u013e\u013f\u0005!\u0000\u0000\u013f\u0141\u00038\u001c\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143"+
		"5\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0007\u0000\u0000\u0000\u01467\u0001\u0000\u0000\u0000\u0147\u0148\u0006"+
		"\u001c\uffff\uffff\u0000\u0148\u014c\u0003:\u001d\u0000\u0149\u014a\u0005"+
		"\u0016\u0000\u0000\u014a\u014c\u00038\u001c\u0003\u014b\u0147\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u0167\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\n\t\u0000\u0000\u014e\u014f\u0005#\u0000\u0000"+
		"\u014f\u0166\u00038\u001c\n\u0150\u0151\n\b\u0000\u0000\u0151\u0152\u0007"+
		"\u0001\u0000\u0000\u0152\u0166\u00038\u001c\t\u0153\u0154\n\u0007\u0000"+
		"\u0000\u0154\u0155\u0007\u0002\u0000\u0000\u0155\u0166\u00038\u001c\b"+
		"\u0156\u0157\n\u0006\u0000\u0000\u0157\u0158\u0007\u0003\u0000\u0000\u0158"+
		"\u0166\u00038\u001c\u0007\u0159\u015a\n\u0005\u0000\u0000\u015a\u015b"+
		"\u0005\u0013\u0000\u0000\u015b\u0166\u00038\u001c\u0006\u015c\u015d\n"+
		"\u0004\u0000\u0000\u015d\u015e\u0005?\u0000\u0000\u015e\u0166\u00038\u001c"+
		"\u0005\u015f\u0160\n\u0002\u0000\u0000\u0160\u0161\u0005\u0014\u0000\u0000"+
		"\u0161\u0166\u00038\u001c\u0003\u0162\u0163\n\u0001\u0000\u0000\u0163"+
		"\u0164\u0005\u0015\u0000\u0000\u0164\u0166\u00038\u001c\u0002\u0165\u014d"+
		"\u0001\u0000\u0000\u0000\u0165\u0150\u0001\u0000\u0000\u0000\u0165\u0153"+
		"\u0001\u0000\u0000\u0000\u0165\u0156\u0001\u0000\u0000\u0000\u0165\u0159"+
		"\u0001\u0000\u0000\u0000\u0165\u015c\u0001\u0000\u0000\u0000\u0165\u015f"+
		"\u0001\u0000\u0000\u0000\u0165\u0162\u0001\u0000\u0000\u0000\u0166\u0169"+
		"\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u01689\u0001\u0000\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u016a\u0173\u0003>\u001f\u0000\u016b\u016f\u0005-\u0000"+
		"\u0000\u016c\u016e\u0003<\u001e\u0000\u016d\u016c\u0001\u0000\u0000\u0000"+
		"\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000"+
		"\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u016a\u0001\u0000\u0000\u0000"+
		"\u0172\u016b\u0001\u0000\u0000\u0000\u0173;\u0001\u0000\u0000\u0000\u0174"+
		"\u0176\u0005\u001e\u0000\u0000\u0175\u0177\u0003F#\u0000\u0176\u0175\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178\u0180\u0005\u001f\u0000\u0000\u0179\u017a\u0005"+
		"\u001c\u0000\u0000\u017a\u017b\u00038\u001c\u0000\u017b\u017c\u0005\u001d"+
		"\u0000\u0000\u017c\u0180\u0001\u0000\u0000\u0000\u017d\u017e\u0005%\u0000"+
		"\u0000\u017e\u0180\u0005-\u0000\u0000\u017f\u0174\u0001\u0000\u0000\u0000"+
		"\u017f\u0179\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000"+
		"\u0180=\u0001\u0000\u0000\u0000\u0181\u0183\u0005\u001e\u0000\u0000\u0182"+
		"\u0184\u00034\u001a\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0192"+
		"\u0005\u001f\u0000\u0000\u0186\u0188\u0005\u001a\u0000\u0000\u0187\u0189"+
		"\u0003@ \u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u0192\u0005\u001b"+
		"\u0000\u0000\u018b\u018d\u0005\u001c\u0000\u0000\u018c\u018e\u00034\u001a"+
		"\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0192\u0005\u001d\u0000"+
		"\u0000\u0190\u0192\u0003D\"\u0000\u0191\u0181\u0001\u0000\u0000\u0000"+
		"\u0191\u0186\u0001\u0000\u0000\u0000\u0191\u018b\u0001\u0000\u0000\u0000"+
		"\u0191\u0190\u0001\u0000\u0000\u0000\u0192?\u0001\u0000\u0000\u0000\u0193"+
		"\u0195\u0005\u0001\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195"+
		"\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198"+
		"\u0196\u0001\u0000\u0000\u0000\u0199\u01a4\u0003B!\u0000\u019a\u019e\u0005"+
		"!\u0000\u0000\u019b\u019d\u0005\u0001\u0000\u0000\u019c\u019b\u0001\u0000"+
		"\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a3\u0003B!\u0000"+
		"\u01a2\u019a\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a9\u0005!\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ad\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ac\u0005\u0001\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac"+
		"\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0001\u0000\u0000\u0000\u01aeA\u0001\u0000\u0000\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u00038\u001c\u0000\u01b1\u01b2\u0005"+
		" \u0000\u0000\u01b2\u01b3\u00038\u001c\u0000\u01b3C\u0001\u0000\u0000"+
		"\u0000\u01b4\u01bd\u0005&\u0000\u0000\u01b5\u01bd\u0005\'\u0000\u0000"+
		"\u01b6\u01bd\u0005(\u0000\u0000\u01b7\u01bd\u0005,\u0000\u0000\u01b8\u01bd"+
		"\u0005)\u0000\u0000\u01b9\u01bd\u0005*\u0000\u0000\u01ba\u01bd\u0005+"+
		"\u0000\u0000\u01bb\u01bd\u0005-\u0000\u0000\u01bc\u01b4\u0001\u0000\u0000"+
		"\u0000\u01bc\u01b5\u0001\u0000\u0000\u0000\u01bc\u01b6\u0001\u0000\u0000"+
		"\u0000\u01bc\u01b7\u0001\u0000\u0000\u0000\u01bc\u01b8\u0001\u0000\u0000"+
		"\u0000\u01bc\u01b9\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bdE\u0001\u0000\u0000\u0000"+
		"\u01be\u01c3\u0003H$\u0000\u01bf\u01c0\u0005!\u0000\u0000\u01c0\u01c2"+
		"\u0003H$\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c8\u0005!\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8G\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0005-\u0000\u0000\u01ca\u01cc\u0005.\u0000\u0000\u01cb\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cd\u01d1\u00038\u001c\u0000\u01ce\u01cf\u0005"+
		"#\u0000\u0000\u01cf\u01d1\u00038\u001c\u0000\u01d0\u01cb\u0001\u0000\u0000"+
		"\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1I\u0001\u0000\u0000\u0000"+
		"6MT^ahl|\u0089\u008e\u0093\u009a\u00a3\u00af\u00b2\u00bb\u00c0\u00c6\u00cb"+
		"\u00d3\u00d9\u00dc\u00e5\u00ed\u00f1\u00f6\u00fc\u0115\u011b\u0120\u012a"+
		"\u0138\u013a\u0142\u014b\u0165\u0167\u016f\u0172\u0176\u017f\u0183\u0188"+
		"\u018d\u0191\u0196\u019e\u01a4\u01a8\u01ad\u01bc\u01c3\u01c7\u01cb\u01d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}