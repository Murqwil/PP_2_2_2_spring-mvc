package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public int getSizeOfListCars(List<Car> someList) {
        return someList.size();
    }
}
