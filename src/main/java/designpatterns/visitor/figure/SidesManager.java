package designpatterns.visitor.figure;

public class SidesManager implements FigureVisitor{
    private int sides;
    
    @Override
    public void handleVisitFrom(Circle circle) {
        sides += Double.POSITIVE_INFINITY;
    }
    
    @Override
    public void handleVisitFrom(Square square){
        sides += 4;
    }
    
    @Override
    public void handleVisitFrom(Triangle square){
        sides += 3;
    }
    
    public int getSides(){
        return sides;
    }

}
