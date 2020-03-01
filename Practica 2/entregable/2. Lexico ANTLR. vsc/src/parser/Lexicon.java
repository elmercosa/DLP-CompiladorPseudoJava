// Generated from src\parser\Lexicon.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexicon extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, READ=2, WRITE=3, INT=4, FLOAT=5, PCOMA=6, IGUAL=7, SUMA=8, 
		RESTA=9, IDENT=10, REAL_CONSTANT=11, INT_CONSTANT=12, WHITESPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "READ", "WRITE", "INT", "FLOAT", "PCOMA", "IGUAL", "SUMA", 
			"RESTA", "IDENT", "REAL_CONSTANT", "INT_CONSTANT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'read'", "'write'", "'int'", "'float'", "';'", "'='", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "READ", "WRITE", "INT", "FLOAT", "PCOMA", "IGUAL", "SUMA", 
			"RESTA", "IDENT", "REAL_CONSTANT", "INT_CONSTANT", "WHITESPACE"
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


	public Lexicon(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexicon.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2"+
		"%\13\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\5\2\63\n"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13U\n"+
		"\13\r\13\16\13V\3\13\7\13Z\n\13\f\13\16\13]\13\13\3\13\7\13`\n\13\f\13"+
		"\16\13c\13\13\3\13\7\13f\n\13\f\13\16\13i\13\13\3\f\6\fl\n\f\r\f\16\f"+
		"m\3\f\3\f\7\fr\n\f\f\f\16\fu\13\f\3\r\6\rx\n\r\r\r\16\ry\3\16\6\16}\n"+
		"\16\r\16\16\16~\3\16\3\16\4#.\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\""+
		"\2\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\62\3\2\2\2\5\66\3\2\2\2\7;\3\2\2"+
		"\2\tA\3\2\2\2\13E\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2"+
		"\2\25T\3\2\2\2\27k\3\2\2\2\31w\3\2\2\2\33|\3\2\2\2\35\36\7\61\2\2\36\37"+
		"\7,\2\2\37#\3\2\2\2 \"\13\2\2\2! \3\2\2\2\"%\3\2\2\2#$\3\2\2\2#!\3\2\2"+
		"\2$&\3\2\2\2%#\3\2\2\2&\'\7,\2\2\'\63\7\61\2\2()\7\61\2\2)*\7\61\2\2*"+
		".\3\2\2\2+-\13\2\2\2,+\3\2\2\2-\60\3\2\2\2./\3\2\2\2.,\3\2\2\2/\61\3\2"+
		"\2\2\60.\3\2\2\2\61\63\7\f\2\2\62\35\3\2\2\2\62(\3\2\2\2\63\64\3\2\2\2"+
		"\64\65\b\2\2\2\65\4\3\2\2\2\66\67\7t\2\2\678\7g\2\289\7c\2\29:\7f\2\2"+
		":\6\3\2\2\2;<\7y\2\2<=\7t\2\2=>\7k\2\2>?\7v\2\2?@\7g\2\2@\b\3\2\2\2AB"+
		"\7k\2\2BC\7p\2\2CD\7v\2\2D\n\3\2\2\2EF\7h\2\2FG\7n\2\2GH\7q\2\2HI\7c\2"+
		"\2IJ\7v\2\2J\f\3\2\2\2KL\7=\2\2L\16\3\2\2\2MN\7?\2\2N\20\3\2\2\2OP\7-"+
		"\2\2P\22\3\2\2\2QR\7/\2\2R\24\3\2\2\2SU\t\2\2\2TS\3\2\2\2UV\3\2\2\2VT"+
		"\3\2\2\2VW\3\2\2\2W[\3\2\2\2XZ\t\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2["+
		"\\\3\2\2\2\\a\3\2\2\2][\3\2\2\2^`\t\3\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2"+
		"\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\7a\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2"+
		"\2gh\3\2\2\2h\26\3\2\2\2ig\3\2\2\2jl\t\3\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2no\3\2\2\2os\7\60\2\2pr\t\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3"+
		"\2\2\2st\3\2\2\2t\30\3\2\2\2us\3\2\2\2vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2y"+
		"w\3\2\2\2yz\3\2\2\2z\32\3\2\2\2{}\t\4\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\16\2\2\u0081\34\3\2\2"+
		"\2\16\2#.\62V[agmsy~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}