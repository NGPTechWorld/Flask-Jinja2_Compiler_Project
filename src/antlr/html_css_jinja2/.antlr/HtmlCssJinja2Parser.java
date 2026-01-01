// Generated from d:/IT/Fourth Year/First Semester/Compiler/Compiler1Project/src/antlr/html_css_jinja2/HtmlCssJinja2Parser.g4 by ANTLR 4.13.1

    package antlr.html_css_jinja2.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HtmlCssJinja2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, DTD=2, SEA_WS=3, STYLE_OPEN=4, TAG_OPEN=5, HTML_TEXT=6, 
		JINJA2_OPEN_EXPR=7, JINJA2_OPEN_STMT=8, JINJA2_COMMENT=9, TAG_CLOSE=10, 
		TAG_SLASH_CLOSE=11, TAG_SLASH=12, TAG_EQUALS=13, TAG_NAME=14, TAG_WHITESPACE=15, 
		ATTVALUE_VALUE=16, ATTRIBUTE=17, STYLE_CLOSE=18, OpenParen=19, CloseParen=20, 
		OpenBrace=21, CloseBrace=22, SemiColon=23, Colon=24, Dot=25, Multiply=26, 
		Divide=27, Pipe=28, Comment=29, Url=30, Space=31, Hash=32, Import=33, 
		Page=34, Media=35, Important=36, Percentage=37, Url_=38, MediaOnly=39, 
		Not=40, And=41, Dimension=42, Plus=43, Minus=44, Greater=45, Comma=46, 
		Tilde=47, Number=48, String_=49, Calc=50, Variable=51, Var=52, Ident=53, 
		Function_=54, JINJA2_CLOSE_EXPR=55, JINJA2_WS=56, JINJA2_IS=57, JINJA2_NOT=58, 
		JINJA2_ISNOT=59, JINJA2_AND=60, JINJA2_OR=61, JINJA2_EQUAL=62, JINJA2_PLUS=63, 
		JINJA2_MINUS=64, JINJA2_STAR=65, JINJA2_DIV=66, JINJA2_MOD=67, JINJA2_DOT=68, 
		JINJA2_COMMA=69, JINJA2_EQ=70, JINJA2_NEQ=71, JINJA2_LT=72, JINJA2_LTE=73, 
		JINJA2_GT=74, JINJA2_GTE=75, JINJA2_LSB=76, JINJA2_RSB=77, JINJA2_LPAREN=78, 
		JINJA2_RPAREN=79, JINJA2_TRUE=80, JINJA2_FALSE=81, JINJA2_NULL=82, JINJA2_FOR=83, 
		JINJA2_IN=84, JINJA2_IF=85, JINJA2_ELIF=86, JINJA2_ELSE=87, JINJA2_INT=88, 
		JINJA2_DOUBLE=89, JINJA2_STRING=90, JINJA2_IDENTIFIER=91, JINJA2_CLOSE_STMT=92, 
		JINJA2_STMT_WS=93, JINJA2_STMT_IS=94, JINJA2_STMT_ISNOT=95, JINJA2_STMT_AND=96, 
		JINJA2_STMT_OR=97, JINJA2_STMT_NOT=98, JINJA2_STMT_EQUAL=99, JINJA2_STMT_PLUS=100, 
		JINJA2_STMT_MINUS=101, JINJA2_STMT_STAR=102, JINJA2_STMT_DIV=103, JINJA2_STMT_MOD=104, 
		JINJA2_STMT_DOT=105, JINJA2_STMT_COMMA=106, JINJA2_STMT_EQ=107, JINJA2_STMT_NEQ=108, 
		JINJA2_STMT_LT=109, JINJA2_STMT_LTE=110, JINJA2_STMT_GT=111, JINJA2_STMT_GTE=112, 
		JINJA2_STMT_LSB=113, JINJA2_STMT_RSB=114, JINJA2_STMT_LPAREN=115, JINJA2_STMT_RPAREN=116, 
		JINJA2_STMT_TRUE=117, JINJA2_STMT_FALSE=118, JINJA2_STMT_NULL=119, JINJA2_STMT_FOR=120, 
		JINJA2_STMT_ENDFOR=121, JINJA2_STMT_IN=122, JINJA2_STMT_IF=123, JINJA2_STMT_ENDIF=124, 
		JINJA2_STMT_ELIF=125, JINJA2_STMT_ELSE=126, JINJA2_STMT_INT=127, JINJA2_STMT_DOUBLE=128, 
		JINJA2_STMT_STRING=129, JINJA2_STMT_IDENTIFIER=130;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElements = 1, RULE_htmlElement = 2, RULE_htmlContent = 3, 
		RULE_htmlAttribute = 4, RULE_htmlCharData = 5, RULE_htmlMisc = 6, RULE_htmlComment = 7, 
		RULE_jinjaBlock = 8, RULE_jinjaExpression = 9, RULE_jinjaExprContent = 10, 
		RULE_jinjaExprExpression = 11, RULE_jinjaExprAtomExpression = 12, RULE_jinjaExprTrailer = 13, 
		RULE_jinjaExprAtom = 14, RULE_jinjaExprLiteral = 15, RULE_jinjaExprArgument = 16, 
		RULE_jinjaStatement = 17, RULE_jinjaForBlock = 18, RULE_jinjaForStatement = 19, 
		RULE_jinjaIfBlock = 20, RULE_jinjaStmtExpression = 21, RULE_jinjaStmtAtomExpression = 22, 
		RULE_jinjaStmtTrailer = 23, RULE_jinjaStmtAtom = 24, RULE_jinjaStmtLiteral = 25, 
		RULE_jinjaStmtArgument = 26, RULE_style = 27, RULE_stylesheet = 28, RULE_imports = 29, 
		RULE_media = 30, RULE_mediaQueryList = 31, RULE_mediaQuery = 32, RULE_mediaExpression = 33, 
		RULE_selectorGroup = 34, RULE_selector = 35, RULE_combinator = 36, RULE_simpleSelectorSequence = 37, 
		RULE_typeSelector = 38, RULE_typeNamespacePrefix = 39, RULE_universal = 40, 
		RULE_className = 41, RULE_pseudo = 42, RULE_functionalPseudo = 43, RULE_expression = 44, 
		RULE_operator_ = 45, RULE_property_ = 46, RULE_ruleset = 47, RULE_declarationList = 48, 
		RULE_declaration = 49, RULE_expr = 50, RULE_term = 51, RULE_number = 52, 
		RULE_percentage = 53, RULE_dimension = 54, RULE_nestedStatement = 55, 
		RULE_groupRuleBody = 56, RULE_url = 57, RULE_calcSum = 58, RULE_calcProduct = 59, 
		RULE_calcValue = 60, RULE_cssIdent = 61, RULE_ws = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "htmlElements", "htmlElement", "htmlContent", "htmlAttribute", 
			"htmlCharData", "htmlMisc", "htmlComment", "jinjaBlock", "jinjaExpression", 
			"jinjaExprContent", "jinjaExprExpression", "jinjaExprAtomExpression", 
			"jinjaExprTrailer", "jinjaExprAtom", "jinjaExprLiteral", "jinjaExprArgument", 
			"jinjaStatement", "jinjaForBlock", "jinjaForStatement", "jinjaIfBlock", 
			"jinjaStmtExpression", "jinjaStmtAtomExpression", "jinjaStmtTrailer", 
			"jinjaStmtAtom", "jinjaStmtLiteral", "jinjaStmtArgument", "style", "stylesheet", 
			"imports", "media", "mediaQueryList", "mediaQuery", "mediaExpression", 
			"selectorGroup", "selector", "combinator", "simpleSelectorSequence", 
			"typeSelector", "typeNamespacePrefix", "universal", "className", "pseudo", 
			"functionalPseudo", "expression", "operator_", "property_", "ruleset", 
			"declarationList", "declaration", "expr", "term", "number", "percentage", 
			"dimension", "nestedStatement", "groupRuleBody", "url", "calcSum", "calcProduct", 
			"calcValue", "cssIdent", "ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'{{'", "'{%'", null, null, 
			"'/>'", null, null, null, null, null, null, "'</style>'", null, null, 
			"'{'", "'}'", "';'", "':'", null, null, null, "'|'", null, null, null, 
			null, null, null, null, null, null, "'url('", null, null, null, null, 
			null, null, null, null, "'~'", null, null, "'calc('", null, "'var('", 
			null, null, "'}}'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'%}'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'endfor'", null, null, 
			"'endif'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "DTD", "SEA_WS", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"JINJA2_OPEN_EXPR", "JINJA2_OPEN_STMT", "JINJA2_COMMENT", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "STYLE_CLOSE", "OpenParen", "CloseParen", 
			"OpenBrace", "CloseBrace", "SemiColon", "Colon", "Dot", "Multiply", "Divide", 
			"Pipe", "Comment", "Url", "Space", "Hash", "Import", "Page", "Media", 
			"Important", "Percentage", "Url_", "MediaOnly", "Not", "And", "Dimension", 
			"Plus", "Minus", "Greater", "Comma", "Tilde", "Number", "String_", "Calc", 
			"Variable", "Var", "Ident", "Function_", "JINJA2_CLOSE_EXPR", "JINJA2_WS", 
			"JINJA2_IS", "JINJA2_NOT", "JINJA2_ISNOT", "JINJA2_AND", "JINJA2_OR", 
			"JINJA2_EQUAL", "JINJA2_PLUS", "JINJA2_MINUS", "JINJA2_STAR", "JINJA2_DIV", 
			"JINJA2_MOD", "JINJA2_DOT", "JINJA2_COMMA", "JINJA2_EQ", "JINJA2_NEQ", 
			"JINJA2_LT", "JINJA2_LTE", "JINJA2_GT", "JINJA2_GTE", "JINJA2_LSB", "JINJA2_RSB", 
			"JINJA2_LPAREN", "JINJA2_RPAREN", "JINJA2_TRUE", "JINJA2_FALSE", "JINJA2_NULL", 
			"JINJA2_FOR", "JINJA2_IN", "JINJA2_IF", "JINJA2_ELIF", "JINJA2_ELSE", 
			"JINJA2_INT", "JINJA2_DOUBLE", "JINJA2_STRING", "JINJA2_IDENTIFIER", 
			"JINJA2_CLOSE_STMT", "JINJA2_STMT_WS", "JINJA2_STMT_IS", "JINJA2_STMT_ISNOT", 
			"JINJA2_STMT_AND", "JINJA2_STMT_OR", "JINJA2_STMT_NOT", "JINJA2_STMT_EQUAL", 
			"JINJA2_STMT_PLUS", "JINJA2_STMT_MINUS", "JINJA2_STMT_STAR", "JINJA2_STMT_DIV", 
			"JINJA2_STMT_MOD", "JINJA2_STMT_DOT", "JINJA2_STMT_COMMA", "JINJA2_STMT_EQ", 
			"JINJA2_STMT_NEQ", "JINJA2_STMT_LT", "JINJA2_STMT_LTE", "JINJA2_STMT_GT", 
			"JINJA2_STMT_GTE", "JINJA2_STMT_LSB", "JINJA2_STMT_RSB", "JINJA2_STMT_LPAREN", 
			"JINJA2_STMT_RPAREN", "JINJA2_STMT_TRUE", "JINJA2_STMT_FALSE", "JINJA2_STMT_NULL", 
			"JINJA2_STMT_FOR", "JINJA2_STMT_ENDFOR", "JINJA2_STMT_IN", "JINJA2_STMT_IF", 
			"JINJA2_STMT_ENDIF", "JINJA2_STMT_ELIF", "JINJA2_STMT_ELSE", "JINJA2_STMT_INT", 
			"JINJA2_STMT_DOUBLE", "JINJA2_STMT_STRING", "JINJA2_STMT_IDENTIFIER"
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
	public String getGrammarFileName() { return "HtmlCssJinja2Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtmlCssJinja2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
	 
		public HtmlDocumentContext() { }
		public void copyFrom(HtmlDocumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentRuleContext extends HtmlDocumentContext {
		public TerminalNode EOF() { return getToken(HtmlCssJinja2Parser.EOF, 0); }
		public List<TerminalNode> SEA_WS() { return getTokens(HtmlCssJinja2Parser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(HtmlCssJinja2Parser.SEA_WS, i);
		}
		public TerminalNode DTD() { return getToken(HtmlCssJinja2Parser.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public List<JinjaBlockContext> jinjaBlock() {
			return getRuleContexts(JinjaBlockContext.class);
		}
		public JinjaBlockContext jinjaBlock(int i) {
			return getRuleContext(JinjaBlockContext.class,i);
		}
		public HtmlDocumentRuleContext(HtmlDocumentContext ctx) { copyFrom(ctx); }
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			_localctx = new HtmlDocumentRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					match(SEA_WS);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(132);
				match(DTD);
				}
			}

			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					match(SEA_WS);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 954L) != 0)) {
				{
				setState(143);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HTML_COMMENT:
				case SEA_WS:
				case STYLE_OPEN:
				case TAG_OPEN:
					{
					setState(141);
					htmlElements();
					}
					break;
				case JINJA2_OPEN_EXPR:
				case JINJA2_OPEN_STMT:
				case JINJA2_COMMENT:
					{
					setState(142);
					jinjaBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
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
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
	 
		public HtmlElementsContext() { }
		public void copyFrom(HtmlElementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsRuleContext extends HtmlElementsContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsRuleContext(HtmlElementsContext ctx) { copyFrom(ctx); }
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			_localctx = new HtmlElementsRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_COMMENT || _la==SEA_WS) {
				{
				{
				setState(150);
				htmlMisc();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			htmlElement();
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					htmlMisc();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOpeningClosingTagContext extends HtmlElementContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(HtmlCssJinja2Parser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HtmlCssJinja2Parser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(HtmlCssJinja2Parser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HtmlCssJinja2Parser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HtmlCssJinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HtmlCssJinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HtmlCssJinja2Parser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HtmlCssJinja2Parser.TAG_SLASH, 0); }
		public HtmlOpeningClosingTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends HtmlElementContext {
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public StyleElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new HtmlOpeningClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(TAG_OPEN);
				setState(164);
				match(TAG_NAME);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(165);
					htmlAttribute();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(171);
					match(TAG_CLOSE);
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(172);
						htmlContent();
						setState(173);
						match(TAG_OPEN);
						setState(174);
						match(TAG_SLASH);
						setState(175);
						match(TAG_NAME);
						setState(176);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(180);
					match(TAG_SLASH_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case STYLE_OPEN:
				_localctx = new StyleElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				style();
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
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentRuleContext extends HtmlContentContext {
		public List<HtmlCharDataContext> htmlCharData() {
			return getRuleContexts(HtmlCharDataContext.class);
		}
		public HtmlCharDataContext htmlCharData(int i) {
			return getRuleContext(HtmlCharDataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public List<JinjaBlockContext> jinjaBlock() {
			return getRuleContexts(JinjaBlockContext.class);
		}
		public JinjaBlockContext jinjaBlock(int i) {
			return getRuleContext(JinjaBlockContext.class,i);
		}
		public HtmlContentRuleContext(HtmlContentContext ctx) { copyFrom(ctx); }
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlContent);
		try {
			int _alt;
			_localctx = new HtmlContentRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(190);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SEA_WS:
					case HTML_TEXT:
						{
						setState(186);
						htmlCharData();
						}
						break;
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(187);
						htmlElement();
						}
						break;
					case HTML_COMMENT:
						{
						setState(188);
						htmlComment();
						}
						break;
					case JINJA2_OPEN_EXPR:
					case JINJA2_OPEN_STMT:
					case JINJA2_COMMENT:
						{
						setState(189);
						jinjaBlock();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeRuleContext extends HtmlAttributeContext {
		public TerminalNode TAG_NAME() { return getToken(HtmlCssJinja2Parser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(HtmlCssJinja2Parser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HtmlCssJinja2Parser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeRuleContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlAttribute);
		int _la;
		try {
			_localctx = new HtmlAttributeRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(TAG_NAME);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(196);
				match(TAG_EQUALS);
				setState(197);
				match(ATTVALUE_VALUE);
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
	public static class HtmlCharDataContext extends ParserRuleContext {
		public HtmlCharDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlCharData; }
	 
		public HtmlCharDataContext() { }
		public void copyFrom(HtmlCharDataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlWhitespaceDataContext extends HtmlCharDataContext {
		public TerminalNode SEA_WS() { return getToken(HtmlCssJinja2Parser.SEA_WS, 0); }
		public HtmlWhitespaceDataContext(HtmlCharDataContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextDataContext extends HtmlCharDataContext {
		public TerminalNode HTML_TEXT() { return getToken(HtmlCssJinja2Parser.HTML_TEXT, 0); }
		public HtmlTextDataContext(HtmlCharDataContext ctx) { copyFrom(ctx); }
	}

	public final HtmlCharDataContext htmlCharData() throws RecognitionException {
		HtmlCharDataContext _localctx = new HtmlCharDataContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlCharData);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				_localctx = new HtmlTextDataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(HTML_TEXT);
				}
				break;
			case SEA_WS:
				_localctx = new HtmlWhitespaceDataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(SEA_WS);
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
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
	 
		public HtmlMiscContext() { }
		public void copyFrom(HtmlMiscContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlMiscCommentContext extends HtmlMiscContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlMiscCommentContext(HtmlMiscContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlMiscWhitespaceContext extends HtmlMiscContext {
		public TerminalNode SEA_WS() { return getToken(HtmlCssJinja2Parser.SEA_WS, 0); }
		public HtmlMiscWhitespaceContext(HtmlMiscContext ctx) { copyFrom(ctx); }
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlMisc);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				_localctx = new HtmlMiscCommentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				htmlComment();
				}
				break;
			case SEA_WS:
				_localctx = new HtmlMiscWhitespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(SEA_WS);
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
	public static class HtmlCommentContext extends ParserRuleContext {
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
	 
		public HtmlCommentContext() { }
		public void copyFrom(HtmlCommentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentRuleContext extends HtmlCommentContext {
		public TerminalNode HTML_COMMENT() { return getToken(HtmlCssJinja2Parser.HTML_COMMENT, 0); }
		public HtmlCommentRuleContext(HtmlCommentContext ctx) { copyFrom(ctx); }
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlComment);
		try {
			_localctx = new HtmlCommentRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(HTML_COMMENT);
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
	public static class JinjaBlockContext extends ParserRuleContext {
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
	 
		public JinjaBlockContext() { }
		public void copyFrom(JinjaBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StatementsContext extends JinjaBlockContext {
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public Jinja2StatementsContext(JinjaBlockContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2CommentsContext extends JinjaBlockContext {
		public TerminalNode JINJA2_COMMENT() { return getToken(HtmlCssJinja2Parser.JINJA2_COMMENT, 0); }
		public Jinja2CommentsContext(JinjaBlockContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2ExpressionsContext extends JinjaBlockContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public Jinja2ExpressionsContext(JinjaBlockContext ctx) { copyFrom(ctx); }
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jinjaBlock);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA2_COMMENT:
				_localctx = new Jinja2CommentsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(JINJA2_COMMENT);
				}
				break;
			case JINJA2_OPEN_EXPR:
				_localctx = new Jinja2ExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				jinjaExpression();
				}
				break;
			case JINJA2_OPEN_STMT:
				_localctx = new Jinja2StatementsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				jinjaStatement();
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
	public static class JinjaExpressionContext extends ParserRuleContext {
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
	 
		public JinjaExpressionContext() { }
		public void copyFrom(JinjaExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2ExpressionsBodyContext extends JinjaExpressionContext {
		public TerminalNode JINJA2_OPEN_EXPR() { return getToken(HtmlCssJinja2Parser.JINJA2_OPEN_EXPR, 0); }
		public TerminalNode JINJA2_CLOSE_EXPR() { return getToken(HtmlCssJinja2Parser.JINJA2_CLOSE_EXPR, 0); }
		public JinjaExprContentContext jinjaExprContent() {
			return getRuleContext(JinjaExprContentContext.class,0);
		}
		public Jinja2ExpressionsBodyContext(JinjaExpressionContext ctx) { copyFrom(ctx); }
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jinjaExpression);
		int _la;
		try {
			_localctx = new Jinja2ExpressionsBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(JINJA2_OPEN_EXPR);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16136798209L) != 0)) {
				{
				setState(216);
				jinjaExprContent();
				}
			}

			setState(219);
			match(JINJA2_CLOSE_EXPR);
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
	public static class JinjaExprContentContext extends ParserRuleContext {
		public JinjaExprContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprContent; }
	 
		public JinjaExprContentContext() { }
		public void copyFrom(JinjaExprContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2ExprContentRuleContext extends JinjaExprContentContext {
		public List<JinjaExprExpressionContext> jinjaExprExpression() {
			return getRuleContexts(JinjaExprExpressionContext.class);
		}
		public JinjaExprExpressionContext jinjaExprExpression(int i) {
			return getRuleContext(JinjaExprExpressionContext.class,i);
		}
		public Jinja2ExprContentRuleContext(JinjaExprContentContext ctx) { copyFrom(ctx); }
	}

	public final JinjaExprContentContext jinjaExprContent() throws RecognitionException {
		JinjaExprContentContext _localctx = new JinjaExprContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jinjaExprContent);
		int _la;
		try {
			_localctx = new Jinja2ExprContentRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			jinjaExprExpression(0);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16136798209L) != 0)) {
				{
				{
				setState(222);
				jinjaExprExpression(0);
				}
				}
				setState(227);
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
	public static class JinjaExprExpressionContext extends ParserRuleContext {
		public JinjaExprExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprExpression; }
	 
		public JinjaExprExpressionContext() { }
		public void copyFrom(JinjaExprExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2NotExpressionContext extends JinjaExprExpressionContext {
		public TerminalNode JINJA2_NOT() { return getToken(HtmlCssJinja2Parser.JINJA2_NOT, 0); }
		public JinjaExprExpressionContext jinjaExprExpression() {
			return getRuleContext(JinjaExprExpressionContext.class,0);
		}
		public Jinja2NotExpressionContext(JinjaExprExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2AddSubExpressionContext extends JinjaExprExpressionContext {
		public List<JinjaExprExpressionContext> jinjaExprExpression() {
			return getRuleContexts(JinjaExprExpressionContext.class);
		}
		public JinjaExprExpressionContext jinjaExprExpression(int i) {
			return getRuleContext(JinjaExprExpressionContext.class,i);
		}
		public TerminalNode JINJA2_PLUS() { return getToken(HtmlCssJinja2Parser.JINJA2_PLUS, 0); }
		public TerminalNode JINJA2_MINUS() { return getToken(HtmlCssJinja2Parser.JINJA2_MINUS, 0); }
		public Jinja2AddSubExpressionContext(JinjaExprExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2IsNotExpressionContext extends JinjaExprExpressionContext {
		public List<JinjaExprExpressionContext> jinjaExprExpression() {
			return getRuleContexts(JinjaExprExpressionContext.class);
		}
		public JinjaExprExpressionContext jinjaExprExpression(int i) {
			return getRuleContext(JinjaExprExpressionContext.class,i);
		}
		public TerminalNode JINJA2_ISNOT() { return getToken(HtmlCssJinja2Parser.JINJA2_ISNOT, 0); }
		public Jinja2IsNotExpressionContext(JinjaExprExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2AtomExpressionContext extends JinjaExprExpressionContext {
		public JinjaExprAtomExpressionContext jinjaExprAtomExpression() {
			return getRuleContext(JinjaExprAtomExpressionContext.class,0);
		}
		public Jinja2AtomExpressionContext(JinjaExprExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2MulDivModExpressionContext extends JinjaExprExpressionContext {
		public List<JinjaExprExpressionContext> jinjaExprExpression() {
			return getRuleContexts(JinjaExprExpressionContext.class);
		}
		public JinjaExprExpressionContext jinjaExprExpression(int i) {
			return getRuleContext(JinjaExprExpressionContext.class,i);
		}
		public TerminalNode JINJA2_STAR() { return getToken(HtmlCssJinja2Parser.JINJA2_STAR, 0); }
		public TerminalNode JINJA2_DIV() { return getToken(HtmlCssJinja2Parser.JINJA2_DIV, 0); }
		public TerminalNode JINJA2_MOD() { return getToken(HtmlCssJinja2Parser.JINJA2_MOD, 0); }
		public Jinja2MulDivModExpressionContext(JinjaExprExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2LogicalExpressionContext extends JinjaExprExpressionContext {
		public List<JinjaExprExpressionContext> jinjaExprExpression() {
			return getRuleContexts(JinjaExprExpressionContext.class);
		}
		public JinjaExprExpressionContext jinjaExprExpression(int i) {
			return getRuleContext(JinjaExprExpressionContext.class,i);
		}
		public TerminalNode JINJA2_AND() { return getToken(HtmlCssJinja2Parser.JINJA2_AND, 0); }
		public TerminalNode JINJA2_OR() { return getToken(HtmlCssJinja2Parser.JINJA2_OR, 0); }
		public Jinja2LogicalExpressionContext(JinjaExprExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2ComparisonExpressionContext extends JinjaExprExpressionContext {
		public List<JinjaExprExpressionContext> jinjaExprExpression() {
			return getRuleContexts(JinjaExprExpressionContext.class);
		}
		public JinjaExprExpressionContext jinjaExprExpression(int i) {
			return getRuleContext(JinjaExprExpressionContext.class,i);
		}
		public TerminalNode JINJA2_EQ() { return getToken(HtmlCssJinja2Parser.JINJA2_EQ, 0); }
		public TerminalNode JINJA2_NEQ() { return getToken(HtmlCssJinja2Parser.JINJA2_NEQ, 0); }
		public TerminalNode JINJA2_LT() { return getToken(HtmlCssJinja2Parser.JINJA2_LT, 0); }
		public TerminalNode JINJA2_LTE() { return getToken(HtmlCssJinja2Parser.JINJA2_LTE, 0); }
		public TerminalNode JINJA2_GT() { return getToken(HtmlCssJinja2Parser.JINJA2_GT, 0); }
		public TerminalNode JINJA2_GTE() { return getToken(HtmlCssJinja2Parser.JINJA2_GTE, 0); }
		public Jinja2ComparisonExpressionContext(JinjaExprExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2IsExpressionContext extends JinjaExprExpressionContext {
		public List<JinjaExprExpressionContext> jinjaExprExpression() {
			return getRuleContexts(JinjaExprExpressionContext.class);
		}
		public JinjaExprExpressionContext jinjaExprExpression(int i) {
			return getRuleContext(JinjaExprExpressionContext.class,i);
		}
		public TerminalNode JINJA2_IS() { return getToken(HtmlCssJinja2Parser.JINJA2_IS, 0); }
		public Jinja2IsExpressionContext(JinjaExprExpressionContext ctx) { copyFrom(ctx); }
	}

	public final JinjaExprExpressionContext jinjaExprExpression() throws RecognitionException {
		return jinjaExprExpression(0);
	}

	private JinjaExprExpressionContext jinjaExprExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JinjaExprExpressionContext _localctx = new JinjaExprExpressionContext(_ctx, _parentState);
		JinjaExprExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_jinjaExprExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA2_LSB:
			case JINJA2_LPAREN:
			case JINJA2_TRUE:
			case JINJA2_FALSE:
			case JINJA2_NULL:
			case JINJA2_INT:
			case JINJA2_DOUBLE:
			case JINJA2_STRING:
			case JINJA2_IDENTIFIER:
				{
				_localctx = new Jinja2AtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(229);
				jinjaExprAtomExpression();
				}
				break;
			case JINJA2_NOT:
				{
				_localctx = new Jinja2NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(JINJA2_NOT);
				setState(231);
				jinjaExprExpression(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Jinja2MulDivModExpressionContext(new JinjaExprExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExprExpression);
						setState(234);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(235);
						_la = _input.LA(1);
						if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(236);
						jinjaExprExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new Jinja2AddSubExpressionContext(new JinjaExprExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExprExpression);
						setState(237);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(238);
						_la = _input.LA(1);
						if ( !(_la==JINJA2_PLUS || _la==JINJA2_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						jinjaExprExpression(7);
						}
						break;
					case 3:
						{
						_localctx = new Jinja2ComparisonExpressionContext(new JinjaExprExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExprExpression);
						setState(240);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(241);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						jinjaExprExpression(6);
						}
						break;
					case 4:
						{
						_localctx = new Jinja2IsExpressionContext(new JinjaExprExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExprExpression);
						setState(243);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(244);
						match(JINJA2_IS);
						setState(245);
						jinjaExprExpression(5);
						}
						break;
					case 5:
						{
						_localctx = new Jinja2IsNotExpressionContext(new JinjaExprExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExprExpression);
						setState(246);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(247);
						match(JINJA2_ISNOT);
						setState(248);
						jinjaExprExpression(4);
						}
						break;
					case 6:
						{
						_localctx = new Jinja2LogicalExpressionContext(new JinjaExprExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExprExpression);
						setState(249);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(250);
						_la = _input.LA(1);
						if ( !(_la==JINJA2_AND || _la==JINJA2_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(251);
						jinjaExprExpression(2);
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	public static class JinjaExprAtomExpressionContext extends ParserRuleContext {
		public JinjaExprAtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprAtomExpression; }
	 
		public JinjaExprAtomExpressionContext() { }
		public void copyFrom(JinjaExprAtomExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2AtomExpressionBodyContext extends JinjaExprAtomExpressionContext {
		public JinjaExprAtomContext jinjaExprAtom() {
			return getRuleContext(JinjaExprAtomContext.class,0);
		}
		public List<JinjaExprTrailerContext> jinjaExprTrailer() {
			return getRuleContexts(JinjaExprTrailerContext.class);
		}
		public JinjaExprTrailerContext jinjaExprTrailer(int i) {
			return getRuleContext(JinjaExprTrailerContext.class,i);
		}
		public Jinja2AtomExpressionBodyContext(JinjaExprAtomExpressionContext ctx) { copyFrom(ctx); }
	}

	public final JinjaExprAtomExpressionContext jinjaExprAtomExpression() throws RecognitionException {
		JinjaExprAtomExpressionContext _localctx = new JinjaExprAtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinjaExprAtomExpression);
		try {
			int _alt;
			_localctx = new Jinja2AtomExpressionBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			jinjaExprAtom();
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					jinjaExprTrailer();
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
	public static class JinjaExprTrailerContext extends ParserRuleContext {
		public JinjaExprTrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprTrailer; }
	 
		public JinjaExprTrailerContext() { }
		public void copyFrom(JinjaExprTrailerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2CallTrailerContext extends JinjaExprTrailerContext {
		public TerminalNode JINJA2_LPAREN() { return getToken(HtmlCssJinja2Parser.JINJA2_LPAREN, 0); }
		public TerminalNode JINJA2_RPAREN() { return getToken(HtmlCssJinja2Parser.JINJA2_RPAREN, 0); }
		public List<JinjaExprArgumentContext> jinjaExprArgument() {
			return getRuleContexts(JinjaExprArgumentContext.class);
		}
		public JinjaExprArgumentContext jinjaExprArgument(int i) {
			return getRuleContext(JinjaExprArgumentContext.class,i);
		}
		public List<TerminalNode> JINJA2_COMMA() { return getTokens(HtmlCssJinja2Parser.JINJA2_COMMA); }
		public TerminalNode JINJA2_COMMA(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_COMMA, i);
		}
		public Jinja2CallTrailerContext(JinjaExprTrailerContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2SubscriptTrailerContext extends JinjaExprTrailerContext {
		public TerminalNode JINJA2_LSB() { return getToken(HtmlCssJinja2Parser.JINJA2_LSB, 0); }
		public JinjaExprExpressionContext jinjaExprExpression() {
			return getRuleContext(JinjaExprExpressionContext.class,0);
		}
		public TerminalNode JINJA2_RSB() { return getToken(HtmlCssJinja2Parser.JINJA2_RSB, 0); }
		public Jinja2SubscriptTrailerContext(JinjaExprTrailerContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2AttributeTrailerContext extends JinjaExprTrailerContext {
		public TerminalNode JINJA2_DOT() { return getToken(HtmlCssJinja2Parser.JINJA2_DOT, 0); }
		public TerminalNode JINJA2_IDENTIFIER() { return getToken(HtmlCssJinja2Parser.JINJA2_IDENTIFIER, 0); }
		public Jinja2AttributeTrailerContext(JinjaExprTrailerContext ctx) { copyFrom(ctx); }
	}

	public final JinjaExprTrailerContext jinjaExprTrailer() throws RecognitionException {
		JinjaExprTrailerContext _localctx = new JinjaExprTrailerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinjaExprTrailer);
		int _la;
		try {
			int _alt;
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA2_LPAREN:
				_localctx = new Jinja2CallTrailerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(JINJA2_LPAREN);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16136798209L) != 0)) {
					{
					setState(265);
					jinjaExprArgument();
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(266);
							match(JINJA2_COMMA);
							setState(267);
							jinjaExprArgument();
							}
							} 
						}
						setState(272);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==JINJA2_COMMA) {
						{
						setState(273);
						match(JINJA2_COMMA);
						}
					}

					}
				}

				setState(278);
				match(JINJA2_RPAREN);
				}
				break;
			case JINJA2_LSB:
				_localctx = new Jinja2SubscriptTrailerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(JINJA2_LSB);
				setState(280);
				jinjaExprExpression(0);
				setState(281);
				match(JINJA2_RSB);
				}
				break;
			case JINJA2_DOT:
				_localctx = new Jinja2AttributeTrailerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(JINJA2_DOT);
				setState(284);
				match(JINJA2_IDENTIFIER);
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
	public static class JinjaExprAtomContext extends ParserRuleContext {
		public JinjaExprAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprAtom; }
	 
		public JinjaExprAtomContext() { }
		public void copyFrom(JinjaExprAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2ParenthesizedAtomContext extends JinjaExprAtomContext {
		public TerminalNode JINJA2_LPAREN() { return getToken(HtmlCssJinja2Parser.JINJA2_LPAREN, 0); }
		public TerminalNode JINJA2_RPAREN() { return getToken(HtmlCssJinja2Parser.JINJA2_RPAREN, 0); }
		public JinjaExprExpressionContext jinjaExprExpression() {
			return getRuleContext(JinjaExprExpressionContext.class,0);
		}
		public Jinja2ParenthesizedAtomContext(JinjaExprAtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2ListAtomContext extends JinjaExprAtomContext {
		public TerminalNode JINJA2_LSB() { return getToken(HtmlCssJinja2Parser.JINJA2_LSB, 0); }
		public TerminalNode JINJA2_RSB() { return getToken(HtmlCssJinja2Parser.JINJA2_RSB, 0); }
		public List<JinjaExprExpressionContext> jinjaExprExpression() {
			return getRuleContexts(JinjaExprExpressionContext.class);
		}
		public JinjaExprExpressionContext jinjaExprExpression(int i) {
			return getRuleContext(JinjaExprExpressionContext.class,i);
		}
		public List<TerminalNode> JINJA2_COMMA() { return getTokens(HtmlCssJinja2Parser.JINJA2_COMMA); }
		public TerminalNode JINJA2_COMMA(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_COMMA, i);
		}
		public Jinja2ListAtomContext(JinjaExprAtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2LiteralAtomContext extends JinjaExprAtomContext {
		public JinjaExprLiteralContext jinjaExprLiteral() {
			return getRuleContext(JinjaExprLiteralContext.class,0);
		}
		public Jinja2LiteralAtomContext(JinjaExprAtomContext ctx) { copyFrom(ctx); }
	}

	public final JinjaExprAtomContext jinjaExprAtom() throws RecognitionException {
		JinjaExprAtomContext _localctx = new JinjaExprAtomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jinjaExprAtom);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA2_LPAREN:
				_localctx = new Jinja2ParenthesizedAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(JINJA2_LPAREN);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16136798209L) != 0)) {
					{
					setState(288);
					jinjaExprExpression(0);
					}
				}

				setState(291);
				match(JINJA2_RPAREN);
				}
				break;
			case JINJA2_LSB:
				_localctx = new Jinja2ListAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(JINJA2_LSB);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16136798209L) != 0)) {
					{
					setState(293);
					jinjaExprExpression(0);
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==JINJA2_COMMA) {
						{
						{
						setState(294);
						match(JINJA2_COMMA);
						setState(295);
						jinjaExprExpression(0);
						}
						}
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(303);
				match(JINJA2_RSB);
				}
				break;
			case JINJA2_TRUE:
			case JINJA2_FALSE:
			case JINJA2_NULL:
			case JINJA2_INT:
			case JINJA2_DOUBLE:
			case JINJA2_STRING:
			case JINJA2_IDENTIFIER:
				_localctx = new Jinja2LiteralAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				jinjaExprLiteral();
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
	public static class JinjaExprLiteralContext extends ParserRuleContext {
		public JinjaExprLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprLiteral; }
	 
		public JinjaExprLiteralContext() { }
		public void copyFrom(JinjaExprLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2DoubleLiteralContext extends JinjaExprLiteralContext {
		public TerminalNode JINJA2_DOUBLE() { return getToken(HtmlCssJinja2Parser.JINJA2_DOUBLE, 0); }
		public Jinja2DoubleLiteralContext(JinjaExprLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2NullLiteralContext extends JinjaExprLiteralContext {
		public TerminalNode JINJA2_NULL() { return getToken(HtmlCssJinja2Parser.JINJA2_NULL, 0); }
		public Jinja2NullLiteralContext(JinjaExprLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2IntLiteralContext extends JinjaExprLiteralContext {
		public TerminalNode JINJA2_INT() { return getToken(HtmlCssJinja2Parser.JINJA2_INT, 0); }
		public Jinja2IntLiteralContext(JinjaExprLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2IdLiteralContext extends JinjaExprLiteralContext {
		public TerminalNode JINJA2_IDENTIFIER() { return getToken(HtmlCssJinja2Parser.JINJA2_IDENTIFIER, 0); }
		public Jinja2IdLiteralContext(JinjaExprLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StringLiteralContext extends JinjaExprLiteralContext {
		public TerminalNode JINJA2_STRING() { return getToken(HtmlCssJinja2Parser.JINJA2_STRING, 0); }
		public Jinja2StringLiteralContext(JinjaExprLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2FalseLiteralContext extends JinjaExprLiteralContext {
		public TerminalNode JINJA2_FALSE() { return getToken(HtmlCssJinja2Parser.JINJA2_FALSE, 0); }
		public Jinja2FalseLiteralContext(JinjaExprLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2TrueLiteralContext extends JinjaExprLiteralContext {
		public TerminalNode JINJA2_TRUE() { return getToken(HtmlCssJinja2Parser.JINJA2_TRUE, 0); }
		public Jinja2TrueLiteralContext(JinjaExprLiteralContext ctx) { copyFrom(ctx); }
	}

	public final JinjaExprLiteralContext jinjaExprLiteral() throws RecognitionException {
		JinjaExprLiteralContext _localctx = new JinjaExprLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jinjaExprLiteral);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA2_INT:
				_localctx = new Jinja2IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(JINJA2_INT);
				}
				break;
			case JINJA2_DOUBLE:
				_localctx = new Jinja2DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(JINJA2_DOUBLE);
				}
				break;
			case JINJA2_STRING:
				_localctx = new Jinja2StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(JINJA2_STRING);
				}
				break;
			case JINJA2_TRUE:
				_localctx = new Jinja2TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(JINJA2_TRUE);
				}
				break;
			case JINJA2_FALSE:
				_localctx = new Jinja2FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(JINJA2_FALSE);
				}
				break;
			case JINJA2_NULL:
				_localctx = new Jinja2NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				match(JINJA2_NULL);
				}
				break;
			case JINJA2_IDENTIFIER:
				_localctx = new Jinja2IdLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
				match(JINJA2_IDENTIFIER);
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
	public static class JinjaExprArgumentContext extends ParserRuleContext {
		public JinjaExprArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprArgument; }
	 
		public JinjaExprArgumentContext() { }
		public void copyFrom(JinjaExprArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2FunctionArgContext extends JinjaExprArgumentContext {
		public JinjaExprExpressionContext jinjaExprExpression() {
			return getRuleContext(JinjaExprExpressionContext.class,0);
		}
		public TerminalNode JINJA2_IDENTIFIER() { return getToken(HtmlCssJinja2Parser.JINJA2_IDENTIFIER, 0); }
		public TerminalNode JINJA2_EQUAL() { return getToken(HtmlCssJinja2Parser.JINJA2_EQUAL, 0); }
		public Jinja2FunctionArgContext(JinjaExprArgumentContext ctx) { copyFrom(ctx); }
	}

	public final JinjaExprArgumentContext jinjaExprArgument() throws RecognitionException {
		JinjaExprArgumentContext _localctx = new JinjaExprArgumentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinjaExprArgument);
		try {
			_localctx = new Jinja2FunctionArgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(316);
				match(JINJA2_IDENTIFIER);
				setState(317);
				match(JINJA2_EQUAL);
				}
				break;
			}
			setState(320);
			jinjaExprExpression(0);
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
	public static class JinjaStatementContext extends ParserRuleContext {
		public JinjaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatement; }
	 
		public JinjaStatementContext() { }
		public void copyFrom(JinjaStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2ForBlockContext extends JinjaStatementContext {
		public JinjaForBlockContext jinjaForBlock() {
			return getRuleContext(JinjaForBlockContext.class,0);
		}
		public Jinja2ForBlockContext(JinjaStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2IfBlockContext extends JinjaStatementContext {
		public JinjaIfBlockContext jinjaIfBlock() {
			return getRuleContext(JinjaIfBlockContext.class,0);
		}
		public Jinja2IfBlockContext(JinjaStatementContext ctx) { copyFrom(ctx); }
	}

	public final JinjaStatementContext jinjaStatement() throws RecognitionException {
		JinjaStatementContext _localctx = new JinjaStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jinjaStatement);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new Jinja2ForBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				jinjaForBlock();
				}
				break;
			case 2:
				_localctx = new Jinja2IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				jinjaIfBlock();
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
	public static class JinjaForBlockContext extends ParserRuleContext {
		public JinjaForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaForBlock; }
	 
		public JinjaForBlockContext() { }
		public void copyFrom(JinjaForBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2ForBlockBodyContext extends JinjaForBlockContext {
		public List<TerminalNode> JINJA2_OPEN_STMT() { return getTokens(HtmlCssJinja2Parser.JINJA2_OPEN_STMT); }
		public TerminalNode JINJA2_OPEN_STMT(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_OPEN_STMT, i);
		}
		public JinjaForStatementContext jinjaForStatement() {
			return getRuleContext(JinjaForStatementContext.class,0);
		}
		public List<TerminalNode> JINJA2_CLOSE_STMT() { return getTokens(HtmlCssJinja2Parser.JINJA2_CLOSE_STMT); }
		public TerminalNode JINJA2_CLOSE_STMT(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_CLOSE_STMT, i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public TerminalNode JINJA2_STMT_ENDFOR() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_ENDFOR, 0); }
		public TerminalNode JINJA2_STMT_ELSE() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_ELSE, 0); }
		public Jinja2ForBlockBodyContext(JinjaForBlockContext ctx) { copyFrom(ctx); }
	}

	public final JinjaForBlockContext jinjaForBlock() throws RecognitionException {
		JinjaForBlockContext _localctx = new JinjaForBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jinjaForBlock);
		try {
			_localctx = new Jinja2ForBlockBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(JINJA2_OPEN_STMT);
			setState(327);
			jinjaForStatement();
			setState(328);
			match(JINJA2_CLOSE_STMT);
			setState(329);
			htmlContent();
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(330);
				match(JINJA2_OPEN_STMT);
				setState(331);
				match(JINJA2_STMT_ELSE);
				setState(332);
				match(JINJA2_CLOSE_STMT);
				setState(333);
				htmlContent();
				}
				break;
			}
			setState(336);
			match(JINJA2_OPEN_STMT);
			setState(337);
			match(JINJA2_STMT_ENDFOR);
			setState(338);
			match(JINJA2_CLOSE_STMT);
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
	public static class JinjaForStatementContext extends ParserRuleContext {
		public JinjaForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaForStatement; }
	 
		public JinjaForStatementContext() { }
		public void copyFrom(JinjaForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2ForStatementContext extends JinjaForStatementContext {
		public TerminalNode JINJA2_STMT_FOR() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_FOR, 0); }
		public List<TerminalNode> JINJA2_STMT_IDENTIFIER() { return getTokens(HtmlCssJinja2Parser.JINJA2_STMT_IDENTIFIER); }
		public TerminalNode JINJA2_STMT_IDENTIFIER(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_STMT_IDENTIFIER, i);
		}
		public TerminalNode JINJA2_STMT_IN() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_IN, 0); }
		public JinjaStmtAtomExpressionContext jinjaStmtAtomExpression() {
			return getRuleContext(JinjaStmtAtomExpressionContext.class,0);
		}
		public List<TerminalNode> JINJA2_STMT_COMMA() { return getTokens(HtmlCssJinja2Parser.JINJA2_STMT_COMMA); }
		public TerminalNode JINJA2_STMT_COMMA(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_STMT_COMMA, i);
		}
		public TerminalNode JINJA2_STMT_IF() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_IF, 0); }
		public JinjaStmtExpressionContext jinjaStmtExpression() {
			return getRuleContext(JinjaStmtExpressionContext.class,0);
		}
		public Jinja2ForStatementContext(JinjaForStatementContext ctx) { copyFrom(ctx); }
	}

	public final JinjaForStatementContext jinjaForStatement() throws RecognitionException {
		JinjaForStatementContext _localctx = new JinjaForStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jinjaForStatement);
		int _la;
		try {
			_localctx = new Jinja2ForStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(JINJA2_STMT_FOR);
			setState(341);
			match(JINJA2_STMT_IDENTIFIER);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA2_STMT_COMMA) {
				{
				{
				setState(342);
				match(JINJA2_STMT_COMMA);
				setState(343);
				match(JINJA2_STMT_IDENTIFIER);
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			match(JINJA2_STMT_IN);
			setState(350);
			jinjaStmtAtomExpression();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA2_STMT_IF) {
				{
				setState(351);
				match(JINJA2_STMT_IF);
				setState(352);
				jinjaStmtExpression(0);
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
	public static class JinjaIfBlockContext extends ParserRuleContext {
		public JinjaIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIfBlock; }
	 
		public JinjaIfBlockContext() { }
		public void copyFrom(JinjaIfBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2IfBlockBodyContext extends JinjaIfBlockContext {
		public List<TerminalNode> JINJA2_OPEN_STMT() { return getTokens(HtmlCssJinja2Parser.JINJA2_OPEN_STMT); }
		public TerminalNode JINJA2_OPEN_STMT(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_OPEN_STMT, i);
		}
		public TerminalNode JINJA2_STMT_IF() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_IF, 0); }
		public List<JinjaStmtExpressionContext> jinjaStmtExpression() {
			return getRuleContexts(JinjaStmtExpressionContext.class);
		}
		public JinjaStmtExpressionContext jinjaStmtExpression(int i) {
			return getRuleContext(JinjaStmtExpressionContext.class,i);
		}
		public List<TerminalNode> JINJA2_CLOSE_STMT() { return getTokens(HtmlCssJinja2Parser.JINJA2_CLOSE_STMT); }
		public TerminalNode JINJA2_CLOSE_STMT(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_CLOSE_STMT, i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public TerminalNode JINJA2_STMT_ENDIF() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_ENDIF, 0); }
		public List<TerminalNode> JINJA2_STMT_ELIF() { return getTokens(HtmlCssJinja2Parser.JINJA2_STMT_ELIF); }
		public TerminalNode JINJA2_STMT_ELIF(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_STMT_ELIF, i);
		}
		public TerminalNode JINJA2_STMT_ELSE() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_ELSE, 0); }
		public Jinja2IfBlockBodyContext(JinjaIfBlockContext ctx) { copyFrom(ctx); }
	}

	public final JinjaIfBlockContext jinjaIfBlock() throws RecognitionException {
		JinjaIfBlockContext _localctx = new JinjaIfBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jinjaIfBlock);
		try {
			int _alt;
			_localctx = new Jinja2IfBlockBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(JINJA2_OPEN_STMT);
			setState(356);
			match(JINJA2_STMT_IF);
			setState(357);
			jinjaStmtExpression(0);
			setState(358);
			match(JINJA2_CLOSE_STMT);
			setState(359);
			htmlContent();
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					match(JINJA2_OPEN_STMT);
					setState(361);
					match(JINJA2_STMT_ELIF);
					setState(362);
					jinjaStmtExpression(0);
					setState(363);
					match(JINJA2_CLOSE_STMT);
					setState(364);
					htmlContent();
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(371);
				match(JINJA2_OPEN_STMT);
				setState(372);
				match(JINJA2_STMT_ELSE);
				setState(373);
				match(JINJA2_CLOSE_STMT);
				setState(374);
				htmlContent();
				}
				break;
			}
			setState(377);
			match(JINJA2_OPEN_STMT);
			setState(378);
			match(JINJA2_STMT_ENDIF);
			setState(379);
			match(JINJA2_CLOSE_STMT);
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
	public static class JinjaStmtExpressionContext extends ParserRuleContext {
		public JinjaStmtExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmtExpression; }
	 
		public JinjaStmtExpressionContext() { }
		public void copyFrom(JinjaStmtExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtIsExpressionContext extends JinjaStmtExpressionContext {
		public List<JinjaStmtExpressionContext> jinjaStmtExpression() {
			return getRuleContexts(JinjaStmtExpressionContext.class);
		}
		public JinjaStmtExpressionContext jinjaStmtExpression(int i) {
			return getRuleContext(JinjaStmtExpressionContext.class,i);
		}
		public TerminalNode JINJA2_STMT_IS() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_IS, 0); }
		public Jinja2StmtIsExpressionContext(JinjaStmtExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtAddSubExpressionContext extends JinjaStmtExpressionContext {
		public List<JinjaStmtExpressionContext> jinjaStmtExpression() {
			return getRuleContexts(JinjaStmtExpressionContext.class);
		}
		public JinjaStmtExpressionContext jinjaStmtExpression(int i) {
			return getRuleContext(JinjaStmtExpressionContext.class,i);
		}
		public TerminalNode JINJA2_STMT_PLUS() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_PLUS, 0); }
		public TerminalNode JINJA2_STMT_MINUS() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_MINUS, 0); }
		public Jinja2StmtAddSubExpressionContext(JinjaStmtExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtNotExpressionContext extends JinjaStmtExpressionContext {
		public TerminalNode JINJA2_STMT_NOT() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_NOT, 0); }
		public JinjaStmtExpressionContext jinjaStmtExpression() {
			return getRuleContext(JinjaStmtExpressionContext.class,0);
		}
		public Jinja2StmtNotExpressionContext(JinjaStmtExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtComparisonExpressionContext extends JinjaStmtExpressionContext {
		public List<JinjaStmtExpressionContext> jinjaStmtExpression() {
			return getRuleContexts(JinjaStmtExpressionContext.class);
		}
		public JinjaStmtExpressionContext jinjaStmtExpression(int i) {
			return getRuleContext(JinjaStmtExpressionContext.class,i);
		}
		public TerminalNode JINJA2_STMT_EQ() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_EQ, 0); }
		public TerminalNode JINJA2_STMT_NEQ() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_NEQ, 0); }
		public TerminalNode JINJA2_STMT_LT() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_LT, 0); }
		public TerminalNode JINJA2_STMT_LTE() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_LTE, 0); }
		public TerminalNode JINJA2_STMT_GT() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_GT, 0); }
		public TerminalNode JINJA2_STMT_GTE() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_GTE, 0); }
		public Jinja2StmtComparisonExpressionContext(JinjaStmtExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtLogicalExpressionContext extends JinjaStmtExpressionContext {
		public List<JinjaStmtExpressionContext> jinjaStmtExpression() {
			return getRuleContexts(JinjaStmtExpressionContext.class);
		}
		public JinjaStmtExpressionContext jinjaStmtExpression(int i) {
			return getRuleContext(JinjaStmtExpressionContext.class,i);
		}
		public TerminalNode JINJA2_STMT_AND() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_AND, 0); }
		public TerminalNode JINJA2_STMT_OR() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_OR, 0); }
		public Jinja2StmtLogicalExpressionContext(JinjaStmtExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtAtomExpressionContext extends JinjaStmtExpressionContext {
		public JinjaStmtAtomExpressionContext jinjaStmtAtomExpression() {
			return getRuleContext(JinjaStmtAtomExpressionContext.class,0);
		}
		public Jinja2StmtAtomExpressionContext(JinjaStmtExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtMulDivModExpressionContext extends JinjaStmtExpressionContext {
		public List<JinjaStmtExpressionContext> jinjaStmtExpression() {
			return getRuleContexts(JinjaStmtExpressionContext.class);
		}
		public JinjaStmtExpressionContext jinjaStmtExpression(int i) {
			return getRuleContext(JinjaStmtExpressionContext.class,i);
		}
		public TerminalNode JINJA2_STMT_STAR() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_STAR, 0); }
		public TerminalNode JINJA2_STMT_DIV() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_DIV, 0); }
		public TerminalNode JINJA2_STMT_MOD() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_MOD, 0); }
		public Jinja2StmtMulDivModExpressionContext(JinjaStmtExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtIsNotExpressionContext extends JinjaStmtExpressionContext {
		public List<JinjaStmtExpressionContext> jinjaStmtExpression() {
			return getRuleContexts(JinjaStmtExpressionContext.class);
		}
		public JinjaStmtExpressionContext jinjaStmtExpression(int i) {
			return getRuleContext(JinjaStmtExpressionContext.class,i);
		}
		public TerminalNode JINJA2_STMT_ISNOT() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_ISNOT, 0); }
		public Jinja2StmtIsNotExpressionContext(JinjaStmtExpressionContext ctx) { copyFrom(ctx); }
	}

	public final JinjaStmtExpressionContext jinjaStmtExpression() throws RecognitionException {
		return jinjaStmtExpression(0);
	}

	private JinjaStmtExpressionContext jinjaStmtExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JinjaStmtExpressionContext _localctx = new JinjaStmtExpressionContext(_ctx, _parentState);
		JinjaStmtExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_jinjaStmtExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA2_STMT_NOT:
				{
				_localctx = new Jinja2StmtNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(382);
				match(JINJA2_STMT_NOT);
				setState(383);
				jinjaStmtExpression(4);
				}
				break;
			case JINJA2_STMT_LSB:
			case JINJA2_STMT_LPAREN:
			case JINJA2_STMT_TRUE:
			case JINJA2_STMT_FALSE:
			case JINJA2_STMT_NULL:
			case JINJA2_STMT_INT:
			case JINJA2_STMT_DOUBLE:
			case JINJA2_STMT_STRING:
			case JINJA2_STMT_IDENTIFIER:
				{
				_localctx = new Jinja2StmtAtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(384);
				jinjaStmtAtomExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(405);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new Jinja2StmtIsExpressionContext(new JinjaStmtExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaStmtExpression);
						setState(387);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(388);
						match(JINJA2_STMT_IS);
						setState(389);
						jinjaStmtExpression(9);
						}
						break;
					case 2:
						{
						_localctx = new Jinja2StmtIsNotExpressionContext(new JinjaStmtExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaStmtExpression);
						setState(390);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(391);
						match(JINJA2_STMT_ISNOT);
						setState(392);
						jinjaStmtExpression(8);
						}
						break;
					case 3:
						{
						_localctx = new Jinja2StmtComparisonExpressionContext(new JinjaStmtExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaStmtExpression);
						setState(393);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(394);
						_la = _input.LA(1);
						if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(395);
						jinjaStmtExpression(7);
						}
						break;
					case 4:
						{
						_localctx = new Jinja2StmtLogicalExpressionContext(new JinjaStmtExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaStmtExpression);
						setState(396);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(397);
						_la = _input.LA(1);
						if ( !(_la==JINJA2_STMT_AND || _la==JINJA2_STMT_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(398);
						jinjaStmtExpression(6);
						}
						break;
					case 5:
						{
						_localctx = new Jinja2StmtAddSubExpressionContext(new JinjaStmtExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaStmtExpression);
						setState(399);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(400);
						_la = _input.LA(1);
						if ( !(_la==JINJA2_STMT_PLUS || _la==JINJA2_STMT_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(401);
						jinjaStmtExpression(4);
						}
						break;
					case 6:
						{
						_localctx = new Jinja2StmtMulDivModExpressionContext(new JinjaStmtExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaStmtExpression);
						setState(402);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(403);
						_la = _input.LA(1);
						if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(404);
						jinjaStmtExpression(3);
						}
						break;
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class JinjaStmtAtomExpressionContext extends ParserRuleContext {
		public JinjaStmtAtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmtAtomExpression; }
	 
		public JinjaStmtAtomExpressionContext() { }
		public void copyFrom(JinjaStmtAtomExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtAtomExpressionBodyContext extends JinjaStmtAtomExpressionContext {
		public JinjaStmtAtomContext jinjaStmtAtom() {
			return getRuleContext(JinjaStmtAtomContext.class,0);
		}
		public List<JinjaStmtTrailerContext> jinjaStmtTrailer() {
			return getRuleContexts(JinjaStmtTrailerContext.class);
		}
		public JinjaStmtTrailerContext jinjaStmtTrailer(int i) {
			return getRuleContext(JinjaStmtTrailerContext.class,i);
		}
		public Jinja2StmtAtomExpressionBodyContext(JinjaStmtAtomExpressionContext ctx) { copyFrom(ctx); }
	}

	public final JinjaStmtAtomExpressionContext jinjaStmtAtomExpression() throws RecognitionException {
		JinjaStmtAtomExpressionContext _localctx = new JinjaStmtAtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jinjaStmtAtomExpression);
		try {
			int _alt;
			_localctx = new Jinja2StmtAtomExpressionBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			jinjaStmtAtom();
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					jinjaStmtTrailer();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
	public static class JinjaStmtTrailerContext extends ParserRuleContext {
		public JinjaStmtTrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmtTrailer; }
	 
		public JinjaStmtTrailerContext() { }
		public void copyFrom(JinjaStmtTrailerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtCallTrailerContext extends JinjaStmtTrailerContext {
		public TerminalNode JINJA2_STMT_LPAREN() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_LPAREN, 0); }
		public TerminalNode JINJA2_STMT_RPAREN() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_RPAREN, 0); }
		public List<JinjaStmtArgumentContext> jinjaStmtArgument() {
			return getRuleContexts(JinjaStmtArgumentContext.class);
		}
		public JinjaStmtArgumentContext jinjaStmtArgument(int i) {
			return getRuleContext(JinjaStmtArgumentContext.class,i);
		}
		public List<TerminalNode> JINJA2_STMT_COMMA() { return getTokens(HtmlCssJinja2Parser.JINJA2_STMT_COMMA); }
		public TerminalNode JINJA2_STMT_COMMA(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_STMT_COMMA, i);
		}
		public Jinja2StmtCallTrailerContext(JinjaStmtTrailerContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtSubscriptTrailerContext extends JinjaStmtTrailerContext {
		public TerminalNode JINJA2_STMT_LSB() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_LSB, 0); }
		public JinjaStmtExpressionContext jinjaStmtExpression() {
			return getRuleContext(JinjaStmtExpressionContext.class,0);
		}
		public TerminalNode JINJA2_STMT_RSB() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_RSB, 0); }
		public Jinja2StmtSubscriptTrailerContext(JinjaStmtTrailerContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtAttributeTrailerContext extends JinjaStmtTrailerContext {
		public TerminalNode JINJA2_STMT_DOT() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_DOT, 0); }
		public TerminalNode JINJA2_STMT_IDENTIFIER() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_IDENTIFIER, 0); }
		public Jinja2StmtAttributeTrailerContext(JinjaStmtTrailerContext ctx) { copyFrom(ctx); }
	}

	public final JinjaStmtTrailerContext jinjaStmtTrailer() throws RecognitionException {
		JinjaStmtTrailerContext _localctx = new JinjaStmtTrailerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jinjaStmtTrailer);
		int _la;
		try {
			int _alt;
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA2_STMT_LPAREN:
				_localctx = new Jinja2StmtCallTrailerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(JINJA2_STMT_LPAREN);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 8056897537L) != 0)) {
					{
					setState(418);
					jinjaStmtArgument();
					setState(423);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(419);
							match(JINJA2_STMT_COMMA);
							setState(420);
							jinjaStmtArgument();
							}
							} 
						}
						setState(425);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==JINJA2_STMT_COMMA) {
						{
						setState(426);
						match(JINJA2_STMT_COMMA);
						}
					}

					}
				}

				setState(431);
				match(JINJA2_STMT_RPAREN);
				}
				break;
			case JINJA2_STMT_LSB:
				_localctx = new Jinja2StmtSubscriptTrailerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(JINJA2_STMT_LSB);
				setState(433);
				jinjaStmtExpression(0);
				setState(434);
				match(JINJA2_STMT_RSB);
				}
				break;
			case JINJA2_STMT_DOT:
				_localctx = new Jinja2StmtAttributeTrailerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(JINJA2_STMT_DOT);
				setState(437);
				match(JINJA2_STMT_IDENTIFIER);
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
	public static class JinjaStmtAtomContext extends ParserRuleContext {
		public JinjaStmtAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmtAtom; }
	 
		public JinjaStmtAtomContext() { }
		public void copyFrom(JinjaStmtAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtListAtomContext extends JinjaStmtAtomContext {
		public TerminalNode JINJA2_STMT_LSB() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_LSB, 0); }
		public TerminalNode JINJA2_STMT_RSB() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_RSB, 0); }
		public List<JinjaStmtExpressionContext> jinjaStmtExpression() {
			return getRuleContexts(JinjaStmtExpressionContext.class);
		}
		public JinjaStmtExpressionContext jinjaStmtExpression(int i) {
			return getRuleContext(JinjaStmtExpressionContext.class,i);
		}
		public List<TerminalNode> JINJA2_STMT_COMMA() { return getTokens(HtmlCssJinja2Parser.JINJA2_STMT_COMMA); }
		public TerminalNode JINJA2_STMT_COMMA(int i) {
			return getToken(HtmlCssJinja2Parser.JINJA2_STMT_COMMA, i);
		}
		public Jinja2StmtListAtomContext(JinjaStmtAtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtParenthesizedAtomContext extends JinjaStmtAtomContext {
		public TerminalNode JINJA2_STMT_LPAREN() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_LPAREN, 0); }
		public TerminalNode JINJA2_STMT_RPAREN() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_RPAREN, 0); }
		public JinjaStmtExpressionContext jinjaStmtExpression() {
			return getRuleContext(JinjaStmtExpressionContext.class,0);
		}
		public Jinja2StmtParenthesizedAtomContext(JinjaStmtAtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtLiteralAtomContext extends JinjaStmtAtomContext {
		public JinjaStmtLiteralContext jinjaStmtLiteral() {
			return getRuleContext(JinjaStmtLiteralContext.class,0);
		}
		public Jinja2StmtLiteralAtomContext(JinjaStmtAtomContext ctx) { copyFrom(ctx); }
	}

	public final JinjaStmtAtomContext jinjaStmtAtom() throws RecognitionException {
		JinjaStmtAtomContext _localctx = new JinjaStmtAtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_jinjaStmtAtom);
		int _la;
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA2_STMT_LPAREN:
				_localctx = new Jinja2StmtParenthesizedAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(JINJA2_STMT_LPAREN);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 8056897537L) != 0)) {
					{
					setState(441);
					jinjaStmtExpression(0);
					}
				}

				setState(444);
				match(JINJA2_STMT_RPAREN);
				}
				break;
			case JINJA2_STMT_LSB:
				_localctx = new Jinja2StmtListAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(JINJA2_STMT_LSB);
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 8056897537L) != 0)) {
					{
					setState(446);
					jinjaStmtExpression(0);
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==JINJA2_STMT_COMMA) {
						{
						{
						setState(447);
						match(JINJA2_STMT_COMMA);
						setState(448);
						jinjaStmtExpression(0);
						}
						}
						setState(453);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(456);
				match(JINJA2_STMT_RSB);
				}
				break;
			case JINJA2_STMT_TRUE:
			case JINJA2_STMT_FALSE:
			case JINJA2_STMT_NULL:
			case JINJA2_STMT_INT:
			case JINJA2_STMT_DOUBLE:
			case JINJA2_STMT_STRING:
			case JINJA2_STMT_IDENTIFIER:
				_localctx = new Jinja2StmtLiteralAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				jinjaStmtLiteral();
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
	public static class JinjaStmtLiteralContext extends ParserRuleContext {
		public JinjaStmtLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmtLiteral; }
	 
		public JinjaStmtLiteralContext() { }
		public void copyFrom(JinjaStmtLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtIntLiteralContext extends JinjaStmtLiteralContext {
		public TerminalNode JINJA2_STMT_INT() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_INT, 0); }
		public Jinja2StmtIntLiteralContext(JinjaStmtLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtStringLiteralContext extends JinjaStmtLiteralContext {
		public TerminalNode JINJA2_STMT_STRING() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_STRING, 0); }
		public Jinja2StmtStringLiteralContext(JinjaStmtLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtIdLiteralContext extends JinjaStmtLiteralContext {
		public TerminalNode JINJA2_STMT_IDENTIFIER() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_IDENTIFIER, 0); }
		public Jinja2StmtIdLiteralContext(JinjaStmtLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtNullLiteralContext extends JinjaStmtLiteralContext {
		public TerminalNode JINJA2_STMT_NULL() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_NULL, 0); }
		public Jinja2StmtNullLiteralContext(JinjaStmtLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtFalseLiteralContext extends JinjaStmtLiteralContext {
		public TerminalNode JINJA2_STMT_FALSE() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_FALSE, 0); }
		public Jinja2StmtFalseLiteralContext(JinjaStmtLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtDoubleLiteralContext extends JinjaStmtLiteralContext {
		public TerminalNode JINJA2_STMT_DOUBLE() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_DOUBLE, 0); }
		public Jinja2StmtDoubleLiteralContext(JinjaStmtLiteralContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtTrueLiteralContext extends JinjaStmtLiteralContext {
		public TerminalNode JINJA2_STMT_TRUE() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_TRUE, 0); }
		public Jinja2StmtTrueLiteralContext(JinjaStmtLiteralContext ctx) { copyFrom(ctx); }
	}

	public final JinjaStmtLiteralContext jinjaStmtLiteral() throws RecognitionException {
		JinjaStmtLiteralContext _localctx = new JinjaStmtLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jinjaStmtLiteral);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA2_STMT_INT:
				_localctx = new Jinja2StmtIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(JINJA2_STMT_INT);
				}
				break;
			case JINJA2_STMT_DOUBLE:
				_localctx = new Jinja2StmtDoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(JINJA2_STMT_DOUBLE);
				}
				break;
			case JINJA2_STMT_STRING:
				_localctx = new Jinja2StmtStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(JINJA2_STMT_STRING);
				}
				break;
			case JINJA2_STMT_TRUE:
				_localctx = new Jinja2StmtTrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				match(JINJA2_STMT_TRUE);
				}
				break;
			case JINJA2_STMT_FALSE:
				_localctx = new Jinja2StmtFalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(464);
				match(JINJA2_STMT_FALSE);
				}
				break;
			case JINJA2_STMT_NULL:
				_localctx = new Jinja2StmtNullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(465);
				match(JINJA2_STMT_NULL);
				}
				break;
			case JINJA2_STMT_IDENTIFIER:
				_localctx = new Jinja2StmtIdLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(466);
				match(JINJA2_STMT_IDENTIFIER);
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
	public static class JinjaStmtArgumentContext extends ParserRuleContext {
		public JinjaStmtArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmtArgument; }
	 
		public JinjaStmtArgumentContext() { }
		public void copyFrom(JinjaStmtArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2StmtFunctionArgContext extends JinjaStmtArgumentContext {
		public JinjaStmtExpressionContext jinjaStmtExpression() {
			return getRuleContext(JinjaStmtExpressionContext.class,0);
		}
		public TerminalNode JINJA2_STMT_IDENTIFIER() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_IDENTIFIER, 0); }
		public TerminalNode JINJA2_STMT_EQUAL() { return getToken(HtmlCssJinja2Parser.JINJA2_STMT_EQUAL, 0); }
		public Jinja2StmtFunctionArgContext(JinjaStmtArgumentContext ctx) { copyFrom(ctx); }
	}

	public final JinjaStmtArgumentContext jinjaStmtArgument() throws RecognitionException {
		JinjaStmtArgumentContext _localctx = new JinjaStmtArgumentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jinjaStmtArgument);
		try {
			_localctx = new Jinja2StmtFunctionArgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(469);
				match(JINJA2_STMT_IDENTIFIER);
				setState(470);
				match(JINJA2_STMT_EQUAL);
				}
				break;
			}
			setState(473);
			jinjaStmtExpression(0);
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
	public static class StyleContext extends ParserRuleContext {
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
	 
		public StyleContext() { }
		public void copyFrom(StyleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleBodyContext extends StyleContext {
		public TerminalNode STYLE_OPEN() { return getToken(HtmlCssJinja2Parser.STYLE_OPEN, 0); }
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(HtmlCssJinja2Parser.STYLE_CLOSE, 0); }
		public StyleBodyContext(StyleContext ctx) { copyFrom(ctx); }
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_style);
		try {
			_localctx = new StyleBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(STYLE_OPEN);
			setState(476);
			stylesheet();
			setState(477);
			match(STYLE_CLOSE);
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
	public static class StylesheetContext extends ParserRuleContext {
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
	 
		public StylesheetContext() { }
		public void copyFrom(StylesheetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStylesheetContext extends StylesheetContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public CssStylesheetContext(StylesheetContext ctx) { copyFrom(ctx); }
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stylesheet);
		int _la;
		try {
			_localctx = new CssStylesheetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			ws();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(480);
				imports();
				setState(481);
				ws();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9011086586019840L) != 0)) {
				{
				{
				setState(488);
				nestedStatement();
				setState(489);
				ws();
				}
				}
				setState(495);
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
	public static class ImportsContext extends ParserRuleContext {
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
	 
		public ImportsContext() { }
		public void copyFrom(ImportsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssImportWithMediaQueryAndSemicolonContext extends ImportsContext {
		public TerminalNode Import() { return getToken(HtmlCssJinja2Parser.Import, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(HtmlCssJinja2Parser.SemiColon, 0); }
		public TerminalNode String_() { return getToken(HtmlCssJinja2Parser.String_, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public CssImportWithMediaQueryAndSemicolonContext(ImportsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssImportWithMediaQueryNoSemicolonContext extends ImportsContext {
		public TerminalNode Import() { return getToken(HtmlCssJinja2Parser.Import, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode String_() { return getToken(HtmlCssJinja2Parser.String_, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public CssImportWithMediaQueryNoSemicolonContext(ImportsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssImportWithSemicolonContext extends ImportsContext {
		public TerminalNode Import() { return getToken(HtmlCssJinja2Parser.Import, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(HtmlCssJinja2Parser.SemiColon, 0); }
		public TerminalNode String_() { return getToken(HtmlCssJinja2Parser.String_, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public CssImportWithSemicolonContext(ImportsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssImportWithoutSemicolonContext extends ImportsContext {
		public TerminalNode Import() { return getToken(HtmlCssJinja2Parser.Import, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode String_() { return getToken(HtmlCssJinja2Parser.String_, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public CssImportWithoutSemicolonContext(ImportsContext ctx) { copyFrom(ctx); }
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_imports);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new CssImportWithMediaQueryAndSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				match(Import);
				setState(497);
				ws();
				setState(500);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(498);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(499);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(502);
				ws();
				setState(503);
				mediaQueryList();
				setState(504);
				match(SemiColon);
				setState(505);
				ws();
				}
				break;
			case 2:
				_localctx = new CssImportWithSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(Import);
				setState(508);
				ws();
				setState(511);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(509);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(510);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(513);
				ws();
				setState(514);
				match(SemiColon);
				setState(515);
				ws();
				}
				break;
			case 3:
				_localctx = new CssImportWithMediaQueryNoSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				match(Import);
				setState(518);
				ws();
				setState(521);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(519);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(520);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(523);
				ws();
				setState(524);
				mediaQueryList();
				}
				break;
			case 4:
				_localctx = new CssImportWithoutSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(526);
				match(Import);
				setState(527);
				ws();
				setState(530);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(528);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(529);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(532);
				ws();
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
	public static class MediaContext extends ParserRuleContext {
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
	 
		public MediaContext() { }
		public void copyFrom(MediaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueriesDefinitionContext extends MediaContext {
		public TerminalNode Media() { return getToken(HtmlCssJinja2Parser.Media, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public CssMediaQueriesDefinitionContext(MediaContext ctx) { copyFrom(ctx); }
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_media);
		try {
			_localctx = new CssMediaQueriesDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(Media);
			setState(537);
			ws();
			setState(538);
			mediaQueryList();
			setState(539);
			groupRuleBody();
			setState(540);
			ws();
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
	public static class MediaQueryListContext extends ParserRuleContext {
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
	 
		public MediaQueryListContext() { }
		public void copyFrom(MediaQueryListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueriesListContext extends MediaQueryListContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HtmlCssJinja2Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HtmlCssJinja2Parser.Comma, i);
		}
		public CssMediaQueriesListContext(MediaQueryListContext ctx) { copyFrom(ctx); }
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mediaQueryList);
		int _la;
		try {
			_localctx = new CssMediaQueriesListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(542);
				mediaQuery();
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(543);
					match(Comma);
					setState(544);
					ws();
					setState(545);
					mediaQuery();
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(554);
			ws();
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
	public static class MediaQueryContext extends ParserRuleContext {
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
	 
		public MediaQueryContext() { }
		public void copyFrom(MediaQueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueryTypeAndExpressionsContext extends MediaQueryContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CssIdentContext cssIdent() {
			return getRuleContext(CssIdentContext.class,0);
		}
		public List<TerminalNode> And() { return getTokens(HtmlCssJinja2Parser.And); }
		public TerminalNode And(int i) {
			return getToken(HtmlCssJinja2Parser.And, i);
		}
		public List<MediaExpressionContext> mediaExpression() {
			return getRuleContexts(MediaExpressionContext.class);
		}
		public MediaExpressionContext mediaExpression(int i) {
			return getRuleContext(MediaExpressionContext.class,i);
		}
		public TerminalNode MediaOnly() { return getToken(HtmlCssJinja2Parser.MediaOnly, 0); }
		public TerminalNode Not() { return getToken(HtmlCssJinja2Parser.Not, 0); }
		public CssMediaQueryTypeAndExpressionsContext(MediaQueryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueryExpressionsContext extends MediaQueryContext {
		public List<MediaExpressionContext> mediaExpression() {
			return getRuleContexts(MediaExpressionContext.class);
		}
		public MediaExpressionContext mediaExpression(int i) {
			return getRuleContext(MediaExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(HtmlCssJinja2Parser.And); }
		public TerminalNode And(int i) {
			return getToken(HtmlCssJinja2Parser.And, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CssMediaQueryExpressionsContext(MediaQueryContext ctx) { copyFrom(ctx); }
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mediaQuery);
		int _la;
		try {
			int _alt;
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comment:
			case Space:
			case MediaOnly:
			case Not:
			case And:
			case Ident:
				_localctx = new CssMediaQueryTypeAndExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(556);
					_la = _input.LA(1);
					if ( !(_la==MediaOnly || _la==Not) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(559);
				ws();
				setState(560);
				cssIdent();
				setState(561);
				ws();
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(562);
						match(And);
						setState(563);
						ws();
						setState(564);
						mediaExpression();
						}
						} 
					}
					setState(570);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			case OpenParen:
				_localctx = new CssMediaQueryExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				mediaExpression();
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(572);
						match(And);
						setState(573);
						ws();
						setState(574);
						mediaExpression();
						}
						} 
					}
					setState(580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
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
	public static class MediaExpressionContext extends ParserRuleContext {
		public MediaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaExpression; }
	 
		public MediaExpressionContext() { }
		public void copyFrom(MediaExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaExpressionsContext extends MediaExpressionContext {
		public TerminalNode OpenParen() { return getToken(HtmlCssJinja2Parser.OpenParen, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CssIdentContext cssIdent() {
			return getRuleContext(CssIdentContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(HtmlCssJinja2Parser.CloseParen, 0); }
		public TerminalNode Colon() { return getToken(HtmlCssJinja2Parser.Colon, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CssMediaExpressionsContext(MediaExpressionContext ctx) { copyFrom(ctx); }
	}

	public final MediaExpressionContext mediaExpression() throws RecognitionException {
		MediaExpressionContext _localctx = new MediaExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mediaExpression);
		int _la;
		try {
			_localctx = new CssMediaExpressionsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(OpenParen);
			setState(584);
			ws();
			setState(585);
			cssIdent();
			setState(586);
			ws();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(587);
				match(Colon);
				setState(588);
				ws();
				setState(589);
				expr();
				}
			}

			setState(593);
			match(CloseParen);
			setState(594);
			ws();
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
	public static class SelectorGroupContext extends ParserRuleContext {
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
	 
		public SelectorGroupContext() { }
		public void copyFrom(SelectorGroupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorGroupBodyContext extends SelectorGroupContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HtmlCssJinja2Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HtmlCssJinja2Parser.Comma, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CssSelectorGroupBodyContext(SelectorGroupContext ctx) { copyFrom(ctx); }
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selectorGroup);
		int _la;
		try {
			_localctx = new CssSelectorGroupBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			selector();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(597);
				match(Comma);
				setState(598);
				ws();
				setState(599);
				selector();
				}
				}
				setState(605);
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
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorGroupContext extends SelectorContext {
		public List<SimpleSelectorSequenceContext> simpleSelectorSequence() {
			return getRuleContexts(SimpleSelectorSequenceContext.class);
		}
		public SimpleSelectorSequenceContext simpleSelectorSequence(int i) {
			return getRuleContext(SimpleSelectorSequenceContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public CssSelectorGroupContext(SelectorContext ctx) { copyFrom(ctx); }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_selector);
		int _la;
		try {
			_localctx = new CssSelectorGroupContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			simpleSelectorSequence();
			setState(607);
			ws();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 184720100950016L) != 0)) {
				{
				{
				setState(608);
				combinator();
				setState(609);
				simpleSelectorSequence();
				setState(610);
				ws();
				}
				}
				setState(616);
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
	public static class CombinatorContext extends ParserRuleContext {
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
	 
		public CombinatorContext() { }
		public void copyFrom(CombinatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDescendantCombinatorContext extends CombinatorContext {
		public TerminalNode Space() { return getToken(HtmlCssJinja2Parser.Space, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssDescendantCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssChildCombinatorContext extends CombinatorContext {
		public TerminalNode Greater() { return getToken(HtmlCssJinja2Parser.Greater, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssChildCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssGeneralSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode Tilde() { return getToken(HtmlCssJinja2Parser.Tilde, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssGeneralSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAdjacentSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode Plus() { return getToken(HtmlCssJinja2Parser.Plus, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssAdjacentSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_combinator);
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				_localctx = new CssAdjacentSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				match(Plus);
				setState(618);
				ws();
				}
				break;
			case Greater:
				_localctx = new CssChildCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(Greater);
				setState(620);
				ws();
				}
				break;
			case Tilde:
				_localctx = new CssGeneralSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				match(Tilde);
				setState(622);
				ws();
				}
				break;
			case Space:
				_localctx = new CssDescendantCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				match(Space);
				setState(624);
				ws();
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
	public static class SimpleSelectorSequenceContext extends ParserRuleContext {
		public SimpleSelectorSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectorSequence; }
	 
		public SimpleSelectorSequenceContext() { }
		public void copyFrom(SimpleSelectorSequenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCompoundSelectorWithoutTypeContext extends SimpleSelectorSequenceContext {
		public List<TerminalNode> Hash() { return getTokens(HtmlCssJinja2Parser.Hash); }
		public TerminalNode Hash(int i) {
			return getToken(HtmlCssJinja2Parser.Hash, i);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public CssCompoundSelectorWithoutTypeContext(SimpleSelectorSequenceContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCompoundSelectorWithTypeContext extends SimpleSelectorSequenceContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public List<TerminalNode> Hash() { return getTokens(HtmlCssJinja2Parser.Hash); }
		public TerminalNode Hash(int i) {
			return getToken(HtmlCssJinja2Parser.Hash, i);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public CssCompoundSelectorWithTypeContext(SimpleSelectorSequenceContext ctx) { copyFrom(ctx); }
	}

	public final SimpleSelectorSequenceContext simpleSelectorSequence() throws RecognitionException {
		SimpleSelectorSequenceContext _localctx = new SimpleSelectorSequenceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
			case Pipe:
			case MediaOnly:
			case Not:
			case And:
			case Ident:
				_localctx = new CssCompoundSelectorWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(627);
					typeSelector();
					}
					break;
				case 2:
					{
					setState(628);
					universal();
					}
					break;
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4345298944L) != 0)) {
					{
					setState(634);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(631);
						match(Hash);
						}
						break;
					case Dot:
						{
						setState(632);
						className();
						}
						break;
					case Colon:
						{
						setState(633);
						pseudo();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Colon:
			case Dot:
			case Hash:
				_localctx = new CssCompoundSelectorWithoutTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(642); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(642);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(639);
						match(Hash);
						}
						break;
					case Dot:
						{
						setState(640);
						className();
						}
						break;
					case Colon:
						{
						setState(641);
						pseudo();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(644); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4345298944L) != 0) );
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
	public static class TypeSelectorContext extends ParserRuleContext {
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
	 
		public TypeSelectorContext() { }
		public void copyFrom(TypeSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssElementTypeSelectorContext extends TypeSelectorContext {
		public CssIdentContext cssIdent() {
			return getRuleContext(CssIdentContext.class,0);
		}
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public CssElementTypeSelectorContext(TypeSelectorContext ctx) { copyFrom(ctx); }
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeSelector);
		try {
			_localctx = new CssElementTypeSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(648);
				typeNamespacePrefix();
				}
				break;
			}
			setState(651);
			cssIdent();
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
	public static class TypeNamespacePrefixContext extends ParserRuleContext {
		public TypeNamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamespacePrefix; }
	 
		public TypeNamespacePrefixContext() { }
		public void copyFrom(TypeNamespacePrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNamespacePrefixContext extends TypeNamespacePrefixContext {
		public TerminalNode Pipe() { return getToken(HtmlCssJinja2Parser.Pipe, 0); }
		public CssIdentContext cssIdent() {
			return getRuleContext(CssIdentContext.class,0);
		}
		public TerminalNode Multiply() { return getToken(HtmlCssJinja2Parser.Multiply, 0); }
		public CssNamespacePrefixContext(TypeNamespacePrefixContext ctx) { copyFrom(ctx); }
	}

	public final TypeNamespacePrefixContext typeNamespacePrefix() throws RecognitionException {
		TypeNamespacePrefixContext _localctx = new TypeNamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeNamespacePrefix);
		try {
			_localctx = new CssNamespacePrefixContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Ident:
				{
				setState(653);
				cssIdent();
				}
				break;
			case Multiply:
				{
				setState(654);
				match(Multiply);
				}
				break;
			case Pipe:
				break;
			default:
				break;
			}
			setState(657);
			match(Pipe);
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
	public static class UniversalContext extends ParserRuleContext {
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
	 
		public UniversalContext() { }
		public void copyFrom(UniversalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssUniversalSelectorContext extends UniversalContext {
		public TerminalNode Multiply() { return getToken(HtmlCssJinja2Parser.Multiply, 0); }
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public CssUniversalSelectorContext(UniversalContext ctx) { copyFrom(ctx); }
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_universal);
		try {
			_localctx = new CssUniversalSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(659);
				typeNamespacePrefix();
				}
				break;
			}
			setState(662);
			match(Multiply);
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
	public static class ClassNameContext extends ParserRuleContext {
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
	 
		public ClassNameContext() { }
		public void copyFrom(ClassNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssClassSelectorContext extends ClassNameContext {
		public TerminalNode Dot() { return getToken(HtmlCssJinja2Parser.Dot, 0); }
		public CssIdentContext cssIdent() {
			return getRuleContext(CssIdentContext.class,0);
		}
		public CssClassSelectorContext(ClassNameContext ctx) { copyFrom(ctx); }
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_className);
		try {
			_localctx = new CssClassSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(Dot);
			setState(665);
			cssIdent();
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
	public static class PseudoContext extends ParserRuleContext {
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
	 
		public PseudoContext() { }
		public void copyFrom(PseudoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPseudoClassOrElementContext extends PseudoContext {
		public List<TerminalNode> Colon() { return getTokens(HtmlCssJinja2Parser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(HtmlCssJinja2Parser.Colon, i);
		}
		public CssIdentContext cssIdent() {
			return getRuleContext(CssIdentContext.class,0);
		}
		public FunctionalPseudoContext functionalPseudo() {
			return getRuleContext(FunctionalPseudoContext.class,0);
		}
		public CssPseudoClassOrElementContext(PseudoContext ctx) { copyFrom(ctx); }
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_pseudo);
		int _la;
		try {
			_localctx = new CssPseudoClassOrElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(Colon);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(668);
				match(Colon);
				}
			}

			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Ident:
				{
				setState(671);
				cssIdent();
				}
				break;
			case Function_:
				{
				setState(672);
				functionalPseudo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class FunctionalPseudoContext extends ParserRuleContext {
		public FunctionalPseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalPseudo; }
	 
		public FunctionalPseudoContext() { }
		public void copyFrom(FunctionalPseudoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionalPseudoContext extends FunctionalPseudoContext {
		public TerminalNode Function_() { return getToken(HtmlCssJinja2Parser.Function_, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(HtmlCssJinja2Parser.CloseParen, 0); }
		public CssFunctionalPseudoContext(FunctionalPseudoContext ctx) { copyFrom(ctx); }
	}

	public final FunctionalPseudoContext functionalPseudo() throws RecognitionException {
		FunctionalPseudoContext _localctx = new FunctionalPseudoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionalPseudo);
		try {
			_localctx = new CssFunctionalPseudoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(Function_);
			setState(676);
			ws();
			setState(677);
			expression();
			setState(678);
			match(CloseParen);
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
	public static class CssValueExpressionContext extends ExpressionContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(HtmlCssJinja2Parser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(HtmlCssJinja2Parser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(HtmlCssJinja2Parser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(HtmlCssJinja2Parser.Minus, i);
		}
		public List<TerminalNode> Dimension() { return getTokens(HtmlCssJinja2Parser.Dimension); }
		public TerminalNode Dimension(int i) {
			return getToken(HtmlCssJinja2Parser.Dimension, i);
		}
		public List<TerminalNode> Number() { return getTokens(HtmlCssJinja2Parser.Number); }
		public TerminalNode Number(int i) {
			return getToken(HtmlCssJinja2Parser.Number, i);
		}
		public List<TerminalNode> String_() { return getTokens(HtmlCssJinja2Parser.String_); }
		public TerminalNode String_(int i) {
			return getToken(HtmlCssJinja2Parser.String_, i);
		}
		public List<CssIdentContext> cssIdent() {
			return getRuleContexts(CssIdentContext.class);
		}
		public CssIdentContext cssIdent(int i) {
			return getRuleContext(CssIdentContext.class,i);
		}
		public CssValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expression);
		int _la;
		try {
			_localctx = new CssValueExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(689); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(686);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
					{
					setState(680);
					match(Plus);
					}
					break;
				case Minus:
					{
					setState(681);
					match(Minus);
					}
					break;
				case Dimension:
					{
					setState(682);
					match(Dimension);
					}
					break;
				case Number:
					{
					setState(683);
					match(Number);
					}
					break;
				case String_:
					{
					setState(684);
					match(String_);
					}
					break;
				case MediaOnly:
				case Not:
				case And:
				case Ident:
					{
					setState(685);
					cssIdent();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(688);
				ws();
				}
				}
				setState(691); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9886258801147904L) != 0) );
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
	public static class Operator_Context extends ParserRuleContext {
		public Operator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_; }
	 
		public Operator_Context() { }
		public void copyFrom(Operator_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDivideOperatorContext extends Operator_Context {
		public TerminalNode Divide() { return getToken(HtmlCssJinja2Parser.Divide, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssDivideOperatorContext(Operator_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCommaSeparatorContext extends Operator_Context {
		public TerminalNode Comma() { return getToken(HtmlCssJinja2Parser.Comma, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssCommaSeparatorContext(Operator_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSpaceSeparatorContext extends Operator_Context {
		public TerminalNode Space() { return getToken(HtmlCssJinja2Parser.Space, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssSpaceSeparatorContext(Operator_Context ctx) { copyFrom(ctx); }
	}

	public final Operator_Context operator_() throws RecognitionException {
		Operator_Context _localctx = new Operator_Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_operator_);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Divide:
				_localctx = new CssDivideOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				match(Divide);
				setState(694);
				ws();
				}
				break;
			case Comma:
				_localctx = new CssCommaSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(Comma);
				setState(696);
				ws();
				}
				break;
			case Space:
				_localctx = new CssSpaceSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				match(Space);
				setState(698);
				ws();
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
	public static class Property_Context extends ParserRuleContext {
		public Property_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_; }
	 
		public Property_Context() { }
		public void copyFrom(Property_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssVarPropertyContext extends Property_Context {
		public TerminalNode Variable() { return getToken(HtmlCssJinja2Parser.Variable, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssVarPropertyContext(Property_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdPropertyContext extends Property_Context {
		public CssIdentContext cssIdent() {
			return getRuleContext(CssIdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssIdPropertyContext(Property_Context ctx) { copyFrom(ctx); }
	}

	public final Property_Context property_() throws RecognitionException {
		Property_Context _localctx = new Property_Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_property_);
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Ident:
				_localctx = new CssIdPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				cssIdent();
				setState(702);
				ws();
				}
				break;
			case Variable:
				_localctx = new CssVarPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(Variable);
				setState(705);
				ws();
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
	public static class RulesetContext extends ParserRuleContext {
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
	 
		public RulesetContext() { }
		public void copyFrom(RulesetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRulesetDefinitionContext extends RulesetContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(HtmlCssJinja2Parser.OpenBrace, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(HtmlCssJinja2Parser.CloseBrace, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public CssRulesetDefinitionContext(RulesetContext ctx) { copyFrom(ctx); }
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ruleset);
		int _la;
		try {
			_localctx = new CssRulesetDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			selectorGroup();
			setState(709);
			match(OpenBrace);
			setState(710);
			ws();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11262847367512064L) != 0)) {
				{
				setState(711);
				declarationList();
				}
			}

			setState(714);
			match(CloseBrace);
			setState(715);
			ws();
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
	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	 
		public DeclarationListContext() { }
		public void copyFrom(DeclarationListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationListContext extends DeclarationListContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(HtmlCssJinja2Parser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(HtmlCssJinja2Parser.SemiColon, i);
		}
		public CssDeclarationListContext(DeclarationListContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_declarationList);
		int _la;
		try {
			_localctx = new CssDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(717);
				match(SemiColon);
				setState(718);
				ws();
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(724);
			declaration();
			setState(725);
			ws();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(726);
				match(SemiColon);
				setState(727);
				ws();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11262847359123456L) != 0)) {
					{
					setState(728);
					declaration();
					}
				}

				}
				}
				setState(735);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends DeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(HtmlCssJinja2Parser.Colon, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Important() { return getToken(HtmlCssJinja2Parser.Important, 0); }
		public CssDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_declaration);
		int _la;
		try {
			_localctx = new CssDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			property_();
			setState(737);
			match(Colon);
			setState(738);
			ws();
			setState(739);
			expr();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Important) {
				{
				setState(740);
				match(Important);
				setState(741);
				ws();
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssExpressionSequenceContext extends ExprContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Operator_Context> operator_() {
			return getRuleContexts(Operator_Context.class);
		}
		public Operator_Context operator_(int i) {
			return getRuleContext(Operator_Context.class,i);
		}
		public CssExpressionSequenceContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expr);
		int _la;
		try {
			int _alt;
			_localctx = new CssExpressionSequenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			term();
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70371025879040L) != 0)) {
						{
						setState(745);
						operator_();
						}
					}

					setState(748);
					term();
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStringTermContext extends TermContext {
		public TerminalNode String_() { return getToken(HtmlCssJinja2Parser.String_, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssStringTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPercentageTermContext extends TermContext {
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssPercentageTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCalcTermContext extends TermContext {
		public TerminalNode Calc() { return getToken(HtmlCssJinja2Parser.Calc, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(HtmlCssJinja2Parser.CloseParen, 0); }
		public CssCalcTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssVariableTermContext extends TermContext {
		public TerminalNode Var() { return getToken(HtmlCssJinja2Parser.Var, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode Variable() { return getToken(HtmlCssJinja2Parser.Variable, 0); }
		public TerminalNode CloseParen() { return getToken(HtmlCssJinja2Parser.CloseParen, 0); }
		public CssVariableTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionTermContext extends TermContext {
		public TerminalNode Function_() { return getToken(HtmlCssJinja2Parser.Function_, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(HtmlCssJinja2Parser.CloseParen, 0); }
		public CssFunctionTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssUrlTermContext extends TermContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssUrlTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssHexColorTermContext extends TermContext {
		public TerminalNode Hash() { return getToken(HtmlCssJinja2Parser.Hash, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssHexColorTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumberTermContext extends TermContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssNumberTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdTermContext extends TermContext {
		public CssIdentContext cssIdent() {
			return getRuleContext(CssIdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssIdTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDimensionTermContext extends TermContext {
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssDimensionTermContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_term);
		try {
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				_localctx = new CssNumberTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				number();
				setState(755);
				ws();
				}
				break;
			case 2:
				_localctx = new CssPercentageTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				percentage();
				setState(758);
				ws();
				}
				break;
			case 3:
				_localctx = new CssDimensionTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				dimension();
				setState(761);
				ws();
				}
				break;
			case 4:
				_localctx = new CssStringTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(763);
				match(String_);
				setState(764);
				ws();
				}
				break;
			case 5:
				_localctx = new CssIdTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(765);
				cssIdent();
				setState(766);
				ws();
				}
				break;
			case 6:
				_localctx = new CssVariableTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(768);
				match(Var);
				setState(769);
				ws();
				setState(770);
				match(Variable);
				setState(771);
				ws();
				setState(772);
				match(CloseParen);
				setState(773);
				ws();
				}
				break;
			case 7:
				_localctx = new CssUrlTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(775);
				url();
				setState(776);
				ws();
				}
				break;
			case 8:
				_localctx = new CssHexColorTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(778);
				match(Hash);
				setState(779);
				ws();
				}
				break;
			case 9:
				_localctx = new CssCalcTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(780);
				match(Calc);
				setState(781);
				ws();
				setState(782);
				calcSum();
				setState(783);
				match(CloseParen);
				setState(784);
				ws();
				}
				break;
			case 10:
				_localctx = new CssFunctionTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(786);
				match(Function_);
				setState(787);
				ws();
				setState(788);
				expr();
				setState(789);
				match(CloseParen);
				setState(790);
				ws();
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
	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumberExpressionContext extends NumberContext {
		public TerminalNode Number() { return getToken(HtmlCssJinja2Parser.Number, 0); }
		public TerminalNode Plus() { return getToken(HtmlCssJinja2Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(HtmlCssJinja2Parser.Minus, 0); }
		public CssNumberExpressionContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_number);
		int _la;
		try {
			_localctx = new CssNumberExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(794);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(797);
			match(Number);
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
	public static class PercentageContext extends ParserRuleContext {
		public PercentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentage; }
	 
		public PercentageContext() { }
		public void copyFrom(PercentageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPercentageExpressionContext extends PercentageContext {
		public TerminalNode Percentage() { return getToken(HtmlCssJinja2Parser.Percentage, 0); }
		public TerminalNode Plus() { return getToken(HtmlCssJinja2Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(HtmlCssJinja2Parser.Minus, 0); }
		public CssPercentageExpressionContext(PercentageContext ctx) { copyFrom(ctx); }
	}

	public final PercentageContext percentage() throws RecognitionException {
		PercentageContext _localctx = new PercentageContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_percentage);
		int _la;
		try {
			_localctx = new CssPercentageExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(799);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(802);
			match(Percentage);
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
	public static class DimensionContext extends ParserRuleContext {
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
	 
		public DimensionContext() { }
		public void copyFrom(DimensionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDimensionExpressionContext extends DimensionContext {
		public TerminalNode Dimension() { return getToken(HtmlCssJinja2Parser.Dimension, 0); }
		public TerminalNode Plus() { return getToken(HtmlCssJinja2Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(HtmlCssJinja2Parser.Minus, 0); }
		public CssDimensionExpressionContext(DimensionContext ctx) { copyFrom(ctx); }
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_dimension);
		int _la;
		try {
			_localctx = new CssDimensionExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(804);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(807);
			match(Dimension);
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
	public static class NestedStatementContext extends ParserRuleContext {
		public NestedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedStatement; }
	 
		public NestedStatementContext() { }
		public void copyFrom(NestedStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRulesetContext extends NestedStatementContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public CssRulesetContext(NestedStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueriesContext extends NestedStatementContext {
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public CssMediaQueriesContext(NestedStatementContext ctx) { copyFrom(ctx); }
	}

	public final NestedStatementContext nestedStatement() throws RecognitionException {
		NestedStatementContext _localctx = new NestedStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_nestedStatement);
		try {
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
			case Dot:
			case Multiply:
			case Pipe:
			case Hash:
			case MediaOnly:
			case Not:
			case And:
			case Ident:
				_localctx = new CssRulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				ruleset();
				}
				break;
			case Media:
				_localctx = new CssMediaQueriesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				media();
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
	public static class GroupRuleBodyContext extends ParserRuleContext {
		public GroupRuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupRuleBody; }
	 
		public GroupRuleBodyContext() { }
		public void copyFrom(GroupRuleBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssGroupRulebodyContext extends GroupRuleBodyContext {
		public TerminalNode OpenBrace() { return getToken(HtmlCssJinja2Parser.OpenBrace, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(HtmlCssJinja2Parser.CloseBrace, 0); }
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public CssGroupRulebodyContext(GroupRuleBodyContext ctx) { copyFrom(ctx); }
	}

	public final GroupRuleBodyContext groupRuleBody() throws RecognitionException {
		GroupRuleBodyContext _localctx = new GroupRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_groupRuleBody);
		int _la;
		try {
			_localctx = new CssGroupRulebodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(OpenBrace);
			setState(814);
			ws();
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9011086586019840L) != 0)) {
				{
				{
				setState(815);
				nestedStatement();
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(821);
			match(CloseBrace);
			setState(822);
			ws();
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
	public static class UrlContext extends ParserRuleContext {
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
	 
		public UrlContext() { }
		public void copyFrom(UrlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssQuotedUrlContext extends UrlContext {
		public TerminalNode Url_() { return getToken(HtmlCssJinja2Parser.Url_, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode String_() { return getToken(HtmlCssJinja2Parser.String_, 0); }
		public TerminalNode CloseParen() { return getToken(HtmlCssJinja2Parser.CloseParen, 0); }
		public CssQuotedUrlContext(UrlContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssUnquotedUrlContext extends UrlContext {
		public TerminalNode Url() { return getToken(HtmlCssJinja2Parser.Url, 0); }
		public CssUnquotedUrlContext(UrlContext ctx) { copyFrom(ctx); }
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_url);
		try {
			setState(831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Url_:
				_localctx = new CssQuotedUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				match(Url_);
				setState(825);
				ws();
				setState(826);
				match(String_);
				setState(827);
				ws();
				setState(828);
				match(CloseParen);
				}
				break;
			case Url:
				_localctx = new CssUnquotedUrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				match(Url);
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
	public static class CalcSumContext extends ParserRuleContext {
		public CalcSumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcSum; }
	 
		public CalcSumContext() { }
		public void copyFrom(CalcSumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCalcSumExpressionContext extends CalcSumContext {
		public List<CalcProductContext> calcProduct() {
			return getRuleContexts(CalcProductContext.class);
		}
		public CalcProductContext calcProduct(int i) {
			return getRuleContext(CalcProductContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(HtmlCssJinja2Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(HtmlCssJinja2Parser.Space, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(HtmlCssJinja2Parser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(HtmlCssJinja2Parser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(HtmlCssJinja2Parser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(HtmlCssJinja2Parser.Minus, i);
		}
		public CssCalcSumExpressionContext(CalcSumContext ctx) { copyFrom(ctx); }
	}

	public final CalcSumContext calcSum() throws RecognitionException {
		CalcSumContext _localctx = new CalcSumContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_calcSum);
		int _la;
		try {
			_localctx = new CssCalcSumExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			calcProduct();
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(834);
				match(Space);
				setState(835);
				ws();
				setState(836);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(837);
				ws();
				setState(838);
				match(Space);
				setState(839);
				ws();
				setState(840);
				calcProduct();
				}
				}
				setState(846);
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
	public static class CalcProductContext extends ParserRuleContext {
		public CalcProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcProduct; }
	 
		public CalcProductContext() { }
		public void copyFrom(CalcProductContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCalcProductExpressionContext extends CalcProductContext {
		public List<CalcValueContext> calcValue() {
			return getRuleContexts(CalcValueContext.class);
		}
		public CalcValueContext calcValue(int i) {
			return getRuleContext(CalcValueContext.class,i);
		}
		public List<TerminalNode> Multiply() { return getTokens(HtmlCssJinja2Parser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(HtmlCssJinja2Parser.Multiply, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> Divide() { return getTokens(HtmlCssJinja2Parser.Divide); }
		public TerminalNode Divide(int i) {
			return getToken(HtmlCssJinja2Parser.Divide, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public CssCalcProductExpressionContext(CalcProductContext ctx) { copyFrom(ctx); }
	}

	public final CalcProductContext calcProduct() throws RecognitionException {
		CalcProductContext _localctx = new CalcProductContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_calcProduct);
		int _la;
		try {
			_localctx = new CssCalcProductExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			calcValue();
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Multiply || _la==Divide) {
				{
				setState(857);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
					{
					setState(848);
					match(Multiply);
					setState(849);
					ws();
					setState(850);
					calcValue();
					}
					break;
				case Divide:
					{
					setState(852);
					match(Divide);
					setState(853);
					ws();
					setState(854);
					number();
					setState(855);
					ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(861);
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
	public static class CalcValueContext extends ParserRuleContext {
		public CalcValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcValue; }
	 
		public CalcValueContext() { }
		public void copyFrom(CalcValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDimensionValueContext extends CalcValueContext {
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssDimensionValueContext(CalcValueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumberValueContext extends CalcValueContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssNumberValueContext(CalcValueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPercentageValueContext extends CalcValueContext {
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssPercentageValueContext(CalcValueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNestedCalcExpressionContext extends CalcValueContext {
		public TerminalNode OpenParen() { return getToken(HtmlCssJinja2Parser.OpenParen, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(HtmlCssJinja2Parser.CloseParen, 0); }
		public CssNestedCalcExpressionContext(CalcValueContext ctx) { copyFrom(ctx); }
	}

	public final CalcValueContext calcValue() throws RecognitionException {
		CalcValueContext _localctx = new CalcValueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_calcValue);
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				_localctx = new CssNumberValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				number();
				setState(863);
				ws();
				}
				break;
			case 2:
				_localctx = new CssDimensionValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				dimension();
				setState(866);
				ws();
				}
				break;
			case 3:
				_localctx = new CssPercentageValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(868);
				percentage();
				setState(869);
				ws();
				}
				break;
			case 4:
				_localctx = new CssNestedCalcExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				match(OpenParen);
				setState(872);
				ws();
				setState(873);
				calcSum();
				setState(874);
				match(CloseParen);
				setState(875);
				ws();
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
	public static class CssIdentContext extends ParserRuleContext {
		public CssIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssIdent; }
	 
		public CssIdentContext() { }
		public void copyFrom(CssIdentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaOnlyContext extends CssIdentContext {
		public TerminalNode MediaOnly() { return getToken(HtmlCssJinja2Parser.MediaOnly, 0); }
		public CssMediaOnlyContext(CssIdentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdentifierContext extends CssIdentContext {
		public TerminalNode Ident() { return getToken(HtmlCssJinja2Parser.Ident, 0); }
		public CssIdentifierContext(CssIdentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAndContext extends CssIdentContext {
		public TerminalNode And() { return getToken(HtmlCssJinja2Parser.And, 0); }
		public CssAndContext(CssIdentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNotContext extends CssIdentContext {
		public TerminalNode Not() { return getToken(HtmlCssJinja2Parser.Not, 0); }
		public CssNotContext(CssIdentContext ctx) { copyFrom(ctx); }
	}

	public final CssIdentContext cssIdent() throws RecognitionException {
		CssIdentContext _localctx = new CssIdentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cssIdent);
		try {
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				_localctx = new CssIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				match(Ident);
				}
				break;
			case MediaOnly:
				_localctx = new CssMediaOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(MediaOnly);
				}
				break;
			case Not:
				_localctx = new CssNotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(881);
				match(Not);
				}
				break;
			case And:
				_localctx = new CssAndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(882);
				match(And);
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
	public static class WsContext extends ParserRuleContext {
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
	 
		public WsContext() { }
		public void copyFrom(WsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssWhiteSpaceContext extends WsContext {
		public List<TerminalNode> Comment() { return getTokens(HtmlCssJinja2Parser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(HtmlCssJinja2Parser.Comment, i);
		}
		public List<TerminalNode> Space() { return getTokens(HtmlCssJinja2Parser.Space); }
		public TerminalNode Space(int i) {
			return getToken(HtmlCssJinja2Parser.Space, i);
		}
		public CssWhiteSpaceContext(WsContext ctx) { copyFrom(ctx); }
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ws);
		int _la;
		try {
			int _alt;
			_localctx = new CssWhiteSpaceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(885);
					_la = _input.LA(1);
					if ( !(_la==Comment || _la==Space) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return jinjaExprExpression_sempred((JinjaExprExpressionContext)_localctx, predIndex);
		case 21:
			return jinjaStmtExpression_sempred((JinjaStmtExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean jinjaExprExpression_sempred(JinjaExprExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean jinjaStmtExpression_sempred(JinjaStmtExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0082\u037c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000\u0005\u0000\u0080"+
		"\b\u0000\n\u0000\f\u0000\u0083\t\u0000\u0001\u0000\u0003\u0000\u0086\b"+
		"\u0000\u0001\u0000\u0005\u0000\u0089\b\u0000\n\u0000\f\u0000\u008c\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0090\b\u0000\n\u0000\f\u0000\u0093"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u0098\b\u0001"+
		"\n\u0001\f\u0001\u009b\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u009f"+
		"\b\u0001\n\u0001\f\u0001\u00a2\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u00a7\b\u0002\n\u0002\f\u0002\u00aa\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00b3\b\u0002\u0001\u0002\u0003\u0002\u00b6\b\u0002\u0001\u0002"+
		"\u0003\u0002\u00b9\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u00bf\b\u0003\n\u0003\f\u0003\u00c2\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00c7\b\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00cb\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00cf\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00d6\b\b\u0001"+
		"\t\u0001\t\u0003\t\u00da\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00e0"+
		"\b\n\n\n\f\n\u00e3\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00e9\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00fd\b\u000b\n\u000b\f\u000b\u0100"+
		"\t\u000b\u0001\f\u0001\f\u0005\f\u0104\b\f\n\f\f\f\u0107\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u010d\b\r\n\r\f\r\u0110\t\r\u0001\r\u0003\r"+
		"\u0113\b\r\u0003\r\u0115\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u011e\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u0122"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0129\b\u000e\n\u000e\f\u000e\u012c\t\u000e\u0003\u000e\u012e\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0132\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u013b\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u013f\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0145\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u014f\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0159\b\u0013\n\u0013\f\u0013\u015c\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0162\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u016f\b\u0014\n"+
		"\u0014\f\u0014\u0172\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0178\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0182"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u0196\b\u0015\n\u0015\f\u0015\u0199\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u019d\b\u0016\n\u0016\f\u0016\u01a0\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01a6\b\u0017\n"+
		"\u0017\f\u0017\u01a9\t\u0017\u0001\u0017\u0003\u0017\u01ac\b\u0017\u0003"+
		"\u0017\u01ae\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01b7\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u01bb\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u01c2\b\u0018\n\u0018\f\u0018\u01c5\t\u0018"+
		"\u0003\u0018\u01c7\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01cb\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01d4\b\u0019\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01d8\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u01e4\b\u001c\n\u001c\f\u001c\u01e7\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u01ec\b\u001c\n\u001c\f\u001c\u01ef\t\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01f5\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0200\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u020a\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0213\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0217\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0224\b\u001f\n\u001f\f\u001f"+
		"\u0227\t\u001f\u0003\u001f\u0229\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0003 \u022e\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u0237\b \n \f \u023a\t \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0241"+
		"\b \n \f \u0244\t \u0003 \u0246\b \u0001!\u0001!\u0001!\u0001!\u0001!"+
		"\u0001!\u0001!\u0001!\u0003!\u0250\b!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u025a\b\"\n\"\f\"\u025d\t\"\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0265\b#\n#\f#\u0268\t#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0272\b$\u0001"+
		"%\u0001%\u0003%\u0276\b%\u0001%\u0001%\u0001%\u0005%\u027b\b%\n%\f%\u027e"+
		"\t%\u0001%\u0001%\u0001%\u0004%\u0283\b%\u000b%\f%\u0284\u0003%\u0287"+
		"\b%\u0001&\u0003&\u028a\b&\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u0290"+
		"\b\'\u0001\'\u0001\'\u0001(\u0003(\u0295\b(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0003*\u029e\b*\u0001*\u0001*\u0003*\u02a2\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u02af\b,\u0001,\u0004,\u02b2\b,\u000b,\f,\u02b3\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u02bc\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u02c3\b.\u0001/\u0001/\u0001/\u0001/\u0003/\u02c9\b/\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00050\u02d0\b0\n0\f0\u02d3\t0\u00010\u0001"+
		"0\u00010\u00010\u00010\u00030\u02da\b0\u00050\u02dc\b0\n0\f0\u02df\t0"+
		"\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u02e7\b1\u00012\u0001"+
		"2\u00032\u02eb\b2\u00012\u00052\u02ee\b2\n2\f2\u02f1\t2\u00013\u00013"+
		"\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u0319\b3\u00014\u0003"+
		"4\u031c\b4\u00014\u00014\u00015\u00035\u0321\b5\u00015\u00015\u00016\u0003"+
		"6\u0326\b6\u00016\u00016\u00017\u00017\u00037\u032c\b7\u00018\u00018\u0001"+
		"8\u00058\u0331\b8\n8\f8\u0334\t8\u00018\u00018\u00018\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u0340\b9\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u034b\b:\n:\f:\u034e\t:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0005"+
		";\u035a\b;\n;\f;\u035d\t;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u036e"+
		"\b<\u0001=\u0001=\u0001=\u0001=\u0003=\u0374\b=\u0001>\u0005>\u0377\b"+
		">\n>\f>\u037a\t>\u0001>\u0000\u0002\u0016*?\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\u0000\u000b\u0001\u0000AC\u0001"+
		"\u0000?@\u0001\u0000FK\u0001\u0000<=\u0001\u0000kp\u0001\u0000`a\u0001"+
		"\u0000de\u0001\u0000fh\u0001\u0000\'(\u0001\u0000+,\u0002\u0000\u001d"+
		"\u001d\u001f\u001f\u03d6\u0000\u0081\u0001\u0000\u0000\u0000\u0002\u0099"+
		"\u0001\u0000\u0000\u0000\u0004\u00b8\u0001\u0000\u0000\u0000\u0006\u00c0"+
		"\u0001\u0000\u0000\u0000\b\u00c3\u0001\u0000\u0000\u0000\n\u00ca\u0001"+
		"\u0000\u0000\u0000\f\u00ce\u0001\u0000\u0000\u0000\u000e\u00d0\u0001\u0000"+
		"\u0000\u0000\u0010\u00d5\u0001\u0000\u0000\u0000\u0012\u00d7\u0001\u0000"+
		"\u0000\u0000\u0014\u00dd\u0001\u0000\u0000\u0000\u0016\u00e8\u0001\u0000"+
		"\u0000\u0000\u0018\u0101\u0001\u0000\u0000\u0000\u001a\u011d\u0001\u0000"+
		"\u0000\u0000\u001c\u0131\u0001\u0000\u0000\u0000\u001e\u013a\u0001\u0000"+
		"\u0000\u0000 \u013e\u0001\u0000\u0000\u0000\"\u0144\u0001\u0000\u0000"+
		"\u0000$\u0146\u0001\u0000\u0000\u0000&\u0154\u0001\u0000\u0000\u0000("+
		"\u0163\u0001\u0000\u0000\u0000*\u0181\u0001\u0000\u0000\u0000,\u019a\u0001"+
		"\u0000\u0000\u0000.\u01b6\u0001\u0000\u0000\u00000\u01ca\u0001\u0000\u0000"+
		"\u00002\u01d3\u0001\u0000\u0000\u00004\u01d7\u0001\u0000\u0000\u00006"+
		"\u01db\u0001\u0000\u0000\u00008\u01df\u0001\u0000\u0000\u0000:\u0216\u0001"+
		"\u0000\u0000\u0000<\u0218\u0001\u0000\u0000\u0000>\u0228\u0001\u0000\u0000"+
		"\u0000@\u0245\u0001\u0000\u0000\u0000B\u0247\u0001\u0000\u0000\u0000D"+
		"\u0254\u0001\u0000\u0000\u0000F\u025e\u0001\u0000\u0000\u0000H\u0271\u0001"+
		"\u0000\u0000\u0000J\u0286\u0001\u0000\u0000\u0000L\u0289\u0001\u0000\u0000"+
		"\u0000N\u028f\u0001\u0000\u0000\u0000P\u0294\u0001\u0000\u0000\u0000R"+
		"\u0298\u0001\u0000\u0000\u0000T\u029b\u0001\u0000\u0000\u0000V\u02a3\u0001"+
		"\u0000\u0000\u0000X\u02b1\u0001\u0000\u0000\u0000Z\u02bb\u0001\u0000\u0000"+
		"\u0000\\\u02c2\u0001\u0000\u0000\u0000^\u02c4\u0001\u0000\u0000\u0000"+
		"`\u02d1\u0001\u0000\u0000\u0000b\u02e0\u0001\u0000\u0000\u0000d\u02e8"+
		"\u0001\u0000\u0000\u0000f\u0318\u0001\u0000\u0000\u0000h\u031b\u0001\u0000"+
		"\u0000\u0000j\u0320\u0001\u0000\u0000\u0000l\u0325\u0001\u0000\u0000\u0000"+
		"n\u032b\u0001\u0000\u0000\u0000p\u032d\u0001\u0000\u0000\u0000r\u033f"+
		"\u0001\u0000\u0000\u0000t\u0341\u0001\u0000\u0000\u0000v\u034f\u0001\u0000"+
		"\u0000\u0000x\u036d\u0001\u0000\u0000\u0000z\u0373\u0001\u0000\u0000\u0000"+
		"|\u0378\u0001\u0000\u0000\u0000~\u0080\u0005\u0003\u0000\u0000\u007f~"+
		"\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0005\u0002\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u008a\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0005\u0003\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u0091\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u0090\u0003\u0002\u0001\u0000\u008e\u0090"+
		"\u0003\u0010\b\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"\u0000\u0000\u0001\u0095\u0001\u0001\u0000\u0000\u0000\u0096\u0098\u0003"+
		"\f\u0006\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u00a0\u0003\u0004\u0002\u0000\u009d\u009f\u0003\f\u0006"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u0003\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005\u0005\u0000\u0000\u00a4\u00a8\u0005\u000e\u0000"+
		"\u0000\u00a5\u00a7\u0003\b\u0004\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00b5\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00b2\u0005\n\u0000\u0000\u00ac"+
		"\u00ad\u0003\u0006\u0003\u0000\u00ad\u00ae\u0005\u0005\u0000\u0000\u00ae"+
		"\u00af\u0005\f\u0000\u0000\u00af\u00b0\u0005\u000e\u0000\u0000\u00b0\u00b1"+
		"\u0005\n\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b6\u0005\u000b\u0000\u0000\u00b5\u00ab\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b9\u00036\u001b\u0000\u00b8\u00a3\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u0005\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bf\u0003\n\u0005\u0000\u00bb\u00bf\u0003\u0004\u0002"+
		"\u0000\u00bc\u00bf\u0003\u000e\u0007\u0000\u00bd\u00bf\u0003\u0010\b\u0000"+
		"\u00be\u00ba\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u0007\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6\u0005\u000e\u0000\u0000"+
		"\u00c4\u00c5\u0005\r\u0000\u0000\u00c5\u00c7\u0005\u0010\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\t\u0001\u0000\u0000\u0000\u00c8\u00cb\u0005\u0006\u0000\u0000\u00c9\u00cb"+
		"\u0005\u0003\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u000b\u0001\u0000\u0000\u0000\u00cc\u00cf"+
		"\u0003\u000e\u0007\u0000\u00cd\u00cf\u0005\u0003\u0000\u0000\u00ce\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\r\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005\u0001\u0000\u0000\u00d1\u000f\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d6\u0005\t\u0000\u0000\u00d3\u00d6\u0003\u0012"+
		"\t\u0000\u00d4\u00d6\u0003\"\u0011\u0000\u00d5\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u0011\u0001\u0000\u0000\u0000\u00d7\u00d9\u0005\u0007\u0000"+
		"\u0000\u00d8\u00da\u0003\u0014\n\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u00057\u0000\u0000\u00dc\u0013\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e1\u0003\u0016\u000b\u0000\u00de\u00e0\u0003\u0016\u000b\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u0015\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0006\u000b\uffff\uffff\u0000\u00e5\u00e9\u0003\u0018\f\u0000\u00e6"+
		"\u00e7\u0005:\u0000\u0000\u00e7\u00e9\u0003\u0016\u000b\u0002\u00e8\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00fe"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\n\u0007\u0000\u0000\u00eb\u00ec\u0007"+
		"\u0000\u0000\u0000\u00ec\u00fd\u0003\u0016\u000b\b\u00ed\u00ee\n\u0006"+
		"\u0000\u0000\u00ee\u00ef\u0007\u0001\u0000\u0000\u00ef\u00fd\u0003\u0016"+
		"\u000b\u0007\u00f0\u00f1\n\u0005\u0000\u0000\u00f1\u00f2\u0007\u0002\u0000"+
		"\u0000\u00f2\u00fd\u0003\u0016\u000b\u0006\u00f3\u00f4\n\u0004\u0000\u0000"+
		"\u00f4\u00f5\u00059\u0000\u0000\u00f5\u00fd\u0003\u0016\u000b\u0005\u00f6"+
		"\u00f7\n\u0003\u0000\u0000\u00f7\u00f8\u0005;\u0000\u0000\u00f8\u00fd"+
		"\u0003\u0016\u000b\u0004\u00f9\u00fa\n\u0001\u0000\u0000\u00fa\u00fb\u0007"+
		"\u0003\u0000\u0000\u00fb\u00fd\u0003\u0016\u000b\u0002\u00fc\u00ea\u0001"+
		"\u0000\u0000\u0000\u00fc\u00ed\u0001\u0000\u0000\u0000\u00fc\u00f0\u0001"+
		"\u0000\u0000\u0000\u00fc\u00f3\u0001\u0000\u0000\u0000\u00fc\u00f6\u0001"+
		"\u0000\u0000\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0017\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0105\u0003\u001c\u000e\u0000\u0102\u0104\u0003"+
		"\u001a\r\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u0019\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u0114\u0005N\u0000\u0000\u0109\u010e\u0003 \u0010\u0000"+
		"\u010a\u010b\u0005E\u0000\u0000\u010b\u010d\u0003 \u0010\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0112"+
		"\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0113"+
		"\u0005E\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113\u0001"+
		"\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0109\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u011e\u0005O\u0000\u0000\u0117\u0118\u0005L\u0000"+
		"\u0000\u0118\u0119\u0003\u0016\u000b\u0000\u0119\u011a\u0005M\u0000\u0000"+
		"\u011a\u011e\u0001\u0000\u0000\u0000\u011b\u011c\u0005D\u0000\u0000\u011c"+
		"\u011e\u0005[\u0000\u0000\u011d\u0108\u0001\u0000\u0000\u0000\u011d\u0117"+
		"\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u001b"+
		"\u0001\u0000\u0000\u0000\u011f\u0121\u0005N\u0000\u0000\u0120\u0122\u0003"+
		"\u0016\u000b\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0132\u0005"+
		"O\u0000\u0000\u0124\u012d\u0005L\u0000\u0000\u0125\u012a\u0003\u0016\u000b"+
		"\u0000\u0126\u0127\u0005E\u0000\u0000\u0127\u0129\u0003\u0016\u000b\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u0125\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0132\u0005M\u0000\u0000\u0130"+
		"\u0132\u0003\u001e\u000f\u0000\u0131\u011f\u0001\u0000\u0000\u0000\u0131"+
		"\u0124\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132"+
		"\u001d\u0001\u0000\u0000\u0000\u0133\u013b\u0005X\u0000\u0000\u0134\u013b"+
		"\u0005Y\u0000\u0000\u0135\u013b\u0005Z\u0000\u0000\u0136\u013b\u0005P"+
		"\u0000\u0000\u0137\u013b\u0005Q\u0000\u0000\u0138\u013b\u0005R\u0000\u0000"+
		"\u0139\u013b\u0005[\u0000\u0000\u013a\u0133\u0001\u0000\u0000\u0000\u013a"+
		"\u0134\u0001\u0000\u0000\u0000\u013a\u0135\u0001\u0000\u0000\u0000\u013a"+
		"\u0136\u0001\u0000\u0000\u0000\u013a\u0137\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b"+
		"\u001f\u0001\u0000\u0000\u0000\u013c\u013d\u0005[\u0000\u0000\u013d\u013f"+
		"\u0005>\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0003"+
		"\u0016\u000b\u0000\u0141!\u0001\u0000\u0000\u0000\u0142\u0145\u0003$\u0012"+
		"\u0000\u0143\u0145\u0003(\u0014\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0144\u0143\u0001\u0000\u0000\u0000\u0145#\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0005\b\u0000\u0000\u0147\u0148\u0003&\u0013\u0000\u0148\u0149"+
		"\u0005\\\u0000\u0000\u0149\u014e\u0003\u0006\u0003\u0000\u014a\u014b\u0005"+
		"\b\u0000\u0000\u014b\u014c\u0005~\u0000\u0000\u014c\u014d\u0005\\\u0000"+
		"\u0000\u014d\u014f\u0003\u0006\u0003\u0000\u014e\u014a\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005\b\u0000\u0000\u0151\u0152\u0005y\u0000\u0000"+
		"\u0152\u0153\u0005\\\u0000\u0000\u0153%\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005x\u0000\u0000\u0155\u015a\u0005\u0082\u0000\u0000\u0156\u0157"+
		"\u0005j\u0000\u0000\u0157\u0159\u0005\u0082\u0000\u0000\u0158\u0156\u0001"+
		"\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001"+
		"\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0005"+
		"z\u0000\u0000\u015e\u0161\u0003,\u0016\u0000\u015f\u0160\u0005{\u0000"+
		"\u0000\u0160\u0162\u0003*\u0015\u0000\u0161\u015f\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0001\u0000\u0000\u0000\u0162\'\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0005\b\u0000\u0000\u0164\u0165\u0005{\u0000\u0000\u0165\u0166"+
		"\u0003*\u0015\u0000\u0166\u0167\u0005\\\u0000\u0000\u0167\u0170\u0003"+
		"\u0006\u0003\u0000\u0168\u0169\u0005\b\u0000\u0000\u0169\u016a\u0005}"+
		"\u0000\u0000\u016a\u016b\u0003*\u0015\u0000\u016b\u016c\u0005\\\u0000"+
		"\u0000\u016c\u016d\u0003\u0006\u0003\u0000\u016d\u016f\u0001\u0000\u0000"+
		"\u0000\u016e\u0168\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000"+
		"\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171\u0177\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0005\b\u0000\u0000\u0174\u0175\u0005~\u0000\u0000"+
		"\u0175\u0176\u0005\\\u0000\u0000\u0176\u0178\u0003\u0006\u0003\u0000\u0177"+
		"\u0173\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0005\b\u0000\u0000\u017a\u017b"+
		"\u0005|\u0000\u0000\u017b\u017c\u0005\\\u0000\u0000\u017c)\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0006\u0015\uffff\uffff\u0000\u017e\u017f\u0005"+
		"b\u0000\u0000\u017f\u0182\u0003*\u0015\u0004\u0180\u0182\u0003,\u0016"+
		"\u0000\u0181\u017d\u0001\u0000\u0000\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0197\u0001\u0000\u0000\u0000\u0183\u0184\n\b\u0000\u0000"+
		"\u0184\u0185\u0005^\u0000\u0000\u0185\u0196\u0003*\u0015\t\u0186\u0187"+
		"\n\u0007\u0000\u0000\u0187\u0188\u0005_\u0000\u0000\u0188\u0196\u0003"+
		"*\u0015\b\u0189\u018a\n\u0006\u0000\u0000\u018a\u018b\u0007\u0004\u0000"+
		"\u0000\u018b\u0196\u0003*\u0015\u0007\u018c\u018d\n\u0005\u0000\u0000"+
		"\u018d\u018e\u0007\u0005\u0000\u0000\u018e\u0196\u0003*\u0015\u0006\u018f"+
		"\u0190\n\u0003\u0000\u0000\u0190\u0191\u0007\u0006\u0000\u0000\u0191\u0196"+
		"\u0003*\u0015\u0004\u0192\u0193\n\u0002\u0000\u0000\u0193\u0194\u0007"+
		"\u0007\u0000\u0000\u0194\u0196\u0003*\u0015\u0003\u0195\u0183\u0001\u0000"+
		"\u0000\u0000\u0195\u0186\u0001\u0000\u0000\u0000\u0195\u0189\u0001\u0000"+
		"\u0000\u0000\u0195\u018c\u0001\u0000\u0000\u0000\u0195\u018f\u0001\u0000"+
		"\u0000\u0000\u0195\u0192\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000"+
		"\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198+\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000"+
		"\u0000\u019a\u019e\u00030\u0018\u0000\u019b\u019d\u0003.\u0017\u0000\u019c"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		"-\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01ad"+
		"\u0005s\u0000\u0000\u01a2\u01a7\u00034\u001a\u0000\u01a3\u01a4\u0005j"+
		"\u0000\u0000\u01a4\u01a6\u00034\u001a\u0000\u01a5\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ac\u0005j\u0000\u0000"+
		"\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01a2\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000"+
		"\u01af\u01b7\u0005t\u0000\u0000\u01b0\u01b1\u0005q\u0000\u0000\u01b1\u01b2"+
		"\u0003*\u0015\u0000\u01b2\u01b3\u0005r\u0000\u0000\u01b3\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0005i\u0000\u0000\u01b5\u01b7\u0005\u0082\u0000"+
		"\u0000\u01b6\u01a1\u0001\u0000\u0000\u0000\u01b6\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7/\u0001\u0000\u0000\u0000"+
		"\u01b8\u01ba\u0005s\u0000\u0000\u01b9\u01bb\u0003*\u0015\u0000\u01ba\u01b9"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bc\u01cb\u0005t\u0000\u0000\u01bd\u01c6\u0005"+
		"q\u0000\u0000\u01be\u01c3\u0003*\u0015\u0000\u01bf\u01c0\u0005j\u0000"+
		"\u0000\u01c0\u01c2\u0003*\u0015\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01be\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c8\u01cb\u0005r\u0000\u0000\u01c9\u01cb\u00032\u0019\u0000\u01ca\u01b8"+
		"\u0001\u0000\u0000\u0000\u01ca\u01bd\u0001\u0000\u0000\u0000\u01ca\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cb1\u0001\u0000\u0000\u0000\u01cc\u01d4\u0005"+
		"\u007f\u0000\u0000\u01cd\u01d4\u0005\u0080\u0000\u0000\u01ce\u01d4\u0005"+
		"\u0081\u0000\u0000\u01cf\u01d4\u0005u\u0000\u0000\u01d0\u01d4\u0005v\u0000"+
		"\u0000\u01d1\u01d4\u0005w\u0000\u0000\u01d2\u01d4\u0005\u0082\u0000\u0000"+
		"\u01d3\u01cc\u0001\u0000\u0000\u0000\u01d3\u01cd\u0001\u0000\u0000\u0000"+
		"\u01d3\u01ce\u0001\u0000\u0000\u0000\u01d3\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d43\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0005\u0082\u0000\u0000\u01d6\u01d8\u0005c\u0000\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0003*\u0015\u0000\u01da5\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0005\u0004\u0000\u0000\u01dc\u01dd\u00038\u001c"+
		"\u0000\u01dd\u01de\u0005\u0012\u0000\u0000\u01de7\u0001\u0000\u0000\u0000"+
		"\u01df\u01e5\u0003|>\u0000\u01e0\u01e1\u0003:\u001d\u0000\u01e1\u01e2"+
		"\u0003|>\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01ed\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003n7\u0000"+
		"\u01e9\u01ea\u0003|>\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01e8"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee9\u0001"+
		"\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005"+
		"!\u0000\u0000\u01f1\u01f4\u0003|>\u0000\u01f2\u01f5\u00051\u0000\u0000"+
		"\u01f3\u01f5\u0003r9\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0003|>\u0000\u01f7\u01f8\u0003>\u001f\u0000\u01f8\u01f9\u0005\u0017"+
		"\u0000\u0000\u01f9\u01fa\u0003|>\u0000\u01fa\u0217\u0001\u0000\u0000\u0000"+
		"\u01fb\u01fc\u0005!\u0000\u0000\u01fc\u01ff\u0003|>\u0000\u01fd\u0200"+
		"\u00051\u0000\u0000\u01fe\u0200\u0003r9\u0000\u01ff\u01fd\u0001\u0000"+
		"\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0003|>\u0000\u0202\u0203\u0005\u0017\u0000\u0000"+
		"\u0203\u0204\u0003|>\u0000\u0204\u0217\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0005!\u0000\u0000\u0206\u0209\u0003|>\u0000\u0207\u020a\u00051\u0000"+
		"\u0000\u0208\u020a\u0003r9\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209"+
		"\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b"+
		"\u020c\u0003|>\u0000\u020c\u020d\u0003>\u001f\u0000\u020d\u0217\u0001"+
		"\u0000\u0000\u0000\u020e\u020f\u0005!\u0000\u0000\u020f\u0212\u0003|>"+
		"\u0000\u0210\u0213\u00051\u0000\u0000\u0211\u0213\u0003r9\u0000\u0212"+
		"\u0210\u0001\u0000\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213"+
		"\u0214\u0001\u0000\u0000\u0000\u0214\u0215\u0003|>\u0000\u0215\u0217\u0001"+
		"\u0000\u0000\u0000\u0216\u01f0\u0001\u0000\u0000\u0000\u0216\u01fb\u0001"+
		"\u0000\u0000\u0000\u0216\u0205\u0001\u0000\u0000\u0000\u0216\u020e\u0001"+
		"\u0000\u0000\u0000\u0217;\u0001\u0000\u0000\u0000\u0218\u0219\u0005#\u0000"+
		"\u0000\u0219\u021a\u0003|>\u0000\u021a\u021b\u0003>\u001f\u0000\u021b"+
		"\u021c\u0003p8\u0000\u021c\u021d\u0003|>\u0000\u021d=\u0001\u0000\u0000"+
		"\u0000\u021e\u0225\u0003@ \u0000\u021f\u0220\u0005.\u0000\u0000\u0220"+
		"\u0221\u0003|>\u0000\u0221\u0222\u0003@ \u0000\u0222\u0224\u0001\u0000"+
		"\u0000\u0000\u0223\u021f\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000"+
		"\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000"+
		"\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000"+
		"\u0000\u0000\u0228\u021e\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0003|>\u0000"+
		"\u022b?\u0001\u0000\u0000\u0000\u022c\u022e\u0007\b\u0000\u0000\u022d"+
		"\u022c\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e"+
		"\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0003|>\u0000\u0230\u0231\u0003"+
		"z=\u0000\u0231\u0238\u0003|>\u0000\u0232\u0233\u0005)\u0000\u0000\u0233"+
		"\u0234\u0003|>\u0000\u0234\u0235\u0003B!\u0000\u0235\u0237\u0001\u0000"+
		"\u0000\u0000\u0236\u0232\u0001\u0000\u0000\u0000\u0237\u023a\u0001\u0000"+
		"\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000"+
		"\u0000\u0000\u0239\u0246\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000"+
		"\u0000\u0000\u023b\u0242\u0003B!\u0000\u023c\u023d\u0005)\u0000\u0000"+
		"\u023d\u023e\u0003|>\u0000\u023e\u023f\u0003B!\u0000\u023f\u0241\u0001"+
		"\u0000\u0000\u0000\u0240\u023c\u0001\u0000\u0000\u0000\u0241\u0244\u0001"+
		"\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001"+
		"\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244\u0242\u0001"+
		"\u0000\u0000\u0000\u0245\u022d\u0001\u0000\u0000\u0000\u0245\u023b\u0001"+
		"\u0000\u0000\u0000\u0246A\u0001\u0000\u0000\u0000\u0247\u0248\u0005\u0013"+
		"\u0000\u0000\u0248\u0249\u0003|>\u0000\u0249\u024a\u0003z=\u0000\u024a"+
		"\u024f\u0003|>\u0000\u024b\u024c\u0005\u0018\u0000\u0000\u024c\u024d\u0003"+
		"|>\u0000\u024d\u024e\u0003d2\u0000\u024e\u0250\u0001\u0000\u0000\u0000"+
		"\u024f\u024b\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0005\u0014\u0000\u0000"+
		"\u0252\u0253\u0003|>\u0000\u0253C\u0001\u0000\u0000\u0000\u0254\u025b"+
		"\u0003F#\u0000\u0255\u0256\u0005.\u0000\u0000\u0256\u0257\u0003|>\u0000"+
		"\u0257\u0258\u0003F#\u0000\u0258\u025a\u0001\u0000\u0000\u0000\u0259\u0255"+
		"\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000\u0000\u0000\u025b\u0259"+
		"\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025cE\u0001"+
		"\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025e\u025f\u0003"+
		"J%\u0000\u025f\u0266\u0003|>\u0000\u0260\u0261\u0003H$\u0000\u0261\u0262"+
		"\u0003J%\u0000\u0262\u0263\u0003|>\u0000\u0263\u0265\u0001\u0000\u0000"+
		"\u0000\u0264\u0260\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000"+
		"\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000"+
		"\u0000\u0267G\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0005+\u0000\u0000\u026a\u0272\u0003|>\u0000\u026b\u026c"+
		"\u0005-\u0000\u0000\u026c\u0272\u0003|>\u0000\u026d\u026e\u0005/\u0000"+
		"\u0000\u026e\u0272\u0003|>\u0000\u026f\u0270\u0005\u001f\u0000\u0000\u0270"+
		"\u0272\u0003|>\u0000\u0271\u0269\u0001\u0000\u0000\u0000\u0271\u026b\u0001"+
		"\u0000\u0000\u0000\u0271\u026d\u0001\u0000\u0000\u0000\u0271\u026f\u0001"+
		"\u0000\u0000\u0000\u0272I\u0001\u0000\u0000\u0000\u0273\u0276\u0003L&"+
		"\u0000\u0274\u0276\u0003P(\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0275"+
		"\u0274\u0001\u0000\u0000\u0000\u0276\u027c\u0001\u0000\u0000\u0000\u0277"+
		"\u027b\u0005 \u0000\u0000\u0278\u027b\u0003R)\u0000\u0279\u027b\u0003"+
		"T*\u0000\u027a\u0277\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000"+
		"\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b\u027e\u0001\u0000\u0000"+
		"\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000"+
		"\u0000\u027d\u0287\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000"+
		"\u0000\u027f\u0283\u0005 \u0000\u0000\u0280\u0283\u0003R)\u0000\u0281"+
		"\u0283\u0003T*\u0000\u0282\u027f\u0001\u0000\u0000\u0000\u0282\u0280\u0001"+
		"\u0000\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0283\u0284\u0001"+
		"\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001"+
		"\u0000\u0000\u0000\u0285\u0287\u0001\u0000\u0000\u0000\u0286\u0275\u0001"+
		"\u0000\u0000\u0000\u0286\u0282\u0001\u0000\u0000\u0000\u0287K\u0001\u0000"+
		"\u0000\u0000\u0288\u028a\u0003N\'\u0000\u0289\u0288\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0003z=\u0000\u028cM\u0001\u0000\u0000\u0000\u028d"+
		"\u0290\u0003z=\u0000\u028e\u0290\u0005\u001a\u0000\u0000\u028f\u028d\u0001"+
		"\u0000\u0000\u0000\u028f\u028e\u0001\u0000\u0000\u0000\u028f\u0290\u0001"+
		"\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0292\u0005"+
		"\u001c\u0000\u0000\u0292O\u0001\u0000\u0000\u0000\u0293\u0295\u0003N\'"+
		"\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000"+
		"\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0297\u0005\u001a\u0000"+
		"\u0000\u0297Q\u0001\u0000\u0000\u0000\u0298\u0299\u0005\u0019\u0000\u0000"+
		"\u0299\u029a\u0003z=\u0000\u029aS\u0001\u0000\u0000\u0000\u029b\u029d"+
		"\u0005\u0018\u0000\u0000\u029c\u029e\u0005\u0018\u0000\u0000\u029d\u029c"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u02a1"+
		"\u0001\u0000\u0000\u0000\u029f\u02a2\u0003z=\u0000\u02a0\u02a2\u0003V"+
		"+\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a2U\u0001\u0000\u0000\u0000\u02a3\u02a4\u00056\u0000\u0000\u02a4"+
		"\u02a5\u0003|>\u0000\u02a5\u02a6\u0003X,\u0000\u02a6\u02a7\u0005\u0014"+
		"\u0000\u0000\u02a7W\u0001\u0000\u0000\u0000\u02a8\u02af\u0005+\u0000\u0000"+
		"\u02a9\u02af\u0005,\u0000\u0000\u02aa\u02af\u0005*\u0000\u0000\u02ab\u02af"+
		"\u00050\u0000\u0000\u02ac\u02af\u00051\u0000\u0000\u02ad\u02af\u0003z"+
		"=\u0000\u02ae\u02a8\u0001\u0000\u0000\u0000\u02ae\u02a9\u0001\u0000\u0000"+
		"\u0000\u02ae\u02aa\u0001\u0000\u0000\u0000\u02ae\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000"+
		"\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b2\u0003|>\u0000\u02b1"+
		"\u02ae\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4"+
		"Y\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005\u001b\u0000\u0000\u02b6\u02bc"+
		"\u0003|>\u0000\u02b7\u02b8\u0005.\u0000\u0000\u02b8\u02bc\u0003|>\u0000"+
		"\u02b9\u02ba\u0005\u001f\u0000\u0000\u02ba\u02bc\u0003|>\u0000\u02bb\u02b5"+
		"\u0001\u0000\u0000\u0000\u02bb\u02b7\u0001\u0000\u0000\u0000\u02bb\u02b9"+
		"\u0001\u0000\u0000\u0000\u02bc[\u0001\u0000\u0000\u0000\u02bd\u02be\u0003"+
		"z=\u0000\u02be\u02bf\u0003|>\u0000\u02bf\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c1\u00053\u0000\u0000\u02c1\u02c3\u0003|>\u0000\u02c2\u02bd"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c3]\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c5\u0003D\"\u0000\u02c5\u02c6\u0005\u0015"+
		"\u0000\u0000\u02c6\u02c8\u0003|>\u0000\u02c7\u02c9\u0003`0\u0000\u02c8"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9"+
		"\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005\u0016\u0000\u0000\u02cb"+
		"\u02cc\u0003|>\u0000\u02cc_\u0001\u0000\u0000\u0000\u02cd\u02ce\u0005"+
		"\u0017\u0000\u0000\u02ce\u02d0\u0003|>\u0000\u02cf\u02cd\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4\u02d5\u0003b1\u0000\u02d5"+
		"\u02dd\u0003|>\u0000\u02d6\u02d7\u0005\u0017\u0000\u0000\u02d7\u02d9\u0003"+
		"|>\u0000\u02d8\u02da\u0003b1\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000"+
		"\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02dc\u0001\u0000\u0000\u0000"+
		"\u02db\u02d6\u0001\u0000\u0000\u0000\u02dc\u02df\u0001\u0000\u0000\u0000"+
		"\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000"+
		"\u02dea\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02e0"+
		"\u02e1\u0003\\.\u0000\u02e1\u02e2\u0005\u0018\u0000\u0000\u02e2\u02e3"+
		"\u0003|>\u0000\u02e3\u02e6\u0003d2\u0000\u02e4\u02e5\u0005$\u0000\u0000"+
		"\u02e5\u02e7\u0003|>\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e7c\u0001\u0000\u0000\u0000\u02e8\u02ef\u0003"+
		"f3\u0000\u02e9\u02eb\u0003Z-\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000"+
		"\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ee\u0003f3\u0000\u02ed\u02ea\u0001\u0000\u0000\u0000\u02ee\u02f1"+
		"\u0001\u0000\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f0e\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f3\u0003h4\u0000\u02f3\u02f4\u0003|>\u0000"+
		"\u02f4\u0319\u0001\u0000\u0000\u0000\u02f5\u02f6\u0003j5\u0000\u02f6\u02f7"+
		"\u0003|>\u0000\u02f7\u0319\u0001\u0000\u0000\u0000\u02f8\u02f9\u0003l"+
		"6\u0000\u02f9\u02fa\u0003|>\u0000\u02fa\u0319\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fc\u00051\u0000\u0000\u02fc\u0319\u0003|>\u0000\u02fd\u02fe"+
		"\u0003z=\u0000\u02fe\u02ff\u0003|>\u0000\u02ff\u0319\u0001\u0000\u0000"+
		"\u0000\u0300\u0301\u00054\u0000\u0000\u0301\u0302\u0003|>\u0000\u0302"+
		"\u0303\u00053\u0000\u0000\u0303\u0304\u0003|>\u0000\u0304\u0305\u0005"+
		"\u0014\u0000\u0000\u0305\u0306\u0003|>\u0000\u0306\u0319\u0001\u0000\u0000"+
		"\u0000\u0307\u0308\u0003r9\u0000\u0308\u0309\u0003|>\u0000\u0309\u0319"+
		"\u0001\u0000\u0000\u0000\u030a\u030b\u0005 \u0000\u0000\u030b\u0319\u0003"+
		"|>\u0000\u030c\u030d\u00052\u0000\u0000\u030d\u030e\u0003|>\u0000\u030e"+
		"\u030f\u0003t:\u0000\u030f\u0310\u0005\u0014\u0000\u0000\u0310\u0311\u0003"+
		"|>\u0000\u0311\u0319\u0001\u0000\u0000\u0000\u0312\u0313\u00056\u0000"+
		"\u0000\u0313\u0314\u0003|>\u0000\u0314\u0315\u0003d2\u0000\u0315\u0316"+
		"\u0005\u0014\u0000\u0000\u0316\u0317\u0003|>\u0000\u0317\u0319\u0001\u0000"+
		"\u0000\u0000\u0318\u02f2\u0001\u0000\u0000\u0000\u0318\u02f5\u0001\u0000"+
		"\u0000\u0000\u0318\u02f8\u0001\u0000\u0000\u0000\u0318\u02fb\u0001\u0000"+
		"\u0000\u0000\u0318\u02fd\u0001\u0000\u0000\u0000\u0318\u0300\u0001\u0000"+
		"\u0000\u0000\u0318\u0307\u0001\u0000\u0000\u0000\u0318\u030a\u0001\u0000"+
		"\u0000\u0000\u0318\u030c\u0001\u0000\u0000\u0000\u0318\u0312\u0001\u0000"+
		"\u0000\u0000\u0319g\u0001\u0000\u0000\u0000\u031a\u031c\u0007\t\u0000"+
		"\u0000\u031b\u031a\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000"+
		"\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031e\u00050\u0000\u0000"+
		"\u031ei\u0001\u0000\u0000\u0000\u031f\u0321\u0007\t\u0000\u0000\u0320"+
		"\u031f\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321"+
		"\u0322\u0001\u0000\u0000\u0000\u0322\u0323\u0005%\u0000\u0000\u0323k\u0001"+
		"\u0000\u0000\u0000\u0324\u0326\u0007\t\u0000\u0000\u0325\u0324\u0001\u0000"+
		"\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326\u0327\u0001\u0000"+
		"\u0000\u0000\u0327\u0328\u0005*\u0000\u0000\u0328m\u0001\u0000\u0000\u0000"+
		"\u0329\u032c\u0003^/\u0000\u032a\u032c\u0003<\u001e\u0000\u032b\u0329"+
		"\u0001\u0000\u0000\u0000\u032b\u032a\u0001\u0000\u0000\u0000\u032co\u0001"+
		"\u0000\u0000\u0000\u032d\u032e\u0005\u0015\u0000\u0000\u032e\u0332\u0003"+
		"|>\u0000\u032f\u0331\u0003n7\u0000\u0330\u032f\u0001\u0000\u0000\u0000"+
		"\u0331\u0334\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000"+
		"\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0335\u0001\u0000\u0000\u0000"+
		"\u0334\u0332\u0001\u0000\u0000\u0000\u0335\u0336\u0005\u0016\u0000\u0000"+
		"\u0336\u0337\u0003|>\u0000\u0337q\u0001\u0000\u0000\u0000\u0338\u0339"+
		"\u0005&\u0000\u0000\u0339\u033a\u0003|>\u0000\u033a\u033b\u00051\u0000"+
		"\u0000\u033b\u033c\u0003|>\u0000\u033c\u033d\u0005\u0014\u0000\u0000\u033d"+
		"\u0340\u0001\u0000\u0000\u0000\u033e\u0340\u0005\u001e\u0000\u0000\u033f"+
		"\u0338\u0001\u0000\u0000\u0000\u033f\u033e\u0001\u0000\u0000\u0000\u0340"+
		"s\u0001\u0000\u0000\u0000\u0341\u034c\u0003v;\u0000\u0342\u0343\u0005"+
		"\u001f\u0000\u0000\u0343\u0344\u0003|>\u0000\u0344\u0345\u0007\t\u0000"+
		"\u0000\u0345\u0346\u0003|>\u0000\u0346\u0347\u0005\u001f\u0000\u0000\u0347"+
		"\u0348\u0003|>\u0000\u0348\u0349\u0003v;\u0000\u0349\u034b\u0001\u0000"+
		"\u0000\u0000\u034a\u0342\u0001\u0000\u0000\u0000\u034b\u034e\u0001\u0000"+
		"\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000"+
		"\u0000\u0000\u034du\u0001\u0000\u0000\u0000\u034e\u034c\u0001\u0000\u0000"+
		"\u0000\u034f\u035b\u0003x<\u0000\u0350\u0351\u0005\u001a\u0000\u0000\u0351"+
		"\u0352\u0003|>\u0000\u0352\u0353\u0003x<\u0000\u0353\u035a\u0001\u0000"+
		"\u0000\u0000\u0354\u0355\u0005\u001b\u0000\u0000\u0355\u0356\u0003|>\u0000"+
		"\u0356\u0357\u0003h4\u0000\u0357\u0358\u0003|>\u0000\u0358\u035a\u0001"+
		"\u0000\u0000\u0000\u0359\u0350\u0001\u0000\u0000\u0000\u0359\u0354\u0001"+
		"\u0000\u0000\u0000\u035a\u035d\u0001\u0000\u0000\u0000\u035b\u0359\u0001"+
		"\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035cw\u0001\u0000"+
		"\u0000\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035e\u035f\u0003h4\u0000"+
		"\u035f\u0360\u0003|>\u0000\u0360\u036e\u0001\u0000\u0000\u0000\u0361\u0362"+
		"\u0003l6\u0000\u0362\u0363\u0003|>\u0000\u0363\u036e\u0001\u0000\u0000"+
		"\u0000\u0364\u0365\u0003j5\u0000\u0365\u0366\u0003|>\u0000\u0366\u036e"+
		"\u0001\u0000\u0000\u0000\u0367\u0368\u0005\u0013\u0000\u0000\u0368\u0369"+
		"\u0003|>\u0000\u0369\u036a\u0003t:\u0000\u036a\u036b\u0005\u0014\u0000"+
		"\u0000\u036b\u036c\u0003|>\u0000\u036c\u036e\u0001\u0000\u0000\u0000\u036d"+
		"\u035e\u0001\u0000\u0000\u0000\u036d\u0361\u0001\u0000\u0000\u0000\u036d"+
		"\u0364\u0001\u0000\u0000\u0000\u036d\u0367\u0001\u0000\u0000\u0000\u036e"+
		"y\u0001\u0000\u0000\u0000\u036f\u0374\u00055\u0000\u0000\u0370\u0374\u0005"+
		"\'\u0000\u0000\u0371\u0374\u0005(\u0000\u0000\u0372\u0374\u0005)\u0000"+
		"\u0000\u0373\u036f\u0001\u0000\u0000\u0000\u0373\u0370\u0001\u0000\u0000"+
		"\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0373\u0372\u0001\u0000\u0000"+
		"\u0000\u0374{\u0001\u0000\u0000\u0000\u0375\u0377\u0007\n\u0000\u0000"+
		"\u0376\u0375\u0001\u0000\u0000\u0000\u0377\u037a\u0001\u0000\u0000\u0000"+
		"\u0378\u0376\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000"+
		"\u0379}\u0001\u0000\u0000\u0000\u037a\u0378\u0001\u0000\u0000\u0000i\u0081"+
		"\u0085\u008a\u008f\u0091\u0099\u00a0\u00a8\u00b2\u00b5\u00b8\u00be\u00c0"+
		"\u00c6\u00ca\u00ce\u00d5\u00d9\u00e1\u00e8\u00fc\u00fe\u0105\u010e\u0112"+
		"\u0114\u011d\u0121\u012a\u012d\u0131\u013a\u013e\u0144\u014e\u015a\u0161"+
		"\u0170\u0177\u0181\u0195\u0197\u019e\u01a7\u01ab\u01ad\u01b6\u01ba\u01c3"+
		"\u01c6\u01ca\u01d3\u01d7\u01e5\u01ed\u01f4\u01ff\u0209\u0212\u0216\u0225"+
		"\u0228\u022d\u0238\u0242\u0245\u024f\u025b\u0266\u0271\u0275\u027a\u027c"+
		"\u0282\u0284\u0286\u0289\u028f\u0294\u029d\u02a1\u02ae\u02b3\u02bb\u02c2"+
		"\u02c8\u02d1\u02d9\u02dd\u02e6\u02ea\u02ef\u0318\u031b\u0320\u0325\u032b"+
		"\u0332\u033f\u034c\u0359\u035b\u036d\u0373\u0378";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}