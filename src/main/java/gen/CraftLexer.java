// Generated from /Users/morten/Documents/uib/M-inf225/term-project/Craft.g4 by ANTLR 4.9.2
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
public class CraftLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, EndRow=8, End=9, 
		ID=10, Blank=11, Num=12, Str=13, TypeSeparator=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WS", "EndRow", "End", 
			"ID", "Blank", "Num", "Str", "TypeSeparator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'materials'", "'item'", "'mats'", "':'", "'list'", "'grid'", null, 
			"','", "'end'", null, "'_'", null, null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "WS", "EndRow", "End", "ID", 
			"Blank", "Num", "Str", "TypeSeparator"
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


	public CraftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Craft.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\6\bA\n\b\r\b\16\bB\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\7\13O\n\13\f\13\16\13R\13\13\3\f\3\f\3\r\3\r"+
		"\3\r\7\rY\n\r\f\r\16\r\\\13\r\5\r^\n\r\3\16\3\16\6\16b\n\16\r\16\16\16"+
		"c\3\16\3\16\3\17\3\17\3c\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\3\2\7\4\2\13\f\"\"\4\2C\\c|\5\2\62;C\\c|"+
		"\3\2\63;\3\2\62;\2m\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2"+
		"\2\5)\3\2\2\2\7.\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r:\3\2\2\2\17@\3\2"+
		"\2\2\21F\3\2\2\2\23H\3\2\2\2\25L\3\2\2\2\27S\3\2\2\2\31]\3\2\2\2\33_\3"+
		"\2\2\2\35g\3\2\2\2\37 \7o\2\2 !\7c\2\2!\"\7v\2\2\"#\7g\2\2#$\7t\2\2$%"+
		"\7k\2\2%&\7c\2\2&\'\7n\2\2\'(\7u\2\2(\4\3\2\2\2)*\7k\2\2*+\7v\2\2+,\7"+
		"g\2\2,-\7o\2\2-\6\3\2\2\2./\7o\2\2/\60\7c\2\2\60\61\7v\2\2\61\62\7u\2"+
		"\2\62\b\3\2\2\2\63\64\7<\2\2\64\n\3\2\2\2\65\66\7n\2\2\66\67\7k\2\2\67"+
		"8\7u\2\289\7v\2\29\f\3\2\2\2:;\7i\2\2;<\7t\2\2<=\7k\2\2=>\7f\2\2>\16\3"+
		"\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b"+
		"\b\2\2E\20\3\2\2\2FG\7.\2\2G\22\3\2\2\2HI\7g\2\2IJ\7p\2\2JK\7f\2\2K\24"+
		"\3\2\2\2LP\t\3\2\2MO\t\4\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q"+
		"\26\3\2\2\2RP\3\2\2\2ST\7a\2\2T\30\3\2\2\2U^\7\62\2\2VZ\t\5\2\2WY\t\6"+
		"\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]U\3"+
		"\2\2\2]V\3\2\2\2^\32\3\2\2\2_a\7)\2\2`b\13\2\2\2a`\3\2\2\2bc\3\2\2\2c"+
		"d\3\2\2\2ca\3\2\2\2de\3\2\2\2ef\7)\2\2f\34\3\2\2\2gh\7\61\2\2h\36\3\2"+
		"\2\2\b\2BPZ]c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}