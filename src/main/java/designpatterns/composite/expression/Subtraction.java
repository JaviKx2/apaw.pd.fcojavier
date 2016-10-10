package designpatterns.composite.expression;

public class Subtraction extends ExpressionCompositeNode{

    public Subtraction(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int operate() {
        return expressions[0].operate() - expressions[1].operate();
    }

	@Override
	public String symbol() {
		return "-";
	}

}
