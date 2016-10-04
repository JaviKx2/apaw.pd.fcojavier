package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator{

    @Override
    protected NaturalNumber createNaturalNumber() {
        return new NaturalNumberFr(0);
    }

}
