package cl.inacap.centromedico2.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "examen")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoExamen;

    @ManyToOne
    @JoinColumn(name="id_paciente", nullable=false, foreignKey = @ForeignKey(name="FK_examen_paciente"))
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name="id_atencion", nullable=false, foreignKey = @ForeignKey(name="FK_examen_atencion"))
    private Atencion atencion;

    @ManyToMany(mappedBy = "examenes")
    Set<Ficha> fichas;

    public Integer getCodigoExamen() {
        return codigoExamen;
    }

    public void setCodigoExamen(Integer codigoExamen) {
        this.codigoExamen = codigoExamen;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Atencion getAtencion() {
        return atencion;
    }

    public void setAtencion(Atencion atencion) {
        this.atencion = atencion;
    }
    
}