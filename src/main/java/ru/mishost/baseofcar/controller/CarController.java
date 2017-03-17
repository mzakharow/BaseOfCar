package ru.mishost.baseofcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.mishost.baseofcar.model.Car;
import ru.mishost.baseofcar.model.CarLogin;
import ru.mishost.baseofcar.service.CarService;

import javax.validation.Valid;

/**
 * Created by zakharow on 13.03.17.
 */
@Controller
@SessionAttributes("car")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping(value="/signup", method= RequestMethod.GET)
    public String signup(Model model) {
        Car car = new Car();
        model.addAttribute("car", car);
        return "signup";
    }

    @RequestMapping(value="/signup", method=RequestMethod.POST)
    public String signup(@Valid @ModelAttribute("car") Car car, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "signup";
        } else if(carService.findByUserName(car.getUserName())) {
            model.addAttribute("message", "User Name exists. Try another user name");
            return "signup";
        } else {
            carService.save(car);
            model.addAttribute("message", "Saved car details");
            return "redirect:login.html";
        }
    }

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login(Model model) {
        CarLogin carLogin = new CarLogin();
        model.addAttribute("carLogin", carLogin);
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@Valid @ModelAttribute("carLogin") CarLogin carLogin, BindingResult result) {
        if (result.hasErrors()) {
            return "login";
        } else {
            boolean found = carService.findByLogin(carLogin.getUserName(), carLogin.getPassword());
            if (found) {
                return "success";
            } else {
                return "failure";
            }
        }

    }
}
