package designpatterns.composite.expression;

public class Number extends Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int operate() {
        return this.number;
    }

}
