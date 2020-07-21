package cl.inacap.centromedico2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.inacap.centromedico2.model.Receta;

public interface IRecetaRepo extends JpaRepository<Receta, Integer> {
    
}