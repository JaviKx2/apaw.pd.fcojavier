package designpatterns.visitor.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figure> figures;

    public FiguresManager() {
        figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }
    
    public void add(List<Figure> figures){
    	this.figures.addAll(figures);
    }

    public double totalArea() {
        AreaManager areaManager = new AreaManager();
        for (Figure figure : figures) {
            figure.acceptVisitFrom(areaManager);
        }
        return areaManager.getArea();
    }

    public double totalNumberOfSides() {
        SidesManager sidesManager = new SidesManager();
        for (Figure figure : figures) {
            figure.acceptVisitFrom(sidesManager);
        }
        return sidesManager.getSides();
    }

}
