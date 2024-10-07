package co.edu.uniquindio.poo;

public class Leon extends Animal {
    private String melena;

    public Leon(String nombre, int edad, double peso, String melena) {
        super(nombre, edad, peso);
        this.melena = melena;
    }

    public String getMelena() {
        return melena;
    }

    public void setMelena(String melena) {
        this.melena = melena;
    }

    public void cazar() {
        System.out.println(getNombre() + " está cazando en la sabana.");
    }

    @Override
    public String toString() {
        return "Leon [melena=" + melena + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
                + ", getPeso()=" + getPeso() + "]";
    }
}
