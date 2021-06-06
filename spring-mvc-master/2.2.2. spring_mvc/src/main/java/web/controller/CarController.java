package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarServiceImp;

@Controller
@RequestMapping("/cars")
public class CarController {

    private CarServiceImp carServiceImp;

    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping
    public String getCars(@RequestParam(defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carServiceImp.getCar(count));
        return "cars";
    }

}
