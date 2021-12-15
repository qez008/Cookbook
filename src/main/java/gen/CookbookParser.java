// Generated from /Users/morten/Documents/uib/M-inf225/term-project/Cookbook.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CookbookParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8, End=9, ID=10, 
		Blank=11, Num=12, Str=13;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_materials = 2, RULE_recipe = 3, 
		RULE_row = 4, RULE_entry = 5, RULE_types = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "materials", "recipe", "row", "entry", "types"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'item'", "'mats'", "':'", "'list'", "'table'", "','", "'/'", null, 
			"'end'", null, "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "WS", "End", "ID", "Blank", 
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

	@Override
	public String getGrammarFileName() { return "Cookbook.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CookbookParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				definition();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CookbookParser.ID, 0); }
		public RecipeContext recipe() {
			return getRuleContext(RecipeContext.class,0);
		}
		public TerminalNode End() { return getToken(CookbookParser.End, 0); }
		public MaterialsContext materials() {
			return getRuleContext(MaterialsContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(20);
			match(ID);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(21);
				materials();
				}
			}

			setState(24);
			recipe();
			setState(25);
			match(End);
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

	public static class MaterialsContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(CookbookParser.End, 0); }
		public List<TerminalNode> ID() { return getTokens(CookbookParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CookbookParser.ID, i);
		}
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public MaterialsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materials; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterMaterials(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitMaterials(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitMaterials(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialsContext materials() throws RecognitionException {
		MaterialsContext _localctx = new MaterialsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_materials);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__1);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				match(ID);
				setState(29);
				match(T__2);
				setState(30);
				types();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(35);
			match(End);
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

	public static class RecipeContext extends ParserRuleContext {
		public RecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipe; }
	 
		public RecipeContext() { }
		public void copyFrom(RecipeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListContext extends RecipeContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public TerminalNode End() { return getToken(CookbookParser.End, 0); }
		public ListContext(RecipeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends RecipeContext {
		public TerminalNode End() { return getToken(CookbookParser.End, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public TableContext(RecipeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeContext recipe() throws RecognitionException {
		RecipeContext _localctx = new RecipeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_recipe);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new ListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(T__3);
				setState(38);
				row();
				setState(39);
				match(End);
				}
				break;
			case T__4:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(T__4);
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(42);
					row();
					}
					break;
				case 2:
					{
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(43);
						row();
						setState(44);
						match(T__5);
						}
						}
						setState(48); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ID || _la==Blank );
					}
					break;
				}
				setState(52);
				match(End);
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

	public static class RowContext extends ParserRuleContext {
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				entry();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==Blank );
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

	public static class EntryContext extends ParserRuleContext {
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
	 
		public EntryContext() { }
		public void copyFrom(EntryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlankContext extends EntryContext {
		public TerminalNode Blank() { return getToken(CookbookParser.Blank, 0); }
		public BlankContext(EntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAndNumContext extends EntryContext {
		public TerminalNode ID() { return getToken(CookbookParser.ID, 0); }
		public TerminalNode Num() { return getToken(CookbookParser.Num, 0); }
		public IdAndNumContext(EntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterIdAndNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitIdAndNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitIdAndNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends EntryContext {
		public TerminalNode ID() { return getToken(CookbookParser.ID, 0); }
		public IdContext(EntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entry);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(Blank);
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(ID);
				}
				break;
			case 3:
				_localctx = new IdAndNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(ID);
				setState(64);
				match(T__2);
				setState(65);
				match(Num);
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

	public static class TypesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CookbookParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CookbookParser.ID, i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_types);
		try {
			int _alt;
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(71); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(69);
						match(ID);
						setState(70);
						match(T__6);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(73); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(75);
				match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4\"\n\4\r\4\16\4"+
		"#\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\61\n\5\r\5\16\5\62\5"+
		"\5\65\n\5\3\5\3\5\5\59\n\5\3\6\6\6<\n\6\r\6\16\6=\3\7\3\7\3\7\3\7\3\7"+
		"\5\7E\n\7\3\b\3\b\3\b\6\bJ\n\b\r\b\16\bK\3\b\5\bO\n\b\3\b\2\2\t\2\4\6"+
		"\b\n\f\16\2\2\2T\2\21\3\2\2\2\4\25\3\2\2\2\6\35\3\2\2\2\b8\3\2\2\2\n;"+
		"\3\2\2\2\fD\3\2\2\2\16N\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2"+
		"\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\7\3\2\2\26\30\7\f"+
		"\2\2\27\31\5\6\4\2\30\27\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\5\b"+
		"\5\2\33\34\7\13\2\2\34\5\3\2\2\2\35!\7\4\2\2\36\37\7\f\2\2\37 \7\5\2\2"+
		" \"\5\16\b\2!\36\3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7"+
		"\13\2\2&\7\3\2\2\2\'(\7\6\2\2()\5\n\6\2)*\7\13\2\2*9\3\2\2\2+\64\7\7\2"+
		"\2,\65\5\n\6\2-.\5\n\6\2./\7\b\2\2/\61\3\2\2\2\60-\3\2\2\2\61\62\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64,\3\2\2\2\64\60\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\7\13\2\2\679\3\2\2\28\'\3\2\2\28+\3\2\2\29\t\3\2"+
		"\2\2:<\5\f\7\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\13\3\2\2\2?E\7"+
		"\r\2\2@E\7\f\2\2AB\7\f\2\2BC\7\5\2\2CE\7\16\2\2D?\3\2\2\2D@\3\2\2\2DA"+
		"\3\2\2\2E\r\3\2\2\2FO\7\f\2\2GH\7\f\2\2HJ\7\t\2\2IG\3\2\2\2JK\3\2\2\2"+
		"KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MO\7\f\2\2NF\3\2\2\2NI\3\2\2\2O\17\3\2\2"+
		"\2\f\23\30#\62\648=DKN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}