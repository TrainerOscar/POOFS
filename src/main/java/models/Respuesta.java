package models;

import java.util.Date;
import java.util.Map;

public class Respuesta {
    private int idRespuesta;
    private Usuario usuario;
    private Evaluacion evaluacion;
    private Date fechaRespuesta;
    private Map<Pregunta, String> respuestas;

    // Getters y Setters
    public int getIdRespuesta() { return idRespuesta; }
    public void setIdRespuesta(int idRespuesta) { this.idRespuesta = idRespuesta; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Evaluacion getEvaluacion() { return evaluacion; }
    public void setEvaluacion(Evaluacion evaluacion) { this.evaluacion = evaluacion; }

    public Date getFechaRespuesta() { return fechaRespuesta; }
    public void setFechaRespuesta(Date fechaRespuesta) { this.fechaRespuesta = fechaRespuesta; }

    public Map<Pregunta, String> getRespuestas() { return respuestas; }
    public void setRespuestas(Map<Pregunta, String> respuestas) { this.respuestas = respuestas; }
}
