package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberManager {
    private NaturalNumber naturalNumber;

    private NaturalNumberCreator naturalNumberCreator;

    public void createNaturalNumber(int value) {
        this.naturalNumber = naturalNumberCreator.createNaturalNumber(value);
    }

    public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
        assert naturalNumberCreator != null;
        this.naturalNumberCreator = naturalNumberCreator;
    }

    public NaturalNumber getNaturalNumber() {
        assert naturalNumber != null;
        return naturalNumber;
    }
}
