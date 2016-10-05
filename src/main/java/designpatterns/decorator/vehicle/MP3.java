package designpatterns.decorator.vehicle;

public class MP3 extends VehicleDecorator {

    public MP3(VehicleComponent vehicleComponent) {
        super(vehicleComponent);
    }

    public MP3(VehicleComponent vehicleComponent, double price, String description) {
        super(vehicleComponent, price, description);
    }

    @Override
    public void view() {
        super.view();
        System.out.println(description + " " + price);
    }

}
