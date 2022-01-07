package javaflex;
import java_cup.runtime.*;
import java.io.*;
import javacup.sym;
%%

%class JavaFlexScanner
%public
%line
%column
%cup
%unicode

%{
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type,Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

select=[Ss][Ee][Ll][Ee][Cc][Tt]
from=[Ff][Rr][Oo][Mm]
where=[Ww][Hh][Ee][Rr][Ee]
and=[Aa][Nn][Dd]
or=[Oo][Rr]

string=[a-zA-Z_][a-zA-Z0-9_]*

WhiteSpace=[ \r\n\t\f]

%%

//词法规则段
<YYINITIAL> {
    {select} {return symbol(sym.SELECT);}
    {from} {return symbol(sym.FROM);}
    {where} {return symbol(sym.WHERE);}
    {and} {return symbol(sym.AND);}
    {or} {return symbol(sym.OR);}

    "," { return symbol(sym.COMMA); }
    ";" { return symbol(sym.SEMI); }

    "=" { return symbol(sym.EQUAL); }
    ">" { return symbol(sym.BIGGER); }
    "<" { return symbol(sym.SMALLER); }
    "." { return symbol(sym.DOT); }
    "*" { return symbol(sym.ALL);}
    "^" {return symbol(sym.AND);}
    "(" {return symbol(sym.LPAREN);}
    ")" {return symbol(sym.RPAREN);}
    "\"" {return symbol(sym.QUOTATION);}

    {string} { return symbol(sym.STRING, yytext()); }

    {WhiteSpace} {;}

}




[^] {
    System.out.println( "Error:" + yytext() + " is illegal!");
}