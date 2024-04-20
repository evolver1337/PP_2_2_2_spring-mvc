package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarServise {

    private List<Car> carList = new ArrayList<>();

    public CarServiseImpl(){
        carList.add(new Car("Mercedes", "black", 2017));
        carList.add(new Car("BMW", "blue", 2015));
        carList.add(new Car("AUDI", "white", 2012));
        carList.add(new Car("Porshe", "red", 2021));
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
