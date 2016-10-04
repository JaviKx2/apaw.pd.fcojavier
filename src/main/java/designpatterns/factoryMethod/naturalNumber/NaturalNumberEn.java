package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
    private static final String[] textValue = {"Zero", "One", "Two", "Three", "Four", "Five"};

    public NaturalNumberEn(int value) {
        super(value);
    }

    @Override
    public String[] getTextValues() {
        return textValue;
    }

}
