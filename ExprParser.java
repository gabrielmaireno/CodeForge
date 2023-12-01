// Generated from Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		EspacoBranco=25, INT=26, FLOAT=27, STR=28, BOOL=29, RETURN=30, Assign=31, 
		SemiColon=32, LParen=33, RParen=34, LBrace=35, RBrace=36, Comma=37, Not=38, 
		ID=39;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_def = 2, RULE_tipo = 3, RULE_whileBloco = 4, 
		RULE_ifBloco = 5, RULE_func = 6, RULE_return = 7, RULE_expr = 8, RULE_multiplicaoOp = 9, 
		RULE_adicaoOp = 10, RULE_comparacaoOp = 11, RULE_booleanOp = 12, RULE_const = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "def", "tipo", "whileBloco", "ifBloco", "func", "return", 
			"expr", "multiplicaoOp", "adicaoOp", "comparacaoOp", "booleanOp", "const"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'string'", "'int'", "'float'", "'boolean'", "'double'", "'char'", 
			"'while'", "'if'", "'else'", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", "'and'", "'||'", "'or'", "'&&'", 
			null, null, null, null, null, "'return'", "'='", "';'", "'('", "')'", 
			"'{'", "'}'", "','", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "EspacoBranco", "INT", "FLOAT", "STR", "BOOL", "RETURN", "Assign", 
			"SemiColon", "LParen", "RParen", "LBrace", "RBrace", "Comma", "Not", 
			"ID"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public List<IfBlocoContext> ifBloco() {
			return getRuleContexts(IfBlocoContext.class);
		}
		public IfBlocoContext ifBloco(int i) {
			return getRuleContext(IfBlocoContext.class,i);
		}
		public List<WhileBlocoContext> whileBloco() {
			return getRuleContexts(WhileBlocoContext.class);
		}
		public WhileBlocoContext whileBloco(int i) {
			return getRuleContext(WhileBlocoContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(28);
					stat();
					}
					break;
				case 2:
					{
					setState(29);
					def();
					}
					break;
				case 3:
					{
					setState(30);
					ifBloco();
					}
					break;
				case 4:
					{
					setState(31);
					whileBloco();
					}
					break;
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 620555665918L) != 0) );
			setState(36);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode Assign() { return getToken(ExprParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ExprParser.SemiColon, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				tipo();
				setState(39);
				match(ID);
				setState(40);
				match(Assign);
				setState(41);
				expr(0);
				setState(42);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(ID);
				setState(45);
				match(Assign);
				setState(46);
				expr(0);
				setState(47);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				expr(0);
				setState(50);
				match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode LParen() { return getToken(ExprParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(ExprParser.RParen, 0); }
		public TerminalNode LBrace() { return getToken(ExprParser.LBrace, 0); }
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public TerminalNode RBrace() { return getToken(ExprParser.RBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(ExprParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ExprParser.Comma, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(ID);
				setState(55);
				match(LParen);
				setState(56);
				match(ID);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(57);
					match(Comma);
					setState(58);
					match(ID);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(RParen);
				setState(65);
				match(LBrace);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 550762446974L) != 0)) {
					{
					{
					setState(66);
					stat();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				return_();
				setState(73);
				match(RBrace);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					stat();
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 550762446974L) != 0) );
				}
				setState(80);
				match(RBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileBlocoContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(ExprParser.LParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RParen() { return getToken(ExprParser.RParen, 0); }
		public TerminalNode LBrace() { return getToken(ExprParser.LBrace, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<IfBlocoContext> ifBloco() {
			return getRuleContexts(IfBlocoContext.class);
		}
		public IfBlocoContext ifBloco(int i) {
			return getRuleContext(IfBlocoContext.class,i);
		}
		public TerminalNode RBrace() { return getToken(ExprParser.RBrace, 0); }
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public WhileBlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWhileBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWhileBloco(this);
		}
	}

	public final WhileBlocoContext whileBloco() throws RecognitionException {
		WhileBlocoContext _localctx = new WhileBlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileBloco);
		int _la;
		try {
			int _alt;
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__6);
				setState(87);
				match(LParen);
				setState(88);
				expr(0);
				setState(89);
				match(RParen);
				setState(90);
				match(LBrace);
				setState(93); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(93);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__0:
						case T__1:
						case T__2:
						case T__3:
						case T__4:
						case T__5:
						case INT:
						case FLOAT:
						case STR:
						case BOOL:
						case ID:
							{
							setState(91);
							stat();
							}
							break;
						case T__7:
							{
							setState(92);
							ifBloco();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(95); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(97);
					return_();
					}
				}

				setState(100);
				match(RBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(T__6);
				setState(102);
				match(LParen);
				setState(103);
				expr(0);
				setState(104);
				match(RParen);
				setState(105);
				match(LBrace);
				setState(106);
				return_();
				setState(107);
				match(RBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlocoContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(ExprParser.LParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RParen() { return getToken(ExprParser.RParen, 0); }
		public List<TerminalNode> LBrace() { return getTokens(ExprParser.LBrace); }
		public TerminalNode LBrace(int i) {
			return getToken(ExprParser.LBrace, i);
		}
		public List<TerminalNode> RBrace() { return getTokens(ExprParser.RBrace); }
		public TerminalNode RBrace(int i) {
			return getToken(ExprParser.RBrace, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<IfBlocoContext> ifBloco() {
			return getRuleContexts(IfBlocoContext.class);
		}
		public IfBlocoContext ifBloco(int i) {
			return getRuleContext(IfBlocoContext.class,i);
		}
		public List<WhileBlocoContext> whileBloco() {
			return getRuleContexts(WhileBlocoContext.class);
		}
		public WhileBlocoContext whileBloco(int i) {
			return getRuleContext(WhileBlocoContext.class,i);
		}
		public List<ReturnContext> return_() {
			return getRuleContexts(ReturnContext.class);
		}
		public ReturnContext return_(int i) {
			return getRuleContext(ReturnContext.class,i);
		}
		public IfBlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfBloco(this);
		}
	}

	public final IfBlocoContext ifBloco() throws RecognitionException {
		IfBlocoContext _localctx = new IfBlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifBloco);
		int _la;
		try {
			int _alt;
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__7);
				setState(112);
				match(LParen);
				setState(113);
				expr(0);
				setState(114);
				match(RParen);
				setState(115);
				match(LBrace);
				setState(119); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(119);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__0:
						case T__1:
						case T__2:
						case T__3:
						case T__4:
						case T__5:
						case INT:
						case FLOAT:
						case STR:
						case BOOL:
						case ID:
							{
							setState(116);
							stat();
							}
							break;
						case T__7:
							{
							setState(117);
							ifBloco();
							}
							break;
						case T__6:
						case RETURN:
						case RBrace:
							{
							setState(118);
							whileBloco();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(121); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(123);
					return_();
					}
				}

				setState(126);
				match(RBrace);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(127);
					match(T__8);
					setState(128);
					match(LBrace);
					setState(132); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(132);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case T__0:
							case T__1:
							case T__2:
							case T__3:
							case T__4:
							case T__5:
							case INT:
							case FLOAT:
							case STR:
							case BOOL:
							case ID:
								{
								setState(129);
								stat();
								}
								break;
							case T__7:
								{
								setState(130);
								ifBloco();
								}
								break;
							case T__6:
							case RETURN:
							case RBrace:
								{
								setState(131);
								whileBloco();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(134); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RETURN) {
						{
						setState(136);
						return_();
						}
					}

					setState(139);
					match(RBrace);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__7);
				setState(144);
				match(LParen);
				setState(145);
				expr(0);
				setState(146);
				match(RParen);
				setState(147);
				match(LBrace);
				setState(148);
				return_();
				setState(149);
				match(RBrace);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(150);
					match(T__8);
					setState(151);
					match(LBrace);
					setState(152);
					return_();
					setState(153);
					match(RBrace);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode LParen() { return getToken(ExprParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(ExprParser.RParen, 0); }
		public List<TerminalNode> Comma() { return getTokens(ExprParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ExprParser.Comma, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ID);
			setState(160);
			match(LParen);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(161);
				match(ID);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(167);
				match(Comma);
				setState(168);
				match(ID);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(RParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ExprParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ExprParser.SemiColon, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(RETURN);
			setState(177);
			expr(0);
			setState(178);
			match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplicaoOpContext multiplicaoOp() {
			return getRuleContext(MultiplicaoOpContext.class,0);
		}
		public AdicaoOpContext adicaoOp() {
			return getRuleContext(AdicaoOpContext.class,0);
		}
		public ComparacaoOpContext comparacaoOp() {
			return getRuleContext(ComparacaoOpContext.class,0);
		}
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(181);
				const_();
				}
				break;
			case 2:
				{
				setState(182);
				match(ID);
				}
				break;
			case 3:
				{
				setState(183);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(187);
						multiplicaoOp();
						setState(188);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191);
						adicaoOp();
						setState(192);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(195);
						comparacaoOp();
						setState(196);
						expr(3);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(199);
						booleanOp();
						setState(200);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicaoOpContext extends ParserRuleContext {
		public MultiplicaoOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicaoOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMultiplicaoOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMultiplicaoOp(this);
		}
	}

	public final MultiplicaoOpContext multiplicaoOp() throws RecognitionException {
		MultiplicaoOpContext _localctx = new MultiplicaoOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplicaoOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdicaoOpContext extends ParserRuleContext {
		public AdicaoOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicaoOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAdicaoOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAdicaoOp(this);
		}
	}

	public final AdicaoOpContext adicaoOp() throws RecognitionException {
		AdicaoOpContext _localctx = new AdicaoOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_adicaoOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacaoOpContext extends ParserRuleContext {
		public ComparacaoOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacaoOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterComparacaoOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitComparacaoOp(this);
		}
	}

	public final ComparacaoOpContext comparacaoOp() throws RecognitionException {
		ComparacaoOpContext _localctx = new ComparacaoOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparacaoOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanOpContext extends ParserRuleContext {
		public BooleanOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBooleanOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBooleanOp(this);
		}
	}

	public final BooleanOpContext booleanOp() throws RecognitionException {
		BooleanOpContext _localctx = new BooleanOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleanOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(ExprParser.BOOL, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConst(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002?\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002D\b\u0002\n\u0002"+
		"\f\u0002G\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002M\b\u0002\u000b\u0002\f\u0002N\u0001\u0002\u0001\u0002\u0003\u0002"+
		"S\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004^\b\u0004"+
		"\u000b\u0004\f\u0004_\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004n\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005x\b\u0005\u000b\u0005\f\u0005y\u0001\u0005\u0003\u0005}\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0004\u0005\u0085\b\u0005\u000b\u0005\f\u0005\u0086\u0001\u0005\u0003"+
		"\u0005\u008a\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008e\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u009c\b\u0005\u0003\u0005\u009e\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00a3\b\u0006\n\u0006\f\u0006\u00a6\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00aa\b\u0006\n\u0006\f\u0006\u00ad"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b9\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00cb\b\b\n\b\f\b\u00ce"+
		"\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0000\u0001\u0010\u000e\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0006\u0001\u0000"+
		"\u0001\u0006\u0001\u0000\n\f\u0001\u0000\r\u000e\u0001\u0000\u000f\u0014"+
		"\u0001\u0000\u0015\u0018\u0001\u0000\u001a\u001d\u00ed\u0000 \u0001\u0000"+
		"\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000"+
		"\u0006T\u0001\u0000\u0000\u0000\bm\u0001\u0000\u0000\u0000\n\u009d\u0001"+
		"\u0000\u0000\u0000\f\u009f\u0001\u0000\u0000\u0000\u000e\u00b0\u0001\u0000"+
		"\u0000\u0000\u0010\u00b8\u0001\u0000\u0000\u0000\u0012\u00cf\u0001\u0000"+
		"\u0000\u0000\u0014\u00d1\u0001\u0000\u0000\u0000\u0016\u00d3\u0001\u0000"+
		"\u0000\u0000\u0018\u00d5\u0001\u0000\u0000\u0000\u001a\u00d7\u0001\u0000"+
		"\u0000\u0000\u001c!\u0003\u0002\u0001\u0000\u001d!\u0003\u0004\u0002\u0000"+
		"\u001e!\u0003\n\u0005\u0000\u001f!\u0003\b\u0004\u0000 \u001c\u0001\u0000"+
		"\u0000\u0000 \u001d\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&\'\u0003\u0006\u0003"+
		"\u0000\'(\u0005\'\u0000\u0000()\u0005\u001f\u0000\u0000)*\u0003\u0010"+
		"\b\u0000*+\u0005 \u0000\u0000+5\u0001\u0000\u0000\u0000,-\u0005\'\u0000"+
		"\u0000-.\u0005\u001f\u0000\u0000./\u0003\u0010\b\u0000/0\u0005 \u0000"+
		"\u000005\u0001\u0000\u0000\u000012\u0003\u0010\b\u000023\u0005 \u0000"+
		"\u000035\u0001\u0000\u0000\u00004&\u0001\u0000\u0000\u00004,\u0001\u0000"+
		"\u0000\u000041\u0001\u0000\u0000\u00005\u0003\u0001\u0000\u0000\u0000"+
		"67\u0005\'\u0000\u000078\u0005!\u0000\u00008=\u0005\'\u0000\u00009:\u0005"+
		"%\u0000\u0000:<\u0005\'\u0000\u0000;9\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\"\u0000\u0000"+
		"AE\u0005#\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0003\u000e"+
		"\u0007\u0000IJ\u0005$\u0000\u0000JS\u0001\u0000\u0000\u0000KM\u0003\u0002"+
		"\u0001\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PQ\u0005$\u0000\u0000QS\u0001\u0000\u0000\u0000R6\u0001\u0000\u0000\u0000"+
		"RL\u0001\u0000\u0000\u0000S\u0005\u0001\u0000\u0000\u0000TU\u0007\u0000"+
		"\u0000\u0000U\u0007\u0001\u0000\u0000\u0000VW\u0005\u0007\u0000\u0000"+
		"WX\u0005!\u0000\u0000XY\u0003\u0010\b\u0000YZ\u0005\"\u0000\u0000Z]\u0005"+
		"#\u0000\u0000[^\u0003\u0002\u0001\u0000\\^\u0003\n\u0005\u0000][\u0001"+
		"\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`n\u0001\u0000\u0000"+
		"\u0000ac\u0003\u000e\u0007\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000dn\u0005$\u0000\u0000ef\u0005\u0007"+
		"\u0000\u0000fg\u0005!\u0000\u0000gh\u0003\u0010\b\u0000hi\u0005\"\u0000"+
		"\u0000ij\u0005#\u0000\u0000jk\u0003\u000e\u0007\u0000kl\u0005$\u0000\u0000"+
		"ln\u0001\u0000\u0000\u0000mV\u0001\u0000\u0000\u0000mb\u0001\u0000\u0000"+
		"\u0000me\u0001\u0000\u0000\u0000n\t\u0001\u0000\u0000\u0000op\u0005\b"+
		"\u0000\u0000pq\u0005!\u0000\u0000qr\u0003\u0010\b\u0000rs\u0005\"\u0000"+
		"\u0000sw\u0005#\u0000\u0000tx\u0003\u0002\u0001\u0000ux\u0003\n\u0005"+
		"\u0000vx\u0003\b\u0004\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{}\u0003"+
		"\u000e\u0007\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u008d\u0005$\u0000\u0000\u007f\u0080\u0005"+
		"\t\u0000\u0000\u0080\u0084\u0005#\u0000\u0000\u0081\u0085\u0003\u0002"+
		"\u0001\u0000\u0082\u0085\u0003\n\u0005\u0000\u0083\u0085\u0003\b\u0004"+
		"\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u008a\u0003\u000e\u0007"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005$\u0000\u0000"+
		"\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u007f\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u009e\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005\b\u0000\u0000\u0090\u0091\u0005!\u0000\u0000\u0091"+
		"\u0092\u0003\u0010\b\u0000\u0092\u0093\u0005\"\u0000\u0000\u0093\u0094"+
		"\u0005#\u0000\u0000\u0094\u0095\u0003\u000e\u0007\u0000\u0095\u009b\u0005"+
		"$\u0000\u0000\u0096\u0097\u0005\t\u0000\u0000\u0097\u0098\u0005#\u0000"+
		"\u0000\u0098\u0099\u0003\u000e\u0007\u0000\u0099\u009a\u0005$\u0000\u0000"+
		"\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000"+
		"\u009do\u0001\u0000\u0000\u0000\u009d\u008f\u0001\u0000\u0000\u0000\u009e"+
		"\u000b\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\'\u0000\u0000\u00a0\u00a4"+
		"\u0005!\u0000\u0000\u00a1\u00a3\u0005\'\u0000\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"%\u0000\u0000\u00a8\u00aa\u0005\'\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\"\u0000"+
		"\u0000\u00af\r\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u001e\u0000\u0000"+
		"\u00b1\u00b2\u0003\u0010\b\u0000\u00b2\u00b3\u0005 \u0000\u0000\u00b3"+
		"\u000f\u0001\u0000\u0000\u0000\u00b4\u00b5\u0006\b\uffff\uffff\u0000\u00b5"+
		"\u00b9\u0003\u001a\r\u0000\u00b6\u00b9\u0005\'\u0000\u0000\u00b7\u00b9"+
		"\u0003\f\u0006\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\n\u0004\u0000\u0000\u00bb\u00bc\u0003\u0012"+
		"\t\u0000\u00bc\u00bd\u0003\u0010\b\u0005\u00bd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\n\u0003\u0000\u0000\u00bf\u00c0\u0003\u0014\n\u0000"+
		"\u00c0\u00c1\u0003\u0010\b\u0004\u00c1\u00cb\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\n\u0002\u0000\u0000\u00c3\u00c4\u0003\u0016\u000b\u0000\u00c4\u00c5"+
		"\u0003\u0010\b\u0003\u00c5\u00cb\u0001\u0000\u0000\u0000\u00c6\u00c7\n"+
		"\u0001\u0000\u0000\u00c7\u00c8\u0003\u0018\f\u0000\u00c8\u00c9\u0003\u0010"+
		"\b\u0002\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ca\u00be\u0001\u0000\u0000\u0000\u00ca\u00c2\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u0011\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0007\u0001\u0000\u0000\u00d0\u0013\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0007\u0002\u0000\u0000\u00d2\u0015\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0007\u0003\u0000\u0000\u00d4\u0017\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0007\u0004\u0000\u0000\u00d6\u0019\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0007\u0005\u0000\u0000\u00d8\u001b\u0001\u0000\u0000"+
		"\u0000\u0019 \"4=ENR]_bmwy|\u0084\u0086\u0089\u008d\u009b\u009d\u00a4"+
		"\u00ab\u00b8\u00ca\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}