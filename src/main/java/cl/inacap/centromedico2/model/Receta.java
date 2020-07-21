package cl.inacap.centromedico2.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name = "receta")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReceta;

    @ManyToOne
    @JoinColumn(name="id_paciente", nullable=false, foreignKey = @ForeignKey(name="FK_receta_paciente"))
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name="id_atencion", nullable=false, foreignKey = @ForeignKey(name="FK_receta_atencion"))
    private Atencion atencion;

    @ManyToOne
    @JoinColumn(name="id_medico", nullable=false, foreignKey = @ForeignKey(name="FK_receta_medico"))
    private Medico medico;

    @OneToMany(mappedBy="receta", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Ficha> fichas = new HashSet<Ficha>();

    public Integer getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Integer idReceta) {
        this.idReceta = idReceta;
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
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