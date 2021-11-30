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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, EndRow=7, End=8, ID=9, Blank=10, 
		Num=11, Str=12, TypeSeparator=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WS", "EndRow", "End", "ID", 
			"Blank", "Num", "Str", "TypeSeparator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'item'", "'mats'", "':'", "'list'", "'table'", null, "','", "'end'", 
			null, "'_'", null, null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WS", "EndRow", "End", "ID", "Blank", 
			"Num", "Str", "TypeSeparator"
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
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7\66\n\7\r"+
		"\7\16\7\67\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\7\nD\n\n\f\n\16\nG"+
		"\13\n\3\13\3\13\3\f\3\f\3\f\7\fN\n\f\f\f\16\fQ\13\f\5\fS\n\f\3\r\3\r\6"+
		"\rW\n\r\r\r\16\rX\3\r\3\r\3\16\3\16\3X\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\7\4\2\13\f\"\"\4\2C\\c|\5\2\62"+
		";C\\c|\3\2\63;\3\2\62;\2b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\"\3"+
		"\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13.\3\2\2\2\r\65\3\2\2\2\17;\3\2\2\2\21"+
		"=\3\2\2\2\23A\3\2\2\2\25H\3\2\2\2\27R\3\2\2\2\31T\3\2\2\2\33\\\3\2\2\2"+
		"\35\36\7k\2\2\36\37\7v\2\2\37 \7g\2\2 !\7o\2\2!\4\3\2\2\2\"#\7o\2\2#$"+
		"\7c\2\2$%\7v\2\2%&\7u\2\2&\6\3\2\2\2\'(\7<\2\2(\b\3\2\2\2)*\7n\2\2*+\7"+
		"k\2\2+,\7u\2\2,-\7v\2\2-\n\3\2\2\2./\7v\2\2/\60\7c\2\2\60\61\7d\2\2\61"+
		"\62\7n\2\2\62\63\7g\2\2\63\f\3\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67"+
		"\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\b\7\2\2:\16\3\2\2\2;<\7"+
		".\2\2<\20\3\2\2\2=>\7g\2\2>?\7p\2\2?@\7f\2\2@\22\3\2\2\2AE\t\3\2\2BD\t"+
		"\4\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\24\3\2\2\2GE\3\2\2\2H"+
		"I\7a\2\2I\26\3\2\2\2JS\7\62\2\2KO\t\5\2\2LN\t\6\2\2ML\3\2\2\2NQ\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RJ\3\2\2\2RK\3\2\2\2S\30\3\2"+
		"\2\2TV\7)\2\2UW\13\2\2\2VU\3\2\2\2WX\3\2\2\2XY\3\2\2\2XV\3\2\2\2YZ\3\2"+
		"\2\2Z[\7)\2\2[\32\3\2\2\2\\]\7\61\2\2]\34\3\2\2\2\b\2\67EORX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}