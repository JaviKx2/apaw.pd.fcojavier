package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber{
    private static final String[] textValue = {"Zero", "One", "Two", "Three", "Four", "Five"};
    
    public NaturalNumberEn(int value) {
        super(value);
    }

    @Override
    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumberEn.textValue[this.value];
        } else {
            return "???";
        }
    }

}
