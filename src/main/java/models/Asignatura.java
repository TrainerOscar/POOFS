package models;

public class Asignatura {
    private int idAsignatura;
    private String nombreAsignatura;
    private String codigoAsignatura;

    // Getters y Setters
    public int getIdAsignatura() { return idAsignatura; }
    public void setIdAsignatura(int idAsignatura) { this.idAsignatura = idAsignatura; }

    public String getNombreAsignatura() { return nombreAsignatura; }
    public void setNombreAsignatura(String nombreAsignatura) { this.nombreAsignatura = nombreAsignatura; }

    public String getCodigoAsignatura() { return codigoAsignatura; }
    public void setCodigoAsignatura(String codigoAsignatura) { this.codigoAsignatura = codigoAsignatura; }
}
