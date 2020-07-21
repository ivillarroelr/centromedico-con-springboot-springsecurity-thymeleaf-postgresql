package cl.inacap.centromedico2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.inacap.centromedico2.model.Medico;

public interface IMedicoRepo extends JpaRepository<Medico, Integer> {
    
}