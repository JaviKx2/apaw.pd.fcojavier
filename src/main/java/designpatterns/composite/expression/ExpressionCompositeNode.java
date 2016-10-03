package designpatterns.composite.expression;

import java.util.List;

public abstract class ExpressionCompositeNode extends Expression{
    List<Expression> expressions;
   
    public ExpressionCompositeNode(Expression expression1, Expression expression2){
        expressions.add(expression1);
        expressions.add(expression2);
    }

    public abstract int operate();

   
}
