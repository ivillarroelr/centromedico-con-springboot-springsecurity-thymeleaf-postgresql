package cl.inacap.centromedico2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.inacap.centromedico2.model.Examen;

public interface IExamenRepo extends JpaRepository<Examen, Integer> {
    
}