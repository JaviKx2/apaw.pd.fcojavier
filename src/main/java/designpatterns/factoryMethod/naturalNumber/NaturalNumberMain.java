package designpatterns.factoryMethod.naturalNumber;

public class NaturalNumberMain {
    public static NaturalNumberCreator[] naturalNumberCreators = new NaturalNumberCreator[] {new NaturalNumberEsCreator(),
            new NaturalNumberEnCreator(), new NaturalNumberFrCreator()};

    public static void main(String[] args) {
        NaturalNumberManager naturalNumberManager = new NaturalNumberManager();
        NaturalNumber number;
        for (int i = 0; i < 3; i++) {
            naturalNumberManager.setNaturalNumberCreator(naturalNumberCreators[i]);
            for (int j = 0; j < 7; j++) {
                naturalNumberManager.createNaturalNumber(j);
                System.out.println(naturalNumberManager.getNaturalNumber());
            }
            for (int j = 0; j < 7; j++) {
                naturalNumberManager.createNaturalNumber(j);
                number = naturalNumberManager.getNaturalNumber();
                number.add(j);
                System.out.println(number);
            }
            for (int j = 0; j < 7; j++) {
                naturalNumberManager.createNaturalNumber(j);
                number = naturalNumberManager.getNaturalNumber();
                number.add(j+1);
                System.out.println(number);
            }
        }
    }

}
