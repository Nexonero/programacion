package co.edu.uniquindio.poo;

public class Aguila extends Animal {
    private String habitat;

    public Aguila(String nombre, int edad, double peso, String habitat) {
        super(nombre, edad, peso);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void volar() {
        System.out.println(getNombre() + " está volando por los cielos de " + habitat + ".");
    }

    @Override
    public String toString() {
        return "Aguila [habitat=" + habitat + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
                + ", getPeso()=" + getPeso() + "]";
    }
}
