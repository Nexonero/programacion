package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GatoTest {

    @Test
    void testGetColorPelaje() {
        Gato gato = new Gato("Mimi", 3, 4.5, "Gris", "Juan");
        assertEquals("Gris", gato.getColorPelaje());
    }

    @Test
    void testGetDueño() {
        Gato gato = new Gato("Mimi", 3, 4.5, "Gris", "Juan");
        assertEquals("Juan", gato.getDueño());
    }

    @Test
    void testToString() {
        Gato gato = new Gato("Mimi", 3, 4.5, "Gris", "Juan");
        String expected = "Gato [colorPelaje=Gris, dueño=Juan, getNombre()=Mimi, getEdad()=3, getPeso()=4.5]";
        assertEquals(expected, gato.toString());
    }
}
