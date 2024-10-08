package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Entrenador {
    private String nombre;
    private String especialidad;
    private int telefono;
    private String correo;
    private LinkedList<Miembro> listaMiembros;

    public Entrenador (String nombre, String especialidad, int telefono, String correo){
        this.nombre=nombre;
        this.especialidad=especialidad;
        this.telefono=telefono;
        this.correo=correo;
        listaMiembros = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Entrenador [nombre=" + nombre + ", especialidad=" + especialidad + ", telefono=" + telefono
                + ", correo=" + correo + "]";
    }
    public void agregarMiembro (Miembro miembro){
        listaMiembros.add(miembro);
    }
    
    
}