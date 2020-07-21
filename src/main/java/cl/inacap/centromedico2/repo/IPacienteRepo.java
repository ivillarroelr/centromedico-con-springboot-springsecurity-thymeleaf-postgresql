package cl.inacap.centromedico2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.inacap.centromedico2.model.Paciente;

public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {
    
}