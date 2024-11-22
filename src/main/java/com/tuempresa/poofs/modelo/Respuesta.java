package com.tuempresa.poofs.modelo;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRespuesta;

    @ManyToOne
    @DescriptionsList
    private Usuario usuario;

    @ManyToOne
    @DescriptionsList
    private Evaluacion evaluacion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRespuesta;

    @ElementCollection
    @MapKeyJoinColumn(name = "pregunta_id")
    @Column(name = "respuesta")
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

