package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator{

    @Override
    protected NaturalNumber createNaturalNumber() {
        return new NaturalNumberEn(0);
    }

}
