package tarefa_m15;

import factory.Car;
import factory.CarFactory;
import factory.EletricCarFactory;
import factory.GasCarFactory;

import java.util.Objects;

public class Demo {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Xunda", "4x4", "ELECTRIC");
        CarFactory carFactory = getCarFactory(cliente1);
        Car car1 = carFactory.create(cliente1.getRequestedType());
    }

    private static CarFactory getCarFactory(Cliente cliente){
        if (Objects.equals(cliente.getPreferenceMotor(), "GAS")){
            return new GasCarFactory();
        } else {
            return new EletricCarFactory();
        }
    }
}
