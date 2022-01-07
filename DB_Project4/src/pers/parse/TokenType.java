package pers.parse;

/**
 * 单词类型
 */
public enum TokenType {
    /**错误*/
    Error,
    /**加号*/
    Plus,
    /**减号*/
    Minus,
    /**乘号*/
    Mul,
    /**除号*/
    Div,
    /**句子结尾*/
    EndOfText,
    /**左括号*/
    OpenParenthesis,
    /**右括号*/
    ClosedParenthesis,
    /**数字*/
    Number,
    /**sin函数*/
    Sin,
    /**cos函数*/
    Cos,
}
