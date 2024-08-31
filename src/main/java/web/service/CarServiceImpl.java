package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCarsByCount(Integer count) {
        List<Car> allCars = carRepository.getCars();
        if (count == null || count >= 5) {
            return allCars;
        } else if (count > 0) {
            return allCars.subList(0, Math.min(count, allCars.size()));
        } else {
            return List.of();
        }
    }
}
