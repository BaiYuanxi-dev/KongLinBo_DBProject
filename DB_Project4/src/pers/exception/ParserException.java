package pers.exception;

/**
 * 自定义语法解析异常
 */
public class ParserException extends Exception {
    private int value;
    public ParserException() {
        super();
    }
    public ParserException(String msg, int value) {
        super(msg +" " +value);
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}