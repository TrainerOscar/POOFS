package com.tuempresa.poofs.modelo;



import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEvaluacion;

    @Column(length = 255)
    @Required
    private String titulo;

    @Column(length = 500)
    private String descripcion;

    @Temporal(TemporalType.TIMESTAMP)
    @Required
    private Date fechaCreacion;

    @Column(length = 50)
    @Required
    private String estado;

    @OneToMany(mappedBy = "evaluacion")
    private List<Pregunta> preguntas;

    @ManyToMany
    @JoinTable(name = "Asignatura_Evaluacion")
    private List<Asignatura> asignaturas;

    // Getters y Setters
    public int getIdEvaluacion() { return idEvaluacion; }
    public void setIdEvaluacion(int idEvaluacion) { this.idEvaluacion = idEvaluacion; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Date getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public List<Pregunta> getPreguntas() { return preguntas; }
    public void setPreguntas(List<Pregunta> preguntas) { this.preguntas = preguntas; }

    public List<Asignatura> getAsignaturas() { return asignaturas; }
    public void setAsignaturas(List<Asignatura> asignaturas) { this.asignaturas = asignaturas; }
}

