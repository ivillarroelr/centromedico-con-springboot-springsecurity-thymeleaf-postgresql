package cl.inacap.centromedico2.services;

import cl.inacap.centromedico2.model.Medico;

import java.util.List;

public interface IMedicoService extends ICRUD<Medico> {
    Medico registrar(Medico obj);
	Medico modificar(Medico obj);
	List<Medico> listar();
	Medico leerPorId(Integer id);
	boolean eliminar(Integer id);
}