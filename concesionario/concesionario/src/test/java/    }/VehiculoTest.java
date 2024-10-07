package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Vehiculo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class VehiculoTest {
    private static final Logger LOG = Logger.getLogger(VehiculoTest.class.getName());

    @Test
    public void datosVacios() {
        LOG.info("Iniciando test datosVacios");

        assertThrows(IllegalArgumentException.class, () -> new Vehiculo("", "", 0, "", "", 0.0, 0, 0.0, 0.0));

        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void modeloNegativo() {
        LOG.info("Iniciando test modeloNegativo");

        assertThrows(IllegalArgumentException.class, () -> new Vehiculo("ABC123", "Toyota", -2021, "Rojo", "Gasolina", 50.0, 5, 1500.0, 150.0));

        LOG.info("Finalizando test modeloNegativo");
    }

    @Test
    public void capacidadTanqueNegativa() {
        LOG.info("Iniciando test capacidadTanqueNegativa");

        assertThrows(IllegalArgumentException.class, () -> new Vehiculo("ABC123", "Toyota", 2021, "Rojo", "Gasolina", -50.0, 5, 1500.0, 150.0));

        LOG.info("Finalizando test capacidadTanqueNegativa");
    }
}
