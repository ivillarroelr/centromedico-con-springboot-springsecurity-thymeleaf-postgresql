package cl.inacap.centromedico2.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.inacap.centromedico2.dto.AtencionDTO;
import cl.inacap.centromedico2.model.Atencion;
import cl.inacap.centromedico2.model.Especialidad;
import cl.inacap.centromedico2.model.Medico;
import cl.inacap.centromedico2.model.Paciente;
import cl.inacap.centromedico2.services.IAtencionService;
import cl.inacap.centromedico2.services.IEspecialidadService;
import cl.inacap.centromedico2.services.IMedicoService;
import cl.inacap.centromedico2.services.IPacienteService;

@Controller
public class AtencionController {

    @Autowired
    private IAtencionService service;

    @Autowired
    private IEspecialidadService serviceEspecialidad;

    @Autowired
    private IMedicoService serviceMedico;

    @Autowired
    private IPacienteService servicePaciente;

    @GetMapping("/atenciones")
    public ModelAndView atenciones() {
        ModelAndView model = new ModelAndView();
        List<Atencion> atenciones = new ArrayList<Atencion>();
        atenciones = service.listar();
        model.addObject("atenciones", atenciones);
        model.setViewName("atenciones");
        return model;
    }

    @GetMapping("/nuevaatencion")
    public ModelAndView nuevaAtencion() {
        ModelAndView model = new ModelAndView();
        List<Especialidad> especialidades = new ArrayList<Especialidad>();
        especialidades = serviceEspecialidad.listar();
        List<Medico> medicos = new ArrayList<Medico>();
        medicos = serviceMedico.listar();
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = servicePaciente.listar();
        model.addObject("especialidades", especialidades);
        model.addObject("medicos", medicos);
        model.addObject("pacientes", pacientes);
        model.setViewName("nuevaatencion");
        return model;
    }

    @PostMapping("/crearatencion")
    public String crearAtencion(@ModelAttribute("atencion") AtencionDTO atencion) {
        Atencion at = new Atencion();
        String fecha = atencion.getFechaAtencion().replace('T', ' ');
        System.out.println(fecha);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(fecha, formatter);
        at.setPaciente(servicePaciente.leerPorId(atencion.getIdPaciente()));
        at.setMedico(serviceMedico.leerPorId(atencion.getIdMedico()));
        at.setComentarios(" ");
        at.setFechaAtencion(dateTime);
        service.registrar(at);
        return "redirect:/atenciones";
    }
}