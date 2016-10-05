package designpatterns.decorator.vehicle;

public abstract class VehicleDecorator extends VehicleComponent{
    protected VehicleComponent vehicle;

    protected double price;

    protected String description;

    public VehicleDecorator(VehicleComponent vehicle) {
        this.vehicle = vehicle;
    }
    
    public VehicleDecorator(VehicleComponent vehicle, double price, String description){
        this.vehicle = vehicle;
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void view(){
        vehicle.view();
    }
}
