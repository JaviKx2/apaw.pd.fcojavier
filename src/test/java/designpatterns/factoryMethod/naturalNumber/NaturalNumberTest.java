package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberTest {
    private int value;

    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberTest(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }

    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumberTest.textValue[this.value];
        } else {
            return "???";
        }
    }

}
