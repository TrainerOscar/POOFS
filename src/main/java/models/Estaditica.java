package models;

public class Estaditica {
    private int idEstadistica;
    private Evaluacion evaluacion;
    private float tasaParticipacion;
    private float promedioRespuestas;
    private float tiempoPromedioRespuesta;

    // Getters y Setters
    public int getIdEstadistica() { return idEstadistica; }
    public void setIdEstadistica(int idEstadistica) { this.idEstadistica = idEstadistica; }

    public Evaluacion getEvaluacion() { return evaluacion; }
    public void setEvaluacion(Evaluacion evaluacion) { this.evaluacion = evaluacion; }

    public float getTasaParticipacion() { return tasaParticipacion; }
    public void setTasaParticipacion(float tasaParticipacion) { this.tasaParticipacion = tasaParticipacion; }

    public float getPromedioRespuestas() { return promedioRespuestas; }
    public void setPromedioRespuestas(float promedioRespuestas) { this.promedioRespuestas = promedioRespuestas; }

    public float getTiempoPromedioRespuesta() { return tiempoPromedioRespuesta; }
    public void setTiempoPromedioRespuesta(float tiempoPromedioRespuesta) { this.tiempoPromedioRespuesta = tiempoPromedioRespuesta; }
}
