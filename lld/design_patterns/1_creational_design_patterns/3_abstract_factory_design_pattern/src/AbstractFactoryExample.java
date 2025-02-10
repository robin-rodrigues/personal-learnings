import vehicle.car.Car;
import vehicle.factory.CarFactory;
import vehicle.factory.EuropeCarFactory;
import vehicle.factory.NorthAmericaCarFactory;
import vehicle.specification.CarSpecification;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        CarFactory northAmericaCarFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaCarFactory.createCar();
        CarSpecification northAmericaSpecification = northAmericaCarFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpecification.display();

        CarFactory europeCarFactory = new EuropeCarFactory();
        Car europeCar = europeCarFactory.createCar();
        CarSpecification europeSpecification = europeCarFactory.createSpecification();

        europeCar.assemble();
        europeSpecification.display();
    }
}