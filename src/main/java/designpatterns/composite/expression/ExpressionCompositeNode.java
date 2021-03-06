package designpatterns.composite.expression;

public abstract class ExpressionCompositeNode extends Expression {
	Expression[] expressions;

	public ExpressionCompositeNode(Expression expression1, Expression expression2) {
		expressions = new Expression[2];
		expressions[0] = expression1;
		expressions[1] = expression2;
	}

	public abstract int operate();
	
	public abstract String symbol();

	@Override
	public String toString() {
		return "(" + expressions[0].toString() + symbol() + expressions[1].toString() + ")";
	}
	
	
}
