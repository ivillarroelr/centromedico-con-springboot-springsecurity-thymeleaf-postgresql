package cl.inacap.centromedico2.services;

import java.util.List;

import cl.inacap.centromedico2.model.Ficha;

public interface IFichaService extends ICRUD<Ficha> {
    Ficha registrar(Ficha obj);
	Ficha modificar(Ficha obj);
	List<Ficha> listar();
	Ficha leerPorId(Integer id);
	boolean eliminar(Integer id);

}