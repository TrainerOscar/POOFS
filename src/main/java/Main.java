import models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class Main {
        public static void main(String[] args) {
            // Crear asignaturas
            Asignatura asignatura1 = new Asignatura();
            asignatura1.setIdAsignatura(1);
            asignatura1.setNombreAsignatura("Programación Orientada a Objetos");
            asignatura1.setCodigoAsignatura("POO101");

            Asignatura asignatura2 = new Asignatura();
            asignatura2.setIdAsignatura(2);
            asignatura2.setNombreAsignatura("Estructura de Datos");
            asignatura2.setCodigoAsignatura("ED202");

            List<Asignatura> asignaturas = new ArrayList<>();
            asignaturas.add(asignatura1);
            asignaturas.add(asignatura2);

            // Crear administrador
            Usuario administrador = new Usuario();
            administrador.setIdUsuario(1);
            administrador.setNombre("Max Anthony Martínez");
            administrador.setCorreoElectronico("max.martinez@university.edu");
            administrador.setRol("Administrador");

            // Crear enlace de evaluación
            EnlaceEvaluacion enlace = new EnlaceEvaluacion();
            enlace.setIdEnlace(1001);
            enlace.setUrlEnlace("https://evaluaciones.university.edu/1001");
            enlace.setEstado("Abierto");
            enlace.setFechaApertura(new Date());
            enlace.setFechaCierre(new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000)); // +7 días
            enlace.setAsignaturas(asignaturas);
            enlace.setAdministradorCreador(administrador);

            // Crear preguntas
            Pregunta pregunta1 = new Pregunta();
            pregunta1.setIdPregunta(1);
            pregunta1.setEnunciado("¿Cuál es el concepto principal de la POO?");

            Pregunta pregunta2 = new Pregunta();
            pregunta2.setIdPregunta(2);
            pregunta2.setEnunciado("Explique la diferencia entre una lista y un array.");

            List<Pregunta> preguntas = new ArrayList<>();
            preguntas.add(pregunta1);
            preguntas.add(pregunta2);

            // Crear evaluación
            Evaluacion evaluacion = new Evaluacion();
            evaluacion.setIdEvaluacion(5001);
            evaluacion.setTitulo("Evaluación de Programación");
            evaluacion.setDescripcion("Prueba sobre conceptos básicos de POO y estructuras de datos.");
            evaluacion.setFechaCreacion(new Date());
            evaluacion.setPreguntas(preguntas);
            evaluacion.setAsignaturas(asignaturas);
            evaluacion.setEstado("Activa");

            // Crear usuario estudiante
            Usuario estudiante = new Usuario();
            estudiante.setIdUsuario(2);
            estudiante.setNombre("Oscar Calero");
            estudiante.setCorreoElectronico("oscar.calero@university.edu");
            estudiante.setRol("Usuario");

            // Crear respuestas
            Map<Pregunta, String> respuestas = new HashMap<>();
            respuestas.put(pregunta1, "La POO se basa en clases y objetos.");
            respuestas.put(pregunta2, "Una lista es dinámica, un array tiene tamaño fijo.");

            Respuesta respuesta = new Respuesta();
            respuesta.setIdRespuesta(3001);
            respuesta.setUsuario(estudiante);
            respuesta.setEvaluacion(evaluacion);
            respuesta.setFechaRespuesta(new Date());
            respuesta.setRespuestas(respuestas);

            // Crear estadística
            Estaditica estadistica = new Estaditica();
            estadistica.setIdEstadistica(4001);
            estadistica.setEvaluacion(evaluacion);
            estadistica.setTasaParticipacion(85.5f);
            estadistica.setPromedioRespuestas(4.2f);
            estadistica.setTiempoPromedioRespuesta(12.8f);

            // Mostrar resultados
            System.out.println("Enlace de Evaluación: " + enlace.getUrlEnlace());
            System.out.println("Administrador: " + enlace.getAdministradorCreador().getNombre());
            System.out.println("Evaluación: " + evaluacion.getTitulo());
            System.out.println("Estudiante: " + respuesta.getUsuario().getNombre());
            System.out.println("Respuestas:");
            for (Map.Entry<Pregunta, String> entry : respuesta.getRespuestas().entrySet()) {
                System.out.println(" - " + entry.getKey().getEnunciado() + ": " + entry.getValue());
            }
            System.out.println("Estadísticas de Evaluación:");
            System.out.println(" - Tasa de Participación: " + estadistica.getTasaParticipacion() + "%");
            System.out.println(" - Promedio de Respuestas: " + estadistica.getPromedioRespuestas());
            System.out.println(" - Tiempo Promedio de Respuesta: " + estadistica.getTiempoPromedioRespuesta() + " minutos");
        }
    }


