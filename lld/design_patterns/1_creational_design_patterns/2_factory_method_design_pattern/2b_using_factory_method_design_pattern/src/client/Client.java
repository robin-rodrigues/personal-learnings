package client;

import vehicle.Vehicle;
import vehicle.factory.VehicleFactory;

public class Client {
    private Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory) {
        vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
