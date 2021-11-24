// Generated from /Users/morten/Documents/uib/M-inf225/term-project/Craft.g4 by ANTLR 4.9.2
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
public class CraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, EndRow=8, End=9, 
		ID=10, Blank=11, Num=12, Str=13, TypeSeparator=14;
	public static final int
		RULE_materials = 0, RULE_def = 1, RULE_materialTypes = 2, RULE_recipe = 3, 
		RULE_list = 4, RULE_grid = 5, RULE_row = 6, RULE_entry = 7, RULE_type = 8, 
		RULE_types = 9, RULE_program = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"materials", "def", "materialTypes", "recipe", "list", "grid", "row", 
			"entry", "type", "types", "program"
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

	@Override
	public String getGrammarFileName() { return "Craft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MaterialsContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(CraftParser.End, 0); }
		public List<TerminalNode> ID() { return getTokens(CraftParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CraftParser.ID, i);
		}
		public MaterialsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materials; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterMaterials(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitMaterials(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitMaterials(this);
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
		public TerminalNode ID() { return getToken(CraftParser.ID, 0); }
		public MaterialTypesContext materialTypes() {
			return getRuleContext(MaterialTypesContext.class,0);
		}
		public RecipeContext recipe() {
			return getRuleContext(RecipeContext.class,0);
		}
		public TerminalNode End() { return getToken(CraftParser.End, 0); }
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__1);
			setState(31);
			match(ID);
			setState(32);
			materialTypes();
			setState(33);
			recipe();
			setState(34);
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
		public TerminalNode End() { return getToken(CraftParser.End, 0); }
		public List<TerminalNode> ID() { return getTokens(CraftParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CraftParser.ID, i);
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
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterMaterialTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitMaterialTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitMaterialTypes(this);
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
			setState(36);
			match(T__2);
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				match(ID);
				setState(38);
				match(T__3);
				setState(39);
				types();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(44);
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
		public GridContext grid() {
			return getRuleContext(GridContext.class,0);
		}
		public RecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterRecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitRecipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitRecipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeContext recipe() throws RecognitionException {
		RecipeContext _localctx = new RecipeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_recipe);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				list();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				grid();
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
		public TerminalNode End() { return getToken(CraftParser.End, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__4);
			setState(51);
			row();
			setState(52);
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

	public static class GridContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(CraftParser.End, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public List<TerminalNode> EndRow() { return getTokens(CraftParser.EndRow); }
		public TerminalNode EndRow(int i) {
			return getToken(CraftParser.EndRow, i);
		}
		public GridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterGrid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitGrid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitGrid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GridContext grid() throws RecognitionException {
		GridContext _localctx = new GridContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_grid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__5);
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(55);
				row();
				}
				break;
			case 2:
				{
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					row();
					setState(57);
					match(EndRow);
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==Blank );
				}
				break;
			}
			setState(65);
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
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitRow(this);
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
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				entry();
				}
				}
				setState(70); 
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
		public TerminalNode Blank() { return getToken(CraftParser.Blank, 0); }
		public TerminalNode ID() { return getToken(CraftParser.ID, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(72);
				match(Blank);
				}
				break;
			case 2:
				{
				setState(73);
				match(ID);
				}
				break;
			case 3:
				{
				{
				setState(74);
				match(ID);
				setState(75);
				match(T__3);
				setState(76);
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
		public TerminalNode ID() { return getToken(CraftParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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
		public List<TerminalNode> TypeSeparator() { return getTokens(CraftParser.TypeSeparator); }
		public TerminalNode TypeSeparator(int i) {
			return getToken(CraftParser.TypeSeparator, i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_types);
		try {
			int _alt;
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(85); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(82);
						type();
						setState(83);
						match(TypeSeparator);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(87); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(89);
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
			if ( listener instanceof CraftListener ) ((CraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CraftListener ) ((CraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CraftVisitor ) return ((CraftVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(93);
					materials();
					}
					break;
				case T__1:
					{
					setState(94);
					def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\4\3\4\3\5\3\5\5\5\63\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7>\n\7\r\7\16\7?\5\7B\n\7\3\7\3\7\3\b\6"+
		"\bG\n\b\r\b\16\bH\3\t\3\t\3\t\3\t\3\t\5\tP\n\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\6\13X\n\13\r\13\16\13Y\3\13\3\13\5\13^\n\13\3\f\3\f\6\fb\n\f\r\f"+
		"\16\fc\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2f\2\30\3\2\2\2\4 \3\2"+
		"\2\2\6&\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f8\3\2\2\2\16F\3\2\2\2\20O\3"+
		"\2\2\2\22Q\3\2\2\2\24]\3\2\2\2\26a\3\2\2\2\30\32\7\3\2\2\31\33\7\f\2\2"+
		"\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2"+
		"\36\37\7\13\2\2\37\3\3\2\2\2 !\7\4\2\2!\"\7\f\2\2\"#\5\6\4\2#$\5\b\5\2"+
		"$%\7\13\2\2%\5\3\2\2\2&*\7\5\2\2\'(\7\f\2\2()\7\6\2\2)+\5\24\13\2*\'\3"+
		"\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\13\2\2/\7\3\2\2\2\60"+
		"\63\5\n\6\2\61\63\5\f\7\2\62\60\3\2\2\2\62\61\3\2\2\2\63\t\3\2\2\2\64"+
		"\65\7\7\2\2\65\66\5\16\b\2\66\67\7\13\2\2\67\13\3\2\2\28A\7\b\2\29B\5"+
		"\16\b\2:;\5\16\b\2;<\7\n\2\2<>\3\2\2\2=:\3\2\2\2>?\3\2\2\2?=\3\2\2\2?"+
		"@\3\2\2\2@B\3\2\2\2A9\3\2\2\2A=\3\2\2\2BC\3\2\2\2CD\7\13\2\2D\r\3\2\2"+
		"\2EG\5\20\t\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\17\3\2\2\2JP\7"+
		"\r\2\2KP\7\f\2\2LM\7\f\2\2MN\7\6\2\2NP\5\24\13\2OJ\3\2\2\2OK\3\2\2\2O"+
		"L\3\2\2\2P\21\3\2\2\2QR\7\f\2\2R\23\3\2\2\2S^\5\22\n\2TU\5\22\n\2UV\7"+
		"\20\2\2VX\3\2\2\2WT\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\"+
		"\5\22\n\2\\^\3\2\2\2]S\3\2\2\2]W\3\2\2\2^\25\3\2\2\2_b\5\2\2\2`b\5\4\3"+
		"\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\27\3\2\2\2\r\34"+
		",\62?AHOY]ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}