package cl.inacap.centromedico2.services;

import cl.inacap.centromedico2.model.Especialidad;


import java.util.List;

public interface IEspecialidadService extends ICRUD<Especialidad> {
    Especialidad registrar(Especialidad obj);
	Especialidad modificar(Especialidad obj);
	List<Especialidad> listar();
	Especialidad leerPorId(Integer id);
	boolean eliminar(Integer id);
}