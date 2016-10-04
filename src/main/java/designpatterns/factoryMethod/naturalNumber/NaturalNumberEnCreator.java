package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

    @Override
    protected NaturalNumber createNaturalNumber(int value) {
        return new NaturalNumberEn(value);
    }

}
