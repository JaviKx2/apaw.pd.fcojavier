package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator{

    @Override
    protected NaturalNumber createNaturalNumber() {
        return new NaturalNumberEs(0);
    }
    

}
