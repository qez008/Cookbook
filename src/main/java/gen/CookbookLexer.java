// Generated from /Users/morten/Documents/uib/M-inf225/term-project/Cookbook.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CookbookLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WS=9, 
		End=10, ID=11, Num=12, Str=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "WS", 
			"End", "ID", "Num", "Str"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'item'", "'mats'", "':'", "'list'", "'table'", "','", "'_'", "'/'", 
			null, "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "WS", "End", "ID", 
			"Num", "Str"
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


	public CookbookLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cookbook.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\6\n<\n\n\r\n\16\n=\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\7\f"+
		"H\n\f\f\f\16\fK\13\f\3\r\3\r\3\r\7\rP\n\r\f\r\16\rS\13\r\5\rU\n\r\3\16"+
		"\3\16\6\16Y\n\16\r\16\16\16Z\3\16\3\16\3Z\2\17\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\7\4\2\13\f\"\"\4\2C\\c|\5"+
		"\2\62;C\\c|\3\2\63;\3\2\62;\2b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5"+
		"\"\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13.\3\2\2\2\r\64\3\2\2\2\17\66\3\2\2"+
		"\2\218\3\2\2\2\23;\3\2\2\2\25A\3\2\2\2\27E\3\2\2\2\31T\3\2\2\2\33V\3\2"+
		"\2\2\35\36\7k\2\2\36\37\7v\2\2\37 \7g\2\2 !\7o\2\2!\4\3\2\2\2\"#\7o\2"+
		"\2#$\7c\2\2$%\7v\2\2%&\7u\2\2&\6\3\2\2\2\'(\7<\2\2(\b\3\2\2\2)*\7n\2\2"+
		"*+\7k\2\2+,\7u\2\2,-\7v\2\2-\n\3\2\2\2./\7v\2\2/\60\7c\2\2\60\61\7d\2"+
		"\2\61\62\7n\2\2\62\63\7g\2\2\63\f\3\2\2\2\64\65\7.\2\2\65\16\3\2\2\2\66"+
		"\67\7a\2\2\67\20\3\2\2\289\7\61\2\29\22\3\2\2\2:<\t\2\2\2;:\3\2\2\2<="+
		"\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\b\n\2\2@\24\3\2\2\2AB\7g\2\2"+
		"BC\7p\2\2CD\7f\2\2D\26\3\2\2\2EI\t\3\2\2FH\t\4\2\2GF\3\2\2\2HK\3\2\2\2"+
		"IG\3\2\2\2IJ\3\2\2\2J\30\3\2\2\2KI\3\2\2\2LU\7\62\2\2MQ\t\5\2\2NP\t\6"+
		"\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TL\3\2"+
		"\2\2TM\3\2\2\2U\32\3\2\2\2VX\7)\2\2WY\13\2\2\2XW\3\2\2\2YZ\3\2\2\2Z[\3"+
		"\2\2\2ZX\3\2\2\2[\\\3\2\2\2\\]\7)\2\2]\34\3\2\2\2\b\2=IQTZ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}