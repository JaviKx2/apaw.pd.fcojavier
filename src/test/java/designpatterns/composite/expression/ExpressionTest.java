package designpatterns.composite.expression;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExpressionTest {
    private Expression exp1, exp2, exp3, exp4, exp5, exp6;

    @Before
    public void ini() {
        this.exp1 = new Number(4);
        this.exp2 = new Sum(this.exp1, new Number(2));
        this.exp3 = new Subtraction(this.exp1, new Number(3));
        this.exp4 = new Multiplication(this.exp1, new Number(2));
        this.exp5 = new Division(this.exp1, new Number(3));
        this.exp6 = new Sum(new Subtraction(new Number(3), new Multiplication(
                new Division(this.exp1, new Number(2)), new Number(3))), this.exp1); // ((3-((4/2)*3))+4)
    }

    @Test
    public void testValor() {
        assertEquals(4, this.exp1.operate());
    }

    @Test
    public void TestSuma() {
        assertEquals(6, this.exp2.operate());
    }

    @Test
    public void testResta() {
        assertEquals(1, this.exp3.operate());
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(8, this.exp4.operate());
    }

    @Test
    public void testDivision() {
        assertEquals(1, this.exp5.operate());
    }

    @Test
    public void testCompuesto() {
        assertEquals(1, this.exp6.operate());
    }

    @Test
    public void testToString() {
        assertEquals("((3-((4/2)*3))+4)", this.exp6.toString());
    }
}
