package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PerroTest {

    @Test
    void testGetRaza() {
        Perro perro = new Perro("Rex", 4, 20.0, "Pastor Alemán", "Carlos");
        assertEquals("Pastor Alemán", perro.getRaza());
    }

    @Test
    void testSetRaza() {
        Perro perro = new Perro("Rex", 4, 20.0, "Pastor Alemán", "Carlos");
        perro.setRaza("Labrador");
        assertEquals("Labrador", perro.getRaza());
    }

    @Test
    void testToString() {
        Perro perro = new Perro("Rex", 4, 20.0, "Pastor Alemán", "Carlos");
        String expected = "Perro [raza=Pastor Alemán, dueño=Carlos, getNombre()=Rex, getEdad()=4, getPeso()=20.0]";
        assertEquals(expected, perro.toString());
    }
}
