package tarefa_m15.factory;

import cars.*;

public class EletricCarFactory extends CarFactory{

    @Override
    Car retrieveCar(String requestedType) {
        return switch (requestedType) {
            case "SPORT" -> new Polestar2("Polestar 2",450, 250, 42000.00);
            case "4x4" -> new FordF150Lightning("Ford F-150 Lightning",285, 180, 50000.00);
            case "FAMILY" -> new ChevroletBoltEV("Chevrolet Bolt EV",280, 179, 37000.00);
            default -> {
                System.out.println("The request car was unfortunately not available.");
                yield null;
            }
        };
    }
}
