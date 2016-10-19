package designpatterns.visitor.figure;

public class Triangle extends Figure {
    private double base;

    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double getBase(){
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
