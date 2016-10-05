package designpatterns.visitor.figure;

public class AreaManager implements FigureVisitor {
    private double area;

    @Override
    public void handleVisitFrom(Circle circle) {
        area += Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void handleVisitFrom(Square square) {
        area += square.getSide() * square.getSide();
    }

    @Override
    public void handleVisitFrom(Triangle triangle) {
        area += triangle.getBase() * triangle.getHeight() / 2;
    }
    
    public double getArea(){
        return area;
    }
}
