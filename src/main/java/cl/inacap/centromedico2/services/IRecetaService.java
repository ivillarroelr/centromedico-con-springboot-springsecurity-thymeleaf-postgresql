package cl.inacap.centromedico2.services;

import cl.inacap.centromedico2.model.Receta;

import java.util.List;

public interface IRecetaService extends ICRUD<Receta>{
    Receta registrar(Receta obj);
	Receta modificar(Receta obj);
	List<Receta> listar();
	Receta leerPorId(Integer id);
	boolean eliminar(Integer id);
}