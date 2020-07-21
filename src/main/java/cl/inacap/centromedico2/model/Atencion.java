package cl.inacap.centromedico2.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "atencion")
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAtencion;

    @Column(name = "fecha_atencion", nullable = false)
    private LocalDateTime fechaAtencion;

    @ManyToOne
    @JoinColumn(name="id_paciente", nullable=false, foreignKey = @ForeignKey(name="FK_atencion_paciente"))
    private Paciente paciente;
    
    @OneToMany(mappedBy="atencion", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Examen> examenes = new HashSet<Examen>();

    @ManyToOne
    @JoinColumn(name="id_medico", nullable=false, foreignKey = @ForeignKey(name="FK_atencion_medico"))
    private Medico medico;

    @OneToMany(mappedBy="atencion", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Receta> recetas = new HashSet<Receta>();

    @Column(name = "comentarios", nullable = false)
    private String comentarios;

    public Integer getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(Integer idAtencion) {
        this.idAtencion = idAtencion;
    }

    public LocalDateTime getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDateTime fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Set<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(Set<Examen> examenes) {
        this.examenes = examenes;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Set<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(Set<Receta> recetas) {
        this.recetas = recetas;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    
}