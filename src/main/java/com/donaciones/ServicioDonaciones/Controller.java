package com.donaciones.ServicioDonaciones;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@RestController
public class Controller {
    @GetMapping("/donaciones")
    @RolesAllowed({"READ_EMPLOYEE"})
    public String getProduct(Principal principal){
        return "La respuesta del servicio: " + principal.getName();
    }

}
