package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AguilaTest {

    @Test
    void testGetHabitat() {
        Aguila aguila = new Aguila("Aguila Real", 5, 3.5, "Montañas Rocosas"); // Instancia creada con parámetros
        assertEquals("Montañas Rocosas", aguila.getHabitat());
    }

    @Test
    void testGetNombre() {
        Aguila aguila = new Aguila("Aguila Real", 5, 3.5, "Montañas Rocosas"); // Instancia creada con parámetros
        assertEquals("Aguila Real", aguila.getNombre());
    }

    @Test
    void testVolar() {
        Aguila aguila = new Aguila("Aguila Real", 5, 3.5, "Montañas Rocosas"); // Instancia creada con parámetros
        aguila.volar(); // Este método imprime, verifica que no lance excepciones
    }
}
