import models.*;

import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear asignaturas dinámicamente
        List<Asignatura> asignaturas = new ArrayList<>();
        System.out.print("Ingrese el número de asignaturas: ");
        int numAsignaturas = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numAsignaturas; i++) {
            Asignatura asignatura = new Asignatura();
            asignatura.setIdAsignatura(i);
            System.out.print("Nombre de la asignatura " + i + ": ");
            asignatura.setNombreAsignatura(scanner.nextLine());
            System.out.print("Código de la asignatura " + i + ": ");
            asignatura.setCodigoAsignatura(scanner.nextLine());
            asignaturas.add(asignatura);
        }

        // Crear administrador dinámicamente
        Usuario administrador = new Usuario();
        administrador.setIdUsuario(1);
        System.out.print("Nombre del administrador: ");
        administrador.setNombre(scanner.nextLine());
        System.out.print("Correo del administrador: ");
        administrador.setCorreoElectronico(scanner.nextLine());
        administrador.setRol("Administrador");

        // Crear enlace de evaluación dinámicamente
        EnlaceEvaluacion enlace = new EnlaceEvaluacion();
        enlace.setIdEnlace(1001);
        System.out.print("URL del enlace de evaluación: ");
        enlace.setUrlEnlace(scanner.nextLine());
        enlace.setEstado("Abierto");
        enlace.setFechaApertura(new Date());
        enlace.setFechaCierre(new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000)); // +7 días
        enlace.setAsignaturas(asignaturas);
        enlace.setAdministradorCreador(administrador);

        // Crear preguntas dinámicamente
        List<Pregunta> preguntas = new ArrayList<>();
        System.out.print("Ingrese el número de preguntas: ");
        int numPreguntas = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numPreguntas; i++) {
            Pregunta pregunta = new Pregunta();
            pregunta.setIdPregunta(i);
            System.out.print("Enunciado de la pregunta " + i + ": ");
            pregunta.setEnunciado(scanner.nextLine());
            preguntas.add(pregunta);
        }

        // Crear evaluación dinámicamente
        Evaluacion evaluacion = new Evaluacion();
        evaluacion.setIdEvaluacion(5001);
        System.out.print("Título de la evaluación: ");
        evaluacion.setTitulo(scanner.nextLine());
        System.out.print("Descripción de la evaluación: ");
        evaluacion.setDescripcion(scanner.nextLine());
        evaluacion.setFechaCreacion(new Date());
        evaluacion.setPreguntas(preguntas);
        evaluacion.setAsignaturas(asignaturas);
        evaluacion.setEstado("Activa");

        // Crear usuario estudiante dinámicamente
        Usuario estudiante = new Usuario();
        estudiante.setIdUsuario(2);
        System.out.print("Nombre del estudiante: ");
        estudiante.setNombre(scanner.nextLine());
        System.out.print("Correo del estudiante: ");
        estudiante.setCorreoElectronico(scanner.nextLine());
        estudiante.setRol("Usuario");

        // Crear respuestas dinámicamente
        Map<Pregunta, String> respuestas = new HashMap<>();
        for (Pregunta pregunta : preguntas) {
            System.out.print("Respuesta a la pregunta \"" + pregunta.getEnunciado() + "\": ");
            respuestas.put(pregunta, scanner.nextLine());
        }

        Respuesta respuesta = new Respuesta();
        respuesta.setIdRespuesta(3001);
        respuesta.setUsuario(estudiante);
        respuesta.setEvaluacion(evaluacion);
        respuesta.setFechaRespuesta(new Date());
        respuesta.setRespuestas(respuestas);

        // Crear estadísticas dinámicamente
        Estaditica estadistica = new Estaditica();
        estadistica.setIdEstadistica(4001);
        estadistica.setEvaluacion(evaluacion);
        System.out.print("Tasa de participación (%): ");
        estadistica.setTasaParticipacion(Float.parseFloat(scanner.nextLine()));
        System.out.print("Promedio de respuestas: ");
        estadistica.setPromedioRespuestas(Float.parseFloat(scanner.nextLine()));
        System.out.print("Tiempo promedio de respuesta (minutos): ");
        estadistica.setTiempoPromedioRespuesta(Float.parseFloat(scanner.nextLine()));

        // Mostrar resultados
        System.out.println("\nResultados:");
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

        scanner.close();
    }
}
