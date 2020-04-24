// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.TerminalNode;

import ast.Aritmetica;
import ast.Array;
import ast.Assignment;
import ast.Caracter;
import ast.Cast;
import ast.Clase;
import ast.Comparacion;
import ast.Def;
import ast.Entero;
import ast.Expression;
import ast.FuncDefinition;
import ast.Iarray;
import ast.Ifelse;
import ast.Invoca;
import ast.LitChar;
import ast.LitEnt;
import ast.LitReal;
import ast.Logica;
import ast.Negacion;
import ast.Print;
import ast.Program;
import ast.Read;
import ast.Real;
import ast.Return;
import ast.ReturnVoidExpression;
import ast.Sentence;
import ast.StructDefinition;
import ast.StructField;
import ast.StructFieldDefinition;
import ast.Type;
import ast.Var;
import ast.VarDefinition;
import ast.VoidType;
import ast.While;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		IDENT=39, INT_CONSTANT=40, REAL_CONSTANT=41, CHAR_CONSTANT=42, LINE_COMMENT=43, 
		L_COMMENT=44, MULTILINE_COMMENT=45, WHITESPACE=46;
	public static final int
		RULE_program = 0, RULE_defs = 1, RULE_var = 2, RULE_structFieldDefinition = 3, 
		RULE_struct = 4, RULE_defVars = 5, RULE_funcDefinition = 6, RULE_fields = 7, 
		RULE_type = 8, RULE_expressions = 9, RULE_sentences = 10, RULE_parameter = 11, 
		RULE_sentence = 12, RULE_returnType = 13, RULE_returnExpression = 14, 
		RULE_expr = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defs", "var", "structFieldDefinition", "struct", "defVars", 
			"funcDefinition", "fields", "type", "expressions", "sentences", "parameter", 
			"sentence", "returnType", "returnExpression", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "';'", "'struct'", "'{'", "'}'", "'('", "')'", 
			"'float'", "'int'", "'char'", "'['", "']'", "','", "'print'", "'printsp'", 
			"'println'", "'return'", "'read'", "'='", "'if'", "'else'", "'while'", 
			"'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", 
			"'&&'", "'||'", "'!'", "'cast'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENT", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"LINE_COMMENT", "L_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public DefsContext defs;
		public DefsContext defs() {
			return getRuleContext(DefsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((ProgramContext)_localctx).defs = defs();
			setState(33);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).defs.list); 
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

	public static class DefsContext extends ParserRuleContext {
		public List<Def> list = new ArrayList<Def>();
		public VarContext var;
		public StructFieldDefinitionContext structFieldDefinition;
		public StructContext struct;
		public FuncDefinitionContext funcDefinition;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<StructFieldDefinitionContext> structFieldDefinition() {
			return getRuleContexts(StructFieldDefinitionContext.class);
		}
		public StructFieldDefinitionContext structFieldDefinition(int i) {
			return getRuleContext(StructFieldDefinitionContext.class,i);
		}
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public List<FuncDefinitionContext> funcDefinition() {
			return getRuleContexts(FuncDefinitionContext.class);
		}
		public FuncDefinitionContext funcDefinition(int i) {
			return getRuleContext(FuncDefinitionContext.class,i);
		}
		public DefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defs; }
	}

	public final DefsContext defs() throws RecognitionException {
		DefsContext _localctx = new DefsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << IDENT))) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(36);
					((DefsContext)_localctx).var = var();
					 _localctx.list.add(((DefsContext)_localctx).var.ast); 
					}
					break;
				case 2:
					{
					setState(39);
					((DefsContext)_localctx).structFieldDefinition = structFieldDefinition();
					 _localctx.list.add(((DefsContext)_localctx).structFieldDefinition.ast); 
					}
					break;
				case 3:
					{
					setState(42);
					((DefsContext)_localctx).struct = struct();
					 _localctx.list.add(((DefsContext)_localctx).struct.ast); 
					}
					break;
				case 4:
					{
					setState(45);
					((DefsContext)_localctx).funcDefinition = funcDefinition();
					 _localctx.list.add(((DefsContext)_localctx).funcDefinition.ast); 
					}
					break;
				}
				}
				setState(52);
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

	public static class VarContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			((VarContext)_localctx).IDENT = match(IDENT);
			setState(55);
			match(T__1);
			setState(56);
			((VarContext)_localctx).type = type();
			setState(57);
			match(T__2);
			 ((VarContext)_localctx).ast =  new VarDefinition(((VarContext)_localctx).IDENT, ((VarContext)_localctx).type.ast); 
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

	public static class StructFieldDefinitionContext extends ParserRuleContext {
		public StructFieldDefinition ast;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructFieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldDefinition; }
	}

	public final StructFieldDefinitionContext structFieldDefinition() throws RecognitionException {
		StructFieldDefinitionContext _localctx = new StructFieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structFieldDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((StructFieldDefinitionContext)_localctx).IDENT = match(IDENT);
			setState(61);
			match(T__1);
			setState(62);
			((StructFieldDefinitionContext)_localctx).type = type();
			setState(63);
			match(T__2);
			 ((StructFieldDefinitionContext)_localctx).ast =  new StructFieldDefinition(((StructFieldDefinitionContext)_localctx).IDENT, ((StructFieldDefinitionContext)_localctx).type.ast); 
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

	public static class StructContext extends ParserRuleContext {
		public StructDefinition ast;
		public Token IDENT;
		public FieldsContext fields;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__3);
			setState(67);
			((StructContext)_localctx).IDENT = match(IDENT);
			setState(68);
			match(T__4);
			setState(69);
			((StructContext)_localctx).fields = fields();
			setState(70);
			match(T__5);
			setState(71);
			match(T__2);
			 ((StructContext)_localctx).ast =  new StructDefinition(((StructContext)_localctx).IDENT, ((StructContext)_localctx).fields.list); 
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

	public static class DefVarsContext extends ParserRuleContext {
		public List<VarDefinition> list = new ArrayList<VarDefinition>();
		public VarContext var;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public DefVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVars; }
	}

	public final DefVarsContext defVars() throws RecognitionException {
		DefVarsContext _localctx = new DefVarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(74);
				((DefVarsContext)_localctx).var = var();
				 _localctx.list.add(((DefVarsContext)_localctx).var.ast); 
				}
				}
				setState(81);
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

	public static class FuncDefinitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token IDENT;
		public ParameterContext parameter;
		public ReturnTypeContext returnType;
		public DefVarsContext defVars;
		public SentencesContext sentences;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public DefVarsContext defVars() {
			return getRuleContext(DefVarsContext.class,0);
		}
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((FuncDefinitionContext)_localctx).IDENT = match(IDENT);
			setState(83);
			match(T__6);
			setState(84);
			((FuncDefinitionContext)_localctx).parameter = parameter();
			setState(85);
			match(T__7);
			setState(86);
			((FuncDefinitionContext)_localctx).returnType = returnType();
			setState(87);
			match(T__4);
			setState(88);
			((FuncDefinitionContext)_localctx).defVars = defVars();
			setState(89);
			((FuncDefinitionContext)_localctx).sentences = sentences();
			setState(90);
			match(T__5);
			 ((FuncDefinitionContext)_localctx).ast =  new FuncDefinition(((FuncDefinitionContext)_localctx).IDENT, ((FuncDefinitionContext)_localctx).parameter.list, ((FuncDefinitionContext)_localctx).returnType.ast, ((FuncDefinitionContext)_localctx).defVars.list, ((FuncDefinitionContext)_localctx).sentences.list); 
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

	public static class FieldsContext extends ParserRuleContext {
		public List<Def> list = new ArrayList<Def>();
		public StructFieldDefinitionContext structFieldDefinition;
		public List<StructFieldDefinitionContext> structFieldDefinition() {
			return getRuleContexts(StructFieldDefinitionContext.class);
		}
		public StructFieldDefinitionContext structFieldDefinition(int i) {
			return getRuleContext(StructFieldDefinitionContext.class,i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(93);
				((FieldsContext)_localctx).structFieldDefinition = structFieldDefinition();
				 _localctx.list.add(((FieldsContext)_localctx).structFieldDefinition.ast); 
				}
				}
				setState(100);
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Token IDENT;
		public Token INT_CONSTANT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__8);
				 ((TypeContext)_localctx).ast =  new Real(); 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__9);
				 ((TypeContext)_localctx).ast =  new Entero(); 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(T__10);
				 ((TypeContext)_localctx).ast =  new Caracter(); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).ast =  new Clase(((TypeContext)_localctx).IDENT); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(T__11);
				setState(110);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(111);
				match(T__12);
				setState(112);
				((TypeContext)_localctx).type = type();
				 ((TypeContext)_localctx).ast =  new Array(((TypeContext)_localctx).type.ast,((TypeContext)_localctx).INT_CONSTANT); 
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<Expression> list = new ArrayList<Expression>();
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__35) | (1L << T__36) | (1L << IDENT) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(117);
				((ExpressionsContext)_localctx).expr = expr(0);
				 _localctx.list.add(((ExpressionsContext)_localctx).expr.ast); 
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(119);
					match(T__13);
					setState(120);
					((ExpressionsContext)_localctx).expr = expr(0);
					 _localctx.list.add(((ExpressionsContext)_localctx).expr.ast); 
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class SentencesContext extends ParserRuleContext {
		public List<Sentence> list = new ArrayList<Sentence>();
		public SentenceContext sentence;
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << IDENT) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(130);
				((SentencesContext)_localctx).sentence = sentence();
				 _localctx.list.add(((SentencesContext)_localctx).sentence.ast); 
				}
				}
				setState(137);
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

	public static class ParameterContext extends ParserRuleContext {
		public List<VarDefinition> list = new ArrayList<VarDefinition>();
		public Token IDENT;
		public TypeContext type;
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(138);
				((ParameterContext)_localctx).IDENT = match(IDENT);
				setState(139);
				match(T__1);
				setState(140);
				((ParameterContext)_localctx).type = type();
				 _localctx.list.add(new VarDefinition(((ParameterContext)_localctx).IDENT, ((ParameterContext)_localctx).type.ast)); 
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(142);
					match(T__13);
					setState(143);
					((ParameterContext)_localctx).IDENT = match(IDENT);
					setState(144);
					match(T__1);
					setState(145);
					((ParameterContext)_localctx).type = type();
					 _localctx.list.add(new VarDefinition(((ParameterContext)_localctx).IDENT, ((ParameterContext)_localctx).type.ast)); 
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class SentenceContext extends ParserRuleContext {
		public Sentence ast;
		public Token op;
		public ExprContext expr;
		public ReturnExpressionContext returnExpression;
		public Token IDENT;
		public ExpressionsContext expressions;
		public SentencesContext sentences;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public List<SentencesContext> sentences() {
			return getRuleContexts(SentencesContext.class);
		}
		public SentencesContext sentences(int i) {
			return getRuleContext(SentencesContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentence);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((SentenceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
					((SentenceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				((SentenceContext)_localctx).expr = expr(0);
				setState(157);
				match(T__2);
				 ((SentenceContext)_localctx).ast =  new Print(((SentenceContext)_localctx).op, ((SentenceContext)_localctx).expr.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__17);
				setState(161);
				((SentenceContext)_localctx).returnExpression = returnExpression();
				setState(162);
				match(T__2);
				 ((SentenceContext)_localctx).ast =  new Return(((SentenceContext)_localctx).returnExpression.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(T__18);
				setState(166);
				((SentenceContext)_localctx).expr = expr(0);
				setState(167);
				match(T__2);
				 ((SentenceContext)_localctx).ast =  new Read(((SentenceContext)_localctx).expr.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				((SentenceContext)_localctx).IDENT = match(IDENT);
				setState(171);
				match(T__6);
				setState(172);
				((SentenceContext)_localctx).expressions = expressions();
				setState(173);
				match(T__7);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(174);
					match(T__2);
					}
				}

				 ((SentenceContext)_localctx).ast =  new Invoca(((SentenceContext)_localctx).IDENT,((SentenceContext)_localctx).expressions.list); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				expr(0);
				setState(180);
				match(T__19);
				setState(181);
				expr(0);
				setState(182);
				match(T__2);
				 ((SentenceContext)_localctx).ast =  new Assignment(_localctx.expr(0),_localctx.expr(1)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				match(T__20);
				setState(186);
				match(T__6);
				setState(187);
				((SentenceContext)_localctx).expr = expr(0);
				setState(188);
				match(T__7);
				setState(189);
				match(T__4);
				setState(190);
				sentences();
				setState(191);
				match(T__5);
				setState(192);
				match(T__21);
				setState(193);
				match(T__4);
				setState(194);
				sentences();
				setState(195);
				match(T__5);
				 ((SentenceContext)_localctx).ast =  new Ifelse(((SentenceContext)_localctx).expr.ast,_localctx.sentences(0).list,_localctx.sentences(1).list); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				match(T__20);
				setState(199);
				match(T__6);
				setState(200);
				((SentenceContext)_localctx).expr = expr(0);
				setState(201);
				match(T__7);
				setState(202);
				match(T__4);
				setState(203);
				sentences();
				setState(204);
				match(T__5);
				 ((SentenceContext)_localctx).ast =  new Ifelse(((SentenceContext)_localctx).expr.ast,_localctx.sentences(0).list,null); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				match(T__22);
				setState(208);
				match(T__6);
				setState(209);
				((SentenceContext)_localctx).expr = expr(0);
				setState(210);
				match(T__7);
				setState(211);
				match(T__4);
				setState(212);
				((SentenceContext)_localctx).sentences = sentences();
				setState(213);
				match(T__5);
				 ((SentenceContext)_localctx).ast =  new While(((SentenceContext)_localctx).expr.ast,((SentenceContext)_localctx).sentences.list); 
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public Type ast;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnType);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__1);
				setState(219);
				((ReturnTypeContext)_localctx).type = type();
				 ((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).type.ast; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				 ((ReturnTypeContext)_localctx).ast =  new VoidType(); 
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

	public static class ReturnExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnExpression);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__35:
			case T__36:
			case IDENT:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				((ReturnExpressionContext)_localctx).expr = expr(0);
				 ((ReturnExpressionContext)_localctx).ast =  ((ReturnExpressionContext)_localctx).expr.ast; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				 ((ReturnExpressionContext)_localctx).ast =  new ReturnVoidExpression(); 
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

	public static class ExprContext extends ParserRuleContext {
		public Expression ast;
		public ExprContext expr;
		public Token IDENT;
		public ExpressionsContext expressions;
		public TypeContext type;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(GrammarParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(GrammarParser.INT_CONSTANT, i);
		}
		public TerminalNode REAL_CONSTANT() { return getToken(GrammarParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(GrammarParser.CHAR_CONSTANT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(232);
				match(T__6);
				setState(233);
				((ExprContext)_localctx).expr = expr(0);
				setState(234);
				match(T__7);
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast; 
				}
				break;
			case 2:
				{
				setState(237);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(238);
				match(T__6);
				setState(239);
				((ExprContext)_localctx).expressions = expressions();
				setState(240);
				match(T__7);
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(241);
					match(T__2);
					}
					break;
				}
				 ((ExprContext)_localctx).ast =  new Invoca(((ExprContext)_localctx).IDENT,((ExprContext)_localctx).expressions.list); 
				}
				break;
			case 3:
				{
				setState(246);
				match(T__35);
				setState(247);
				((ExprContext)_localctx).expr = expr(8);
				 ((ExprContext)_localctx).ast =  new Negacion(((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 4:
				{
				setState(250);
				match(T__36);
				setState(251);
				match(T__29);
				setState(252);
				((ExprContext)_localctx).type = type();
				setState(253);
				match(T__27);
				setState(254);
				match(T__6);
				setState(255);
				((ExprContext)_localctx).expr = expr(0);
				setState(256);
				match(T__7);
				 ((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).type.ast,((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 5:
				{
				setState(259);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Var(((ExprContext)_localctx).IDENT); 
				}
				break;
			case 6:
				{
				setState(262); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(261);
						((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(264); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 ((ExprContext)_localctx).ast =  new LitEnt(((ExprContext)_localctx).INT_CONSTANT); 
				}
				break;
			case 7:
				{
				setState(267);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExprContext)_localctx).ast =  new LitReal(((ExprContext)_localctx).REAL_CONSTANT); 
				}
				break;
			case 8:
				{
				setState(269);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExprContext)_localctx).ast =  new LitChar(((ExprContext)_localctx).CHAR_CONSTANT); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(274);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(275);
						((ExprContext)_localctx).expr = expr(13);
						 ((ExprContext)_localctx).ast =  new Aritmetica(_localctx.expr(0), ((ExprContext)_localctx).op, _localctx.expr(1)); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(279);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(280);
						((ExprContext)_localctx).expr = expr(12);
						 ((ExprContext)_localctx).ast =  new Aritmetica(_localctx.expr(0), ((ExprContext)_localctx).op, _localctx.expr(1)); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(284);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(285);
						((ExprContext)_localctx).expr = expr(11);
						 ((ExprContext)_localctx).ast =  new Comparacion(_localctx.expr(0), ((ExprContext)_localctx).op, _localctx.expr(1)); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(289);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(290);
						((ExprContext)_localctx).expr = expr(10);
						 ((ExprContext)_localctx).ast =  new Logica(_localctx.expr(0), ((ExprContext)_localctx).op, _localctx.expr(1)); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(298); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(294);
								match(T__11);
								setState(295);
								((ExprContext)_localctx).expr = expr(0);
								setState(296);
								match(T__12);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(300); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						 ((ExprContext)_localctx).ast =  new Iarray(_localctx.expr(0), _localctx.expr(1)); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(305);
						match(T__37);
						setState(306);
						((ExprContext)_localctx).IDENT = match(IDENT);
						 ((ExprContext)_localctx).ast =  new StructField(_localctx.expr(0), ((ExprContext)_localctx).IDENT); 
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u013c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63\n\3\f"+
		"\3\16\3\66\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tc\n\t\f\t\16\t"+
		"f\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nv\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13~\n\13\f\13\16\13\u0081\13\13\5\13"+
		"\u0083\n\13\3\f\3\f\3\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0097\n\r\f\r\16\r\u009a\13\r\5\r\u009c"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b2\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00db\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00e2\n\17\3\20\3\20\3\20\3\20\5\20\u00e8\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f5\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\6\21\u0109\n\21\r\21\16\21\u010a\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0112\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\6\21\u012d\n\21\r\21\16\21\u012e\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0137"+
		"\n\21\f\21\16\21\u013a\13\21\3\21\2\3 \22\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \2\7\3\2\21\23\3\2\32\33\3\2\34\35\3\2\36#\3\2$%\2\u0154\2\""+
		"\3\2\2\2\4\64\3\2\2\2\6\67\3\2\2\2\b>\3\2\2\2\nD\3\2\2\2\fQ\3\2\2\2\16"+
		"T\3\2\2\2\20d\3\2\2\2\22u\3\2\2\2\24\u0082\3\2\2\2\26\u0089\3\2\2\2\30"+
		"\u009b\3\2\2\2\32\u00da\3\2\2\2\34\u00e1\3\2\2\2\36\u00e7\3\2\2\2 \u0111"+
		"\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$%\b\2\1\2%\3\3\2\2\2&\'\5\6\4\2\'(\b\3\1"+
		"\2(\63\3\2\2\2)*\5\b\5\2*+\b\3\1\2+\63\3\2\2\2,-\5\n\6\2-.\b\3\1\2.\63"+
		"\3\2\2\2/\60\5\16\b\2\60\61\b\3\1\2\61\63\3\2\2\2\62&\3\2\2\2\62)\3\2"+
		"\2\2\62,\3\2\2\2\62/\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\5\3\2\2\2\66\64\3\2\2\2\678\7\3\2\289\7)\2\29:\7\4\2\2:;\5\22\n\2"+
		";<\7\5\2\2<=\b\4\1\2=\7\3\2\2\2>?\7)\2\2?@\7\4\2\2@A\5\22\n\2AB\7\5\2"+
		"\2BC\b\5\1\2C\t\3\2\2\2DE\7\6\2\2EF\7)\2\2FG\7\7\2\2GH\5\20\t\2HI\7\b"+
		"\2\2IJ\7\5\2\2JK\b\6\1\2K\13\3\2\2\2LM\5\6\4\2MN\b\7\1\2NP\3\2\2\2OL\3"+
		"\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\r\3\2\2\2SQ\3\2\2\2TU\7)\2\2UV\7"+
		"\t\2\2VW\5\30\r\2WX\7\n\2\2XY\5\34\17\2YZ\7\7\2\2Z[\5\f\7\2[\\\5\26\f"+
		"\2\\]\7\b\2\2]^\b\b\1\2^\17\3\2\2\2_`\5\b\5\2`a\b\t\1\2ac\3\2\2\2b_\3"+
		"\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\21\3\2\2\2fd\3\2\2\2gh\7\13\2\2"+
		"hv\b\n\1\2ij\7\f\2\2jv\b\n\1\2kl\7\r\2\2lv\b\n\1\2mn\7)\2\2nv\b\n\1\2"+
		"op\7\16\2\2pq\7*\2\2qr\7\17\2\2rs\5\22\n\2st\b\n\1\2tv\3\2\2\2ug\3\2\2"+
		"\2ui\3\2\2\2uk\3\2\2\2um\3\2\2\2uo\3\2\2\2v\23\3\2\2\2wx\5 \21\2x\177"+
		"\b\13\1\2yz\7\20\2\2z{\5 \21\2{|\b\13\1\2|~\3\2\2\2}y\3\2\2\2~\u0081\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0082w\3\2\2\2\u0082\u0083\3\2\2\2\u0083\25\3\2\2\2\u0084\u0085"+
		"\5\32\16\2\u0085\u0086\b\f\1\2\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2"+
		"\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\27"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7)\2\2\u008d\u008e\7\4\2\2\u008e"+
		"\u008f\5\22\n\2\u008f\u0098\b\r\1\2\u0090\u0091\7\20\2\2\u0091\u0092\7"+
		")\2\2\u0092\u0093\7\4\2\2\u0093\u0094\5\22\n\2\u0094\u0095\b\r\1\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0090\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u008c\3\2\2\2\u009b\u009c\3\2\2\2\u009c\31\3\2\2\2\u009d\u009e\t\2\2"+
		"\2\u009e\u009f\5 \21\2\u009f\u00a0\7\5\2\2\u00a0\u00a1\b\16\1\2\u00a1"+
		"\u00db\3\2\2\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\5\36\20\2\u00a4\u00a5"+
		"\7\5\2\2\u00a5\u00a6\b\16\1\2\u00a6\u00db\3\2\2\2\u00a7\u00a8\7\25\2\2"+
		"\u00a8\u00a9\5 \21\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\b\16\1\2\u00ab\u00db"+
		"\3\2\2\2\u00ac\u00ad\7)\2\2\u00ad\u00ae\7\t\2\2\u00ae\u00af\5\24\13\2"+
		"\u00af\u00b1\7\n\2\2\u00b0\u00b2\7\5\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\16\1\2\u00b4\u00db\3\2\2\2"+
		"\u00b5\u00b6\5 \21\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8\5 \21\2\u00b8\u00b9"+
		"\7\5\2\2\u00b9\u00ba\b\16\1\2\u00ba\u00db\3\2\2\2\u00bb\u00bc\7\27\2\2"+
		"\u00bc\u00bd\7\t\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\7\n\2\2\u00bf\u00c0"+
		"\7\7\2\2\u00c0\u00c1\5\26\f\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\7\30\2\2"+
		"\u00c3\u00c4\7\7\2\2\u00c4\u00c5\5\26\f\2\u00c5\u00c6\7\b\2\2\u00c6\u00c7"+
		"\b\16\1\2\u00c7\u00db\3\2\2\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca\7\t\2\2"+
		"\u00ca\u00cb\5 \21\2\u00cb\u00cc\7\n\2\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce"+
		"\5\26\f\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\b\16\1\2\u00d0\u00db\3\2\2\2"+
		"\u00d1\u00d2\7\31\2\2\u00d2\u00d3\7\t\2\2\u00d3\u00d4\5 \21\2\u00d4\u00d5"+
		"\7\n\2\2\u00d5\u00d6\7\7\2\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8\7\b\2\2"+
		"\u00d8\u00d9\b\16\1\2\u00d9\u00db\3\2\2\2\u00da\u009d\3\2\2\2\u00da\u00a2"+
		"\3\2\2\2\u00da\u00a7\3\2\2\2\u00da\u00ac\3\2\2\2\u00da\u00b5\3\2\2\2\u00da"+
		"\u00bb\3\2\2\2\u00da\u00c8\3\2\2\2\u00da\u00d1\3\2\2\2\u00db\33\3\2\2"+
		"\2\u00dc\u00dd\7\4\2\2\u00dd\u00de\5\22\n\2\u00de\u00df\b\17\1\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00e2\b\17\1\2\u00e1\u00dc\3\2\2\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\35\3\2\2\2\u00e3\u00e4\5 \21\2\u00e4\u00e5\b\20\1\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e8\b\20\1\2\u00e7\u00e3\3\2\2\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\37\3\2\2\2\u00e9\u00ea\b\21\1\2\u00ea\u00eb\7\t\2\2\u00eb"+
		"\u00ec\5 \21\2\u00ec\u00ed\7\n\2\2\u00ed\u00ee\b\21\1\2\u00ee\u0112\3"+
		"\2\2\2\u00ef\u00f0\7)\2\2\u00f0\u00f1\7\t\2\2\u00f1\u00f2\5\24\13\2\u00f2"+
		"\u00f4\7\n\2\2\u00f3\u00f5\7\5\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\21\1\2\u00f7\u0112\3\2\2\2\u00f8"+
		"\u00f9\7&\2\2\u00f9\u00fa\5 \21\n\u00fa\u00fb\b\21\1\2\u00fb\u0112\3\2"+
		"\2\2\u00fc\u00fd\7\'\2\2\u00fd\u00fe\7 \2\2\u00fe\u00ff\5\22\n\2\u00ff"+
		"\u0100\7\36\2\2\u0100\u0101\7\t\2\2\u0101\u0102\5 \21\2\u0102\u0103\7"+
		"\n\2\2\u0103\u0104\b\21\1\2\u0104\u0112\3\2\2\2\u0105\u0106\7)\2\2\u0106"+
		"\u0112\b\21\1\2\u0107\u0109\7*\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u0112\b\21\1\2\u010d\u010e\7+\2\2\u010e\u0112\b\21\1\2\u010f\u0110\7"+
		",\2\2\u0110\u0112\b\21\1\2\u0111\u00e9\3\2\2\2\u0111\u00ef\3\2\2\2\u0111"+
		"\u00f8\3\2\2\2\u0111\u00fc\3\2\2\2\u0111\u0105\3\2\2\2\u0111\u0108\3\2"+
		"\2\2\u0111\u010d\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0138\3\2\2\2\u0113"+
		"\u0114\f\16\2\2\u0114\u0115\t\3\2\2\u0115\u0116\5 \21\17\u0116\u0117\b"+
		"\21\1\2\u0117\u0137\3\2\2\2\u0118\u0119\f\r\2\2\u0119\u011a\t\4\2\2\u011a"+
		"\u011b\5 \21\16\u011b\u011c\b\21\1\2\u011c\u0137\3\2\2\2\u011d\u011e\f"+
		"\f\2\2\u011e\u011f\t\5\2\2\u011f\u0120\5 \21\r\u0120\u0121\b\21\1\2\u0121"+
		"\u0137\3\2\2\2\u0122\u0123\f\13\2\2\u0123\u0124\t\6\2\2\u0124\u0125\5"+
		" \21\f\u0125\u0126\b\21\1\2\u0126\u0137\3\2\2\2\u0127\u012c\f\b\2\2\u0128"+
		"\u0129\7\16\2\2\u0129\u012a\5 \21\2\u012a\u012b\7\17\2\2\u012b\u012d\3"+
		"\2\2\2\u012c\u0128\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b\21\1\2\u0131\u0137\3"+
		"\2\2\2\u0132\u0133\f\7\2\2\u0133\u0134\7(\2\2\u0134\u0135\7)\2\2\u0135"+
		"\u0137\b\21\1\2\u0136\u0113\3\2\2\2\u0136\u0118\3\2\2\2\u0136\u011d\3"+
		"\2\2\2\u0136\u0122\3\2\2\2\u0136\u0127\3\2\2\2\u0136\u0132\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139!\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\26\62\64Qdu\177\u0082\u0089\u0098\u009b\u00b1\u00da"+
		"\u00e1\u00e7\u00f4\u010a\u0111\u012e\u0136\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}