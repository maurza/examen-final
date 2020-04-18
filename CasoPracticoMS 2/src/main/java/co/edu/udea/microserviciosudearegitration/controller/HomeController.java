package co.edu.udea.microserviciosudearegitration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {
    @GetMapping(value = "/")
    public String helloworld(){
        return "Hello world form Spring Boots";
    }
}
