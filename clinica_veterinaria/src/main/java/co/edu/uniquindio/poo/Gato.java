package co.edu.uniquindio.poo;

public class Gato extends Animal {
    private String colorPelaje;
    private String dueño;

    public Gato(String nombre, int edad, double peso, String colorPelaje, String dueño) {
        super(nombre, edad, peso);
        this.colorPelaje = colorPelaje;
        this.dueño = dueño;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Gato [colorPelaje=" + colorPelaje + ", dueño=" + dueño + ", getNombre()=" + getNombre()
                + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + "]";
    }
}
