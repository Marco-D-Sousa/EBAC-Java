package factory;

public abstract class CarFactory {

    public Car create(String requestedType) {
        Car car = retrieveCar(requestedType);
        car = prepareCar(car);
        System.out.println(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.clean();
        return car;
    }

    abstract Car retrieveCar(String requestedType);
}
