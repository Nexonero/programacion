package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private LinkedList<Estudiante> estudiantes;

    public Curso(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (validarNumeroIdentificacion(estudiante.getNumeroIdentificacion())) {
            Curso.mostrarMensaje("El estudiante ya está creado");
        } else {
            estudiantes.add(estudiante);
        }
    }

    public boolean validarNumeroIdentificacion(String numeroIdentificacion) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroIdentificacion().equals(numeroIdentificacion)) {
                return true;
            }
        }
        return false;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "El nombre del curso es: " + nombre + " y el profesor que dicta la clase es: "
                + profesor + ", y los estudiantes que están registrados son: \n\n"
                + estudiantes;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    // Eliminar Estudiante
    public void eliminarEstudiante(String numeroIdentificacion) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroIdentificacion().equals(numeroIdentificacion)) {
                estudiantes.remove(estudiante);
                Curso.mostrarMensaje("Estudiante eliminado: " + numeroIdentificacion);
                break;
            }
        }
    }

    // Actualizar Estudiante
    public void actualizarEstudiante(String telefono, String correo, String numeroIdentificacion) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroIdentificacion().equals(numeroIdentificacion)) {
                estudiante.setTelefono(telefono);
                estudiante.setCorreo(correo);
                Curso.mostrarMensaje("Estudiante actualizado: " + numeroIdentificacion);
                break;
            }
        }
    }
}
