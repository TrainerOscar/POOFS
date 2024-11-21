package models;
import java.util.Date;
import java.util.List;

public class EnlaceEvaluacion {

        private int idEnlace;
        private String urlEnlace;
        private String estado; // Ejemplo: "Abierto", "Cerrado"
        private Date fechaApertura;
        private Date fechaCierre;
        private List<Asignatura> asignaturas;
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

