package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Camry", 2022),
            new Car("BMW", "X5", 2021),
            new Car("Mercedes-Benz", "E-Class", 2023),
            new Car("Audi", "A6", 2020),
            new Car("Kia", "K5", 2022)
    );

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }

        return cars.subList(0, Math.max(0, count));
    }
}
