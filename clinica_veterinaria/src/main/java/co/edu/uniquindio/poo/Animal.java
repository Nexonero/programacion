package co.edu.uniquindio.poo;

public class Animal {
    private String nombre;
    private int edad;
    private double peso;

    // Constructor
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos de comportamiento
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    // Método toString para mostrar información del animal
    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
    }
}
