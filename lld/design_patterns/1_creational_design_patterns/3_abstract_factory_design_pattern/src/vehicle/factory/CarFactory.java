package vehicle.factory;

import vehicle.car.Car;
import vehicle.specification.CarSpecification;

public interface CarFactory {
    Car createCar();

    CarSpecification createSpecification();
}