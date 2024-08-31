package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
    private List<Car> cars = new ArrayList<>();

    public CarRepository() {
        cars.add(new Car("Blue", 1995, "Mitsubishi"));
        cars.add(new Car("Red", 2005, "Volvo"));
        cars.add(new Car("Black", 2024, "Mercedes"));
        cars.add(new Car("White", 2014, "Volga"));
        cars.add(new Car("Green", 2008, "Chevrolet"));
    }
    public List<Car> getCars() {
        return cars;
    }
}
