// Generated from C:/Compiler1Project/src/antlr/html_css_jinja2/HtmlCssJinja2Parser.g4 by ANTLR 4.13.2
package antlr.html_css_jinja2;
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
		TAG_WHITESPACE=12, STYLE_BODY=13, ATTVALUE_VALUE=14, ATTRIBUTE=15;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElements = 1, RULE_htmlElement = 2, RULE_htmlContent = 3, 
		RULE_htmlAttribute = 4, RULE_htmlCharData = 5, RULE_htmlMisc = 6, RULE_htmlComment = 7, 
		RULE_style = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "htmlElements", "htmlElement", "htmlContent", "htmlAttribute", 
			"htmlCharData", "htmlMisc", "htmlComment", "style"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<'", null, "'>'", "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "DTD", "SEA_WS", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", 
			"TAG_WHITESPACE", "STYLE_BODY", "ATTVALUE_VALUE", "ATTRIBUTE"
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
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(18);
					match(SEA_WS);
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(24);
				match(DTD);
				}
			}

			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(27);
					match(SEA_WS);
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58L) != 0)) {
				{
				{
				setState(33);
				htmlElements();
				}
				}
				setState(38);
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
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_COMMENT || _la==SEA_WS) {
				{
				{
				setState(39);
				htmlMisc();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			htmlElement();
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					htmlMisc();
					}
					} 
				}
				setState(51);
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new HtmlOpeningClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(TAG_OPEN);
				setState(53);
				match(TAG_NAME);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(54);
					htmlAttribute();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(60);
					match(TAG_CLOSE);
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(61);
						htmlContent();
						setState(62);
						match(TAG_OPEN);
						setState(63);
						match(TAG_SLASH);
						setState(64);
						match(TAG_NAME);
						setState(65);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(69);
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
				setState(72);
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
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(75);
				htmlCharData();
				}
			}

			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(78);
						htmlElement();
						}
						break;
					case HTML_COMMENT:
						{
						setState(79);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(82);
						htmlCharData();
						}
					}

					}
					} 
				}
				setState(89);
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
			setState(90);
			match(TAG_NAME);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(91);
				match(TAG_EQUALS);
				setState(92);
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				_localctx = new HtmlTextDataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(HTML_TEXT);
				}
				break;
			case SEA_WS:
				_localctx = new HtmlWhitespaceDataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				_localctx = new HtmlMiscCommentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				htmlComment();
				}
				break;
			case SEA_WS:
				_localctx = new HtmlMiscWhitespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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
			setState(103);
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
		public TerminalNode STYLE_BODY() { return getToken(HtmlCssJinja2Parser.STYLE_BODY, 0); }
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
			setState(105);
			match(STYLE_OPEN);
			setState(106);
			match(STYLE_BODY);
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
		"\u0004\u0001\u000fm\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0000\u0005\u0000"+
		"\u001d\b\u0000\n\u0000\f\u0000 \t\u0000\u0001\u0000\u0005\u0000#\b\u0000"+
		"\n\u0000\f\u0000&\t\u0000\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001"+
		",\t\u0001\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u0001"+
		"3\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00028\b\u0002\n\u0002"+
		"\f\u0002;\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0002\u0003"+
		"\u0002G\b\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0001\u0003\u0003\u0003"+
		"M\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003\u0001\u0003\u0003"+
		"\u0003T\b\u0003\u0005\u0003V\b\u0003\n\u0003\f\u0003Y\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004^\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005b\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006f\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000t\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000"+
		"\u0006L\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\na\u0001\u0000"+
		"\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000eg\u0001\u0000\u0000\u0000"+
		"\u0010i\u0001\u0000\u0000\u0000\u0012\u0014\u0005\u0003\u0000\u0000\u0013"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018"+
		"\u001a\u0005\u0002\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u001e\u0001\u0000\u0000\u0000\u001b"+
		"\u001d\u0005\u0003\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d"+
		" \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f$\u0001\u0000\u0000\u0000 \u001e\u0001\u0000"+
		"\u0000\u0000!#\u0003\u0002\u0001\u0000\"!\u0001\u0000\u0000\u0000#&\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%\u0001\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\')\u0003\f\u0006"+
		"\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000-1\u0003\u0004\u0002\u0000.0\u0003\f\u0006\u0000/.\u0001"+
		"\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000045\u0005\u0005\u0000\u000059\u0005\u000b\u0000\u000068\u0003"+
		"\b\u0004\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:F\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<C\u0005\u0007\u0000\u0000=>\u0003\u0006\u0003"+
		"\u0000>?\u0005\u0005\u0000\u0000?@\u0005\t\u0000\u0000@A\u0005\u000b\u0000"+
		"\u0000AB\u0005\u0007\u0000\u0000BD\u0001\u0000\u0000\u0000C=\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EG\u0005"+
		"\b\u0000\u0000F<\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001"+
		"\u0000\u0000\u0000HJ\u0003\u0010\b\u0000I4\u0001\u0000\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KM\u0003\n\u0005\u0000"+
		"LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MW\u0001\u0000\u0000"+
		"\u0000NQ\u0003\u0004\u0002\u0000OQ\u0003\u000e\u0007\u0000PN\u0001\u0000"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RT\u0003"+
		"\n\u0005\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001"+
		"\u0000\u0000\u0000UP\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0007\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z]\u0005\u000b\u0000\u0000[\\\u0005"+
		"\n\u0000\u0000\\^\u0005\u000e\u0000\u0000][\u0001\u0000\u0000\u0000]^"+
		"\u0001\u0000\u0000\u0000^\t\u0001\u0000\u0000\u0000_b\u0005\u0006\u0000"+
		"\u0000`b\u0005\u0003\u0000\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000"+
		"\u0000\u0000b\u000b\u0001\u0000\u0000\u0000cf\u0003\u000e\u0007\u0000"+
		"df\u0005\u0003\u0000\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000"+
		"\u0000f\r\u0001\u0000\u0000\u0000gh\u0005\u0001\u0000\u0000h\u000f\u0001"+
		"\u0000\u0000\u0000ij\u0005\u0004\u0000\u0000jk\u0005\r\u0000\u0000k\u0011"+
		"\u0001\u0000\u0000\u0000\u0011\u0015\u0019\u001e$*19CFILPSW]ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}