package vehicle.factory;

import vehicle.TwoWheeler;
import vehicle.Vehicle;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
