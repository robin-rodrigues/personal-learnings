package vehicle.factory;

import vehicle.FourWheeler;
import vehicle.Vehicle;

public class FourWheelerFactory  implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}