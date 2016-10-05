package designpatterns.decorator.vehicle;

public class Vehicle extends VehicleComponent {
    String modelo;

    double price;

    public Vehicle(String modelo, double price) {
        this.modelo = modelo;
        this.price = price;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void view() {
        System.out.println(modelo + " " + price);

    }
}
