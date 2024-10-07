package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeonTest {

    @Test
    void testGetMelena() {
        Leon leon = new Leon("Simba", 5, 190.5, "Densa");
        assertEquals("Densa", leon.getMelena());
    }

    @Test
    void testSetMelena() {
        Leon leon = new Leon("Simba", 5, 190.5, "Densa");
        leon.setMelena("Corta");
        assertEquals("Corta", leon.getMelena());
    }

    @Test
    void testToString() {
        Leon leon = new Leon("Simba", 5, 190.5, "Densa");
        String expected = "Leon [melena=Densa, getNombre()=Simba, getEdad()=5, getPeso()=190.5]";
        assertEquals(expected, leon.toString());
    }
}
