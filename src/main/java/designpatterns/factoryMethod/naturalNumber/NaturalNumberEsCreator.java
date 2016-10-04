package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

    @Override
    protected NaturalNumber createNaturalNumber(int value) {
        return new NaturalNumberEs(value);
    }

}
