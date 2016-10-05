package designpatterns.visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }
    
    public double getSide(){
        return side;
    }

    @Override
    public String toString() {
        return super.toString();
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
