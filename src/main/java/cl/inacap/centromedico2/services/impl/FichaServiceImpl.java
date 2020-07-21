package cl.inacap.centromedico2.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.inacap.centromedico2.model.Ficha;
import cl.inacap.centromedico2.repo.IFichaRepo;
import cl.inacap.centromedico2.services.IFichaService;

@Service
public class FichaServiceImpl implements IFichaService {
    
    @Autowired
    private IFichaRepo repo;

    @Override
    public Ficha registrar(Ficha obj) {
        return repo.save(obj);
    };
    
    @Override
	public Ficha modificar(Ficha obj){
        return repo.save(obj);
    }
    
    @Override
	public List<Ficha> listar(){
        return repo.findAll();
    }

    @Override
    public Ficha leerPorId(Integer id){
        Optional<Ficha> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Ficha();
    }
    
    @Override
	public boolean eliminar(Integer id){
        repo.deleteById(id);
		return true;
    }

}