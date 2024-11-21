package models;
import java.util.Date;
import java.util.List;
public class Evaluacion {

        private int idEvaluacion;
        private String titulo;
        private String descripcion;
        private Date fechaCreacion;
        private List<Pregunta> preguntas;
        private List<Asignatura> asignaturas;
        private String estado; // Ejemplo: "Activa", "Inactiva"

        // Getters y Setters
        public int getIdEvaluacion() { return idEvaluacion; }
        public void setIdEvaluacion(int idEvaluacion) { this.idEvaluacion = idEvaluacion; }

        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }

        public String getDescripcion() { return descripcion; }
        public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

        public Date getFechaCreacion() { return fechaCreacion; }
        public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }

        public List<Pregunta> getPreguntas() { return preguntas; }
        public void setPreguntas(List<Pregunta> preguntas) { this.preguntas = preguntas; }

        public List<Asignatura> getAsignaturas() { return asignaturas; }
        public void setAsignaturas(List<Asignatura> asignaturas) { this.asignaturas = asignaturas; }

        public String getEstado() { return estado; }
        public void setEstado(String estado) { this.estado = estado; }






}
