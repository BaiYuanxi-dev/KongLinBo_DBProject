package pers.parse;


/**
 *
 */
public class Token {
    /**
     * 单词类型
     */
    private TokenType type;

    /**
     * 运算的值
     */
    private double value;

    /**
     * 单词标志
     */
    private char symbol;

    /**
     * 默认构造函数
     */
    public Token() {}

    /**
     * 构造函数
     * @param type 单词类型
     * @param value 运算的值
     */
    public Token(TokenType type, double value, char symbol){
        this.type = type;
        this.value = value;
        this.symbol = symbol;
    }

    /**
     *
     * @return 单词类型
     */
    public TokenType getType() {
        return type;
    }

    /**
     *
     * @param type 设置单词类型
     */
    public void setType(TokenType type) {
        this.type = type;
    }

    /**
     *
     * @return 单词值
     */
    public double getValue() {
        return value;
    }

    /**
     * 设置单词的值
     * @param value
     */
    public void setValue(double value) {
        this.value = value;
    }


    /**
     *
     * @return 单词是标识
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * 设置单词标识
     * @param symbol
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
