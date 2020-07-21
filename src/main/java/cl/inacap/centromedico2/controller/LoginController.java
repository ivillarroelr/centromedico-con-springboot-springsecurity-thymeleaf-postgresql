package cl.inacap.centromedico2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.inacap.centromedico2.dto.UsuarioDTO;

@Controller
public class LoginController {

    @GetMapping({ "/"})
    public String login() {
        return "login";
    }  

    @GetMapping({ "/index"})
    public String index() {
        return "index";
    }  
}