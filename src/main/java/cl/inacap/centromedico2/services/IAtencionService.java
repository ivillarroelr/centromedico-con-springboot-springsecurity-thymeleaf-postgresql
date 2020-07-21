package cl.inacap.centromedico2.services;

import java.util.List;

import cl.inacap.centromedico2.model.Atencion;

public interface IAtencionService extends ICRUD<Atencion> {
    Atencion registrar(Atencion obj);
	Atencion modificar(Atencion obj);
	List<Atencion> listar();
	Atencion leerPorId(Integer id);
	boolean eliminar(Integer id);
}