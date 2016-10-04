package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator {

    @Override
    protected NaturalNumber createNaturalNumber(int value) {
        return new NaturalNumberFr(value);
    }

}
