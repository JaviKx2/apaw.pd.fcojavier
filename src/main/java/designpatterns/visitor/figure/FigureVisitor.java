package designpatterns.visitor.figure;

public interface FigureVisitor {
    public void handleVisitFrom(Circle circle);
    public void handleVisitFrom(Square square);
    public void handleVisitFrom(Triangle triangle);
}
