package cl.inacap.centromedico2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.inacap.centromedico2.model.Especialidad;

public interface IEspecialidadRepo extends JpaRepository<Especialidad, Integer> {
    
}