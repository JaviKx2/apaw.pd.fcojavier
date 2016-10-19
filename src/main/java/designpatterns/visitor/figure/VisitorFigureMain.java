package designpatterns.visitor.figure;

import java.util.List;
import java.util.ArrayList;

public class VisitorFigureMain {
	
	List<Figure> figures;
	FiguresManager manager;
	
	public VisitorFigureMain(){
		figures = new ArrayList<>();
		figures.add(new Circle(5.5));
		figures.add(new Circle(5.5));
		figures.add(new Circle(25.6));
		figures.add(new Triangle(1.5, 2.0));
		figures.add(new Triangle(5.5, 6.9));
		figures.add(new Triangle(10.1, 14.2));
		figures.add(new Square(4.5));
		figures.add(new Square(9.4));
		figures.add(new Square(16.5));
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
