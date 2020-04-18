package co.edu.udea.microserviciosudearegitration.api;
import co.edu.udea.microserviciosudearegitration.dto.userEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody

public class UserApi {
    @GetMapping(value = "/userEntity")
    public Object userEntity(){
        userEntity user = new userEntity(1152702215, "Manuela ", "Uribe", "3107088758", "manuela.uribez@udea.edu.co");
        return user;
    }
}