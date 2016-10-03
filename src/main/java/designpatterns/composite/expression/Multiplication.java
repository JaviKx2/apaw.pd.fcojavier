package designpatterns.composite.expression;

public class Multiplication extends ExpressionCompositeNode{

    public Multiplication(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int operate() {
        int result = 0;
        for(Expression expression : expressions){
            result *= expression.operate();
        }
        return result;
    }

}
