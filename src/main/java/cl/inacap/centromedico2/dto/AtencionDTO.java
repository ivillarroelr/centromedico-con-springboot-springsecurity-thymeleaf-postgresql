package cl.inacap.centromedico2.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AtencionDTO implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer idMedico;
    private Integer idPaciente;
    private String fechaAtencion;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
    
    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fechaAtencion == null) ? 0 : fechaAtencion.hashCode());
        result = prime * result + ((idMedico == null) ? 0 : idMedico.hashCode());
        result = prime * result + ((idPaciente == null) ? 0 : idPaciente.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AtencionDTO other = (AtencionDTO) obj;
        if (fechaAtencion == null) {
            if (other.fechaAtencion != null)
                return false;
        } else if (!fechaAtencion.equals(other.fechaAtencion))
            return false;
        if (idMedico == null) {
            if (other.idMedico != null)
                return false;
        } else if (!idMedico.equals(other.idMedico))
            return false;
        if (idPaciente == null) {
            if (other.idPaciente != null)
                return false;
        } else if (!idPaciente.equals(other.idPaciente))
            return false;
        return true;
    }

    
    
}