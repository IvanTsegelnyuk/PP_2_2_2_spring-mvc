package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> cars;

    public CarDao() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", 110, 1000));
        cars.add(new Car("Honda", 150, 1200));
        cars.add(new Car("Suzuki", 97, 700));
        cars.add(new Car("Subaru", 120, 900));
        cars.add(new Car("Lexus", 180, 2000));
    }

    public List<Car> getCars() {
        return cars;
    }
}
