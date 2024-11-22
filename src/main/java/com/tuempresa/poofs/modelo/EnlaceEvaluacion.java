package com.tuempresa.poofs.modelo;
import java.util.*;

import javax.persistence.*;

import org.hibernate.validator.constraints.*;
import org.openxava.annotations.*;

@Entity
public class EnlaceEvaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEnlace;

    @Column(length = 255)
    @Required
    @URL
    private String urlEnlace;

    @Column(length = 50)
    private String estado;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaApertura;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCierre;

    @ManyToMany
    @JoinTable(name = "Asignatura_Enlace")
    private List<Asignatura> asignaturas;

    @ManyToOne
    @DescriptionsList
    private Usuario administradorCreador;

    // Getters y Setters
    public int getIdEnlace() { return idEnlace; }
    public void setIdEnlace(int idEnlace) { this.idEnlace = idEnlace; }

    public String getUrlEnlace() { return urlEnlace; }
    public void setUrlEnlace(String urlEnlace) { this.urlEnlace = urlEnlace; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Date getFechaApertura() { return fechaApertura; }
    public void setFechaApertura(Date fechaApertura) { this.fechaApertura = fechaApertura; }

    public Date getFechaCierre() { return fechaCierre; }
    public void setFechaCierre(Date fechaCierre) { this.fechaCierre = fechaCierre; }

    public List<Asignatura> getAsignaturas() { return asignaturas; }
    public void setAsignaturas(List<Asignatura> asignaturas) { this.asignaturas = asignaturas; }

    public Usuario getAdministradorCreador() { return administradorCreador; }
    public void setAdministradorCreador(Usuario administradorCreador) { this.administradorCreador = administradorCreador; }
}
