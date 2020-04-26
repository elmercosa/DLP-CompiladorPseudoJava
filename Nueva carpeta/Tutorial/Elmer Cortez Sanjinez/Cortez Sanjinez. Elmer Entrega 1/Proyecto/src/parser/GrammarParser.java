// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;

import ast.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

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
		RULE_program = 0, RULE_defs = 1, RULE_var = 2, RULE_varLocal = 3, RULE_structFieldDefinition = 4, 
		RULE_struct = 5, RULE_defVars = 6, RULE_funcDefinition = 7, RULE_fields = 8, 
		RULE_type = 9, RULE_expressions = 10, RULE_sentences = 11, RULE_parameter = 12, 
		RULE_sentence = 13, RULE_returnType = 14, RULE_returnExpression = 15, 
		RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defs", "var", "varLocal", "structFieldDefinition", "struct", 
			"defVars", "funcDefinition", "fields", "type", "expressions", "sentences", 
			"parameter", "sentence", "returnType", "returnExpression", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "';'", "'struct'", "'{'", "'}'", "'('", "')'", 
			"'float'", "'int'", "'char'", "'['", "']'", "','", "'print'", "'printsp'", 
			"'println'", "'return'", "'read'", "'='", "'if'", "'else'", "'while'", 
			"'.'", "'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'<'", "'<='", "'=='", 
			"'!='", "'&&'", "'||'", "'!'", "'cast'"
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
			setState(34);
			((ProgramContext)_localctx).defs = defs();
			setState(35);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << IDENT))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(38);
					((DefsContext)_localctx).var = var();
					 _localctx.list.add(((DefsContext)_localctx).var.ast); 
					}
					break;
				case 2:
					{
					setState(41);
					((DefsContext)_localctx).structFieldDefinition = structFieldDefinition();
					 _localctx.list.add(((DefsContext)_localctx).structFieldDefinition.ast); 
					}
					break;
				case 3:
					{
					setState(44);
					((DefsContext)_localctx).struct = struct();
					 _localctx.list.add(((DefsContext)_localctx).struct.ast); 
					}
					break;
				case 4:
					{
					setState(47);
					((DefsContext)_localctx).funcDefinition = funcDefinition();
					 _localctx.list.add(((DefsContext)_localctx).funcDefinition.ast); 
					}
					break;
				}
				}
				setState(54);
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
			setState(55);
			match(T__0);
			setState(56);
			((VarContext)_localctx).IDENT = match(IDENT);
			setState(57);
			match(T__1);
			setState(58);
			((VarContext)_localctx).type = type();
			setState(59);
			match(T__2);
			 ((VarContext)_localctx).ast =  new VarDefinition(((VarContext)_localctx).IDENT, ((VarContext)_localctx).type.ast, "global"); 
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

	public static class VarLocalContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varLocal; }
	}

	public final VarLocalContext varLocal() throws RecognitionException {
		VarLocalContext _localctx = new VarLocalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varLocal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(63);
			((VarLocalContext)_localctx).IDENT = match(IDENT);
			setState(64);
			match(T__1);
			setState(65);
			((VarLocalContext)_localctx).type = type();
			setState(66);
			match(T__2);
			 ((VarLocalContext)_localctx).ast =  new VarDefinition(((VarLocalContext)_localctx).IDENT, ((VarLocalContext)_localctx).type.ast, "local"); 
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
		enterRule(_localctx, 8, RULE_structFieldDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((StructFieldDefinitionContext)_localctx).IDENT = match(IDENT);
			setState(70);
			match(T__1);
			setState(71);
			((StructFieldDefinitionContext)_localctx).type = type();
			setState(72);
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
		enterRule(_localctx, 10, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__3);
			setState(76);
			((StructContext)_localctx).IDENT = match(IDENT);
			setState(77);
			match(T__4);
			setState(78);
			((StructContext)_localctx).fields = fields();
			setState(79);
			match(T__5);
			setState(80);
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
		public VarLocalContext varLocal;
		public List<VarLocalContext> varLocal() {
			return getRuleContexts(VarLocalContext.class);
		}
		public VarLocalContext varLocal(int i) {
			return getRuleContext(VarLocalContext.class,i);
		}
		public DefVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVars; }
	}

	public final DefVarsContext defVars() throws RecognitionException {
		DefVarsContext _localctx = new DefVarsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(83);
				((DefVarsContext)_localctx).varLocal = varLocal();
				 _localctx.list.add(((DefVarsContext)_localctx).varLocal.ast); 
				}
				}
				setState(90);
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
		enterRule(_localctx, 14, RULE_funcDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((FuncDefinitionContext)_localctx).IDENT = match(IDENT);
			setState(92);
			match(T__6);
			setState(93);
			((FuncDefinitionContext)_localctx).parameter = parameter();
			setState(94);
			match(T__7);
			setState(95);
			((FuncDefinitionContext)_localctx).returnType = returnType();
			setState(96);
			match(T__4);
			setState(97);
			((FuncDefinitionContext)_localctx).defVars = defVars();
			setState(98);
			((FuncDefinitionContext)_localctx).sentences = sentences();
			setState(99);
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
		public List<StructFieldDefinition> list = new ArrayList<StructFieldDefinition>();
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
		enterRule(_localctx, 16, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(102);
				((FieldsContext)_localctx).structFieldDefinition = structFieldDefinition();
				 _localctx.list.add(((FieldsContext)_localctx).structFieldDefinition.ast); 
				}
				}
				setState(109);
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
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__8);
				 ((TypeContext)_localctx).ast =  new Real(); 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T__9);
				 ((TypeContext)_localctx).ast =  new Entero(); 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__10);
				 ((TypeContext)_localctx).ast =  new Caracter(); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).ast =  new Clase(((TypeContext)_localctx).IDENT); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(T__11);
				setState(119);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(120);
				match(T__12);
				setState(121);
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
		enterRule(_localctx, 20, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__36) | (1L << T__37) | (1L << IDENT) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(126);
				((ExpressionsContext)_localctx).expr = expr(0);
				 _localctx.list.add(((ExpressionsContext)_localctx).expr.ast); 
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(128);
					match(T__13);
					setState(129);
					((ExpressionsContext)_localctx).expr = expr(0);
					 _localctx.list.add(((ExpressionsContext)_localctx).expr.ast); 
					}
					}
					setState(136);
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
		enterRule(_localctx, 22, RULE_sentences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__36) | (1L << T__37) | (1L << IDENT) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(139);
				((SentencesContext)_localctx).sentence = sentence();
				 _localctx.list.add(((SentencesContext)_localctx).sentence.ast); 
				}
				}
				setState(146);
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
		enterRule(_localctx, 24, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(147);
				((ParameterContext)_localctx).IDENT = match(IDENT);
				setState(148);
				match(T__1);
				setState(149);
				((ParameterContext)_localctx).type = type();
				 _localctx.list.add(new VarDefinition(((ParameterContext)_localctx).IDENT, ((ParameterContext)_localctx).type.ast,"param")); 
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(151);
					match(T__13);
					setState(152);
					((ParameterContext)_localctx).IDENT = match(IDENT);
					setState(153);
					match(T__1);
					setState(154);
					((ParameterContext)_localctx).type = type();
					 _localctx.list.add(new VarDefinition(((ParameterContext)_localctx).IDENT, ((ParameterContext)_localctx).type.ast,"param")); 
					}
					}
					setState(161);
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
		enterRule(_localctx, 26, RULE_sentence);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
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
				setState(165);
				((SentenceContext)_localctx).expr = expr(0);
				setState(166);
				match(T__2);
				 ((SentenceContext)_localctx).ast =  new Print(((SentenceContext)_localctx).op, ((SentenceContext)_localctx).expr.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__17);
				setState(170);
				((SentenceContext)_localctx).returnExpression = returnExpression();
				setState(171);
				match(T__2);
				 ((SentenceContext)_localctx).ast =  new Return(((SentenceContext)_localctx).returnExpression.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(T__18);
				setState(175);
				((SentenceContext)_localctx).expr = expr(0);
				setState(176);
				match(T__2);
				 ((SentenceContext)_localctx).ast =  new Read(((SentenceContext)_localctx).expr.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				((SentenceContext)_localctx).IDENT = match(IDENT);
				setState(180);
				match(T__6);
				setState(181);
				((SentenceContext)_localctx).expressions = expressions();
				setState(182);
				match(T__7);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(183);
					match(T__2);
					}
				}

				 ((SentenceContext)_localctx).ast =  new Invoca(((SentenceContext)_localctx).IDENT,((SentenceContext)_localctx).expressions.list); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				expr(0);
				setState(189);
				match(T__19);
				setState(190);
				expr(0);
				setState(191);
				match(T__2);
				 ((SentenceContext)_localctx).ast =  new Assignment(_localctx.expr(0),_localctx.expr(1)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(T__20);
				setState(195);
				match(T__6);
				setState(196);
				((SentenceContext)_localctx).expr = expr(0);
				setState(197);
				match(T__7);
				setState(198);
				match(T__4);
				setState(199);
				sentences();
				setState(200);
				match(T__5);
				setState(201);
				match(T__21);
				setState(202);
				match(T__4);
				setState(203);
				sentences();
				setState(204);
				match(T__5);
				 ((SentenceContext)_localctx).ast =  new Ifelse(((SentenceContext)_localctx).expr.ast,_localctx.sentences(0).list,_localctx.sentences(1).list); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				match(T__20);
				setState(208);
				match(T__6);
				setState(209);
				((SentenceContext)_localctx).expr = expr(0);
				setState(210);
				match(T__7);
				setState(211);
				match(T__4);
				setState(212);
				sentences();
				setState(213);
				match(T__5);
				 ((SentenceContext)_localctx).ast =  new Ifelse(((SentenceContext)_localctx).expr.ast,_localctx.sentences(0).list,null); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(216);
				match(T__22);
				setState(217);
				match(T__6);
				setState(218);
				((SentenceContext)_localctx).expr = expr(0);
				setState(219);
				match(T__7);
				setState(220);
				match(T__4);
				setState(221);
				((SentenceContext)_localctx).sentences = sentences();
				setState(222);
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
		enterRule(_localctx, 28, RULE_returnType);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__1);
				setState(228);
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
		enterRule(_localctx, 30, RULE_returnExpression);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__36:
			case T__37:
			case IDENT:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(241);
				match(T__6);
				setState(242);
				((ExprContext)_localctx).expr = expr(0);
				setState(243);
				match(T__7);
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast; 
				}
				break;
			case 2:
				{
				setState(246);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(247);
				match(T__6);
				setState(248);
				((ExprContext)_localctx).expressions = expressions();
				setState(249);
				match(T__7);
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(250);
					match(T__2);
					}
					break;
				}
				 ((ExprContext)_localctx).ast =  new Invoca(((ExprContext)_localctx).IDENT,((ExprContext)_localctx).expressions.list); 
				}
				break;
			case 3:
				{
				setState(255);
				match(T__36);
				setState(256);
				((ExprContext)_localctx).expr = expr(7);
				 ((ExprContext)_localctx).ast =  new Negacion(((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 4:
				{
				setState(259);
				match(T__37);
				setState(260);
				match(T__30);
				setState(261);
				((ExprContext)_localctx).type = type();
				setState(262);
				match(T__28);
				setState(263);
				match(T__6);
				setState(264);
				((ExprContext)_localctx).expr = expr(0);
				setState(265);
				match(T__7);
				 ((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).type.ast,((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 5:
				{
				setState(268);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Var(((ExprContext)_localctx).IDENT); 
				}
				break;
			case 6:
				{
				setState(271); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(270);
						((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(273); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 ((ExprContext)_localctx).ast =  new LitEnt(((ExprContext)_localctx).INT_CONSTANT); 
				}
				break;
			case 7:
				{
				setState(276);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExprContext)_localctx).ast =  new LitReal(((ExprContext)_localctx).REAL_CONSTANT); 
				}
				break;
			case 8:
				{
				setState(278);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExprContext)_localctx).ast =  new LitChar(((ExprContext)_localctx).CHAR_CONSTANT); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(283);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(284);
						((ExprContext)_localctx).expr = expr(12);
						 ((ExprContext)_localctx).ast =  new Aritmetica(_localctx.expr(0), ((ExprContext)_localctx).op, _localctx.expr(1)); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(288);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(289);
						((ExprContext)_localctx).expr = expr(11);
						 ((ExprContext)_localctx).ast =  new Aritmetica(_localctx.expr(0), ((ExprContext)_localctx).op, _localctx.expr(1)); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(293);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(294);
						((ExprContext)_localctx).expr = expr(10);
						 ((ExprContext)_localctx).ast =  new Comparacion(_localctx.expr(0), ((ExprContext)_localctx).op, _localctx.expr(1)); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(298);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(299);
						((ExprContext)_localctx).expr = expr(9);
						 ((ExprContext)_localctx).ast =  new Logica(_localctx.expr(0), ((ExprContext)_localctx).op, _localctx.expr(1)); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(303);
						match(T__23);
						setState(304);
						((ExprContext)_localctx).IDENT = match(IDENT);
						 ((ExprContext)_localctx).ast =  new StructField(_localctx.expr(0), ((ExprContext)_localctx).IDENT); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(311); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(307);
								match(T__11);
								setState(308);
								((ExprContext)_localctx).expr = expr(0);
								setState(309);
								match(T__12);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(313); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						 ((ExprContext)_localctx).ast =  new Iarray(_localctx.expr(0), _localctx.expr(1)); 
						}
						break;
					}
					} 
				}
				setState(321);
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
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0145\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\65"+
		"\n\3\f\3\16\38\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\7\nl\n\n\f\n\16\no\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\5\f\u008c\n\f\3\r\3\r\3\r\7"+
		"\r\u0091\n\r\f\r\16\r\u0094\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\5\16\u00a5\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bb\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e4\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00eb\n\20\3\21\3\21\3\21\3\21\5\21\u00f1\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fe\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\6\22\u0112\n\22\r\22\16\22\u0113\3\22\3\22\3\22\3\22\3\22\5\22\u011b"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\6\22\u013a\n\22\r\22\16\22\u013b\3\22\3\22\7\22\u0140\n\22"+
		"\f\22\16\22\u0143\13\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\7\3\2\21\23\3\2\33\34\3\2\35\36\3\2\37$\3\2%&\2\u015c\2$\3"+
		"\2\2\2\4\66\3\2\2\2\69\3\2\2\2\b@\3\2\2\2\nG\3\2\2\2\fM\3\2\2\2\16Z\3"+
		"\2\2\2\20]\3\2\2\2\22m\3\2\2\2\24~\3\2\2\2\26\u008b\3\2\2\2\30\u0092\3"+
		"\2\2\2\32\u00a4\3\2\2\2\34\u00e3\3\2\2\2\36\u00ea\3\2\2\2 \u00f0\3\2\2"+
		"\2\"\u011a\3\2\2\2$%\5\4\3\2%&\7\2\2\3&\'\b\2\1\2\'\3\3\2\2\2()\5\6\4"+
		"\2)*\b\3\1\2*\65\3\2\2\2+,\5\n\6\2,-\b\3\1\2-\65\3\2\2\2./\5\f\7\2/\60"+
		"\b\3\1\2\60\65\3\2\2\2\61\62\5\20\t\2\62\63\b\3\1\2\63\65\3\2\2\2\64("+
		"\3\2\2\2\64+\3\2\2\2\64.\3\2\2\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2"+
		"\2\66\67\3\2\2\2\67\5\3\2\2\28\66\3\2\2\29:\7\3\2\2:;\7)\2\2;<\7\4\2\2"+
		"<=\5\24\13\2=>\7\5\2\2>?\b\4\1\2?\7\3\2\2\2@A\7\3\2\2AB\7)\2\2BC\7\4\2"+
		"\2CD\5\24\13\2DE\7\5\2\2EF\b\5\1\2F\t\3\2\2\2GH\7)\2\2HI\7\4\2\2IJ\5\24"+
		"\13\2JK\7\5\2\2KL\b\6\1\2L\13\3\2\2\2MN\7\6\2\2NO\7)\2\2OP\7\7\2\2PQ\5"+
		"\22\n\2QR\7\b\2\2RS\7\5\2\2ST\b\7\1\2T\r\3\2\2\2UV\5\b\5\2VW\b\b\1\2W"+
		"Y\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\17\3\2\2\2\\Z\3\2"+
		"\2\2]^\7)\2\2^_\7\t\2\2_`\5\32\16\2`a\7\n\2\2ab\5\36\20\2bc\7\7\2\2cd"+
		"\5\16\b\2de\5\30\r\2ef\7\b\2\2fg\b\t\1\2g\21\3\2\2\2hi\5\n\6\2ij\b\n\1"+
		"\2jl\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\23\3\2\2\2om\3\2"+
		"\2\2pq\7\13\2\2q\177\b\13\1\2rs\7\f\2\2s\177\b\13\1\2tu\7\r\2\2u\177\b"+
		"\13\1\2vw\7)\2\2w\177\b\13\1\2xy\7\16\2\2yz\7*\2\2z{\7\17\2\2{|\5\24\13"+
		"\2|}\b\13\1\2}\177\3\2\2\2~p\3\2\2\2~r\3\2\2\2~t\3\2\2\2~v\3\2\2\2~x\3"+
		"\2\2\2\177\25\3\2\2\2\u0080\u0081\5\"\22\2\u0081\u0088\b\f\1\2\u0082\u0083"+
		"\7\20\2\2\u0083\u0084\5\"\22\2\u0084\u0085\b\f\1\2\u0085\u0087\3\2\2\2"+
		"\u0086\u0082\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0080\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d\u008e\5\34\17\2\u008e\u008f\b\r"+
		"\1\2\u008f\u0091\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\31\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\u0095\u0096\7)\2\2\u0096\u0097\7\4\2\2\u0097\u0098\5\24\13\2\u0098"+
		"\u00a1\b\16\1\2\u0099\u009a\7\20\2\2\u009a\u009b\7)\2\2\u009b\u009c\7"+
		"\4\2\2\u009c\u009d\5\24\13\2\u009d\u009e\b\16\1\2\u009e\u00a0\3\2\2\2"+
		"\u009f\u0099\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\33\3\2\2\2\u00a6\u00a7\t\2\2\2\u00a7\u00a8\5\"\22"+
		"\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\b\17\1\2\u00aa\u00e4\3\2\2\2\u00ab"+
		"\u00ac\7\24\2\2\u00ac\u00ad\5 \21\2\u00ad\u00ae\7\5\2\2\u00ae\u00af\b"+
		"\17\1\2\u00af\u00e4\3\2\2\2\u00b0\u00b1\7\25\2\2\u00b1\u00b2\5\"\22\2"+
		"\u00b2\u00b3\7\5\2\2\u00b3\u00b4\b\17\1\2\u00b4\u00e4\3\2\2\2\u00b5\u00b6"+
		"\7)\2\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8\5\26\f\2\u00b8\u00ba\7\n\2\2\u00b9"+
		"\u00bb\7\5\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\b\17\1\2\u00bd\u00e4\3\2\2\2\u00be\u00bf\5\"\22\2\u00bf"+
		"\u00c0\7\26\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7\5\2\2\u00c2\u00c3\b"+
		"\17\1\2\u00c3\u00e4\3\2\2\2\u00c4\u00c5\7\27\2\2\u00c5\u00c6\7\t\2\2\u00c6"+
		"\u00c7\5\"\22\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\7\7\2\2\u00c9\u00ca\5"+
		"\30\r\2\u00ca\u00cb\7\b\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\7\7\2\2\u00cd"+
		"\u00ce\5\30\r\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\b\17\1\2\u00d0\u00e4\3"+
		"\2\2\2\u00d1\u00d2\7\27\2\2\u00d2\u00d3\7\t\2\2\u00d3\u00d4\5\"\22\2\u00d4"+
		"\u00d5\7\n\2\2\u00d5\u00d6\7\7\2\2\u00d6\u00d7\5\30\r\2\u00d7\u00d8\7"+
		"\b\2\2\u00d8\u00d9\b\17\1\2\u00d9\u00e4\3\2\2\2\u00da\u00db\7\31\2\2\u00db"+
		"\u00dc\7\t\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\n\2\2\u00de\u00df\7"+
		"\7\2\2\u00df\u00e0\5\30\r\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2\b\17\1\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00a6\3\2\2\2\u00e3\u00ab\3\2\2\2\u00e3\u00b0\3\2"+
		"\2\2\u00e3\u00b5\3\2\2\2\u00e3\u00be\3\2\2\2\u00e3\u00c4\3\2\2\2\u00e3"+
		"\u00d1\3\2\2\2\u00e3\u00da\3\2\2\2\u00e4\35\3\2\2\2\u00e5\u00e6\7\4\2"+
		"\2\u00e6\u00e7\5\24\13\2\u00e7\u00e8\b\20\1\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00eb\b\20\1\2\u00ea\u00e5\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\37\3\2\2"+
		"\2\u00ec\u00ed\5\"\22\2\u00ed\u00ee\b\21\1\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00f1\b\21\1\2\u00f0\u00ec\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1!\3\2\2\2"+
		"\u00f2\u00f3\b\22\1\2\u00f3\u00f4\7\t\2\2\u00f4\u00f5\5\"\22\2\u00f5\u00f6"+
		"\7\n\2\2\u00f6\u00f7\b\22\1\2\u00f7\u011b\3\2\2\2\u00f8\u00f9\7)\2\2\u00f9"+
		"\u00fa\7\t\2\2\u00fa\u00fb\5\26\f\2\u00fb\u00fd\7\n\2\2\u00fc\u00fe\7"+
		"\5\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\b\22\1\2\u0100\u011b\3\2\2\2\u0101\u0102\7\'\2\2\u0102\u0103\5"+
		"\"\22\t\u0103\u0104\b\22\1\2\u0104\u011b\3\2\2\2\u0105\u0106\7(\2\2\u0106"+
		"\u0107\7!\2\2\u0107\u0108\5\24\13\2\u0108\u0109\7\37\2\2\u0109\u010a\7"+
		"\t\2\2\u010a\u010b\5\"\22\2\u010b\u010c\7\n\2\2\u010c\u010d\b\22\1\2\u010d"+
		"\u011b\3\2\2\2\u010e\u010f\7)\2\2\u010f\u011b\b\22\1\2\u0110\u0112\7*"+
		"\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011b\b\22\1\2\u0116\u0117\7"+
		"+\2\2\u0117\u011b\b\22\1\2\u0118\u0119\7,\2\2\u0119\u011b\b\22\1\2\u011a"+
		"\u00f2\3\2\2\2\u011a\u00f8\3\2\2\2\u011a\u0101\3\2\2\2\u011a\u0105\3\2"+
		"\2\2\u011a\u010e\3\2\2\2\u011a\u0111\3\2\2\2\u011a\u0116\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u0141\3\2\2\2\u011c\u011d\f\r\2\2\u011d\u011e\t\3"+
		"\2\2\u011e\u011f\5\"\22\16\u011f\u0120\b\22\1\2\u0120\u0140\3\2\2\2\u0121"+
		"\u0122\f\f\2\2\u0122\u0123\t\4\2\2\u0123\u0124\5\"\22\r\u0124\u0125\b"+
		"\22\1\2\u0125\u0140\3\2\2\2\u0126\u0127\f\13\2\2\u0127\u0128\t\5\2\2\u0128"+
		"\u0129\5\"\22\f\u0129\u012a\b\22\1\2\u012a\u0140\3\2\2\2\u012b\u012c\f"+
		"\n\2\2\u012c\u012d\t\6\2\2\u012d\u012e\5\"\22\13\u012e\u012f\b\22\1\2"+
		"\u012f\u0140\3\2\2\2\u0130\u0131\f\17\2\2\u0131\u0132\7\32\2\2\u0132\u0133"+
		"\7)\2\2\u0133\u0140\b\22\1\2\u0134\u0139\f\7\2\2\u0135\u0136\7\16\2\2"+
		"\u0136\u0137\5\"\22\2\u0137\u0138\7\17\2\2\u0138\u013a\3\2\2\2\u0139\u0135"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\b\22\1\2\u013e\u0140\3\2\2\2\u013f\u011c\3"+
		"\2\2\2\u013f\u0121\3\2\2\2\u013f\u0126\3\2\2\2\u013f\u012b\3\2\2\2\u013f"+
		"\u0130\3\2\2\2\u013f\u0134\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142#\3\2\2\2\u0143\u0141\3\2\2\2\26\64\66Z"+
		"m~\u0088\u008b\u0092\u00a1\u00a4\u00ba\u00e3\u00ea\u00f0\u00fd\u0113\u011a"+
		"\u013b\u013f\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}