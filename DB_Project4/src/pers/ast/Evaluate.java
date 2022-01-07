package pers.ast;

public class Evaluate {

    public double EvaluateSubtree(ASTNode ast) throws EvaluatorException {
        if(ast == null)
            throw new EvaluatorException("Incorrect syntax tree!");

        if(ast.getType() == ASTNodeType.NumberValue)
            return ast.getValue();
        else if(ast.getType() == ASTNodeType.UnaryMinus)
            return -EvaluateSubtree(ast.getLeft());
        else if (ast.getType() == ASTNodeType.UnarySin){
//            return  Math.sin(EvaluateSubtree(ast.getLeft()));
            return Math.sin(EvaluateSubtree(ast.getLeft()) /180 * Math.PI);
        } else if (ast.getType() == ASTNodeType.UnaryCos){
//            return  Math.cos(EvaluateSubtree(ast.getLeft()));
            return Math.cos(EvaluateSubtree(ast.getLeft())/ 180 * Math.PI);
        }
        else
        {
            double v1 = EvaluateSubtree(ast.getLeft());
            double v2 = EvaluateSubtree(ast.getRight());
            switch(ast.getType())
            {
                case OperatorPlus:  return v1 + v2;
                case OperatorMinus: return v1 - v2;
                case OperatorMul:   return v1 * v2;
                case OperatorDiv:   return v1 / v2;
            }
        }

        throw new EvaluatorException("Incorrect syntax tree!");
    }

    public double Evaluate(ASTNode ast) throws EvaluatorException {
        if(ast == null)
            throw new EvaluatorException("Incorrect abstract syntax tree");

        return this.EvaluateSubtree(ast);
    }
}