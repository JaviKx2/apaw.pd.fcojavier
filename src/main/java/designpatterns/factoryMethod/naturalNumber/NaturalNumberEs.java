package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber{
    private int value;

    private static final String[] textValue = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco"};

    public NaturalNumberEs(int value) {
        super(value);
    }

    @Override
    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumberEs.textValue[this.value];
        } else {
            return "???";
        }
    }

}
