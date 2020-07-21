package cl.inacap.centromedico2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.inacap.centromedico2.model.Ficha;

public interface IFichaRepo extends JpaRepository<Ficha, Integer> {
    
}