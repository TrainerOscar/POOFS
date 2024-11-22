package com.tuempresa.poofs.modelo;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;

    @Column(length = 255)
    @Required
    private String nombre;

    @Column(length = 255)
    @Required
    @Email
    private String correoElectronico;

    @Column(length = 50)
    @Required
    private String rol;

    @OneToMany(mappedBy = "usuario")
    private List<Evaluacion> evaluacionesCompletadas;

    // Getters y Setters
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public List<Evaluacion> getEvaluacionesCompletadas() { return evaluacionesCompletadas; }
    public void setEvaluacionesCompletadas(List<Evaluacion> evaluacionesCompletadas) { this.evaluacionesCompletadas = evaluacionesCompletadas; }
}
