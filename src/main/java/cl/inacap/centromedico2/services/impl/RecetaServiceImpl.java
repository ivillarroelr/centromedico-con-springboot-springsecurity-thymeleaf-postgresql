package cl.inacap.centromedico2.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.inacap.centromedico2.model.Receta;
import cl.inacap.centromedico2.repo.IRecetaRepo;
import cl.inacap.centromedico2.services.IRecetaService;

@Service
public class RecetaServiceImpl implements IRecetaService{

    @Autowired
    private IRecetaRepo repo;

    @Override
    public Receta registrar(Receta obj) {
        return repo.save(obj);
    };
    
    @Override
	public Receta modificar(Receta obj){
        return repo.save(obj);
    }
    
    @Override
	public List<Receta> listar(){
        return repo.findAll();
    }

    @Override
    public Receta leerPorId(Integer id){
        Optional<Receta> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Receta();
    }
    
    @Override
	public boolean eliminar(Integer id){
        repo.deleteById(id);
		return true;
    }

}
    
