package designpatterns.visitor.figure;

public class Circle extends Figure {

    private double radius;

    public Circle(String description, double radius) {
        super(description);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void acceptVisitFrom(AreaManager areaManager) {
        areaManager.handleVisitFrom(this);
    }

    @Override
    public void acceptVisitFrom(SidesManager sidesManager) {
        sidesManager.handleVisitFrom(this);
    }
}
