package designpatterns.decorator.vehicle;

public class DecoratorMain {

    
    public static void main(String[] args){
        
        VehicleComponent vehicle = new Vehicle("Audio R8", 150000);
        VehicleComponent MP3 = new MP3(vehicle, 500.69, "Añade música para tu coche por sólo ");
        VehicleComponent GPS = new GPS(MP3, 1589.12, "Añade GPS por "); 

        
        
  
    }
}
