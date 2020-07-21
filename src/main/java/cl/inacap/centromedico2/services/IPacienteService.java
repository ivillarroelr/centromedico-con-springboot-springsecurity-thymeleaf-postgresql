package cl.inacap.centromedico2.services;

import cl.inacap.centromedico2.model.Paciente;

import java.util.List;

public interface IPacienteService extends ICRUD<Paciente>{
    Paciente registrar(Paciente obj);
	Paciente modificar(Paciente obj);
	List<Paciente> listar();
	Paciente leerPorId(Integer id);
	boolean eliminar(Integer id);
}