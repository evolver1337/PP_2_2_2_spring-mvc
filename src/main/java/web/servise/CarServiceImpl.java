package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = new ArrayList<>();

    public CarServiceImpl(){
        carList.add(new Car("Mercedes", "black", 2017));
        carList.add(new Car("BMW", "white", 2015));
        carList.add(new Car("AUDI", "red", 2012));
        carList.add(new Car("Peugeot", "blue", 2017));
        carList.add(new Car("Volkswagen", "green", 2013));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
