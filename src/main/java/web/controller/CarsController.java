package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarServiseImpl;

import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarServiseImpl carServise;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count") int count, Model model) {
        List<Car> cars = carServise.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
