package designpatterns.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberManagerTest {
    NaturalNumberManager naturalNumberManager;

    NaturalNumberCreator naturalNumberCreator;

    @Before
    public void setUp() {
        naturalNumberManager = new NaturalNumberManager();
    }

    @Test
    public void testNaturalNumberManager() {
        naturalNumberCreator = new NaturalNumberEnCreator();
        naturalNumberManager.setNaturalNumberCreator(naturalNumberCreator);
        naturalNumberManager.createNaturalNumber(0);
        assertEquals(naturalNumberManager.getNaturalNumber().getValue(), new NaturalNumberEn(0).getValue());
        assertEquals(naturalNumberManager.getNaturalNumber().getTextValue(), new NaturalNumberEn(0).getTextValue());

        naturalNumberManager.createNaturalNumber(1);
        assertEquals(naturalNumberManager.getNaturalNumber().getValue(), new NaturalNumberEn(1).getValue());
        assertEquals(naturalNumberManager.getNaturalNumber().getTextValue(), new NaturalNumberEn(1).getTextValue());

        naturalNumberManager.createNaturalNumber(2);
        assertEquals(naturalNumberManager.getNaturalNumber().getValue(), new NaturalNumberEn(2).getValue());
        assertEquals(naturalNumberManager.getNaturalNumber().getTextValue(), new NaturalNumberEn(2).getTextValue());

        naturalNumberManager.createNaturalNumber(3);
        assertEquals(naturalNumberManager.getNaturalNumber().getValue(), new NaturalNumberEn(3).getValue());
        assertEquals(naturalNumberManager.getNaturalNumber().getTextValue(), new NaturalNumberEn(3).getTextValue());

        naturalNumberManager.createNaturalNumber(4);
        assertEquals(naturalNumberManager.getNaturalNumber().getValue(), new NaturalNumberEn(4).getValue());
        assertEquals(naturalNumberManager.getNaturalNumber().getTextValue(), new NaturalNumberEn(4).getTextValue());

        naturalNumberManager.createNaturalNumber(5);
        assertEquals(naturalNumberManager.getNaturalNumber().getValue(), new NaturalNumberEn(5).getValue());
        assertEquals(naturalNumberManager.getNaturalNumber().getTextValue(), new NaturalNumberEn(5).getTextValue());

        naturalNumberManager.createNaturalNumber(6);
        assertEquals(naturalNumberManager.getNaturalNumber().getValue(), new NaturalNumberEn(6).getValue());
        assertEquals(naturalNumberManager.getNaturalNumber().getTextValue(), new NaturalNumberEn(6).getTextValue());
    }

}
