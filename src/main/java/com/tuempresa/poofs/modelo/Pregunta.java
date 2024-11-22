package com.tuempresa.poofs.modelo;
import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPregunta;

    @Column(length = 255)
    @Required
    private String textoPregunta;

    @ManyToOne
    @DescriptionsList
    private Evaluacion evaluacion;

    // Getters y Setters
    public int getIdPregunta() { return idPregunta; }
    public void setIdPregunta(int idPregunta) { this.idPregunta = idPregunta; }

    public String getTextoPregunta() { return textoPregunta; }
    public void setTextoPregunta(String textoPregunta) { this.textoPregunta = textoPregunta; }

    public Evaluacion getEvaluacion() { return evaluacion; }
    public void setEvaluacion(Evaluacion evaluacion) { this.evaluacion = evaluacion; }
}

