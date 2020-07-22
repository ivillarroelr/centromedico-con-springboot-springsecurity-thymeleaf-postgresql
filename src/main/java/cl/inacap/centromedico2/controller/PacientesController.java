package cl.inacap.centromedico2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacientesController {
    

    @GetMapping("/pacientes")
    public String pacientes(){
        return "pacientes";
    }

    @GetMapping("/nuevopaciente")
    public String nuevopaciente(){
        return "nuevopaciente";
    }
}