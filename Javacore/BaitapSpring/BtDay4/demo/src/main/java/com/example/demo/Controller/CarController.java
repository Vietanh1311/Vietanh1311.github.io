package com.example.demo.Controller;

import com.example.demo.Repository.CarDao;
import com.example.demo.Request.*;
import com.example.demo.Model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import org.springframework.ui.Model;

import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    private CarDao cars;

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @GetMapping("/getAll")
    public String getAll(Model model) {
        model.addAttribute("cars", cars.getCars());
        return "getAll";
    }

    @GetMapping("/getbyid")
    public String getId(Model model) {
        model.addAttribute("car", null);
        model.addAttribute("idRequest", new IdRequest());
        return "getById";
    }

    @PostMapping("/getbyid")
    public String getId(@ModelAttribute IdRequest idRequest, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            model.addAttribute("IdRequest", idRequest);
            Optional<Car> car = cars.get(idRequest.getId().intValue());
            if (car.isPresent()) {
                model.addAttribute("car", car.get());
                return "getById";
            }
        }
        return "null";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("newCar",new Car());
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Car newCar, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            cars.add(newCar);
            return getAll(model);
        }
        return "null";
    }
    @GetMapping("/update")
    public String update(Model model) {
        model.addAttribute("updateBook", new Car());
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Car updateCar, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            cars.update(updateCar);
            return getAll(model);
        }
        return "null";
    }
    @GetMapping("/deletebyid")
    public String deleteById( Model model) {
        model.addAttribute("idRequest", new IdRequest());
        return "deletebyid";
    }

    @PostMapping("/deletebyid")
    public String deleteById(@ModelAttribute IdRequest idRequest, BindingResult bindingResult, Model model) {
        cars.deleteByID(idRequest.getId());
        return getAll(model);
    }
    @GetMapping("/searchModel")
    public String searchModel(Model model){
        model.addAttribute("stringRequest", new StringRequest());
        return "searchModel";
    }

    @PostMapping("/searchModel")
    public String searchModel(@ModelAttribute StringRequest stringRequest, BindingResult bindingResult,Model model){
        // model.addAttribute("stringRequest", stringRequest);
        model.addAttribute("cars", cars.searchModel(stringRequest.getStr()));
        return "searchModel";
    }

}
