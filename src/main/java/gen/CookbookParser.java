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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, EndRow=8, End=9, 
		ID=10, Blank=11, Num=12, Str=13, TypeSeparator=14;
	public static final int
		RULE_materials = 0, RULE_def = 1, RULE_materialTypes = 2, RULE_recipe = 3, 
		RULE_list = 4, RULE_table = 5, RULE_row = 6, RULE_entry = 7, RULE_type = 8, 
		RULE_types = 9, RULE_program = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"materials", "def", "materialTypes", "recipe", "list", "table", "row", 
			"entry", "type", "types", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'materials'", "'item'", "'mats'", "':'", "'list'", "'table'", 
			null, "','", "'end'", null, "'_'", null, null, "'/'"
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

	public static class MaterialsContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(CookbookParser.End, 0); }
		public List<TerminalNode> ID() { return getTokens(CookbookParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CookbookParser.ID, i);
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
		enterRule(_localctx, 0, RULE_materials);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				match(ID);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(28);
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

	public static class DefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CookbookParser.ID, 0); }
		public RecipeContext recipe() {
			return getRuleContext(RecipeContext.class,0);
		}
		public TerminalNode End() { return getToken(CookbookParser.End, 0); }
		public MaterialTypesContext materialTypes() {
			return getRuleContext(MaterialTypesContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__1);
			setState(31);
			match(ID);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(32);
				materialTypes();
				}
			}

			setState(35);
			recipe();
			setState(36);
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

	public static class MaterialTypesContext extends ParserRuleContext {
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
		public MaterialTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterMaterialTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitMaterialTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitMaterialTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialTypesContext materialTypes() throws RecognitionException {
		MaterialTypesContext _localctx = new MaterialTypesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_materialTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__2);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				match(ID);
				setState(40);
				match(T__3);
				setState(41);
				types();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(46);
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public RecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterRecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitRecipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitRecipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeContext recipe() throws RecognitionException {
		RecipeContext _localctx = new RecipeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_recipe);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				list();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				table();
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

	public static class ListContext extends ParserRuleContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public TerminalNode End() { return getToken(CookbookParser.End, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
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

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__4);
			setState(53);
			row();
			setState(54);
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(CookbookParser.End, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public List<TerminalNode> EndRow() { return getTokens(CookbookParser.EndRow); }
		public TerminalNode EndRow(int i) {
			return getToken(CookbookParser.EndRow, i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
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

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__5);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(57);
				row();
				}
				break;
			case 2:
				{
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					row();
					setState(59);
					match(EndRow);
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==Blank );
				}
				break;
			}
			setState(67);
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
		enterRule(_localctx, 12, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				entry();
				}
				}
				setState(72); 
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
		public TerminalNode Blank() { return getToken(CookbookParser.Blank, 0); }
		public TerminalNode ID() { return getToken(CookbookParser.ID, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(74);
				match(Blank);
				}
				break;
			case 2:
				{
				setState(75);
				match(ID);
				}
				break;
			case 3:
				{
				{
				setState(76);
				match(ID);
				setState(77);
				match(T__3);
				setState(78);
				types();
				}
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CookbookParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookbookListener ) ((CookbookListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookbookVisitor ) return ((CookbookVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> TypeSeparator() { return getTokens(CookbookParser.TypeSeparator); }
		public TerminalNode TypeSeparator(int i) {
			return getToken(CookbookParser.TypeSeparator, i);
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
		enterRule(_localctx, 18, RULE_types);
		try {
			int _alt;
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(87); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(84);
						type();
						setState(85);
						match(TypeSeparator);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(89); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(91);
				type();
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

	public static class ProgramContext extends ParserRuleContext {
		public List<MaterialsContext> materials() {
			return getRuleContexts(MaterialsContext.class);
		}
		public MaterialsContext materials(int i) {
			return getRuleContext(MaterialsContext.class,i);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
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
		enterRule(_localctx, 20, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(95);
					materials();
					}
					break;
				case T__1:
					{
					setState(96);
					def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__1 );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\3\3\3\3\3\3\5\3$\n\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\3\5\3\5\5\5\65\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7@\n\7\r\7\16\7A\5\7D\n\7\3\7\3"+
		"\7\3\b\6\bI\n\b\r\b\16\bJ\3\t\3\t\3\t\3\t\3\t\5\tR\n\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\6\13Z\n\13\r\13\16\13[\3\13\3\13\5\13`\n\13\3\f\3\f\6\f"+
		"d\n\f\r\f\16\fe\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2i\2\30\3\2\2"+
		"\2\4 \3\2\2\2\6(\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f:\3\2\2\2\16H\3\2"+
		"\2\2\20Q\3\2\2\2\22S\3\2\2\2\24_\3\2\2\2\26c\3\2\2\2\30\32\7\3\2\2\31"+
		"\33\7\f\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35"+
		"\36\3\2\2\2\36\37\7\13\2\2\37\3\3\2\2\2 !\7\4\2\2!#\7\f\2\2\"$\5\6\4\2"+
		"#\"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\5\b\5\2&\'\7\13\2\2\'\5\3\2\2\2(,\7"+
		"\5\2\2)*\7\f\2\2*+\7\6\2\2+-\5\24\13\2,)\3\2\2\2-.\3\2\2\2.,\3\2\2\2."+
		"/\3\2\2\2/\60\3\2\2\2\60\61\7\13\2\2\61\7\3\2\2\2\62\65\5\n\6\2\63\65"+
		"\5\f\7\2\64\62\3\2\2\2\64\63\3\2\2\2\65\t\3\2\2\2\66\67\7\7\2\2\678\5"+
		"\16\b\289\7\13\2\29\13\3\2\2\2:C\7\b\2\2;D\5\16\b\2<=\5\16\b\2=>\7\n\2"+
		"\2>@\3\2\2\2?<\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2C;\3\2\2"+
		"\2C?\3\2\2\2DE\3\2\2\2EF\7\13\2\2F\r\3\2\2\2GI\5\20\t\2HG\3\2\2\2IJ\3"+
		"\2\2\2JH\3\2\2\2JK\3\2\2\2K\17\3\2\2\2LR\7\r\2\2MR\7\f\2\2NO\7\f\2\2O"+
		"P\7\6\2\2PR\5\24\13\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2R\21\3\2\2\2ST\7\f"+
		"\2\2T\23\3\2\2\2U`\5\22\n\2VW\5\22\n\2WX\7\20\2\2XZ\3\2\2\2YV\3\2\2\2"+
		"Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\5\22\n\2^`\3\2\2\2_U\3\2"+
		"\2\2_Y\3\2\2\2`\25\3\2\2\2ad\5\2\2\2bd\5\4\3\2ca\3\2\2\2cb\3\2\2\2de\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2f\27\3\2\2\2\16\34#.\64ACJQ[_ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}