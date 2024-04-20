package web.servise;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCars();
    List<Car> getCars(int count);
}
