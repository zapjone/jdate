// Generated from /opt/yarzlz/program/jdate/src/main/resources/Date.g4 by ANTLR 4.7.2
package com.jdate.parse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NUMBER=13, DAY=14, WEEK=15, MONTH=16, YEAR=17, 
		AGO=18, FORMATOPER=19, ADDOPER=20, SUBOPER=21, CHINAES=22, ENGLISH=23, 
		UNICODE=24, WS=25;
	public static final int
		RULE_jdate = 0, RULE_pname = 1, RULE_indate = 2, RULE_operator = 3, RULE_opdate = 4, 
		RULE_cycle = 5, RULE_format = 6, RULE_spector = 7, RULE_formatval = 8, 
		RULE_yearformat = 9, RULE_monthformat = 10, RULE_dayformat = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"jdate", "pname", "indate", "operator", "opdate", "cycle", "format", 
			"spector", "formatval", "yearformat", "monthformat", "dayformat"
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

	@Override
	public String getGrammarFileName() { return "Date.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JdateContext extends ParserRuleContext {
		public PnameContext pname() {
			return getRuleContext(PnameContext.class,0);
		}
		public IndateContext indate() {
			return getRuleContext(IndateContext.class,0);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public JdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterJdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitJdate(this);
		}
	}

	public final JdateContext jdate() throws RecognitionException {
		JdateContext _localctx = new JdateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			pname();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(25);
				indate();
				}
			}

			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADDOPER) {
				{
				setState(28);
				format();
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

	public static class PnameContext extends ParserRuleContext {
		public PnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterPname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitPname(this);
		}
	}

	public final PnameContext pname() throws RecognitionException {
		PnameContext _localctx = new PnameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
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

	public static class IndateContext extends ParserRuleContext {
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public OpdateContext opdate() {
			return getRuleContext(OpdateContext.class,0);
		}
		public IndateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterIndate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitIndate(this);
		}
	}

	public final IndateContext indate() throws RecognitionException {
		IndateContext _localctx = new IndateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_indate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__1);
			setState(34);
			operator();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(35);
				opdate();
				}
			}

			setState(38);
			operator();
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OpdateContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DateParser.NUMBER, 0); }
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public TerminalNode AGO() { return getToken(DateParser.AGO, 0); }
		public OpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterOpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitOpdate(this);
		}
	}

	public final OpdateContext opdate() throws RecognitionException {
		OpdateContext _localctx = new OpdateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_opdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(NUMBER);
			setState(43);
			cycle();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AGO) {
				{
				setState(44);
				match(AGO);
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

	public static class CycleContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(DateParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(DateParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(DateParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(DateParser.YEAR, 0); }
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitCycle(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAY) | (1L << WEEK) | (1L << MONTH) | (1L << YEAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode ADDOPER() { return getToken(DateParser.ADDOPER, 0); }
		public List<FormatvalContext> formatval() {
			return getRuleContexts(FormatvalContext.class);
		}
		public FormatvalContext formatval(int i) {
			return getRuleContext(FormatvalContext.class,i);
		}
		public List<SpectorContext> spector() {
			return getRuleContexts(SpectorContext.class);
		}
		public SpectorContext spector(int i) {
			return getRuleContext(SpectorContext.class,i);
		}
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitFormat(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_format);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ADDOPER);
			setState(50);
			formatval();
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(51);
						spector();
						}
						break;
					}
					setState(54);
					formatval();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << FORMATOPER) | (1L << SUBOPER) | (1L << CHINAES) | (1L << ENGLISH) | (1L << UNICODE))) != 0)) {
				{
				setState(60);
				spector();
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

	public static class SpectorContext extends ParserRuleContext {
		public TerminalNode SUBOPER() { return getToken(DateParser.SUBOPER, 0); }
		public TerminalNode FORMATOPER() { return getToken(DateParser.FORMATOPER, 0); }
		public TerminalNode CHINAES() { return getToken(DateParser.CHINAES, 0); }
		public TerminalNode ENGLISH() { return getToken(DateParser.ENGLISH, 0); }
		public TerminalNode UNICODE() { return getToken(DateParser.UNICODE, 0); }
		public SpectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterSpector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitSpector(this);
		}
	}

	public final SpectorContext spector() throws RecognitionException {
		SpectorContext _localctx = new SpectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_spector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << FORMATOPER) | (1L << SUBOPER) | (1L << CHINAES) | (1L << ENGLISH) | (1L << UNICODE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FormatvalContext extends ParserRuleContext {
		public TerminalNode FORMATOPER() { return getToken(DateParser.FORMATOPER, 0); }
		public YearformatContext yearformat() {
			return getRuleContext(YearformatContext.class,0);
		}
		public MonthformatContext monthformat() {
			return getRuleContext(MonthformatContext.class,0);
		}
		public DayformatContext dayformat() {
			return getRuleContext(DayformatContext.class,0);
		}
		public FormatvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterFormatval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitFormatval(this);
		}
	}

	public final FormatvalContext formatval() throws RecognitionException {
		FormatvalContext _localctx = new FormatvalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formatval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(FORMATOPER);
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				{
				setState(66);
				yearformat();
				}
				break;
			case T__8:
			case T__9:
				{
				setState(67);
				monthformat();
				}
				break;
			case T__10:
			case T__11:
				{
				setState(68);
				dayformat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class YearformatContext extends ParserRuleContext {
		public YearformatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearformat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterYearformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitYearformat(this);
		}
	}

	public final YearformatContext yearformat() throws RecognitionException {
		YearformatContext _localctx = new YearformatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_yearformat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MonthformatContext extends ParserRuleContext {
		public MonthformatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monthformat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterMonthformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitMonthformat(this);
		}
	}

	public final MonthformatContext monthformat() throws RecognitionException {
		MonthformatContext _localctx = new MonthformatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_monthformat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DayformatContext extends ParserRuleContext {
		public DayformatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayformat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterDayformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitDayformat(this);
		}
	}

	public final DayformatContext dayformat() throws RecognitionException {
		DayformatContext _localctx = new DayformatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dayformat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\2\5\2 \n\2\3\3\3\3\3\4\3\4\3\4\5\4"+
		"\'\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6\60\n\6\3\7\3\7\3\b\3\b\3\b\5\b"+
		"\67\n\b\3\b\7\b:\n\b\f\b\16\b=\13\b\3\b\5\b@\n\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\5\nH\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\b\3\2\5\6\3\2\20\23\5\2\7\b\25\25\27\32\3\2\t\n\3\2\13\f\3"+
		"\2\r\16\2L\2\32\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b*\3\2\2\2\n,\3\2\2\2\f"+
		"\61\3\2\2\2\16\63\3\2\2\2\20A\3\2\2\2\22C\3\2\2\2\24I\3\2\2\2\26K\3\2"+
		"\2\2\30M\3\2\2\2\32\34\5\4\3\2\33\35\5\6\4\2\34\33\3\2\2\2\34\35\3\2\2"+
		"\2\35\37\3\2\2\2\36 \5\16\b\2\37\36\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\""+
		"\7\3\2\2\"\5\3\2\2\2#$\7\4\2\2$&\5\b\5\2%\'\5\n\6\2&%\3\2\2\2&\'\3\2\2"+
		"\2\'(\3\2\2\2()\5\b\5\2)\7\3\2\2\2*+\t\2\2\2+\t\3\2\2\2,-\7\17\2\2-/\5"+
		"\f\7\2.\60\7\24\2\2/.\3\2\2\2/\60\3\2\2\2\60\13\3\2\2\2\61\62\t\3\2\2"+
		"\62\r\3\2\2\2\63\64\7\26\2\2\64;\5\22\n\2\65\67\5\20\t\2\66\65\3\2\2\2"+
		"\66\67\3\2\2\2\678\3\2\2\28:\5\22\n\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2"+
		";<\3\2\2\2<?\3\2\2\2=;\3\2\2\2>@\5\20\t\2?>\3\2\2\2?@\3\2\2\2@\17\3\2"+
		"\2\2AB\t\4\2\2B\21\3\2\2\2CG\7\25\2\2DH\5\24\13\2EH\5\26\f\2FH\5\30\r"+
		"\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\23\3\2\2\2IJ\t\5\2\2J\25\3\2\2\2KL\t"+
		"\6\2\2L\27\3\2\2\2MN\t\7\2\2N\31\3\2\2\2\n\34\37&/\66;?G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}