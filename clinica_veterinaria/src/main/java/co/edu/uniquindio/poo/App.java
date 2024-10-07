package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        // Crear animales (Perro, Gato, Aguila, Leon)
        Perro perro = new Perro("Max", 5, 12.5, "Labrador", "Carlos");
        Gato gato = new Gato("Luna", 3, 4.2, "Blanco", "Sofia");
        Aguila aguila = new Aguila("Fénix", 7, 3.1, "Montañas Rocosas");
        Leon leon = new Leon("Simba", 8, 190.5, "Espesa");

        // Mostrar información de los animales
        System.out.println(perro.toString());
        System.out.println(gato.toString());
        System.out.println(aguila.toString());
        System.out.println(leon.toString());

        // Métodos específicos de algunos animales
        aguila.volar();
        leon.cazar();

        // Modificar algunos atributos y volver a mostrar la información
        perro.setDueño("Juan");
        gato.setColorPelaje("Gris");
        leon.setMelena("Muy espesa");

        System.out.println("\nDespués de modificar algunos atributos:\n");

        System.out.println(perro.toString());
        System.out.println(gato.toString());
        System.out.println(leon.toString());
    }
}
