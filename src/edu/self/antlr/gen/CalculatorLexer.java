// Generated from /Users/Hubert/Development/IdeaProj/calculator_interpreter_hw/Calculator.g4 by ANTLR 4.5.3
package edu.self.antlr.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TYPE=7, IDENTIFIER=8, 
		NUM=9, REAL=10, WS=11, MUL=12, DIV=13, ADD=14, SUB=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TYPE", "IDENTIFIER", 
		"NUM", "REAL", "ALPHA", "DIGIT", "WS", "MUL", "DIV", "ADD", "SUB"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "'='", "'write'", "'('", "')'", null, null, null, 
		null, null, "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "TYPE", "IDENTIFIER", "NUM", 
		"REAL", "WS", "MUL", "DIV", "ADD", "SUB"
	};
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b>\n\b\3\t\3\t\3\t\7\tC\n\t\f\t\16\tF\13"+
		"\t\3\n\3\n\7\nJ\n\n\f\n\16\nM\13\n\3\13\3\13\7\13Q\n\13\f\13\16\13T\13"+
		"\13\3\13\5\13W\n\13\3\13\3\13\7\13[\n\13\f\13\16\13^\13\13\3\f\3\f\3\r"+
		"\3\r\3\16\6\16e\n\16\r\16\16\16f\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\2\31\2\33\r\35\16\37\17!\20#\21\3\2\6\3\2\63;\4\2C\\c|\3\2\62;\5\2\13"+
		"\f\17\17\"\"w\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2"+
		"\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17=\3\2"+
		"\2\2\21?\3\2\2\2\23G\3\2\2\2\25V\3\2\2\2\27_\3\2\2\2\31a\3\2\2\2\33d\3"+
		"\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%&\7\60\2\2&\4\3\2\2"+
		"\2\'(\7=\2\2(\6\3\2\2\2)*\7?\2\2*\b\3\2\2\2+,\7y\2\2,-\7t\2\2-.\7k\2\2"+
		"./\7v\2\2/\60\7g\2\2\60\n\3\2\2\2\61\62\7*\2\2\62\f\3\2\2\2\63\64\7+\2"+
		"\2\64\16\3\2\2\2\65\66\7k\2\2\66\67\7p\2\2\67>\7v\2\289\7h\2\29:\7n\2"+
		"\2:;\7q\2\2;<\7c\2\2<>\7v\2\2=\65\3\2\2\2=8\3\2\2\2>\20\3\2\2\2?D\5\27"+
		"\f\2@C\5\27\f\2AC\5\31\r\2B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3"+
		"\2\2\2E\22\3\2\2\2FD\3\2\2\2GK\t\2\2\2HJ\5\31\r\2IH\3\2\2\2JM\3\2\2\2"+
		"KI\3\2\2\2KL\3\2\2\2L\24\3\2\2\2MK\3\2\2\2NR\t\2\2\2OQ\5\31\r\2PO\3\2"+
		"\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SW\3\2\2\2TR\3\2\2\2UW\7\62\2\2VN\3"+
		"\2\2\2VU\3\2\2\2WX\3\2\2\2X\\\7\60\2\2Y[\5\31\r\2ZY\3\2\2\2[^\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]\26\3\2\2\2^\\\3\2\2\2_`\t\3\2\2`\30\3\2\2\2ab"+
		"\t\4\2\2b\32\3\2\2\2ce\t\5\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"gh\3\2\2\2hi\b\16\2\2i\34\3\2\2\2jk\7,\2\2k\36\3\2\2\2lm\7\61\2\2m \3"+
		"\2\2\2no\7-\2\2o\"\3\2\2\2pq\7/\2\2q$\3\2\2\2\13\2=BDKRV\\f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}