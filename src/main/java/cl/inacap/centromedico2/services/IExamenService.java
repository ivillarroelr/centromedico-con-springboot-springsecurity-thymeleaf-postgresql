package cl.inacap.centromedico2.services;

import cl.inacap.centromedico2.model.Examen;

import java.util.List;

public interface IExamenService extends ICRUD<Examen> {
    Examen registrar(Examen obj);
	Examen modificar(Examen obj);
	List<Examen> listar();
	Examen leerPorId(Integer id);
	boolean eliminar(Integer id);
}