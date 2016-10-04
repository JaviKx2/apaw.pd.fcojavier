package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {
    private static final String[] textValue = {"Zéro", "Un", "Deux", "Trois", "Quatre", "Cinq"};

    public NaturalNumberFr(int value) {
        super(value);
    }

    @Override
    public String[] getTextValues() {
        return textValue;
    }

}
