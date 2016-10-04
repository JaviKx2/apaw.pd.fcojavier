package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {
    private static final String[] textValue = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco"};

    public NaturalNumberEs(int value) {
        super(value);
    }

    @Override
    public String[] getTextValues() {
        return textValue;
    }
}
