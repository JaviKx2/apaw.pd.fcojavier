package designpatterns.visitor.figure;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
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
