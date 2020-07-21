package cl.inacap.centromedico2.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "ficha")
public class Ficha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFicha;

    @ManyToOne
    @JoinColumn(name="id_paciente", nullable=false, foreignKey = @ForeignKey(name="FK_ficha_paciente"))
    private Paciente paciente;

    @Column(name = "diagnostico")
    private String diagnostico;

    @ManyToMany
    @JoinTable(name = "ficha_examen", joinColumns = @JoinColumn(name = "id_ficha"), 
    inverseJoinColumns = @JoinColumn(name = "id_examen"))
    Set<Examen> examenes;

    @ManyToOne
    @JoinColumn(name="id_receta", nullable=false, foreignKey = @ForeignKey(name="FK_ficha_paciente"))
    private Receta receta;

    @ManyToOne
    @JoinColumn(name="id_medico", nullable=false, foreignKey = @ForeignKey(name="FK_ficha_medico"))
    private Medico medico;

    public Integer getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Integer idFicha) {
        this.idFicha = idFicha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Set<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(Set<Examen> examenes) {
        this.examenes.clear();
        if(examenes != null){
            this.examenes.addAll(examenes);
        }
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
}