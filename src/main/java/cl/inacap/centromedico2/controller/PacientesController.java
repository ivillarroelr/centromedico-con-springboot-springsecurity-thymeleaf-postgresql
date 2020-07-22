package cl.inacap.centromedico2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.inacap.centromedico2.dto.PacienteDTO;
import cl.inacap.centromedico2.model.Paciente;
import cl.inacap.centromedico2.services.IPacienteService;

@Controller
public class PacientesController {
    
    @Autowired
    private IPacienteService service;

    @GetMapping("/pacientes")
    public ModelAndView medicos(){
        ModelAndView model = new ModelAndView();
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = service.listar();
        model.addObject("pacientes", pacientes);
        model.setViewName("pacientes");
        return model;
    }

    @GetMapping("/nuevopaciente")
    public String nuevopaciente(){
        return "nuevopaciente";
    }

    @PostMapping("/crearpaciente")
    public ModelAndView crearMedico(@ModelAttribute("paciente") PacienteDTO paciente){
        ModelAndView model = new ModelAndView();
        Paciente pc = new Paciente();
        pc.setRut(paciente.getRut());
        pc.setNombre(paciente.getNombre());
        pc.setApellido(paciente.getApellido());
        pc.setEdad(paciente.getEdad());
        service.registrar(pc);
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = service.listar();
        model.addObject("pacientes", pacientes);
        model.setViewName("pacientes");
        return model;
    }

    @PostMapping("/borrarpaciente/{rut}")
    public String eliminarMedico(@PathVariable("rut") Integer rut){
        service.eliminar(rut);
        return "redirect:/pacientes";
    }
}