package web.controller;

import web.Service.ServiceCar;
import model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Car {
    private final ServiceCar serviceCar;

    @Autowired
    public Car(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }


    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Cars> carList;
        if (count != null && count > 0 && count <= 5) {
            carList = serviceCar.show(count);
        } else {
            carList = serviceCar.returnCars();
        }
        model.addAttribute("listCars", carList);
        return "cars";
    }
}
