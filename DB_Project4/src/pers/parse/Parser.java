package pers.parse;

import pers.ast.ASTNode;
import pers.ast.ASTNodeType;
import pers.exception.ParserException;

/**
 * 语法解析器
 */
public class Parser {
    /**
     * 单词
     */
    private Token token;

    private String text;

    /**
     * 字符位置指針
     */
    private int m_Index;

    private int length;

    /**
     * 构造函数， 初始化text
     * @param context 输入要解析的字符串语句
     */
    public Parser(String context){
        this.text = context;
        this.length = this.text.length();
    }


    /**
     * 语法解析
     */
    public ASTNode Parse() throws ParserException {
        m_Index = 0;
        /*获得下一个单词*/
        GetNextToken();
        return Expression();
    }


    /**
     * 最终返回
     */
    private ASTNode Expression() throws ParserException {
        ASTNode tnode = Term();
        ASTNode e1node = Expression1();
        return this.CreateNode(ASTNodeType.OperatorPlus, tnode, e1node);
    }

    /**
     *第一层表达式：加减
     */
    private ASTNode Expression1() throws ParserException {
        ASTNode tnode;
        ASTNode e1node;
        switch(token.getType())
        {
            case Plus:
                GetNextToken();
                tnode = Term();
                e1node = Expression1();
                return this.CreateNode(ASTNodeType.OperatorPlus, e1node, tnode);

            case Minus:
                GetNextToken();
                tnode = Term();
                e1node = Expression1();
                return this.CreateNode(ASTNodeType.OperatorMinus, e1node, tnode);
        }
        return CreateNodeNumber(0);
    }

    private ASTNode Term() throws ParserException {
        ASTNode fnode = Factor();
        ASTNode t1node = Term1();
        return CreateNode(ASTNodeType.OperatorMul, fnode, t1node);
    }

    private ASTNode Term1() throws ParserException {
        ASTNode fnode;
        ASTNode t1node;
        switch(token.getType())
        {
            case Mul:
                GetNextToken();
                fnode = Factor();
                t1node = Term1();
                return this.CreateNode(ASTNodeType.OperatorMul,t1node, fnode);

            case Div:
                GetNextToken();
                fnode = Factor();
                t1node = Term1();
                return this.CreateNode(ASTNodeType.OperatorDiv,t1node, fnode);
        }
        return CreateNodeNumber(1);
    }

    private ASTNode Factor() throws ParserException {
        ASTNode node = new ASTNode();
        switch(token.getType())
        {
            case OpenParenthesis:
                GetNextToken();
                node = Expression();
                Match(')');
                return node;
            case Minus:
                GetNextToken();
                node = Factor();
                return this.CreateUnaryNode(TokenType.Minus, node);
            case Number:
                double value = this.token.getValue();
                GetNextToken();
                return CreateNodeNumber(value);
            case Sin:
                GetNextToken();
                node = Factor();
                return this.CreateUnaryNode(TokenType.Sin, node);
            case Cos:
                GetNextToken();
                node = Factor();
                return this.CreateUnaryNode(TokenType.Cos, node);
            default:
            {
                throw new ParserException("Unexpected token " + token.getSymbol() + " at position", this.m_Index);
            }
        }
    }

    private ASTNode CreateNode(ASTNodeType type, ASTNode left, ASTNode right)
    {
        ASTNode node = new ASTNode();
        node.setType(type);
        node.setLeft(left);
        node.setRight(right);


        return node;
    }

    private ASTNode CreateUnaryNode(TokenType type, ASTNode left)
    {
        ASTNode node = new ASTNode();
        switch(type){
            case Minus:
                node.setType(ASTNodeType.UnaryMinus);
                break;
            case Sin:
                node.setType(ASTNodeType.UnarySin);
                break;
            case Cos:
                node.setType(ASTNodeType.UnaryCos);
                break;
        }
        node.setLeft(left);
        node.setRight(null);
        return node;
    }

    private ASTNode CreateNodeNumber(double value)
    {
        ASTNode node = new ASTNode();
        node.setType(ASTNodeType.NumberValue);
        node.setValue(value);

        return node;
    }

    void Match(char expected) throws ParserException {
        if(text.charAt(m_Index-1) == expected)
            GetNextToken();
        else
        {
            throw new ParserException("Unexpected token" + token.getSymbol() + "at position", this.m_Index);
        }
    }

    private void SkipWhitespaces()
    {
        if(m_Index >= this.length){
            return ;
        }
        while(Character.isWhitespace(text.charAt(m_Index))){
            m_Index++;
            if(m_Index >= this.length){
                return ;
            }
        }
    }

    /**
     * 刷新token对象
     */
    private void GetNextToken() throws ParserException {
        // ignore white spaces
        SkipWhitespaces();
        //新 单词 对象
        token = new Token();
        token.setValue(0);
        token.setSymbol('0');

        // 表达式结尾
        if(text.charAt(m_Index) == ';')
        {
            token.setType(TokenType.EndOfText);
            return;
        }

        // 如果读到的字符是一个数字：取一个数
        if(Character.isDigit(text.charAt(m_Index)))
        {
            token.setType(TokenType.Number);
            token.setValue(GetNumber());
            return;
        }

        token.setType(TokenType.Error);

        // 如果当前字符是符号或括号
        switch(text.charAt(m_Index))
        {
            case '+':
                token.setType(TokenType.Plus) ;
                break;
            case '-':
                token.setType(TokenType.Minus) ;
                break;
            case '*':
                token.setType(TokenType.Mul) ;
                break;
            case '/':
                token.setType(TokenType.Div) ;
                break;
            case '(':
                token.setType(TokenType.OpenParenthesis) ;
                break;
            case ')':
                token.setType(TokenType.ClosedParenthesis);
                break;
            case 's':
                //判断sin
                if(m_Index + 2 < this.length){
                    String sub = this.text.substring(m_Index, m_Index+3);
                    if(sub.equals("sin")){
                        token.setType(TokenType.Sin);
                        m_Index+=2;
                    }
                }
                break;
            case 'c':
                if(m_Index + 2 < this.length){
                    String sub = this.text.substring(m_Index, m_Index+3);
                    if(sub.equals("cos")){
                        token.setType(TokenType.Cos);
                        m_Index+=2;
                    }
                }
                //判断cos
                break;
        }
        //不是数字时设为 Error， 如果不是符号则是错误，不是错误则继续向下读
        if(token.getType() != TokenType.Error)
        {
            token.setSymbol(text.charAt(m_Index));
            m_Index++;
        }
        else
        {
            //抛出异常
            throw new ParserException("Unexpected token" + token.getSymbol() + "at position", this.m_Index);
        }
    }

    /**
     * 得到數字
     * @return
     */
    private double GetNumber() throws ParserException {
        SkipWhitespaces();

        int index = m_Index;
        if(m_Index >= this.length){
            return 0;
        }
        while(Character.isDigit(text.charAt(m_Index))) {
            m_Index++;
            if(m_Index >= this.length){
                break;
            }
        }
        if(m_Index < this.length){
            if(text.charAt(m_Index) == '.'){
                m_Index++;
            }
            while(Character.isDigit(text.charAt(m_Index))){
                m_Index++;
            }
        }
        if(m_Index - index == 0){
            throw new ParserException("Number expected but not found!", m_Index);
        }
        String sub = this.text.substring(index, m_Index);
        return Double.parseDouble(sub);
    }

}
