package cl.inacap.centromedico2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MedicosController {

    @GetMapping("/medicos")
    public String medicos(){
        return "medicos";
    }

    @GetMapping("/nuevomedico")
    public String nuevomedico(){
        return "nuevomedico";
    }
    
}