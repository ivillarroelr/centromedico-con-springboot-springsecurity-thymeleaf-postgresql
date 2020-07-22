package cl.inacap.centromedico2.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "especialidad")
public class Especialidad {

    @Id
    private Integer idEspecialidad;

    @Column(name = "nombre_especialidad", nullable = false)
    private String nombreEspecialidad;

    @Column(name = "descripcion_especialidad", nullable = true)
    private String descripcionEspecialidad;

    @OneToMany(mappedBy="especialidad", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Medico> medicos = new HashSet<Medico>();

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getDescripcionEspecialidad() {
        return descripcionEspecialidad;
    }

    public void setDescripcionEspecialidad(String descripcionEspecialidad) {
        this.descripcionEspecialidad = descripcionEspecialidad;
    }

    public Set<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(Set<Medico> medicos) {
        this.medicos.clear();
        if (medicos != null) {
            this.medicos.addAll(medicos);
        }
    }

}