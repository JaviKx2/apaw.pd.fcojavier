package designpatterns.decorator.vehicle;

public class EDS extends VehicleDecorator{

    public EDS(Vehicle vehicle) {
        super(vehicle);
    }
    
    public EDS(VehicleComponent vehicleComponent, double price, String description) {
        super(vehicleComponent, price, description);
    }

    @Override
    public void view() {
        super.view();
    }

}
