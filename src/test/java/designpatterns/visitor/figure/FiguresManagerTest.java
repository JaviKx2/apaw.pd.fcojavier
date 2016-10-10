package designpatterns.visitor.figure;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FiguresManagerTest {
	
	private List<Figure> figures;
	private FiguresManager manager;
	
	@Before
	public void init(){
		figures = new ArrayList<>();
		figures.add(new Circle("circulo peque", 5.5));
		figures.add(new Circle("circulo mediano", 5.5));
		figures.add(new Circle("circulo grande", 25.6));
		figures.add(new Triangle("triangulo peque", 1.5, 2.0));
		figures.add(new Triangle("triangulo mediano", 5.5, 6.9));
		figures.add(new Triangle("triangulo grande", 10.1, 14.2));
		figures.add(new Square("cuadrado peque", 4.5));
		figures.add(new Square("cuadrado mediano", 9.4));
		figures.add(new Square("cuadrado grande", 16.5));
		manager = new FiguresManager();
		manager.add(figures);
	}

	@Test
	public void testTotalArea() {
		assertEquals(2721.9855169987895, manager.totalArea(), 0.001);
	}

	@Test
	public void testTotalNumberOfSides() {
		assertEquals(-2.147483628E9, manager.totalNumberOfSides(), 0.001);
	}

}
