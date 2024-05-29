package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServicelmp implements CarService {

    private List<Car> carList = Arrays.asList(
            new Car("BMW", "m5", 2000),
            new Car("Reno", "Logan", 2010),
            new Car("Lexus", "CLX", 2015),
            new Car("Lada", "Priora", 2018),
            new Car("Moscvich", "standart", 2020)
    );

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return carList.stream()
                .limit(count >= 5 ? carList.size() : count)
                .collect(Collectors.toList());
    }
}
