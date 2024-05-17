package factory;

import cars.FordMustangGT;
import cars.HondaOdyssey;
import cars.JeepWrangler;

public class GasCarFactory extends CarFactory{

    @Override
    Car retrieveCar(String requestedType) {
        return switch (requestedType) {
            case "SPORT" -> new FordMustangGT("Ford Mustang GT",450, 250, 42000.00);
            case "4x4" -> new JeepWrangler("Jeep Wrangler",285, 180, 50000.00);
            case "FAMILY" -> new HondaOdyssey("Honda Odyssey",280, 179, 37000.00);
            default -> {
                System.out.println("The request car was unfortunately not available.");
                yield null;
            }
        };
    }
}
