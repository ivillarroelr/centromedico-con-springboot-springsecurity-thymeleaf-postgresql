package cl.inacap.centromedico2.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    private Integer rut;
    
    @Column(name = "nombre", nullable = false)
    @Size(min = 3, max = 20, message = "Nombre debe tener entre 3 y 20 caracteres")
    private String nombre;

    @Column(name = "apellido", nullable = false)
    @Size(min = 3, max = 20, message = "Apellido debe tener entre 3 y 20 caracteres")
    private String apellido;

    @Column(name = "edad", nullable = false)
    @Min(0)
    @Max(150)
    private Integer edad;

    @OneToMany(mappedBy="paciente", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Atencion> atenciones = new HashSet<Atencion>();

    @OneToMany(mappedBy="paciente", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Receta> recetas = new HashSet<Receta>();

    @OneToMany(mappedBy="paciente", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Examen> examenes = new HashSet<Examen>();

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Set<Atencion> getAtenciones() {
        return atenciones;
    }

    public void setAtenciones(Set<Atencion> atenciones) {
        this.atenciones.clear();
        if (atenciones != null) {
            this.atenciones.addAll(atenciones);
        }
    }

    public Set<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(Set<Receta> recetas) {
        this.recetas.clear();
        if (recetas != null) {
            this.recetas.addAll(recetas);
        }
    }

    public Set<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(Set<Examen> examenes) {
        this.examenes.clear();
        if (examenes != null) {
            this.examenes.addAll(examenes);
        }
    }

    
}