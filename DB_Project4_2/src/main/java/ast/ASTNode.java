package ast;

public class ASTNode
{

    private ASTNodeType Type;
    private double Value;
    private ASTNode    Left;
    private ASTNode    Right;

    public ASTNode()
    {
        Type = ASTNodeType.Undefined;
        Value = 0;
        Left = null;
        Right = null;
    }

    public ASTNodeType getType() {
        return Type;
    }

    public void setType(ASTNodeType type) {
        Type = type;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }

    public ASTNode getLeft() {
        return Left;
    }

    public void setLeft(ASTNode left) {
        Left = left;
    }

    public ASTNode getRight() {
        return Right;
    }

    public void setRight(ASTNode right) {
        Right = right;
    }
};