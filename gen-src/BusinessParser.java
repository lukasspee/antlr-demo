// Generated from /vagrant/antlr/antlr-demo/src/antlr/Business.g4 by ANTLR 4.5

package parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BusinessParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, K_INSTANCE=5, K_CONTEXT=6, K_ID=7, IDENTIFIER=8,
		WS=9;
	public static final int
		RULE_r = 0, RULE_context = 1;
	public static final String[] ruleNames = {
		"r", "context"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "'\"'", "'instance'", "'context'", "'id'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "K_INSTANCE", "K_CONTEXT", "K_ID", "IDENTIFIER",
		"WS"
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

	@Override
	public String getGrammarFileName() { return "Business.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BusinessParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode K_INSTANCE() { return getToken(BusinessParser.K_INSTANCE, 0); }
		public List<ContextContext> context() {
			return getRuleContexts(ContextContext.class);
		}
		public ContextContext context(int i) {
			return getRuleContext(ContextContext.class,i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessListener ) ((BusinessListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessListener ) ((BusinessListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(K_INSTANCE);
			setState(5);
			match(T__0);
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				context();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_CONTEXT );
			setState(11);
			match(T__1);
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

	public static class ContextContext extends ParserRuleContext {
		public TerminalNode K_CONTEXT() { return getToken(BusinessParser.K_CONTEXT, 0); }
		public TerminalNode K_ID() { return getToken(BusinessParser.K_ID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BusinessParser.IDENTIFIER, 0); }
		public ContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessListener ) ((BusinessListener)listener).enterContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessListener ) ((BusinessListener)listener).exitContext(this);
		}
	}

	public final ContextContext context() throws RecognitionException {
		ContextContext _localctx = new ContextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_context);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(K_CONTEXT);
			setState(14);
			match(T__0);
			setState(15);
			match(K_ID);
			setState(16);
			match(T__2);
			setState(17);
			match(T__3);
			setState(18);
			match(IDENTIFIER);
			setState(19);
			match(T__3);
			setState(20);
			match(T__1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\31\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\6\2\n\n\2\r\2\16\2\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\27\2\6\3\2\2\2\4\17\3\2\2\2\6\7\7\7\2\2"+
		"\7\t\7\3\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3"+
		"\2\2\2\f\r\3\2\2\2\r\16\7\4\2\2\16\3\3\2\2\2\17\20\7\b\2\2\20\21\7\3\2"+
		"\2\21\22\7\t\2\2\22\23\7\5\2\2\23\24\7\6\2\2\24\25\7\n\2\2\25\26\7\6\2"+
		"\2\26\27\7\4\2\2\27\5\3\2\2\2\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
