package cl.inacap.centromedico2.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "medico")
public class Medico {

    @Id
    private Integer rut;

    @Column(name = "nombre", nullable = false)
    @Size(min = 3, max = 20, message = "Nombre debe tener entre 3 y 20 caracteres")
    private String nombre;

    @Column(name = "apellido", nullable = false)
    @Size(min = 3, max = 20, message = "Apellido debe tener entre 3 y 20 caracteres")
    private String apellido;

    @ManyToOne
    @JoinColumn(name="id_especialidad", nullable=false, foreignKey = @ForeignKey(name="FK_medico_especialidad"))
    private Especialidad especialidad;

    @Column(name = "telefono", nullable = true)
    private String telefono;

    @OneToMany(mappedBy="medico", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Receta> recetas = new HashSet<Receta>();

    @OneToMany(mappedBy="medico", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Ficha> fichas = new HashSet<Ficha>();

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

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(Set<Receta> recetas) {
        this.recetas.clear();
        if(recetas != null){
            this.recetas.addAll(recetas);
        }
    }

    public Set<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(Set<Ficha> fichas) {
        this.fichas.clear();
        if(fichas != null){
            this.fichas.addAll(fichas);
        }
    }
    
}