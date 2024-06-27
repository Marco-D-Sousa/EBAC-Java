package tarefa_m17;

import cars.Car;
import cars.Honda;
import cars.Opel;
import cars.Toyota;


import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Honda("Civic", "Silver", 2020));
        cars.add(new Opel("Corsa", "Gray", 2018));
        cars.add(new Toyota("Corolla", "Black", 2020));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
