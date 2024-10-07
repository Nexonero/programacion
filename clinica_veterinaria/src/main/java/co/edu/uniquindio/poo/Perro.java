package co.edu.uniquindio.poo;

public class Perro extends Animal {
    private String raza;
    private String dueño;

    public Perro(String nombre, int edad, double peso, String raza, String dueño) {
        super(nombre, edad, peso);
        this.raza = raza;
        this.dueño = dueño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", dueño=" + dueño + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
                + ", getPeso()=" + getPeso() + "]";
    }
}
