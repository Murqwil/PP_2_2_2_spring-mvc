package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.repository.ListOfCars;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap modelMap) {
        ListOfCars listOfCars = new ListOfCars();

        if (count == null || count >= 5) {
            modelMap.addAttribute("cars", listOfCars.getCars());
        } else if (count > 0) {
            modelMap.addAttribute("cars", listOfCars.getCars().subList(0, Math.min(count, listOfCars.getCars().size())));
        } else {
            modelMap.addAttribute("cars", List.of());
        }
        return "cars";
    }
}
