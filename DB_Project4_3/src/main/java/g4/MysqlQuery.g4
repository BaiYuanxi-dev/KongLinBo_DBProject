grammar MysqlQuery;


NUMBER                       :N U M B E R;
VARCHAR                      :V A R C H A R;
AS                              : A S;
CREATE                       : C R E A T E;
SELECT                       : S E L E C T;
INSERT                       : I N S E R T;
INTO                         : I N T O;
VALUES                       : V A L U E S;
FROM                        : F R O M;
TABLE                        : T A B L E;
MAX                         : M A X;
SUM                         : S U M;
AVG                          : A V G;
MIN                          : M I N;
COUNT                     : C O U N T;
ALL                            : A L L;
DISTINCT                  : D I S T I N C T;
WHERE                     : W H E R E;
GROUP                    : G R O U P;
BY                             : B Y ;
ORDER                     : O R D E R;
HAVING                   : H A V I N G;
NOT                          : N O T;
IS                               :  I S ;
TRUE                         : T R U E;
FALSE                        : F A L S E;
UNKNOWN               : U N K N O W N;
 BETWEEN                  : B E T W E E N;
 AND                           :  A N D;
 IN                                :   I N;
 NULL                           : N U L L;
 OR                             : O R ;
 ASC                          : A S C;
 DESC                       : D E S C;
 LIMIT                      : L I M I T ;
 OFFSET                    : O F F S E T;

fragment A      : [aA];
fragment B      : [bB];
fragment C      : [cC];
fragment D      : [dD];
fragment E      : [eE];
fragment F      : [fF];
fragment G      : [gG];
fragment H      : [hH];
fragment I      : [iI];
fragment J      : [jJ];
fragment K      : [kK];
fragment L      : [lL];
fragment M      : [mM];
fragment N      : [nN];
fragment O      : [oO];
fragment P      : [pP];
fragment Q      : [qQ];
fragment R      : [rR];
fragment S      : [sS];
fragment T      : [tT];
fragment U      : [uU];
fragment V      : [vV];
fragment W      : [wW];
fragment X      : [xX];
fragment Y      : [yY];
fragment Z      : [zZ];
fragment HEX_DIGIT:                  [0-9A-F];
fragment DEC_DIGIT:                  [0-9];
fragment LETTER:                         [a-zA-Z];


ID:    ( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )*;
TEXT_STRING :    (  '\'' ( ('\\' '\\') | ('\'' '\'') | ('\\' '\'') | ~('\'') )* '\''  );
ID_LITERAL:   '*'|('@'|'_'|LETTER)(LETTER|DEC_DIGIT|'_')*;
REVERSE_QUOTE_ID :   '`' ~'`'+ '`';
DECIMAL_LITERAL:     DEC_DIGIT+;
EOLINE: ';';
//DATA_TYPE: VARCHAR ;

dbName               : tmpName=ID;
tableName            : tmpName=ID
                      |dbName '.' tmpName=ID;
column_name            :ID
                       | ID '.' ID;
function_name            : tmpName=ID ;
datatype                  :VARCHAR | NUMBER;



createStatement:
        CREATE
        TABLE
        tableName
        ('('createcolumnlist')')?
        EOLINE;
insertStatement:
        INSERT
        INTO
        tableName
        ( '(' columnlist ')' )?
        VALUES
        '('
        valuelist
        ')'
        EOLINE
        ;
createcolumnlist:
        colname_and_type(',' colname_and_type)*;

colname_and_type:
        column_name datatype;
columnlist:
        column_name(',' column_name)*;

valuelist:
        value(',' value)*;

selectStatement:
       SELECT
        selectElements
    (
        FROM tableSources
        ( whereClause )?
        ( groupByCaluse )?
        ( havingCaluse )?
    ) ?
    ( orderByClause )?
    ( limitClause )?
    EOLINE ?
;


selectElements
    : (star='*' | selectElement ) (',' selectElement)*
    ;


tableSources
    : tableName (',' tableName)*
    | '(' selectStatement  ')'
    ;

whereClause
    : WHERE    logicExpression
    ;

 logicExpression
     : logicExpression logicalOperator logicExpression
     | fullColumnName comparisonOperator value
     | fullColumnName comparisonOperator fullColumnName
     | fullColumnName comparisonOperator '(' selectStatement  ')'
     | fullColumnName BETWEEN value AND value
     | fullColumnName NOT? IN '(' value (',' value)*  ')'
     | fullColumnName NOT? IN '(' selectStatement ')'
     | '(' logicExpression ')'
     ;


groupByCaluse
    :   GROUP BY   groupByItem (',' groupByItem)*
    ;
havingCaluse
    :    HAVING  logicExpression
   ;

 orderByClause
    : ORDER BY orderByExpression (',' orderByExpression)*
    ;

 limitClause
    : LIMIT
    (
      (offset=decimalLiteral ',')? limit=decimalLiteral
      | limit=decimalLiteral OFFSET offset=decimalLiteral
    )
    ;

orderByExpression
    : fullColumnName order=(ASC | DESC)?
    ;



groupByItem
    : fullColumnName order=(ASC | DESC)?
    ;

logicalOperator
    : AND | '&' '&'  | '^' | OR | '|' '|'
    ;

comparisonOperator
    : '=' | '>' | '<' | '<' '=' | '>' '='
    | '<' '>' | '!' '=' | '<' '=' '>'
    ;


value
    : uid
    | textLiteral
    | decimalLiteral
    | '"' uid '"'

    ;

decimalLiteral
    : DECIMAL_LITERAL
    ;
textLiteral
    : TEXT_STRING
    ;

selectElement
    : fullColumnName (AS? uid)?      #selectColumnElement
    | functionCall (AS? uid)?               #selectFunctionElement
    ;


fullColumnName
    : column_name
    | tableName '.' column_name
    ;

functionCall
   :  aggregateWindowedFunction     #aggregateFunctionCall
    ;

aggregateWindowedFunction
    : (AVG | MAX | MIN | SUM) '(' functionArg ')'
    | COUNT '(' (starArg='*' |  functionArg?) ')'
    | COUNT '(' aggregator=DISTINCT functionArgs ')'
    ;

functionArg
    :  column_name
    ;

functionArgs
    : column_name (',' column_name)*
    ;

uid
    : ID
    ;



 WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

expression: term exp1;

exp1: '+' term exp1
    | '-' term exp1
    |
    ;
term: subterm term1;
term1: '*' subterm term1
     | '/' subterm term1
     |;
subterm : factor subterm1;
subterm1 : '^' factor subterm1|;
factor : '(' expression')'
        | '-' factor
        | DECIMAL_LITERAL
        | 'sin'factor
        | 'cos'factor;
