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

import cl.inacap.centromedico2.dto.MedicoDTO;
import cl.inacap.centromedico2.model.Especialidad;
import cl.inacap.centromedico2.model.Medico;
import cl.inacap.centromedico2.services.IEspecialidadService;
import cl.inacap.centromedico2.services.IMedicoService;


@Controller
public class MedicosController {

    @Autowired
    IMedicoService service;

    @Autowired
    IEspecialidadService serviceEspecialidad;

    @GetMapping("/medicos")
    public ModelAndView medicos(){
        ModelAndView model = new ModelAndView();
        List<Medico> medicos = new ArrayList<Medico>();
        medicos = service.listar();
        model.addObject("medicos", medicos);
        model.setViewName("medicos");
        return model;
    }

    @GetMapping("/nuevomedico")
    public ModelAndView nuevomedico(){
        ModelAndView model = new ModelAndView();
        List<Especialidad> especialidades = new ArrayList<Especialidad>();
        especialidades = serviceEspecialidad.listar();
        model.addObject("especialidades", especialidades);
        model.setViewName("nuevomedico");
        return model;
    }

    @PostMapping("/crearmedico")
    public ModelAndView crearMedico(@ModelAttribute("medico") MedicoDTO medico){
        ModelAndView model = new ModelAndView();
        Medico md = new Medico();
        md.setRut(medico.getRut());
        md.setNombre(medico.getNombre());
        md.setApellido(medico.getApellido());
        md.setEspecialidad(serviceEspecialidad.leerPorId(medico.getEspecialidad()));
        md.setTelefono("+569"+medico.getTelefono());
        service.registrar(md);
        List<Medico> medicos = new ArrayList<Medico>();
        medicos = service.listar();
        model.addObject("medicos", medicos);
        model.setViewName("medicos");
        return model;
    }

    @PostMapping("/borrarmedico/{rut}")
    public String eliminarMedico(@PathVariable("rut") Integer rut){
        service.eliminar(rut);
        return "redirect:/medicos";
    }
    
}