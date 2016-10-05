package designpatterns.decorator.vehicle;

public class GPS extends VehicleDecorator{

    public GPS(Vehicle vehicle) {
        super(vehicle);
    }
    
    public GPS(VehicleComponent vehicleComponent, double price, String description) {
        super(vehicleComponent, price, description);
    }

    @Override
    public void view() {
        super.view();
        
    }

}
