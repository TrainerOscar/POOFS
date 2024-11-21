package models;

import java.util.List;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String correoElectronico;
    private String rol; // Ejemplo: "Usuario", "Administrador"
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
