import vehicle.Bike;
import vehicle.Car;
import vehicle.Vehicle;
import workshop.Assemble;
import workshop.Produce;

public class BridgeMethodExample {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}