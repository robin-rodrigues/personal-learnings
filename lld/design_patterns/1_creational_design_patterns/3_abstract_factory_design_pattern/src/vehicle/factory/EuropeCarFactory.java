package vehicle.factory;

import vehicle.car.Car;
import vehicle.car.HatchBack;
import vehicle.specification.CarSpecification;
import vehicle.specification.EuropeSpecification;

public class EuropeCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new HatchBack();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}