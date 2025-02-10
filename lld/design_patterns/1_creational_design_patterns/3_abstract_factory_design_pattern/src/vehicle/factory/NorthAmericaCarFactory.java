package vehicle.factory;

import vehicle.car.Car;
import vehicle.car.Sedan;
import vehicle.specification.CarSpecification;
import vehicle.specification.NorthAmericaSpecification;

public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}