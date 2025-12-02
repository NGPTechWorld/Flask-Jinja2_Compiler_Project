// Generated from D:/Projects/Compiler1Project/src/antlr/python_flask/pythonLexer.g4 by ANTLR 4.13.2
package antlr.python_flask;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class pythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, INT=3, DOUBLE=4, STRING=5, TRUE=6, FALSE=7, NULL=8, 
		IF=9, ELIF=10, ELSE=11, FOR=12, IN=13, RANGE=14, CONTINUE=15, BREAK=16, 
		LKB=17, RKB=18, LSB=19, RSB=20, LPAREN=21, RPAREN=22, COLON=23, COMMA=24, 
		IDENTIFIER=25, EQUAL=26, PLUS=27, MINUS=28, STAR=29, DIV=30, PLUS_EQUAL=31, 
		MINUS_EQUAL=32, STAR_EQUAL=33, DIV_EQUAL=34, EQ=35, NEQ=36, LT=37, LTE=38, 
		GT=39, GTE=40, NEWLINE=41, COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INDENT", "DEDENT", "INT", "DOUBLE", "STRING", "TRUE", "FALSE", "NULL", 
			"IF", "ELIF", "ELSE", "FOR", "IN", "RANGE", "CONTINUE", "BREAK", "ESC", 
			"EXP", "LKB", "RKB", "LSB", "RSB", "LPAREN", "RPAREN", "COLON", "COMMA", 
			"IDENTIFIER", "EQUAL", "PLUS", "MINUS", "STAR", "DIV", "PLUS_EQUAL", 
			"MINUS_EQUAL", "STAR_EQUAL", "DIV_EQUAL", "EQ", "NEQ", "LT", "LTE", "GT", 
			"GTE", "NEWLINE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'true'", "'false'", "'null'", "'if'", 
			"'elif'", "'else'", "'for'", "'in'", "'range'", "'continue'", "'break'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "':'", "','", null, "'='", 
			"'+'", "'-'", "'*'", "'/'", "'+='", "'-='", "'*='", "'/='", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "INT", "DOUBLE", "STRING", "TRUE", "FALSE", 
			"NULL", "IF", "ELIF", "ELSE", "FOR", "IN", "RANGE", "CONTINUE", "BREAK", 
			"LKB", "RKB", "LSB", "RSB", "LPAREN", "RPAREN", "COLON", "COMMA", "IDENTIFIER", 
			"EQUAL", "PLUS", "MINUS", "STAR", "DIV", "PLUS_EQUAL", "MINUS_EQUAL", 
			"STAR_EQUAL", "DIV_EQUAL", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "NEWLINE", 
			"COMMENT"
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


	    java.util.Stack<Integer> indents = new java.util.Stack<>();
	    boolean atStartOfLine = true;
	    java.util.LinkedList<Token> pendingTokens = new java.util.LinkedList<>();

	    /** Helper method to create a token */
	    private Token commonToken(int type, String text) {
	        int start = getCharIndex() - text.length();
	        int stop = getCharIndex() - 1;
	        return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	    }


	public pythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pythonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			INDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			DEDENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			        int spaces = getText().length();
			        if (indents.isEmpty() || spaces > indents.peek()) {
			            indents.push(spaces);
			            pendingTokens.add(commonToken(INDENT, getText()));
			        }
			        atStartOfLine = false;
			    
			break;
		}
	}
	private void DEDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			        int previous = indents.pop();
			        pendingTokens.add(commonToken(DEDENT, ""));
			    
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return INDENT_sempred((RuleContext)_localctx, predIndex);
		case 1:
			return DEDENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean INDENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfLine;
		}
		return true;
	}
	private boolean DEDENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return atStartOfLine && !indents.isEmpty();
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000*\u011c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0001\u0000\u0001\u0000\u0004\u0000\\\b\u0000\u000b\u0000\f\u0000]\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002l\b\u0002\n\u0002\f\u0002o\t\u0002\u0003\u0002q\b\u0002\u0001\u0003"+
		"\u0003\u0003t\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"y\b\u0003\u000b\u0003\f\u0003z\u0001\u0003\u0003\u0003~\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0083\b\u0004\n\u0004\f\u0004"+
		"\u0086\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00c8\b\u0011\u0001"+
		"\u0011\u0004\u0011\u00cb\b\u0011\u000b\u0011\f\u0011\u00cc\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u00e1\b\u001a\n\u001a\f\u001a\u00e4\t\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001*\u0003*\u010d\b*\u0001*\u0004*\u0110\b*\u000b*\f*\u0111\u0001"+
		"+\u0001+\u0005+\u0116\b+\n+\f+\u0119\t+\u0001+\u0001+\u0000\u0000,\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0000#\u0000%\u0011\'\u0012)\u0013+\u0014-\u0015/"+
		"\u00161\u00173\u00185\u00197\u001a9\u001b;\u001c=\u001d?\u001eA\u001f"+
		"C E!G\"I#K$M%O&Q\'S(U)W*\u0001\u0000\n\u0001\u0000  \u0001\u000019\u0001"+
		"\u000009\u0002\u0000\"\"\\\\\u0007\u0000\"\"\\\\bbffnnrrtt\u0002\u0000"+
		"EEee\u0002\u0000++--\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000"+
		"\n\n\r\r\u0127\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000"+
		"S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001"+
		"\u0000\u0000\u0000\u0001Y\u0001\u0000\u0000\u0000\u0003c\u0001\u0000\u0000"+
		"\u0000\u0005p\u0001\u0000\u0000\u0000\u0007s\u0001\u0000\u0000\u0000\t"+
		"\u007f\u0001\u0000\u0000\u0000\u000b\u0089\u0001\u0000\u0000\u0000\r\u008e"+
		"\u0001\u0000\u0000\u0000\u000f\u0094\u0001\u0000\u0000\u0000\u0011\u0099"+
		"\u0001\u0000\u0000\u0000\u0013\u009c\u0001\u0000\u0000\u0000\u0015\u00a1"+
		"\u0001\u0000\u0000\u0000\u0017\u00a6\u0001\u0000\u0000\u0000\u0019\u00aa"+
		"\u0001\u0000\u0000\u0000\u001b\u00ad\u0001\u0000\u0000\u0000\u001d\u00b3"+
		"\u0001\u0000\u0000\u0000\u001f\u00bc\u0001\u0000\u0000\u0000!\u00c2\u0001"+
		"\u0000\u0000\u0000#\u00c5\u0001\u0000\u0000\u0000%\u00ce\u0001\u0000\u0000"+
		"\u0000\'\u00d0\u0001\u0000\u0000\u0000)\u00d2\u0001\u0000\u0000\u0000"+
		"+\u00d4\u0001\u0000\u0000\u0000-\u00d6\u0001\u0000\u0000\u0000/\u00d8"+
		"\u0001\u0000\u0000\u00001\u00da\u0001\u0000\u0000\u00003\u00dc\u0001\u0000"+
		"\u0000\u00005\u00de\u0001\u0000\u0000\u00007\u00e5\u0001\u0000\u0000\u0000"+
		"9\u00e7\u0001\u0000\u0000\u0000;\u00e9\u0001\u0000\u0000\u0000=\u00eb"+
		"\u0001\u0000\u0000\u0000?\u00ed\u0001\u0000\u0000\u0000A\u00ef\u0001\u0000"+
		"\u0000\u0000C\u00f2\u0001\u0000\u0000\u0000E\u00f5\u0001\u0000\u0000\u0000"+
		"G\u00f8\u0001\u0000\u0000\u0000I\u00fb\u0001\u0000\u0000\u0000K\u00fe"+
		"\u0001\u0000\u0000\u0000M\u0101\u0001\u0000\u0000\u0000O\u0103\u0001\u0000"+
		"\u0000\u0000Q\u0106\u0001\u0000\u0000\u0000S\u0108\u0001\u0000\u0000\u0000"+
		"U\u010f\u0001\u0000\u0000\u0000W\u0113\u0001\u0000\u0000\u0000Y[\u0004"+
		"\u0000\u0000\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0006\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0006\u0000\u0001\u0000b\u0002\u0001\u0000\u0000\u0000"+
		"cd\u0004\u0001\u0001\u0000de\u0006\u0001\u0002\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0006\u0001\u0001\u0000g\u0004\u0001\u0000\u0000\u0000hq\u0005"+
		"0\u0000\u0000im\u0007\u0001\u0000\u0000jl\u0007\u0002\u0000\u0000kj\u0001"+
		"\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000ph\u0001\u0000\u0000\u0000pi\u0001\u0000\u0000\u0000q\u0006\u0001"+
		"\u0000\u0000\u0000rt\u0005-\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0003\u0005\u0002\u0000"+
		"vx\u0005.\u0000\u0000wy\u0007\u0002\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{}\u0001\u0000\u0000\u0000|~\u0003#\u0011\u0000}|\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\b\u0001\u0000\u0000\u0000\u007f\u0084"+
		"\u0005\"\u0000\u0000\u0080\u0083\b\u0003\u0000\u0000\u0081\u0083\u0003"+
		"!\u0010\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005\"\u0000"+
		"\u0000\u0088\n\u0001\u0000\u0000\u0000\u0089\u008a\u0005t\u0000\u0000"+
		"\u008a\u008b\u0005r\u0000\u0000\u008b\u008c\u0005u\u0000\u0000\u008c\u008d"+
		"\u0005e\u0000\u0000\u008d\f\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"f\u0000\u0000\u008f\u0090\u0005a\u0000\u0000\u0090\u0091\u0005l\u0000"+
		"\u0000\u0091\u0092\u0005s\u0000\u0000\u0092\u0093\u0005e\u0000\u0000\u0093"+
		"\u000e\u0001\u0000\u0000\u0000\u0094\u0095\u0005n\u0000\u0000\u0095\u0096"+
		"\u0005u\u0000\u0000\u0096\u0097\u0005l\u0000\u0000\u0097\u0098\u0005l"+
		"\u0000\u0000\u0098\u0010\u0001\u0000\u0000\u0000\u0099\u009a\u0005i\u0000"+
		"\u0000\u009a\u009b\u0005f\u0000\u0000\u009b\u0012\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005e\u0000\u0000\u009d\u009e\u0005l\u0000\u0000\u009e\u009f"+
		"\u0005i\u0000\u0000\u009f\u00a0\u0005f\u0000\u0000\u00a0\u0014\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005e\u0000\u0000\u00a2\u00a3\u0005l\u0000\u0000"+
		"\u00a3\u00a4\u0005s\u0000\u0000\u00a4\u00a5\u0005e\u0000\u0000\u00a5\u0016"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005f\u0000\u0000\u00a7\u00a8\u0005"+
		"o\u0000\u0000\u00a8\u00a9\u0005r\u0000\u0000\u00a9\u0018\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005i\u0000\u0000\u00ab\u00ac\u0005n\u0000\u0000\u00ac"+
		"\u001a\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005r\u0000\u0000\u00ae\u00af"+
		"\u0005a\u0000\u0000\u00af\u00b0\u0005n\u0000\u0000\u00b0\u00b1\u0005g"+
		"\u0000\u0000\u00b1\u00b2\u0005e\u0000\u0000\u00b2\u001c\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005c\u0000\u0000\u00b4\u00b5\u0005o\u0000\u0000\u00b5"+
		"\u00b6\u0005n\u0000\u0000\u00b6\u00b7\u0005t\u0000\u0000\u00b7\u00b8\u0005"+
		"i\u0000\u0000\u00b8\u00b9\u0005n\u0000\u0000\u00b9\u00ba\u0005u\u0000"+
		"\u0000\u00ba\u00bb\u0005e\u0000\u0000\u00bb\u001e\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005b\u0000\u0000\u00bd\u00be\u0005r\u0000\u0000\u00be\u00bf"+
		"\u0005e\u0000\u0000\u00bf\u00c0\u0005a\u0000\u0000\u00c0\u00c1\u0005k"+
		"\u0000\u0000\u00c1 \u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\\\u0000"+
		"\u0000\u00c3\u00c4\u0007\u0004\u0000\u0000\u00c4\"\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c7\u0007\u0005\u0000\u0000\u00c6\u00c8\u0007\u0006\u0000\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00cb\u0007\u0002\u0000\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd$\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005{\u0000\u0000\u00cf&"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005}\u0000\u0000\u00d1(\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005[\u0000\u0000\u00d3*\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0005]\u0000\u0000\u00d5,\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005(\u0000\u0000\u00d7.\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005)"+
		"\u0000\u0000\u00d90\u0001\u0000\u0000\u0000\u00da\u00db\u0005:\u0000\u0000"+
		"\u00db2\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005,\u0000\u0000\u00dd4"+
		"\u0001\u0000\u0000\u0000\u00de\u00e2\u0007\u0007\u0000\u0000\u00df\u00e1"+
		"\u0007\b\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e36\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005=\u0000\u0000\u00e68\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0005+\u0000\u0000\u00e8:\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005-\u0000\u0000\u00ea<\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005*"+
		"\u0000\u0000\u00ec>\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005/\u0000\u0000"+
		"\u00ee@\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005+\u0000\u0000\u00f0\u00f1"+
		"\u0005=\u0000\u0000\u00f1B\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005-"+
		"\u0000\u0000\u00f3\u00f4\u0005=\u0000\u0000\u00f4D\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0005*\u0000\u0000\u00f6\u00f7\u0005=\u0000\u0000\u00f7F"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005/\u0000\u0000\u00f9\u00fa\u0005"+
		"=\u0000\u0000\u00faH\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005=\u0000"+
		"\u0000\u00fc\u00fd\u0005=\u0000\u0000\u00fdJ\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005!\u0000\u0000\u00ff\u0100\u0005=\u0000\u0000\u0100L\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005<\u0000\u0000\u0102N\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005<\u0000\u0000\u0104\u0105\u0005=\u0000\u0000\u0105"+
		"P\u0001\u0000\u0000\u0000\u0106\u0107\u0005>\u0000\u0000\u0107R\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0005>\u0000\u0000\u0109\u010a\u0005=\u0000"+
		"\u0000\u010aT\u0001\u0000\u0000\u0000\u010b\u010d\u0005\r\u0000\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0005\n\u0000\u0000\u010f"+
		"\u010c\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"V\u0001\u0000\u0000\u0000\u0113\u0117\u0005#\u0000\u0000\u0114\u0116\b"+
		"\t\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0006+\u0001\u0000\u011bX\u0001\u0000\u0000\u0000"+
		"\u000f\u0000]mpsz}\u0082\u0084\u00c7\u00cc\u00e2\u010c\u0111\u0117\u0003"+
		"\u0001\u0000\u0000\u0006\u0000\u0000\u0001\u0001\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}