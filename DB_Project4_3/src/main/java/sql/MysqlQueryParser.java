// Generated from E:/AllProjects/IDEA/DB_Project/DB_Project4_3/src/main/java/g4\MysqlQuery.g4 by ANTLR 4.9.2
package sql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MysqlQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, NUMBER=14, VARCHAR=15, AS=16, CREATE=17, 
		SELECT=18, INSERT=19, INTO=20, VALUES=21, FROM=22, TABLE=23, MAX=24, SUM=25, 
		AVG=26, MIN=27, COUNT=28, ALL=29, DISTINCT=30, WHERE=31, GROUP=32, BY=33, 
		ORDER=34, HAVING=35, NOT=36, IS=37, TRUE=38, FALSE=39, UNKNOWN=40, BETWEEN=41, 
		AND=42, IN=43, NULL=44, OR=45, ASC=46, DESC=47, LIMIT=48, OFFSET=49, ID=50, 
		TEXT_STRING=51, ID_LITERAL=52, REVERSE_QUOTE_ID=53, DECIMAL_LITERAL=54, 
		EOLINE=55, WS=56;
	public static final int
		RULE_dbName = 0, RULE_tableName = 1, RULE_column_name = 2, RULE_function_name = 3, 
		RULE_datatype = 4, RULE_createStatement = 5, RULE_insertStatement = 6, 
		RULE_createcolumnlist = 7, RULE_colname_and_type = 8, RULE_columnlist = 9, 
		RULE_valuelist = 10, RULE_selectStatement = 11, RULE_selectElements = 12, 
		RULE_tableSources = 13, RULE_whereClause = 14, RULE_logicExpression = 15, 
		RULE_groupByCaluse = 16, RULE_havingCaluse = 17, RULE_orderByClause = 18, 
		RULE_limitClause = 19, RULE_orderByExpression = 20, RULE_groupByItem = 21, 
		RULE_logicalOperator = 22, RULE_comparisonOperator = 23, RULE_value = 24, 
		RULE_decimalLiteral = 25, RULE_textLiteral = 26, RULE_selectElement = 27, 
		RULE_fullColumnName = 28, RULE_functionCall = 29, RULE_aggregateWindowedFunction = 30, 
		RULE_functionArg = 31, RULE_functionArgs = 32, RULE_uid = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"dbName", "tableName", "column_name", "function_name", "datatype", "createStatement", 
			"insertStatement", "createcolumnlist", "colname_and_type", "columnlist", 
			"valuelist", "selectStatement", "selectElements", "tableSources", "whereClause", 
			"logicExpression", "groupByCaluse", "havingCaluse", "orderByClause", 
			"limitClause", "orderByExpression", "groupByItem", "logicalOperator", 
			"comparisonOperator", "value", "decimalLiteral", "textLiteral", "selectElement", 
			"fullColumnName", "functionCall", "aggregateWindowedFunction", "functionArg", 
			"functionArgs", "uid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "','", "'*'", "'&'", "'^'", "'|'", "'='", 
			"'>'", "'<'", "'!'", "'\"'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NUMBER", "VARCHAR", "AS", "CREATE", "SELECT", "INSERT", 
			"INTO", "VALUES", "FROM", "TABLE", "MAX", "SUM", "AVG", "MIN", "COUNT", 
			"ALL", "DISTINCT", "WHERE", "GROUP", "BY", "ORDER", "HAVING", "NOT", 
			"IS", "TRUE", "FALSE", "UNKNOWN", "BETWEEN", "AND", "IN", "NULL", "OR", 
			"ASC", "DESC", "LIMIT", "OFFSET", "ID", "TEXT_STRING", "ID_LITERAL", 
			"REVERSE_QUOTE_ID", "DECIMAL_LITERAL", "EOLINE", "WS"
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
	public String getGrammarFileName() { return "MysqlQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MysqlQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DbNameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(MysqlQueryParser.ID, 0); }
		public DbNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterDbName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitDbName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitDbName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbNameContext dbName() throws RecognitionException {
		DbNameContext _localctx = new DbNameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dbName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((DbNameContext)_localctx).tmpName = match(ID);
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

	public static class TableNameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(MysqlQueryParser.ID, 0); }
		public DbNameContext dbName() {
			return getRuleContext(DbNameContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tableName);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				((TableNameContext)_localctx).tmpName = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				dbName();
				setState(72);
				match(T__0);
				setState(73);
				((TableNameContext)_localctx).tmpName = match(ID);
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

	public static class Column_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MysqlQueryParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MysqlQueryParser.ID, i);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_column_name);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(ID);
				setState(79);
				match(T__0);
				setState(80);
				match(ID);
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

	public static class Function_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(MysqlQueryParser.ID, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((Function_nameContext)_localctx).tmpName = match(ID);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode VARCHAR() { return getToken(MysqlQueryParser.VARCHAR, 0); }
		public TerminalNode NUMBER() { return getToken(MysqlQueryParser.NUMBER, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==VARCHAR) ) {
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

	public static class CreateStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MysqlQueryParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MysqlQueryParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode EOLINE() { return getToken(MysqlQueryParser.EOLINE, 0); }
		public CreatecolumnlistContext createcolumnlist() {
			return getRuleContext(CreatecolumnlistContext.class,0);
		}
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(CREATE);
			setState(88);
			match(TABLE);
			setState(89);
			tableName();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(90);
				match(T__1);
				setState(91);
				createcolumnlist();
				setState(92);
				match(T__2);
				}
			}

			setState(96);
			match(EOLINE);
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

	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MysqlQueryParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(MysqlQueryParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(MysqlQueryParser.VALUES, 0); }
		public ValuelistContext valuelist() {
			return getRuleContext(ValuelistContext.class,0);
		}
		public TerminalNode EOLINE() { return getToken(MysqlQueryParser.EOLINE, 0); }
		public ColumnlistContext columnlist() {
			return getRuleContext(ColumnlistContext.class,0);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(INSERT);
			setState(99);
			match(INTO);
			setState(100);
			tableName();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(101);
				match(T__1);
				setState(102);
				columnlist();
				setState(103);
				match(T__2);
				}
			}

			setState(107);
			match(VALUES);
			setState(108);
			match(T__1);
			setState(109);
			valuelist();
			setState(110);
			match(T__2);
			setState(111);
			match(EOLINE);
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

	public static class CreatecolumnlistContext extends ParserRuleContext {
		public List<Colname_and_typeContext> colname_and_type() {
			return getRuleContexts(Colname_and_typeContext.class);
		}
		public Colname_and_typeContext colname_and_type(int i) {
			return getRuleContext(Colname_and_typeContext.class,i);
		}
		public CreatecolumnlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createcolumnlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterCreatecolumnlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitCreatecolumnlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitCreatecolumnlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatecolumnlistContext createcolumnlist() throws RecognitionException {
		CreatecolumnlistContext _localctx = new CreatecolumnlistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createcolumnlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			colname_and_type();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(114);
				match(T__3);
				setState(115);
				colname_and_type();
				}
				}
				setState(120);
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

	public static class Colname_and_typeContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public Colname_and_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colname_and_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterColname_and_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitColname_and_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitColname_and_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Colname_and_typeContext colname_and_type() throws RecognitionException {
		Colname_and_typeContext _localctx = new Colname_and_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_colname_and_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			column_name();
			setState(122);
			datatype();
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

	public static class ColumnlistContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public ColumnlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterColumnlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitColumnlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitColumnlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnlistContext columnlist() throws RecognitionException {
		ColumnlistContext _localctx = new ColumnlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columnlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			column_name();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(125);
				match(T__3);
				setState(126);
				column_name();
				}
				}
				setState(131);
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

	public static class ValuelistContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValuelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterValuelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitValuelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitValuelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuelistContext valuelist() throws RecognitionException {
		ValuelistContext _localctx = new ValuelistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valuelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			value();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(133);
				match(T__3);
				setState(134);
				value();
				}
				}
				setState(139);
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

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MysqlQueryParser.SELECT, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public TerminalNode EOLINE() { return getToken(MysqlQueryParser.EOLINE, 0); }
		public TerminalNode FROM() { return getToken(MysqlQueryParser.FROM, 0); }
		public TableSourcesContext tableSources() {
			return getRuleContext(TableSourcesContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByCaluseContext groupByCaluse() {
			return getRuleContext(GroupByCaluseContext.class,0);
		}
		public HavingCaluseContext havingCaluse() {
			return getRuleContext(HavingCaluseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(SELECT);
			setState(141);
			selectElements();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(142);
				match(FROM);
				setState(143);
				tableSources();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(144);
					whereClause();
					}
				}

				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(147);
					groupByCaluse();
					}
				}

				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(150);
					havingCaluse();
					}
				}

				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(155);
				orderByClause();
				}
			}

			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(158);
				limitClause();
				}
			}

			setState(161);
			match(EOLINE);
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

	public static class SelectElementsContext extends ParserRuleContext {
		public Token star;
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterSelectElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitSelectElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitSelectElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(163);
				((SelectElementsContext)_localctx).star = match(T__4);
				}
				break;
			case MAX:
			case SUM:
			case AVG:
			case MIN:
			case COUNT:
			case ID:
				{
				setState(164);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(167);
				match(T__3);
				setState(168);
				selectElement();
				}
				}
				setState(173);
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

	public static class TableSourcesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TableSourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterTableSources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitTableSources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitTableSources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSourcesContext tableSources() throws RecognitionException {
		TableSourcesContext _localctx = new TableSourcesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableSources);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				tableName();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(175);
					match(T__3);
					setState(176);
					tableName();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__1);
				setState(183);
				selectStatement();
				setState(184);
				match(T__2);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MysqlQueryParser.WHERE, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(WHERE);
			setState(189);
			logicExpression(0);
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

	public static class LogicExpressionContext extends ParserRuleContext {
		public List<FullColumnNameContext> fullColumnName() {
			return getRuleContexts(FullColumnNameContext.class);
		}
		public FullColumnNameContext fullColumnName(int i) {
			return getRuleContext(FullColumnNameContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(MysqlQueryParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MysqlQueryParser.AND, 0); }
		public TerminalNode IN() { return getToken(MysqlQueryParser.IN, 0); }
		public TerminalNode NOT() { return getToken(MysqlQueryParser.NOT, 0); }
		public List<LogicExpressionContext> logicExpression() {
			return getRuleContexts(LogicExpressionContext.class);
		}
		public LogicExpressionContext logicExpression(int i) {
			return getRuleContext(LogicExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitLogicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		return logicExpression(0);
	}

	private LogicExpressionContext logicExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, _parentState);
		LogicExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logicExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(192);
				fullColumnName();
				setState(193);
				comparisonOperator();
				setState(194);
				value();
				}
				break;
			case 2:
				{
				setState(196);
				fullColumnName();
				setState(197);
				comparisonOperator();
				setState(198);
				fullColumnName();
				}
				break;
			case 3:
				{
				setState(200);
				fullColumnName();
				setState(201);
				comparisonOperator();
				setState(202);
				match(T__1);
				setState(203);
				selectStatement();
				setState(204);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(206);
				fullColumnName();
				setState(207);
				match(BETWEEN);
				setState(208);
				value();
				setState(209);
				match(AND);
				setState(210);
				value();
				}
				break;
			case 5:
				{
				setState(212);
				fullColumnName();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(213);
					match(NOT);
					}
				}

				setState(216);
				match(IN);
				setState(217);
				match(T__1);
				setState(218);
				value();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(219);
					match(T__3);
					setState(220);
					value();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(228);
				match(T__1);
				setState(229);
				logicExpression(0);
				setState(230);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
					setState(234);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(235);
					logicalOperator();
					setState(236);
					logicExpression(8);
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class GroupByCaluseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(MysqlQueryParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MysqlQueryParser.BY, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public GroupByCaluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByCaluse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterGroupByCaluse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitGroupByCaluse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitGroupByCaluse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByCaluseContext groupByCaluse() throws RecognitionException {
		GroupByCaluseContext _localctx = new GroupByCaluseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_groupByCaluse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(GROUP);
			setState(244);
			match(BY);
			setState(245);
			groupByItem();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(246);
				match(T__3);
				setState(247);
				groupByItem();
				}
				}
				setState(252);
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

	public static class HavingCaluseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(MysqlQueryParser.HAVING, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public HavingCaluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingCaluse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterHavingCaluse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitHavingCaluse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitHavingCaluse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingCaluseContext havingCaluse() throws RecognitionException {
		HavingCaluseContext _localctx = new HavingCaluseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_havingCaluse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(HAVING);
			setState(254);
			logicExpression(0);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(MysqlQueryParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MysqlQueryParser.BY, 0); }
		public List<OrderByExpressionContext> orderByExpression() {
			return getRuleContexts(OrderByExpressionContext.class);
		}
		public OrderByExpressionContext orderByExpression(int i) {
			return getRuleContext(OrderByExpressionContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ORDER);
			setState(257);
			match(BY);
			setState(258);
			orderByExpression();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(259);
				match(T__3);
				setState(260);
				orderByExpression();
				}
				}
				setState(265);
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

	public static class LimitClauseContext extends ParserRuleContext {
		public DecimalLiteralContext offset;
		public DecimalLiteralContext limit;
		public TerminalNode LIMIT() { return getToken(MysqlQueryParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(MysqlQueryParser.OFFSET, 0); }
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(LIMIT);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(267);
					((LimitClauseContext)_localctx).offset = decimalLiteral();
					setState(268);
					match(T__3);
					}
					break;
				}
				setState(272);
				((LimitClauseContext)_localctx).limit = decimalLiteral();
				}
				break;
			case 2:
				{
				setState(273);
				((LimitClauseContext)_localctx).limit = decimalLiteral();
				setState(274);
				match(OFFSET);
				setState(275);
				((LimitClauseContext)_localctx).offset = decimalLiteral();
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

	public static class OrderByExpressionContext extends ParserRuleContext {
		public Token order;
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MysqlQueryParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MysqlQueryParser.DESC, 0); }
		public OrderByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterOrderByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitOrderByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitOrderByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByExpressionContext orderByExpression() throws RecognitionException {
		OrderByExpressionContext _localctx = new OrderByExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_orderByExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			fullColumnName();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(280);
				((OrderByExpressionContext)_localctx).order = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderByExpressionContext)_localctx).order = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class GroupByItemContext extends ParserRuleContext {
		public Token order;
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MysqlQueryParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MysqlQueryParser.DESC, 0); }
		public GroupByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterGroupByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitGroupByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitGroupByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByItemContext groupByItem() throws RecognitionException {
		GroupByItemContext _localctx = new GroupByItemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_groupByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			fullColumnName();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(284);
				((GroupByItemContext)_localctx).order = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((GroupByItemContext)_localctx).order = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MysqlQueryParser.AND, 0); }
		public TerminalNode OR() { return getToken(MysqlQueryParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalOperator);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(AND);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(T__5);
				setState(289);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(T__6);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				match(OR);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				match(T__7);
				setState(293);
				match(T__7);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparisonOperator);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				match(T__10);
				setState(300);
				match(T__8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				match(T__9);
				setState(302);
				match(T__8);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				match(T__10);
				setState(304);
				match(T__9);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(305);
				match(T__11);
				setState(306);
				match(T__8);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(307);
				match(T__10);
				setState(308);
				match(T__8);
				setState(309);
				match(T__9);
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

	public static class ValueContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TextLiteralContext textLiteral() {
			return getRuleContext(TextLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_value);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				uid();
				}
				break;
			case TEXT_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				textLiteral();
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				decimalLiteral();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(T__12);
				setState(316);
				uid();
				setState(317);
				match(T__12);
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

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(MysqlQueryParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(DECIMAL_LITERAL);
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

	public static class TextLiteralContext extends ParserRuleContext {
		public TerminalNode TEXT_STRING() { return getToken(MysqlQueryParser.TEXT_STRING, 0); }
		public TextLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitTextLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitTextLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextLiteralContext textLiteral() throws RecognitionException {
		TextLiteralContext _localctx = new TextLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_textLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(TEXT_STRING);
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

	public static class SelectElementContext extends ParserRuleContext {
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
	 
		public SelectElementContext() { }
		public void copyFrom(SelectElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectFunctionElementContext extends SelectElementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(MysqlQueryParser.AS, 0); }
		public SelectFunctionElementContext(SelectElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterSelectFunctionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitSelectFunctionElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitSelectFunctionElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectColumnElementContext extends SelectElementContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(MysqlQueryParser.AS, 0); }
		public SelectColumnElementContext(SelectElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterSelectColumnElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitSelectColumnElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitSelectColumnElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_selectElement);
		int _la;
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new SelectColumnElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				fullColumnName();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(326);
						match(AS);
						}
					}

					setState(329);
					uid();
					}
				}

				}
				break;
			case MAX:
			case SUM:
			case AVG:
			case MIN:
			case COUNT:
				_localctx = new SelectFunctionElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				functionCall();
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(333);
						match(AS);
						}
					}

					setState(336);
					uid();
					}
				}

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

	public static class FullColumnNameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public FullColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterFullColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitFullColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitFullColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullColumnNameContext fullColumnName() throws RecognitionException {
		FullColumnNameContext _localctx = new FullColumnNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fullColumnName);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				tableName();
				setState(343);
				match(T__0);
				setState(344);
				column_name();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AggregateFunctionCallContext extends FunctionCallContext {
		public AggregateWindowedFunctionContext aggregateWindowedFunction() {
			return getRuleContext(AggregateWindowedFunctionContext.class,0);
		}
		public AggregateFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterAggregateFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitAggregateFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitAggregateFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionCall);
		try {
			_localctx = new AggregateFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			aggregateWindowedFunction();
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

	public static class AggregateWindowedFunctionContext extends ParserRuleContext {
		public Token starArg;
		public Token aggregator;
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public TerminalNode AVG() { return getToken(MysqlQueryParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(MysqlQueryParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(MysqlQueryParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(MysqlQueryParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(MysqlQueryParser.COUNT, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(MysqlQueryParser.DISTINCT, 0); }
		public AggregateWindowedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateWindowedFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterAggregateWindowedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitAggregateWindowedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitAggregateWindowedFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateWindowedFunctionContext aggregateWindowedFunction() throws RecognitionException {
		AggregateWindowedFunctionContext _localctx = new AggregateWindowedFunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_aggregateWindowedFunction);
		int _la;
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << SUM) | (1L << AVG) | (1L << MIN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(351);
				match(T__1);
				setState(352);
				functionArg();
				setState(353);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(COUNT);
				setState(356);
				match(T__1);
				setState(361);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(357);
					((AggregateWindowedFunctionContext)_localctx).starArg = match(T__4);
					}
					break;
				case T__2:
				case ID:
					{
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(358);
						functionArg();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(363);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(COUNT);
				setState(365);
				match(T__1);
				setState(366);
				((AggregateWindowedFunctionContext)_localctx).aggregator = match(DISTINCT);
				setState(367);
				functionArgs();
				setState(368);
				match(T__2);
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

	public static class FunctionArgContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitFunctionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitFunctionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			column_name();
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

	public static class FunctionArgsContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitFunctionArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitFunctionArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			column_name();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(375);
				match(T__3);
				setState(376);
				column_name();
				}
				}
				setState(381);
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

	public static class UidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MysqlQueryParser.ID, 0); }
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).enterUid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlQueryListener ) ((MysqlQueryListener)listener).exitUid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlQueryVisitor ) return ((MysqlQueryVisitor<? extends T>)visitor).visitUid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_uid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return logicExpression_sempred((LogicExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicExpression_sempred(LogicExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0183\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\3\4"+
		"\5\4T\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\7\tw\n\t\f\t\16\tz\13\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0082\n\13"+
		"\f\13\16\13\u0085\13\13\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0094\n\r\3\r\5\r\u0097\n\r\3\r\5\r\u009a\n\r"+
		"\5\r\u009c\n\r\3\r\5\r\u009f\n\r\3\r\5\r\u00a2\n\r\3\r\3\r\3\16\3\16\5"+
		"\16\u00a8\n\16\3\16\3\16\7\16\u00ac\n\16\f\16\16\16\u00af\13\16\3\17\3"+
		"\17\3\17\7\17\u00b4\n\17\f\17\16\17\u00b7\13\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00bd\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00d9\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e0\n\21\f\21\16"+
		"\21\u00e3\13\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00eb\n\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00f1\n\21\f\21\16\21\u00f4\13\21\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u00fb\n\22\f\22\16\22\u00fe\13\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u0108\n\24\f\24\16\24\u010b\13\24\3\25\3\25\3\25"+
		"\3\25\5\25\u0111\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u0118\n\25\3\26\3"+
		"\26\5\26\u011c\n\26\3\27\3\27\5\27\u0120\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0129\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0139\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0142\n\32\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u014a\n\35\3"+
		"\35\5\35\u014d\n\35\3\35\3\35\5\35\u0151\n\35\3\35\5\35\u0154\n\35\5\35"+
		"\u0156\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u015d\n\36\3\37\3\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \5 \u016a\n \5 \u016c\n \3 \3 \3 \3 \3 \3 \3 \5 \u0175"+
		"\n \3!\3!\3\"\3\"\3\"\7\"\u017c\n\"\f\"\16\"\u017f\13\"\3#\3#\3#\2\3 "+
		"$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2"+
		"\5\3\2\20\21\3\2\60\61\3\2\32\35\2\u0198\2F\3\2\2\2\4M\3\2\2\2\6S\3\2"+
		"\2\2\bU\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16d\3\2\2\2\20s\3\2\2\2\22{\3\2"+
		"\2\2\24~\3\2\2\2\26\u0086\3\2\2\2\30\u008e\3\2\2\2\32\u00a7\3\2\2\2\34"+
		"\u00bc\3\2\2\2\36\u00be\3\2\2\2 \u00ea\3\2\2\2\"\u00f5\3\2\2\2$\u00ff"+
		"\3\2\2\2&\u0102\3\2\2\2(\u010c\3\2\2\2*\u0119\3\2\2\2,\u011d\3\2\2\2."+
		"\u0128\3\2\2\2\60\u0138\3\2\2\2\62\u0141\3\2\2\2\64\u0143\3\2\2\2\66\u0145"+
		"\3\2\2\28\u0155\3\2\2\2:\u015c\3\2\2\2<\u015e\3\2\2\2>\u0174\3\2\2\2@"+
		"\u0176\3\2\2\2B\u0178\3\2\2\2D\u0180\3\2\2\2FG\7\64\2\2G\3\3\2\2\2HN\7"+
		"\64\2\2IJ\5\2\2\2JK\7\3\2\2KL\7\64\2\2LN\3\2\2\2MH\3\2\2\2MI\3\2\2\2N"+
		"\5\3\2\2\2OT\7\64\2\2PQ\7\64\2\2QR\7\3\2\2RT\7\64\2\2SO\3\2\2\2SP\3\2"+
		"\2\2T\7\3\2\2\2UV\7\64\2\2V\t\3\2\2\2WX\t\2\2\2X\13\3\2\2\2YZ\7\23\2\2"+
		"Z[\7\31\2\2[`\5\4\3\2\\]\7\4\2\2]^\5\20\t\2^_\7\5\2\2_a\3\2\2\2`\\\3\2"+
		"\2\2`a\3\2\2\2ab\3\2\2\2bc\79\2\2c\r\3\2\2\2de\7\25\2\2ef\7\26\2\2fk\5"+
		"\4\3\2gh\7\4\2\2hi\5\24\13\2ij\7\5\2\2jl\3\2\2\2kg\3\2\2\2kl\3\2\2\2l"+
		"m\3\2\2\2mn\7\27\2\2no\7\4\2\2op\5\26\f\2pq\7\5\2\2qr\79\2\2r\17\3\2\2"+
		"\2sx\5\22\n\2tu\7\6\2\2uw\5\22\n\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2"+
		"\2\2y\21\3\2\2\2zx\3\2\2\2{|\5\6\4\2|}\5\n\6\2}\23\3\2\2\2~\u0083\5\6"+
		"\4\2\177\u0080\7\6\2\2\u0080\u0082\5\6\4\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u008b\5\62\32\2\u0087\u0088\7\6\2\2\u0088\u008a\5"+
		"\62\32\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\24\2"+
		"\2\u008f\u009b\5\32\16\2\u0090\u0091\7\30\2\2\u0091\u0093\5\34\17\2\u0092"+
		"\u0094\5\36\20\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3"+
		"\2\2\2\u0095\u0097\5\"\22\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u009a\5$\23\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0090\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009f\5&\24\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\5(\25\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\79\2\2\u00a4\31\3\2\2\2"+
		"\u00a5\u00a8\7\7\2\2\u00a6\u00a8\58\35\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\7\6\2\2\u00aa\u00ac\58\35\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\33\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b5\5\4\3\2\u00b1\u00b2"+
		"\7\6\2\2\u00b2\u00b4\5\4\3\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bd\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\7\5\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\35\3\2\2"+
		"\2\u00be\u00bf\7!\2\2\u00bf\u00c0\5 \21\2\u00c0\37\3\2\2\2\u00c1\u00c2"+
		"\b\21\1\2\u00c2\u00c3\5:\36\2\u00c3\u00c4\5\60\31\2\u00c4\u00c5\5\62\32"+
		"\2\u00c5\u00eb\3\2\2\2\u00c6\u00c7\5:\36\2\u00c7\u00c8\5\60\31\2\u00c8"+
		"\u00c9\5:\36\2\u00c9\u00eb\3\2\2\2\u00ca\u00cb\5:\36\2\u00cb\u00cc\5\60"+
		"\31\2\u00cc\u00cd\7\4\2\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf\7\5\2\2\u00cf"+
		"\u00eb\3\2\2\2\u00d0\u00d1\5:\36\2\u00d1\u00d2\7+\2\2\u00d2\u00d3\5\62"+
		"\32\2\u00d3\u00d4\7,\2\2\u00d4\u00d5\5\62\32\2\u00d5\u00eb\3\2\2\2\u00d6"+
		"\u00d8\5:\36\2\u00d7\u00d9\7&\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7-\2\2\u00db\u00dc\7\4\2\2\u00dc"+
		"\u00e1\5\62\32\2\u00dd\u00de\7\6\2\2\u00de\u00e0\5\62\32\2\u00df\u00dd"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\5\2\2\u00e5\u00eb\3\2"+
		"\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8\5 \21\2\u00e8\u00e9\7\5\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00c1\3\2\2\2\u00ea\u00c6\3\2\2\2\u00ea\u00ca\3\2"+
		"\2\2\u00ea\u00d0\3\2\2\2\u00ea\u00d6\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb"+
		"\u00f2\3\2\2\2\u00ec\u00ed\f\t\2\2\u00ed\u00ee\5.\30\2\u00ee\u00ef\5 "+
		"\21\n\u00ef\u00f1\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3!\3\2\2\2\u00f4\u00f2\3\2\2\2"+
		"\u00f5\u00f6\7\"\2\2\u00f6\u00f7\7#\2\2\u00f7\u00fc\5,\27\2\u00f8\u00f9"+
		"\7\6\2\2\u00f9\u00fb\5,\27\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd#\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00ff\u0100\7%\2\2\u0100\u0101\5 \21\2\u0101%\3\2\2\2\u0102\u0103\7$"+
		"\2\2\u0103\u0104\7#\2\2\u0104\u0109\5*\26\2\u0105\u0106\7\6\2\2\u0106"+
		"\u0108\5*\26\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\'\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0117"+
		"\7\62\2\2\u010d\u010e\5\64\33\2\u010e\u010f\7\6\2\2\u010f\u0111\3\2\2"+
		"\2\u0110\u010d\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0118"+
		"\5\64\33\2\u0113\u0114\5\64\33\2\u0114\u0115\7\63\2\2\u0115\u0116\5\64"+
		"\33\2\u0116\u0118\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0113\3\2\2\2\u0118"+
		")\3\2\2\2\u0119\u011b\5:\36\2\u011a\u011c\t\3\2\2\u011b\u011a\3\2\2\2"+
		"\u011b\u011c\3\2\2\2\u011c+\3\2\2\2\u011d\u011f\5:\36\2\u011e\u0120\t"+
		"\3\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120-\3\2\2\2\u0121\u0129"+
		"\7,\2\2\u0122\u0123\7\b\2\2\u0123\u0129\7\b\2\2\u0124\u0129\7\t\2\2\u0125"+
		"\u0129\7/\2\2\u0126\u0127\7\n\2\2\u0127\u0129\7\n\2\2\u0128\u0121\3\2"+
		"\2\2\u0128\u0122\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129/\3\2\2\2\u012a\u0139\7\13\2\2\u012b\u0139\7\f\2\2"+
		"\u012c\u0139\7\r\2\2\u012d\u012e\7\r\2\2\u012e\u0139\7\13\2\2\u012f\u0130"+
		"\7\f\2\2\u0130\u0139\7\13\2\2\u0131\u0132\7\r\2\2\u0132\u0139\7\f\2\2"+
		"\u0133\u0134\7\16\2\2\u0134\u0139\7\13\2\2\u0135\u0136\7\r\2\2\u0136\u0137"+
		"\7\13\2\2\u0137\u0139\7\f\2\2\u0138\u012a\3\2\2\2\u0138\u012b\3\2\2\2"+
		"\u0138\u012c\3\2\2\2\u0138\u012d\3\2\2\2\u0138\u012f\3\2\2\2\u0138\u0131"+
		"\3\2\2\2\u0138\u0133\3\2\2\2\u0138\u0135\3\2\2\2\u0139\61\3\2\2\2\u013a"+
		"\u0142\5D#\2\u013b\u0142\5\66\34\2\u013c\u0142\5\64\33\2\u013d\u013e\7"+
		"\17\2\2\u013e\u013f\5D#\2\u013f\u0140\7\17\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013a\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u013c\3\2\2\2\u0141\u013d\3\2"+
		"\2\2\u0142\63\3\2\2\2\u0143\u0144\78\2\2\u0144\65\3\2\2\2\u0145\u0146"+
		"\7\65\2\2\u0146\67\3\2\2\2\u0147\u014c\5:\36\2\u0148\u014a\7\22\2\2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\5D"+
		"#\2\u014c\u0149\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0156\3\2\2\2\u014e"+
		"\u0153\5<\37\2\u014f\u0151\7\22\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3"+
		"\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\5D#\2\u0153\u0150\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0147\3\2\2\2\u0155\u014e\3\2"+
		"\2\2\u01569\3\2\2\2\u0157\u015d\5\6\4\2\u0158\u0159\5\4\3\2\u0159\u015a"+
		"\7\3\2\2\u015a\u015b\5\6\4\2\u015b\u015d\3\2\2\2\u015c\u0157\3\2\2\2\u015c"+
		"\u0158\3\2\2\2\u015d;\3\2\2\2\u015e\u015f\5> \2\u015f=\3\2\2\2\u0160\u0161"+
		"\t\4\2\2\u0161\u0162\7\4\2\2\u0162\u0163\5@!\2\u0163\u0164\7\5\2\2\u0164"+
		"\u0175\3\2\2\2\u0165\u0166\7\36\2\2\u0166\u016b\7\4\2\2\u0167\u016c\7"+
		"\7\2\2\u0168\u016a\5@!\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016c\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u0175\7\5\2\2\u016e\u016f\7\36\2\2\u016f\u0170\7\4\2\2\u0170"+
		"\u0171\7 \2\2\u0171\u0172\5B\"\2\u0172\u0173\7\5\2\2\u0173\u0175\3\2\2"+
		"\2\u0174\u0160\3\2\2\2\u0174\u0165\3\2\2\2\u0174\u016e\3\2\2\2\u0175?"+
		"\3\2\2\2\u0176\u0177\5\6\4\2\u0177A\3\2\2\2\u0178\u017d\5\6\4\2\u0179"+
		"\u017a\7\6\2\2\u017a\u017c\5\6\4\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2"+
		"\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017eC\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u0180\u0181\7\64\2\2\u0181E\3\2\2\2*MS`kx\u0083\u008b\u0093\u0096"+
		"\u0099\u009b\u009e\u00a1\u00a7\u00ad\u00b5\u00bc\u00d8\u00e1\u00ea\u00f2"+
		"\u00fc\u0109\u0110\u0117\u011b\u011f\u0128\u0138\u0141\u0149\u014c\u0150"+
		"\u0153\u0155\u015c\u0169\u016b\u0174\u017d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}