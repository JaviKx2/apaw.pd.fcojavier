package designpatterns.visitor.figure;

import java.util.List;
import java.util.ArrayList;

public class VisitorFigureMain {
	
	List<Figure> figures;
	FiguresManager manager;
	
	public VisitorFigureMain(){
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
	
	private void test(){
		System.out.println("Area: " + manager.totalArea());
		System.out.println("Number Of Sides: " + manager.totalNumberOfSides());
	}
	
	public static void main(String[] args) {
		new VisitorFigureMain().test();
	}

}
