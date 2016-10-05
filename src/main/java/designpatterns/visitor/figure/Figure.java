package designpatterns.visitor.figure;

public abstract class Figure {

    public Figure(String description) {
    }

    public abstract void acceptVisitFrom(AreaManager areaManager);

    public abstract void acceptVisitFrom(SidesManager sidesManager);

}
