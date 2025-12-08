// Generated from ./src/antlr/html_css_jinja2/HtmlCssJinja2Parser.g4 by ANTLR 4.13.2
package antlr.html_css_jinja2.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlCssJinja2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, DTD=2, SEA_WS=3, STYLE_OPEN=4, TAG_OPEN=5, HTML_TEXT=6, 
		TAG_CLOSE=7, TAG_SLASH_CLOSE=8, TAG_SLASH=9, TAG_EQUALS=10, TAG_NAME=11, 
		TAG_WHITESPACE=12, ATTVALUE_VALUE=13, ATTRIBUTE=14, STYLE_CLOSE=15, OpenParen=16, 
		CloseParen=17, OpenBrace=18, CloseBrace=19, SemiColon=20, Colon=21, Dot=22, 
		Multiply=23, Divide=24, Pipe=25, Comment=26, Url=27, Space=28, Hash=29, 
		Import=30, Page=31, Media=32, Important=33, Percentage=34, Url_=35, MediaOnly=36, 
		Not=37, And=38, Dimension=39, Plus=40, Minus=41, Greater=42, Comma=43, 
		Tilde=44, Number=45, String_=46, Calc=47, Variable=48, Var=49, Ident=50, 
		Function_=51;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElements = 1, RULE_htmlElement = 2, RULE_htmlContent = 3, 
		RULE_htmlAttribute = 4, RULE_htmlCharData = 5, RULE_htmlMisc = 6, RULE_htmlComment = 7, 
		RULE_style = 8, RULE_stylesheet = 9, RULE_imports = 10, RULE_media = 11, 
		RULE_mediaQueryList = 12, RULE_mediaQuery = 13, RULE_mediaExpression = 14, 
		RULE_selectorGroup = 15, RULE_selector = 16, RULE_combinator = 17, RULE_simpleSelectorSequence = 18, 
		RULE_typeSelector = 19, RULE_typeNamespacePrefix = 20, RULE_universal = 21, 
		RULE_className = 22, RULE_pseudo = 23, RULE_functionalPseudo = 24, RULE_expression = 25, 
		RULE_operator_ = 26, RULE_property_ = 27, RULE_ruleset = 28, RULE_declarationList = 29, 
		RULE_declaration = 30, RULE_expr = 31, RULE_term = 32, RULE_number = 33, 
		RULE_percentage = 34, RULE_dimension = 35, RULE_nestedStatement = 36, 
		RULE_groupRuleBody = 37, RULE_url = 38, RULE_calcSum = 39, RULE_calcProduct = 40, 
		RULE_calcValue = 41, RULE_ident = 42, RULE_ws = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "htmlElements", "htmlElement", "htmlContent", "htmlAttribute", 
			"htmlCharData", "htmlMisc", "htmlComment", "style", "stylesheet", "imports", 
			"media", "mediaQueryList", "mediaQuery", "mediaExpression", "selectorGroup", 
			"selector", "combinator", "simpleSelectorSequence", "typeSelector", "typeNamespacePrefix", 
			"universal", "className", "pseudo", "functionalPseudo", "expression", 
			"operator_", "property_", "ruleset", "declarationList", "declaration", 
			"expr", "term", "number", "percentage", "dimension", "nestedStatement", 
			"groupRuleBody", "url", "calcSum", "calcProduct", "calcValue", "ident", 
			"ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<'", null, null, "'/>'", null, "'='", 
			null, null, null, null, "'</style>'", "'('", "')'", "'{'", "'}'", "';'", 
			"':'", "'.'", "'*'", null, "'|'", null, null, null, null, null, null, 
			null, null, null, "'url('", null, null, null, null, "'+'", "'-'", null, 
			"','", "'~'", null, null, "'calc('", null, "'var('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "DTD", "SEA_WS", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", 
			"TAG_WHITESPACE", "ATTVALUE_VALUE", "ATTRIBUTE", "STYLE_CLOSE", "OpenParen", 
			"CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Colon", "Dot", 
			"Multiply", "Divide", "Pipe", "Comment", "Url", "Space", "Hash", "Import", 
			"Page", "Media", "Important", "Percentage", "Url_", "MediaOnly", "Not", 
			"And", "Dimension", "Plus", "Minus", "Greater", "Comma", "Tilde", "Number", 
			"String_", "Calc", "Variable", "Var", "Ident", "Function_"
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
		public HtmlDocumentRuleContext(HtmlDocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterHtmlDocumentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitHtmlDocumentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitHtmlDocumentRule(this);
			else return visitor.visitChildren(this);
		}
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
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					match(SEA_WS);
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(94);
				match(DTD);
				}
			}

			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					match(SEA_WS);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58L) != 0)) {
				{
				{
				setState(103);
				htmlElements();
				}
				}
				setState(108);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterHtmlElementsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitHtmlElementsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitHtmlElementsRule(this);
			else return visitor.visitChildren(this);
		}
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
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_COMMENT || _la==SEA_WS) {
				{
				{
				setState(109);
				htmlMisc();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			htmlElement();
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					htmlMisc();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterHtmlOpeningClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitHtmlOpeningClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitHtmlOpeningClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends HtmlElementContext {
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public StyleElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new HtmlOpeningClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(TAG_OPEN);
				setState(123);
				match(TAG_NAME);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(124);
					htmlAttribute();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(130);
					match(TAG_CLOSE);
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(131);
						htmlContent();
						setState(132);
						match(TAG_OPEN);
						setState(133);
						match(TAG_SLASH);
						setState(134);
						match(TAG_NAME);
						setState(135);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(139);
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
				setState(142);
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
		public HtmlContentRuleContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterHtmlContentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitHtmlContentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitHtmlContentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			_localctx = new HtmlContentRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(145);
				htmlCharData();
				}
			}

			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(148);
						htmlElement();
						}
						break;
					case HTML_COMMENT:
						{
						setState(149);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(152);
						htmlCharData();
						}
					}

					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterHtmlAttributeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitHtmlAttributeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitHtmlAttributeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlAttribute);
		int _la;
		try {
			_localctx = new HtmlAttributeRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(TAG_NAME);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(161);
				match(TAG_EQUALS);
				setState(162);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterHtmlWhitespaceData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitHtmlWhitespaceData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitHtmlWhitespaceData(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextDataContext extends HtmlCharDataContext {
		public TerminalNode HTML_TEXT() { return getToken(HtmlCssJinja2Parser.HTML_TEXT, 0); }
		public HtmlTextDataContext(HtmlCharDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterHtmlTextData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitHtmlTextData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitHtmlTextData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCharDataContext htmlCharData() throws RecognitionException {
		HtmlCharDataContext _localctx = new HtmlCharDataContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlCharData);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				_localctx = new HtmlTextDataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(HTML_TEXT);
				}
				break;
			case SEA_WS:
				_localctx = new HtmlWhitespaceDataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterHtmlMiscComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitHtmlMiscComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitHtmlMiscComment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlMiscWhitespaceContext extends HtmlMiscContext {
		public TerminalNode SEA_WS() { return getToken(HtmlCssJinja2Parser.SEA_WS, 0); }
		public HtmlMiscWhitespaceContext(HtmlMiscContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterHtmlMiscWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitHtmlMiscWhitespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitHtmlMiscWhitespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlMisc);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				_localctx = new HtmlMiscCommentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				htmlComment();
				}
				break;
			case SEA_WS:
				_localctx = new HtmlMiscWhitespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterHtmlCommentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitHtmlCommentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitHtmlCommentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlComment);
		try {
			_localctx = new HtmlCommentRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterStyleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitStyleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitStyleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_style);
		try {
			_localctx = new StyleBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(STYLE_OPEN);
			setState(176);
			stylesheet();
			setState(177);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stylesheet);
		int _la;
		try {
			_localctx = new CssStylesheetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			ws();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(180);
				imports();
				setState(181);
				ws();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1126385823252480L) != 0)) {
				{
				{
				setState(188);
				nestedStatement();
				setState(189);
				ws();
				}
				}
				setState(195);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssImportWithMediaQueryAndSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssImportWithMediaQueryAndSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssImportWithMediaQueryAndSemicolon(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssImportWithMediaQueryNoSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssImportWithMediaQueryNoSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssImportWithMediaQueryNoSemicolon(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssImportWithSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssImportWithSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssImportWithSemicolon(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssImportWithoutSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssImportWithoutSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssImportWithoutSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imports);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new CssImportWithMediaQueryAndSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(Import);
				setState(197);
				ws();
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(198);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(199);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202);
				ws();
				setState(203);
				mediaQueryList();
				setState(204);
				match(SemiColon);
				setState(205);
				ws();
				}
				break;
			case 2:
				_localctx = new CssImportWithSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(Import);
				setState(208);
				ws();
				setState(211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(209);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(210);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(213);
				ws();
				setState(214);
				match(SemiColon);
				setState(215);
				ws();
				}
				break;
			case 3:
				_localctx = new CssImportWithMediaQueryNoSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(Import);
				setState(218);
				ws();
				setState(221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(219);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(220);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(223);
				ws();
				setState(224);
				mediaQueryList();
				}
				break;
			case 4:
				_localctx = new CssImportWithoutSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(Import);
				setState(227);
				ws();
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(228);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(229);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssMediaQueriesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssMediaQueriesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssMediaQueriesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_media);
		try {
			_localctx = new CssMediaQueriesDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(Media);
			setState(237);
			ws();
			setState(238);
			mediaQueryList();
			setState(239);
			groupRuleBody();
			setState(240);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssMediaQueriesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssMediaQueriesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssMediaQueriesList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mediaQueryList);
		int _la;
		try {
			_localctx = new CssMediaQueriesListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(242);
				mediaQuery();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(243);
					match(Comma);
					setState(244);
					ws();
					setState(245);
					mediaQuery();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(254);
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssMediaQueryTypeAndExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssMediaQueryTypeAndExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssMediaQueryTypeAndExpressions(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssMediaQueryExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssMediaQueryExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssMediaQueryExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mediaQuery);
		int _la;
		try {
			int _alt;
			setState(281);
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
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(256);
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
				setState(259);
				ws();
				setState(260);
				ident();
				setState(261);
				ws();
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(262);
						match(And);
						setState(263);
						ws();
						setState(264);
						mediaExpression();
						}
						} 
					}
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case OpenParen:
				_localctx = new CssMediaQueryExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				mediaExpression();
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(272);
						match(And);
						setState(273);
						ws();
						setState(274);
						mediaExpression();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(HtmlCssJinja2Parser.CloseParen, 0); }
		public TerminalNode Colon() { return getToken(HtmlCssJinja2Parser.Colon, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CssMediaExpressionsContext(MediaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssMediaExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssMediaExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssMediaExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaExpressionContext mediaExpression() throws RecognitionException {
		MediaExpressionContext _localctx = new MediaExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mediaExpression);
		int _la;
		try {
			_localctx = new CssMediaExpressionsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(OpenParen);
			setState(284);
			ws();
			setState(285);
			ident();
			setState(286);
			ws();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(287);
				match(Colon);
				setState(288);
				ws();
				setState(289);
				expr();
				}
			}

			setState(293);
			match(CloseParen);
			setState(294);
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
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			selector();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(297);
				match(Comma);
				setState(298);
				ws();
				setState(299);
				selector();
				}
				}
				setState(305);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selector);
		int _la;
		try {
			_localctx = new CssSelectorGroupContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			simpleSelectorSequence();
			setState(307);
			ws();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23090012618752L) != 0)) {
				{
				{
				setState(308);
				combinator();
				setState(309);
				simpleSelectorSequence();
				setState(310);
				ws();
				}
				}
				setState(316);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssDescendantCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssDescendantCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssDescendantCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssChildCombinatorContext extends CombinatorContext {
		public TerminalNode Greater() { return getToken(HtmlCssJinja2Parser.Greater, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssChildCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssChildCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssChildCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssChildCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssGeneralSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode Tilde() { return getToken(HtmlCssJinja2Parser.Tilde, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssGeneralSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssGeneralSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssGeneralSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssGeneralSiblingCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAdjacentSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode Plus() { return getToken(HtmlCssJinja2Parser.Plus, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssAdjacentSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssAdjacentSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssAdjacentSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssAdjacentSiblingCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_combinator);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				_localctx = new CssAdjacentSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(Plus);
				setState(318);
				ws();
				}
				break;
			case Greater:
				_localctx = new CssChildCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(Greater);
				setState(320);
				ws();
				}
				break;
			case Tilde:
				_localctx = new CssGeneralSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(Tilde);
				setState(322);
				ws();
				}
				break;
			case Space:
				_localctx = new CssDescendantCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(Space);
				setState(324);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssCompoundSelectorWithoutType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssCompoundSelectorWithoutType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssCompoundSelectorWithoutType(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssCompoundSelectorWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssCompoundSelectorWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssCompoundSelectorWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorSequenceContext simpleSelectorSequence() throws RecognitionException {
		SimpleSelectorSequenceContext _localctx = new SimpleSelectorSequenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(346);
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
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(327);
					typeSelector();
					}
					break;
				case 2:
					{
					setState(328);
					universal();
					}
					break;
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 543162368L) != 0)) {
					{
					setState(334);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(331);
						match(Hash);
						}
						break;
					case Dot:
						{
						setState(332);
						className();
						}
						break;
					case Colon:
						{
						setState(333);
						pseudo();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(338);
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
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(342);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(339);
						match(Hash);
						}
						break;
					case Dot:
						{
						setState(340);
						className();
						}
						break;
					case Colon:
						{
						setState(341);
						pseudo();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(344); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 543162368L) != 0) );
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public CssElementTypeSelectorContext(TypeSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssElementTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssElementTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssElementTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeSelector);
		try {
			_localctx = new CssElementTypeSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(348);
				typeNamespacePrefix();
				}
				break;
			}
			setState(351);
			ident();
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode Multiply() { return getToken(HtmlCssJinja2Parser.Multiply, 0); }
		public CssNamespacePrefixContext(TypeNamespacePrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamespacePrefixContext typeNamespacePrefix() throws RecognitionException {
		TypeNamespacePrefixContext _localctx = new TypeNamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeNamespacePrefix);
		try {
			_localctx = new CssNamespacePrefixContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Ident:
				{
				setState(353);
				ident();
				}
				break;
			case Multiply:
				{
				setState(354);
				match(Multiply);
				}
				break;
			case Pipe:
				break;
			default:
				break;
			}
			setState(357);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssUniversalSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssUniversalSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssUniversalSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_universal);
		try {
			_localctx = new CssUniversalSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(359);
				typeNamespacePrefix();
				}
				break;
			}
			setState(362);
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public CssClassSelectorContext(ClassNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_className);
		try {
			_localctx = new CssClassSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(Dot);
			setState(365);
			ident();
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FunctionalPseudoContext functionalPseudo() {
			return getRuleContext(FunctionalPseudoContext.class,0);
		}
		public CssPseudoClassOrElementContext(PseudoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssPseudoClassOrElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssPseudoClassOrElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssPseudoClassOrElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pseudo);
		int _la;
		try {
			_localctx = new CssPseudoClassOrElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(Colon);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(368);
				match(Colon);
				}
			}

			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Ident:
				{
				setState(371);
				ident();
				}
				break;
			case Function_:
				{
				setState(372);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssFunctionalPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssFunctionalPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssFunctionalPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalPseudoContext functionalPseudo() throws RecognitionException {
		FunctionalPseudoContext _localctx = new FunctionalPseudoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionalPseudo);
		try {
			_localctx = new CssFunctionalPseudoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(Function_);
			setState(376);
			ws();
			setState(377);
			expression();
			setState(378);
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
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public CssValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		int _la;
		try {
			_localctx = new CssValueExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(386);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
					{
					setState(380);
					match(Plus);
					}
					break;
				case Minus:
					{
					setState(381);
					match(Minus);
					}
					break;
				case Dimension:
					{
					setState(382);
					match(Dimension);
					}
					break;
				case Number:
					{
					setState(383);
					match(Number);
					}
					break;
				case String_:
					{
					setState(384);
					match(String_);
					}
					break;
				case MediaOnly:
				case Not:
				case And:
				case Ident:
					{
					setState(385);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(388);
				ws();
				}
				}
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1235782350143488L) != 0) );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssDivideOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssDivideOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssDivideOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCommaSeparatorContext extends Operator_Context {
		public TerminalNode Comma() { return getToken(HtmlCssJinja2Parser.Comma, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssCommaSeparatorContext(Operator_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssCommaSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssCommaSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssCommaSeparator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSpaceSeparatorContext extends Operator_Context {
		public TerminalNode Space() { return getToken(HtmlCssJinja2Parser.Space, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssSpaceSeparatorContext(Operator_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssSpaceSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssSpaceSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssSpaceSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_Context operator_() throws RecognitionException {
		Operator_Context _localctx = new Operator_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_operator_);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Divide:
				_localctx = new CssDivideOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(Divide);
				setState(394);
				ws();
				}
				break;
			case Comma:
				_localctx = new CssCommaSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(Comma);
				setState(396);
				ws();
				}
				break;
			case Space:
				_localctx = new CssSpaceSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(Space);
				setState(398);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssVarProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssVarProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssVarProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdPropertyContext extends Property_Context {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssIdPropertyContext(Property_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssIdProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssIdProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssIdProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_Context property_() throws RecognitionException {
		Property_Context _localctx = new Property_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_property_);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Ident:
				_localctx = new CssIdPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				ident();
				setState(402);
				ws();
				}
				break;
			case Variable:
				_localctx = new CssVarPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(Variable);
				setState(405);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssRulesetDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssRulesetDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssRulesetDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ruleset);
		int _la;
		try {
			_localctx = new CssRulesetDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			selectorGroup();
			setState(409);
			match(OpenBrace);
			setState(410);
			ws();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1407855920939008L) != 0)) {
				{
				setState(411);
				declarationList();
				}
			}

			setState(414);
			match(CloseBrace);
			setState(415);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declarationList);
		int _la;
		try {
			_localctx = new CssDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(417);
				match(SemiColon);
				setState(418);
				ws();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			declaration();
			setState(425);
			ws();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(426);
				match(SemiColon);
				setState(427);
				ws();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1407855919890432L) != 0)) {
					{
					setState(428);
					declaration();
					}
				}

				}
				}
				setState(435);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_declaration);
		int _la;
		try {
			_localctx = new CssDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			property_();
			setState(437);
			match(Colon);
			setState(438);
			ws();
			setState(439);
			expr();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Important) {
				{
				setState(440);
				match(Important);
				setState(441);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr);
		int _la;
		try {
			int _alt;
			_localctx = new CssExpressionSequenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			term();
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796378234880L) != 0)) {
						{
						setState(445);
						operator_();
						}
					}

					setState(448);
					term();
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssStringTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssStringTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssStringTerm(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssPercentageTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssPercentageTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssPercentageTerm(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssCalcTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssCalcTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssCalcTerm(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssVariableTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssVariableTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssVariableTerm(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssFunctionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssFunctionTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssFunctionTerm(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssUrlTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssUrlTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssUrlTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssHexColorTermContext extends TermContext {
		public TerminalNode Hash() { return getToken(HtmlCssJinja2Parser.Hash, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssHexColorTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssHexColorTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssHexColorTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssHexColorTerm(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssNumberTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssNumberTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdTermContext extends TermContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public CssIdTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssIdTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssIdTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssIdTerm(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssDimensionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssDimensionTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssDimensionTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_term);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new CssNumberTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				number();
				setState(455);
				ws();
				}
				break;
			case 2:
				_localctx = new CssPercentageTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				percentage();
				setState(458);
				ws();
				}
				break;
			case 3:
				_localctx = new CssDimensionTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				dimension();
				setState(461);
				ws();
				}
				break;
			case 4:
				_localctx = new CssStringTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				match(String_);
				setState(464);
				ws();
				}
				break;
			case 5:
				_localctx = new CssIdTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(465);
				ident();
				setState(466);
				ws();
				}
				break;
			case 6:
				_localctx = new CssVariableTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				match(Var);
				setState(469);
				ws();
				setState(470);
				match(Variable);
				setState(471);
				ws();
				setState(472);
				match(CloseParen);
				setState(473);
				ws();
				}
				break;
			case 7:
				_localctx = new CssUrlTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(475);
				url();
				setState(476);
				ws();
				}
				break;
			case 8:
				_localctx = new CssHexColorTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(478);
				match(Hash);
				setState(479);
				ws();
				}
				break;
			case 9:
				_localctx = new CssCalcTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(480);
				match(Calc);
				setState(481);
				ws();
				setState(482);
				calcSum();
				setState(483);
				match(CloseParen);
				setState(484);
				ws();
				}
				break;
			case 10:
				_localctx = new CssFunctionTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(486);
				match(Function_);
				setState(487);
				ws();
				setState(488);
				expr();
				setState(489);
				match(CloseParen);
				setState(490);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_number);
		int _la;
		try {
			_localctx = new CssNumberExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(494);
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

			setState(497);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssPercentageExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssPercentageExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssPercentageExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentageContext percentage() throws RecognitionException {
		PercentageContext _localctx = new PercentageContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_percentage);
		int _la;
		try {
			_localctx = new CssPercentageExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(499);
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

			setState(502);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssDimensionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssDimensionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssDimensionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dimension);
		int _la;
		try {
			_localctx = new CssDimensionExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(504);
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

			setState(507);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssRuleset(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueriesContext extends NestedStatementContext {
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public CssMediaQueriesContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssMediaQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssMediaQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssMediaQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedStatementContext nestedStatement() throws RecognitionException {
		NestedStatementContext _localctx = new NestedStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nestedStatement);
		try {
			setState(511);
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
				setState(509);
				ruleset();
				}
				break;
			case Media:
				_localctx = new CssMediaQueriesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssGroupRulebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssGroupRulebody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssGroupRulebody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupRuleBodyContext groupRuleBody() throws RecognitionException {
		GroupRuleBodyContext _localctx = new GroupRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_groupRuleBody);
		int _la;
		try {
			_localctx = new CssGroupRulebodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(OpenBrace);
			setState(514);
			ws();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1126385823252480L) != 0)) {
				{
				{
				setState(515);
				nestedStatement();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			match(CloseBrace);
			setState(522);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssQuotedUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssQuotedUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssQuotedUrl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssUnquotedUrlContext extends UrlContext {
		public TerminalNode Url() { return getToken(HtmlCssJinja2Parser.Url, 0); }
		public CssUnquotedUrlContext(UrlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssUnquotedUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssUnquotedUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssUnquotedUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_url);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Url_:
				_localctx = new CssQuotedUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(Url_);
				setState(525);
				ws();
				setState(526);
				match(String_);
				setState(527);
				ws();
				setState(528);
				match(CloseParen);
				}
				break;
			case Url:
				_localctx = new CssUnquotedUrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssCalcSumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssCalcSumExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssCalcSumExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcSumContext calcSum() throws RecognitionException {
		CalcSumContext _localctx = new CalcSumContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_calcSum);
		int _la;
		try {
			_localctx = new CssCalcSumExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			calcProduct();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(534);
				match(Space);
				setState(535);
				ws();
				setState(536);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(537);
				ws();
				setState(538);
				match(Space);
				setState(539);
				ws();
				setState(540);
				calcProduct();
				}
				}
				setState(546);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssCalcProductExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssCalcProductExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssCalcProductExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcProductContext calcProduct() throws RecognitionException {
		CalcProductContext _localctx = new CalcProductContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_calcProduct);
		int _la;
		try {
			_localctx = new CssCalcProductExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			calcValue();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Multiply || _la==Divide) {
				{
				setState(557);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
					{
					setState(548);
					match(Multiply);
					setState(549);
					ws();
					setState(550);
					calcValue();
					}
					break;
				case Divide:
					{
					setState(552);
					match(Divide);
					setState(553);
					ws();
					setState(554);
					number();
					setState(555);
					ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(561);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssDimensionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssDimensionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssDimensionValue(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssNumberValue(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssPercentageValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssPercentageValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssPercentageValue(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssNestedCalcExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssNestedCalcExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssNestedCalcExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcValueContext calcValue() throws RecognitionException {
		CalcValueContext _localctx = new CalcValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_calcValue);
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				_localctx = new CssNumberValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				number();
				setState(563);
				ws();
				}
				break;
			case 2:
				_localctx = new CssDimensionValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				dimension();
				setState(566);
				ws();
				}
				break;
			case 3:
				_localctx = new CssPercentageValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
				percentage();
				setState(569);
				ws();
				}
				break;
			case 4:
				_localctx = new CssNestedCalcExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(571);
				match(OpenParen);
				setState(572);
				ws();
				setState(573);
				calcSum();
				setState(574);
				match(CloseParen);
				setState(575);
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
	public static class IdentContext extends ParserRuleContext {
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	 
		public IdentContext() { }
		public void copyFrom(IdentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaOnlyContext extends IdentContext {
		public TerminalNode MediaOnly() { return getToken(HtmlCssJinja2Parser.MediaOnly, 0); }
		public CssMediaOnlyContext(IdentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssMediaOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssMediaOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssMediaOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdentifierContext extends IdentContext {
		public TerminalNode Ident() { return getToken(HtmlCssJinja2Parser.Ident, 0); }
		public CssIdentifierContext(IdentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAndContext extends IdentContext {
		public TerminalNode And() { return getToken(HtmlCssJinja2Parser.And, 0); }
		public CssAndContext(IdentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNotContext extends IdentContext {
		public TerminalNode Not() { return getToken(HtmlCssJinja2Parser.Not, 0); }
		public CssNotContext(IdentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ident);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				_localctx = new CssIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(Ident);
				}
				break;
			case MediaOnly:
				_localctx = new CssMediaOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(MediaOnly);
				}
				break;
			case Not:
				_localctx = new CssNotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				match(Not);
				}
				break;
			case And:
				_localctx = new CssAndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(582);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).enterCssWhiteSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlCssJinja2ParserListener ) ((HtmlCssJinja2ParserListener)listener).exitCssWhiteSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlCssJinja2ParserVisitor ) return ((HtmlCssJinja2ParserVisitor<? extends T>)visitor).visitCssWhiteSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ws);
		int _la;
		try {
			int _alt;
			_localctx = new CssWhiteSpaceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(585);
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
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static final String _serializedATN =
		"\u0004\u00013\u0250\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0005\u0000"+
		"Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0000\u0003\u0000`\b\u0000\u0001"+
		"\u0000\u0005\u0000c\b\u0000\n\u0000\f\u0000f\t\u0000\u0001\u0000\u0005"+
		"\u0000i\b\u0000\n\u0000\f\u0000l\t\u0000\u0001\u0001\u0005\u0001o\b\u0001"+
		"\n\u0001\f\u0001r\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001v\b\u0001"+
		"\n\u0001\f\u0001y\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"~\b\u0002\n\u0002\f\u0002\u0081\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008a"+
		"\b\u0002\u0001\u0002\u0003\u0002\u008d\b\u0002\u0001\u0002\u0003\u0002"+
		"\u0090\b\u0002\u0001\u0003\u0003\u0003\u0093\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0097\b\u0003\u0001\u0003\u0003\u0003\u009a\b\u0003"+
		"\u0005\u0003\u009c\b\u0003\n\u0003\f\u0003\u009f\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00a4\b\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00a8\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00ac\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00b8\b\t\n\t\f\t\u00bb\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u00c0\b\t\n\t\f\t\u00c3\t\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00c9\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00d4\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00de\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e7\b\n\u0001\n\u0001\n\u0003\n\u00eb"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f8\b\f\n\f\f"+
		"\f\u00fb\t\f\u0003\f\u00fd\b\f\u0001\f\u0001\f\u0001\r\u0003\r\u0102\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u010b"+
		"\b\r\n\r\f\r\u010e\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u0115\b\r\n\r\f\r\u0118\t\r\u0003\r\u011a\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0124\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u012e\b\u000f"+
		"\n\u000f\f\u000f\u0131\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0139\b\u0010\n\u0010\f\u0010"+
		"\u013c\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0146\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u014a\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u014f\b\u0012\n\u0012\f\u0012\u0152\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0004\u0012\u0157\b\u0012\u000b\u0012\f\u0012\u0158"+
		"\u0003\u0012\u015b\b\u0012\u0001\u0013\u0003\u0013\u015e\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0164\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u0169\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0172\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0176\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0183\b\u0019\u0001\u0019\u0004\u0019\u0186\b\u0019\u000b\u0019\f\u0019"+
		"\u0187\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0190\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0197\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u019d\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u01a4\b\u001d\n\u001d\f\u001d"+
		"\u01a7\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01ae\b\u001d\u0005\u001d\u01b0\b\u001d\n\u001d\f\u001d\u01b3"+
		"\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01bb\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u01bf"+
		"\b\u001f\u0001\u001f\u0005\u001f\u01c2\b\u001f\n\u001f\f\u001f\u01c5\t"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u01ed\b \u0001!\u0003!\u01f0\b!\u0001!\u0001!\u0001\"\u0003\"\u01f5"+
		"\b\"\u0001\"\u0001\"\u0001#\u0003#\u01fa\b#\u0001#\u0001#\u0001$\u0001"+
		"$\u0003$\u0200\b$\u0001%\u0001%\u0001%\u0005%\u0205\b%\n%\f%\u0208\t%"+
		"\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u0214\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u021f\b\'\n\'\f\'\u0222\t\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u022e\b(\n("+
		"\f(\u0231\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0242\b)\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u0248\b*\u0001+\u0005+\u024b\b+\n+\f+\u024e\t+"+
		"\u0001+\u0000\u0000,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0003"+
		"\u0001\u0000$%\u0001\u0000()\u0002\u0000\u001a\u001a\u001c\u001c\u0280"+
		"\u0000[\u0001\u0000\u0000\u0000\u0002p\u0001\u0000\u0000\u0000\u0004\u008f"+
		"\u0001\u0000\u0000\u0000\u0006\u0092\u0001\u0000\u0000\u0000\b\u00a0\u0001"+
		"\u0000\u0000\u0000\n\u00a7\u0001\u0000\u0000\u0000\f\u00ab\u0001\u0000"+
		"\u0000\u0000\u000e\u00ad\u0001\u0000\u0000\u0000\u0010\u00af\u0001\u0000"+
		"\u0000\u0000\u0012\u00b3\u0001\u0000\u0000\u0000\u0014\u00ea\u0001\u0000"+
		"\u0000\u0000\u0016\u00ec\u0001\u0000\u0000\u0000\u0018\u00fc\u0001\u0000"+
		"\u0000\u0000\u001a\u0119\u0001\u0000\u0000\u0000\u001c\u011b\u0001\u0000"+
		"\u0000\u0000\u001e\u0128\u0001\u0000\u0000\u0000 \u0132\u0001\u0000\u0000"+
		"\u0000\"\u0145\u0001\u0000\u0000\u0000$\u015a\u0001\u0000\u0000\u0000"+
		"&\u015d\u0001\u0000\u0000\u0000(\u0163\u0001\u0000\u0000\u0000*\u0168"+
		"\u0001\u0000\u0000\u0000,\u016c\u0001\u0000\u0000\u0000.\u016f\u0001\u0000"+
		"\u0000\u00000\u0177\u0001\u0000\u0000\u00002\u0185\u0001\u0000\u0000\u0000"+
		"4\u018f\u0001\u0000\u0000\u00006\u0196\u0001\u0000\u0000\u00008\u0198"+
		"\u0001\u0000\u0000\u0000:\u01a5\u0001\u0000\u0000\u0000<\u01b4\u0001\u0000"+
		"\u0000\u0000>\u01bc\u0001\u0000\u0000\u0000@\u01ec\u0001\u0000\u0000\u0000"+
		"B\u01ef\u0001\u0000\u0000\u0000D\u01f4\u0001\u0000\u0000\u0000F\u01f9"+
		"\u0001\u0000\u0000\u0000H\u01ff\u0001\u0000\u0000\u0000J\u0201\u0001\u0000"+
		"\u0000\u0000L\u0213\u0001\u0000\u0000\u0000N\u0215\u0001\u0000\u0000\u0000"+
		"P\u0223\u0001\u0000\u0000\u0000R\u0241\u0001\u0000\u0000\u0000T\u0247"+
		"\u0001\u0000\u0000\u0000V\u024c\u0001\u0000\u0000\u0000XZ\u0005\u0003"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^`\u0005\u0002\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`d\u0001\u0000\u0000\u0000ac\u0005\u0003"+
		"\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ej\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000gi\u0003\u0002\u0001\u0000hg\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000k\u0001\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"mo\u0003\f\u0006\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000sw\u0003\u0004\u0002\u0000tv\u0003\f\u0006"+
		"\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0003\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z{\u0005\u0005\u0000\u0000{\u007f\u0005\u000b"+
		"\u0000\u0000|~\u0003\b\u0004\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u008c\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0089\u0005\u0007\u0000\u0000\u0083\u0084\u0003\u0006"+
		"\u0003\u0000\u0084\u0085\u0005\u0005\u0000\u0000\u0085\u0086\u0005\t\u0000"+
		"\u0000\u0086\u0087\u0005\u000b\u0000\u0000\u0087\u0088\u0005\u0007\u0000"+
		"\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0005\b\u0000\u0000\u008c\u0082\u0001\u0000\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000"+
		"\u008e\u0090\u0003\u0010\b\u0000\u008fz\u0001\u0000\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0005\u0001\u0000\u0000\u0000\u0091"+
		"\u0093\u0003\n\u0005\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u009d\u0001\u0000\u0000\u0000\u0094\u0097"+
		"\u0003\u0004\u0002\u0000\u0095\u0097\u0003\u000e\u0007\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0001\u0000\u0000\u0000\u0098\u009a\u0003\n\u0005\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001"+
		"\u0000\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009c\u009f\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u0007\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a3\u0005\u000b\u0000\u0000\u00a1\u00a2\u0005"+
		"\n\u0000\u0000\u00a2\u00a4\u0005\r\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\t\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a8\u0005\u0006\u0000\u0000\u00a6\u00a8\u0005\u0003\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u000b\u0001\u0000\u0000\u0000\u00a9\u00ac\u0003\u000e\u0007"+
		"\u0000\u00aa\u00ac\u0005\u0003\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\r\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0001\u0000\u0000\u00ae\u000f\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\u0004\u0000\u0000\u00b0\u00b1\u0003\u0012\t\u0000\u00b1"+
		"\u00b2\u0005\u000f\u0000\u0000\u00b2\u0011\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b9\u0003V+\u0000\u00b4\u00b5\u0003\u0014\n\u0000\u00b5\u00b6\u0003"+
		"V+\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003H$\u0000\u00bd"+
		"\u00be\u0003V+\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u0013\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"\u001e\u0000\u0000\u00c5\u00c8\u0003V+\u0000\u00c6\u00c9\u0005.\u0000"+
		"\u0000\u00c7\u00c9\u0003L&\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0003V+\u0000\u00cb\u00cc\u0003\u0018\f\u0000\u00cc\u00cd\u0005"+
		"\u0014\u0000\u0000\u00cd\u00ce\u0003V+\u0000\u00ce\u00eb\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005\u001e\u0000\u0000\u00d0\u00d3\u0003V+\u0000\u00d1"+
		"\u00d4\u0005.\u0000\u0000\u00d2\u00d4\u0003L&\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0003V+\u0000\u00d6\u00d7\u0005\u0014\u0000"+
		"\u0000\u00d7\u00d8\u0003V+\u0000\u00d8\u00eb\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005\u001e\u0000\u0000\u00da\u00dd\u0003V+\u0000\u00db\u00de\u0005"+
		".\u0000\u0000\u00dc\u00de\u0003L&\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0003V+\u0000\u00e0\u00e1\u0003\u0018\f\u0000\u00e1"+
		"\u00eb\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u001e\u0000\u0000\u00e3"+
		"\u00e6\u0003V+\u0000\u00e4\u00e7\u0005.\u0000\u0000\u00e5\u00e7\u0003"+
		"L&\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003V+\u0000\u00e9"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ea\u00c4\u0001\u0000\u0000\u0000\u00ea"+
		"\u00cf\u0001\u0000\u0000\u0000\u00ea\u00d9\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e2\u0001\u0000\u0000\u0000\u00eb\u0015\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0005 \u0000\u0000\u00ed\u00ee\u0003V+\u0000\u00ee\u00ef\u0003"+
		"\u0018\f\u0000\u00ef\u00f0\u0003J%\u0000\u00f0\u00f1\u0003V+\u0000\u00f1"+
		"\u0017\u0001\u0000\u0000\u0000\u00f2\u00f9\u0003\u001a\r\u0000\u00f3\u00f4"+
		"\u0005+\u0000\u0000\u00f4\u00f5\u0003V+\u0000\u00f5\u00f6\u0003\u001a"+
		"\r\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00f2\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0003V+\u0000\u00ff\u0019\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u0007\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0003V+\u0000\u0104\u0105\u0003T*\u0000\u0105\u010c\u0003V+\u0000"+
		"\u0106\u0107\u0005&\u0000\u0000\u0107\u0108\u0003V+\u0000\u0108\u0109"+
		"\u0003\u001c\u000e\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0106"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u011a"+
		"\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0116"+
		"\u0003\u001c\u000e\u0000\u0110\u0111\u0005&\u0000\u0000\u0111\u0112\u0003"+
		"V+\u0000\u0112\u0113\u0003\u001c\u000e\u0000\u0113\u0115\u0001\u0000\u0000"+
		"\u0000\u0114\u0110\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0119\u0101\u0001\u0000\u0000\u0000\u0119\u010f\u0001\u0000\u0000"+
		"\u0000\u011a\u001b\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0010\u0000"+
		"\u0000\u011c\u011d\u0003V+\u0000\u011d\u011e\u0003T*\u0000\u011e\u0123"+
		"\u0003V+\u0000\u011f\u0120\u0005\u0015\u0000\u0000\u0120\u0121\u0003V"+
		"+\u0000\u0121\u0122\u0003>\u001f\u0000\u0122\u0124\u0001\u0000\u0000\u0000"+
		"\u0123\u011f\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0011\u0000\u0000"+
		"\u0126\u0127\u0003V+\u0000\u0127\u001d\u0001\u0000\u0000\u0000\u0128\u012f"+
		"\u0003 \u0010\u0000\u0129\u012a\u0005+\u0000\u0000\u012a\u012b\u0003V"+
		"+\u0000\u012b\u012c\u0003 \u0010\u0000\u012c\u012e\u0001\u0000\u0000\u0000"+
		"\u012d\u0129\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000"+
		"\u0130\u001f\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0003$\u0012\u0000\u0133\u013a\u0003V+\u0000\u0134\u0135"+
		"\u0003\"\u0011\u0000\u0135\u0136\u0003$\u0012\u0000\u0136\u0137\u0003"+
		"V+\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0134\u0001\u0000\u0000"+
		"\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b!\u0001\u0000\u0000\u0000"+
		"\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013e\u0005(\u0000\u0000\u013e"+
		"\u0146\u0003V+\u0000\u013f\u0140\u0005*\u0000\u0000\u0140\u0146\u0003"+
		"V+\u0000\u0141\u0142\u0005,\u0000\u0000\u0142\u0146\u0003V+\u0000\u0143"+
		"\u0144\u0005\u001c\u0000\u0000\u0144\u0146\u0003V+\u0000\u0145\u013d\u0001"+
		"\u0000\u0000\u0000\u0145\u013f\u0001\u0000\u0000\u0000\u0145\u0141\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146#\u0001\u0000"+
		"\u0000\u0000\u0147\u014a\u0003&\u0013\u0000\u0148\u014a\u0003*\u0015\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000"+
		"\u014a\u0150\u0001\u0000\u0000\u0000\u014b\u014f\u0005\u001d\u0000\u0000"+
		"\u014c\u014f\u0003,\u0016\u0000\u014d\u014f\u0003.\u0017\u0000\u014e\u014b"+
		"\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014d"+
		"\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u015b"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0157"+
		"\u0005\u001d\u0000\u0000\u0154\u0157\u0003,\u0016\u0000\u0155\u0157\u0003"+
		".\u0017\u0000\u0156\u0153\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000"+
		"\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000"+
		"\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0149\u0001\u0000"+
		"\u0000\u0000\u015a\u0156\u0001\u0000\u0000\u0000\u015b%\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\u0003(\u0014\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0003T*\u0000\u0160\'\u0001\u0000\u0000\u0000\u0161\u0164"+
		"\u0003T*\u0000\u0162\u0164\u0005\u0017\u0000\u0000\u0163\u0161\u0001\u0000"+
		"\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0019"+
		"\u0000\u0000\u0166)\u0001\u0000\u0000\u0000\u0167\u0169\u0003(\u0014\u0000"+
		"\u0168\u0167\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u0017\u0000\u0000"+
		"\u016b+\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u0016\u0000\u0000\u016d"+
		"\u016e\u0003T*\u0000\u016e-\u0001\u0000\u0000\u0000\u016f\u0171\u0005"+
		"\u0015\u0000\u0000\u0170\u0172\u0005\u0015\u0000\u0000\u0171\u0170\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0175\u0001"+
		"\u0000\u0000\u0000\u0173\u0176\u0003T*\u0000\u0174\u0176\u00030\u0018"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000"+
		"\u0000\u0176/\u0001\u0000\u0000\u0000\u0177\u0178\u00053\u0000\u0000\u0178"+
		"\u0179\u0003V+\u0000\u0179\u017a\u00032\u0019\u0000\u017a\u017b\u0005"+
		"\u0011\u0000\u0000\u017b1\u0001\u0000\u0000\u0000\u017c\u0183\u0005(\u0000"+
		"\u0000\u017d\u0183\u0005)\u0000\u0000\u017e\u0183\u0005\'\u0000\u0000"+
		"\u017f\u0183\u0005-\u0000\u0000\u0180\u0183\u0005.\u0000\u0000\u0181\u0183"+
		"\u0003T*\u0000\u0182\u017c\u0001\u0000\u0000\u0000\u0182\u017d\u0001\u0000"+
		"\u0000\u0000\u0182\u017e\u0001\u0000\u0000\u0000\u0182\u017f\u0001\u0000"+
		"\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0181\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0186\u0003V+\u0000"+
		"\u0185\u0182\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000"+
		"\u01883\u0001\u0000\u0000\u0000\u0189\u018a\u0005\u0018\u0000\u0000\u018a"+
		"\u0190\u0003V+\u0000\u018b\u018c\u0005+\u0000\u0000\u018c\u0190\u0003"+
		"V+\u0000\u018d\u018e\u0005\u001c\u0000\u0000\u018e\u0190\u0003V+\u0000"+
		"\u018f\u0189\u0001\u0000\u0000\u0000\u018f\u018b\u0001\u0000\u0000\u0000"+
		"\u018f\u018d\u0001\u0000\u0000\u0000\u01905\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0003T*\u0000\u0192\u0193\u0003V+\u0000\u0193\u0197\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u00050\u0000\u0000\u0195\u0197\u0003V+\u0000"+
		"\u0196\u0191\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000"+
		"\u01977\u0001\u0000\u0000\u0000\u0198\u0199\u0003\u001e\u000f\u0000\u0199"+
		"\u019a\u0005\u0012\u0000\u0000\u019a\u019c\u0003V+\u0000\u019b\u019d\u0003"+
		":\u001d\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u0013"+
		"\u0000\u0000\u019f\u01a0\u0003V+\u0000\u01a09\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0005\u0014\u0000\u0000\u01a2\u01a4\u0003V+\u0000\u01a3\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0003<\u001e\u0000\u01a9\u01b1\u0003V+\u0000\u01aa\u01ab\u0005\u0014"+
		"\u0000\u0000\u01ab\u01ad\u0003V+\u0000\u01ac\u01ae\u0003<\u001e\u0000"+
		"\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000"+
		"\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01aa\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2;\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b5\u00036\u001b\u0000\u01b5\u01b6"+
		"\u0005\u0015\u0000\u0000\u01b6\u01b7\u0003V+\u0000\u01b7\u01ba\u0003>"+
		"\u001f\u0000\u01b8\u01b9\u0005!\u0000\u0000\u01b9\u01bb\u0003V+\u0000"+
		"\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bb=\u0001\u0000\u0000\u0000\u01bc\u01c3\u0003@ \u0000\u01bd\u01bf"+
		"\u00034\u001a\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c2\u0003"+
		"@ \u0000\u01c1\u01be\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c4?\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0003B!\u0000\u01c7\u01c8\u0003V+\u0000\u01c8\u01ed\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0003D\"\u0000\u01ca\u01cb\u0003V+\u0000"+
		"\u01cb\u01ed\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003F#\u0000\u01cd\u01ce"+
		"\u0003V+\u0000\u01ce\u01ed\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005."+
		"\u0000\u0000\u01d0\u01ed\u0003V+\u0000\u01d1\u01d2\u0003T*\u0000\u01d2"+
		"\u01d3\u0003V+\u0000\u01d3\u01ed\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005"+
		"1\u0000\u0000\u01d5\u01d6\u0003V+\u0000\u01d6\u01d7\u00050\u0000\u0000"+
		"\u01d7\u01d8\u0003V+\u0000\u01d8\u01d9\u0005\u0011\u0000\u0000\u01d9\u01da"+
		"\u0003V+\u0000\u01da\u01ed\u0001\u0000\u0000\u0000\u01db\u01dc\u0003L"+
		"&\u0000\u01dc\u01dd\u0003V+\u0000\u01dd\u01ed\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\u0005\u001d\u0000\u0000\u01df\u01ed\u0003V+\u0000\u01e0\u01e1"+
		"\u0005/\u0000\u0000\u01e1\u01e2\u0003V+\u0000\u01e2\u01e3\u0003N\'\u0000"+
		"\u01e3\u01e4\u0005\u0011\u0000\u0000\u01e4\u01e5\u0003V+\u0000\u01e5\u01ed"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u00053\u0000\u0000\u01e7\u01e8\u0003"+
		"V+\u0000\u01e8\u01e9\u0003>\u001f\u0000\u01e9\u01ea\u0005\u0011\u0000"+
		"\u0000\u01ea\u01eb\u0003V+\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec"+
		"\u01c6\u0001\u0000\u0000\u0000\u01ec\u01c9\u0001\u0000\u0000\u0000\u01ec"+
		"\u01cc\u0001\u0000\u0000\u0000\u01ec\u01cf\u0001\u0000\u0000\u0000\u01ec"+
		"\u01d1\u0001\u0000\u0000\u0000\u01ec\u01d4\u0001\u0000\u0000\u0000\u01ec"+
		"\u01db\u0001\u0000\u0000\u0000\u01ec\u01de\u0001\u0000\u0000\u0000\u01ec"+
		"\u01e0\u0001\u0000\u0000\u0000\u01ec\u01e6\u0001\u0000\u0000\u0000\u01ed"+
		"A\u0001\u0000\u0000\u0000\u01ee\u01f0\u0007\u0001\u0000\u0000\u01ef\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005-\u0000\u0000\u01f2C\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f5\u0007\u0001\u0000\u0000\u01f4\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0005\"\u0000\u0000\u01f7E\u0001\u0000\u0000"+
		"\u0000\u01f8\u01fa\u0007\u0001\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0005\'\u0000\u0000\u01fcG\u0001\u0000\u0000\u0000"+
		"\u01fd\u0200\u00038\u001c\u0000\u01fe\u0200\u0003\u0016\u000b\u0000\u01ff"+
		"\u01fd\u0001\u0000\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200"+
		"I\u0001\u0000\u0000\u0000\u0201\u0202\u0005\u0012\u0000\u0000\u0202\u0206"+
		"\u0003V+\u0000\u0203\u0205\u0003H$\u0000\u0204\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000"+
		"\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0209\u0001\u0000\u0000"+
		"\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020a\u0005\u0013\u0000"+
		"\u0000\u020a\u020b\u0003V+\u0000\u020bK\u0001\u0000\u0000\u0000\u020c"+
		"\u020d\u0005#\u0000\u0000\u020d\u020e\u0003V+\u0000\u020e\u020f\u0005"+
		".\u0000\u0000\u020f\u0210\u0003V+\u0000\u0210\u0211\u0005\u0011\u0000"+
		"\u0000\u0211\u0214\u0001\u0000\u0000\u0000\u0212\u0214\u0005\u001b\u0000"+
		"\u0000\u0213\u020c\u0001\u0000\u0000\u0000\u0213\u0212\u0001\u0000\u0000"+
		"\u0000\u0214M\u0001\u0000\u0000\u0000\u0215\u0220\u0003P(\u0000\u0216"+
		"\u0217\u0005\u001c\u0000\u0000\u0217\u0218\u0003V+\u0000\u0218\u0219\u0007"+
		"\u0001\u0000\u0000\u0219\u021a\u0003V+\u0000\u021a\u021b\u0005\u001c\u0000"+
		"\u0000\u021b\u021c\u0003V+\u0000\u021c\u021d\u0003P(\u0000\u021d\u021f"+
		"\u0001\u0000\u0000\u0000\u021e\u0216\u0001\u0000\u0000\u0000\u021f\u0222"+
		"\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0001\u0000\u0000\u0000\u0221O\u0001\u0000\u0000\u0000\u0222\u0220\u0001"+
		"\u0000\u0000\u0000\u0223\u022f\u0003R)\u0000\u0224\u0225\u0005\u0017\u0000"+
		"\u0000\u0225\u0226\u0003V+\u0000\u0226\u0227\u0003R)\u0000\u0227\u022e"+
		"\u0001\u0000\u0000\u0000\u0228\u0229\u0005\u0018\u0000\u0000\u0229\u022a"+
		"\u0003V+\u0000\u022a\u022b\u0003B!\u0000\u022b\u022c\u0003V+\u0000\u022c"+
		"\u022e\u0001\u0000\u0000\u0000\u022d\u0224\u0001\u0000\u0000\u0000\u022d"+
		"\u0228\u0001\u0000\u0000\u0000\u022e\u0231\u0001\u0000\u0000\u0000\u022f"+
		"\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230"+
		"Q\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0232\u0233"+
		"\u0003B!\u0000\u0233\u0234\u0003V+\u0000\u0234\u0242\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0003F#\u0000\u0236\u0237\u0003V+\u0000\u0237\u0242"+
		"\u0001\u0000\u0000\u0000\u0238\u0239\u0003D\"\u0000\u0239\u023a\u0003"+
		"V+\u0000\u023a\u0242\u0001\u0000\u0000\u0000\u023b\u023c\u0005\u0010\u0000"+
		"\u0000\u023c\u023d\u0003V+\u0000\u023d\u023e\u0003N\'\u0000\u023e\u023f"+
		"\u0005\u0011\u0000\u0000\u023f\u0240\u0003V+\u0000\u0240\u0242\u0001\u0000"+
		"\u0000\u0000\u0241\u0232\u0001\u0000\u0000\u0000\u0241\u0235\u0001\u0000"+
		"\u0000\u0000\u0241\u0238\u0001\u0000\u0000\u0000\u0241\u023b\u0001\u0000"+
		"\u0000\u0000\u0242S\u0001\u0000\u0000\u0000\u0243\u0248\u00052\u0000\u0000"+
		"\u0244\u0248\u0005$\u0000\u0000\u0245\u0248\u0005%\u0000\u0000\u0246\u0248"+
		"\u0005&\u0000\u0000\u0247\u0243\u0001\u0000\u0000\u0000\u0247\u0244\u0001"+
		"\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0246\u0001"+
		"\u0000\u0000\u0000\u0248U\u0001\u0000\u0000\u0000\u0249\u024b\u0007\u0002"+
		"\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000"+
		"\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000"+
		"\u0000\u0000\u024dW\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000"+
		"\u0000E[_djpw\u007f\u0089\u008c\u008f\u0092\u0096\u0099\u009d\u00a3\u00a7"+
		"\u00ab\u00b9\u00c1\u00c8\u00d3\u00dd\u00e6\u00ea\u00f9\u00fc\u0101\u010c"+
		"\u0116\u0119\u0123\u012f\u013a\u0145\u0149\u014e\u0150\u0156\u0158\u015a"+
		"\u015d\u0163\u0168\u0171\u0175\u0182\u0187\u018f\u0196\u019c\u01a5\u01ad"+
		"\u01b1\u01ba\u01be\u01c3\u01ec\u01ef\u01f4\u01f9\u01ff\u0206\u0213\u0220"+
		"\u022d\u022f\u0241\u0247\u024c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}