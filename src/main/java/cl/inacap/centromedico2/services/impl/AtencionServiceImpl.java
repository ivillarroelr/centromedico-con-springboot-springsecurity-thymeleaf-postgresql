package cl.inacap.centromedico2.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.inacap.centromedico2.model.Atencion;
import cl.inacap.centromedico2.repo.IAtencionRepo;
import cl.inacap.centromedico2.services.IAtencionService;

@Service
public class AtencionServiceImpl implements IAtencionService {
    
    @Autowired
    private IAtencionRepo repo;

    @Override
    public Atencion registrar(Atencion obj) {
        return repo.save(obj);
    };
    
    @Override
	public Atencion modificar(Atencion obj){
        return repo.save(obj);
    }
    
    @Override
	public List<Atencion> listar(){
        return repo.findAll();
    }

    @Override
    public Atencion leerPorId(Integer id){
        Optional<Atencion> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Atencion();
    }
    
    @Override
	public boolean eliminar(Integer id){
        repo.deleteById(id);
		return true;
    }

}