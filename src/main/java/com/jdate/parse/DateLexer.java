// Generated from /opt/yarzlz/program/jdate/src/main/resources/Date.g4 by ANTLR 4.7.2
package com.jdate.parse;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NUMBER=13, DAY=14, WEEK=15, MONTH=16, YEAR=17, 
		AGO=18, FORMATOPER=19, ADDOPER=20, SUBOPER=21, CHINAES=22, ENGLISH=23, 
		UNICODE=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "NUMBER", "DAY", "WEEK", "MONTH", "YEAR", "AGO", 
			"FORMATOPER", "ADDOPER", "SUBOPER", "CHINAES", "ENGLISH", "UNICODE", 
			"WS", "HEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'date'", "'-d'", "'''", "'\"'", "'/'", "'_'", "'Y'", "'y'", "'M'", 
			"'m'", "'d'", "'D'", null, null, null, null, null, null, "'%'", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NUMBER", "DAY", "WEEK", "MONTH", "YEAR", "AGO", "FORMATOPER", 
			"ADDOPER", "SUBOPER", "CHINAES", "ENGLISH", "UNICODE", "WS"
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


	public DateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Date.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\5\16U\n\16\3\16\6\16X\n\16\r\16\16\16Y\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17b\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20l\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21x\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0082\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u008a\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\6\30"+
		"\u0095\n\30\r\30\16\30\u0096\3\31\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u00a0"+
		"\n\32\r\32\16\32\u00a1\3\32\3\32\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\2\3\2\7\3\2\62;\3\2\u4e02\u9fa7\5\2\62"+
		";C\\c|\5\2\13\f\17\17\"\"\5\2\62;CHch\2\u00ae\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\3\67\3\2\2\2\5<\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2"+
		"\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31Q\3"+
		"\2\2\2\33T\3\2\2\2\35a\3\2\2\2\37k\3\2\2\2!w\3\2\2\2#\u0081\3\2\2\2%\u0089"+
		"\3\2\2\2\'\u008b\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2"+
		"/\u0094\3\2\2\2\61\u0098\3\2\2\2\63\u009f\3\2\2\2\65\u00a5\3\2\2\2\67"+
		"8\7f\2\289\7c\2\29:\7v\2\2:;\7g\2\2;\4\3\2\2\2<=\7/\2\2=>\7f\2\2>\6\3"+
		"\2\2\2?@\7)\2\2@\b\3\2\2\2AB\7$\2\2B\n\3\2\2\2CD\7\61\2\2D\f\3\2\2\2E"+
		"F\7a\2\2F\16\3\2\2\2GH\7[\2\2H\20\3\2\2\2IJ\7{\2\2J\22\3\2\2\2KL\7O\2"+
		"\2L\24\3\2\2\2MN\7o\2\2N\26\3\2\2\2OP\7f\2\2P\30\3\2\2\2QR\7F\2\2R\32"+
		"\3\2\2\2SU\7/\2\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\t\2\2\2WV\3\2\2\2XY"+
		"\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\34\3\2\2\2[\\\7f\2\2\\]\7c\2\2]b\7{\2\2"+
		"^_\7F\2\2_`\7C\2\2`b\7[\2\2a[\3\2\2\2a^\3\2\2\2b\36\3\2\2\2cd\7y\2\2d"+
		"e\7g\2\2ef\7g\2\2fl\7m\2\2gh\7Y\2\2hi\7G\2\2ij\7G\2\2jl\7M\2\2kc\3\2\2"+
		"\2kg\3\2\2\2l \3\2\2\2mn\7o\2\2no\7q\2\2op\7p\2\2pq\7v\2\2qx\7j\2\2rs"+
		"\7O\2\2st\7Q\2\2tu\7P\2\2uv\7V\2\2vx\7J\2\2wm\3\2\2\2wr\3\2\2\2x\"\3\2"+
		"\2\2yz\7{\2\2z{\7g\2\2{|\7c\2\2|\u0082\7t\2\2}~\7[\2\2~\177\7G\2\2\177"+
		"\u0080\7C\2\2\u0080\u0082\7T\2\2\u0081y\3\2\2\2\u0081}\3\2\2\2\u0082$"+
		"\3\2\2\2\u0083\u0084\7c\2\2\u0084\u0085\7i\2\2\u0085\u008a\7q\2\2\u0086"+
		"\u0087\7C\2\2\u0087\u0088\7I\2\2\u0088\u008a\7Q\2\2\u0089\u0083\3\2\2"+
		"\2\u0089\u0086\3\2\2\2\u008a&\3\2\2\2\u008b\u008c\7\'\2\2\u008c(\3\2\2"+
		"\2\u008d\u008e\7-\2\2\u008e*\3\2\2\2\u008f\u0090\7/\2\2\u0090,\3\2\2\2"+
		"\u0091\u0092\t\3\2\2\u0092.\3\2\2\2\u0093\u0095\t\4\2\2\u0094\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\60\3\2\2\2\u0098\u0099\7w\2\2\u0099\u009a\5\65\33\2\u009a\u009b\5\65"+
		"\33\2\u009b\u009c\5\65\33\2\u009c\u009d\5\65\33\2\u009d\62\3\2\2\2\u009e"+
		"\u00a0\t\5\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\32\2\2\u00a4"+
		"\64\3\2\2\2\u00a5\u00a6\t\6\2\2\u00a6\66\3\2\2\2\f\2TYakw\u0081\u0089"+
		"\u0096\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}