package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class Gimnasio {
    private String nombre;
    private LocalDate fechaInscripcion;
    private LinkedList<Miembro> miembros;
    private LinkedList<Entrenador> entrenadores;

    // Constructor que acepta el nombre del gimnasio y la fecha de inscripción
    public Gimnasio(String nombre, LocalDate fechaInscripcion) {
        this.nombre = nombre;
        this.fechaInscripcion = fechaInscripcion;
        this.miembros = new LinkedList<>();
        this.entrenadores = new LinkedList<>();
    }

    // Métodos getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", fechaInscripcion=" + fechaInscripcion + ", miembros=" + miembros
                + ", entrenadores=" + entrenadores + "]";
    }

    public void agregarMiembro(Miembro miembro) {
        miembros.add(miembro);
    }

    public void agregarEntrenador(Entrenador entrenador) {
        entrenadores.add(entrenador);
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // 1. Imprimir nombres invertidos
    public void imprimirNombresInvertidos() {
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            mostrarMensaje(miembro.getNombre());
        }
    }

    // 2. Obtener miembros menores a una edad específica
    public LinkedList<Miembro> obtenerMiembrosMenores() {
        LinkedList<Miembro> menores = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                menores.add(miembro);
            }
        }
        return menores;
    }

    // 3. Calcular el promedio de las edades
    public double calcularPromedioEdades() {
        int sumaEdades = 0;
        int cantidadMiembros = miembros.size();                                                                                         
        for (Miembro miembro : miembros) {
            sumaEdades += miembro.getEdad();
        }
            double promedio = 0.0;
            if (cantidadMiembros > 0) {
                promedio = sumaEdades / cantidadMiembros;
            
        }
        return promedio;
    }

    // 4. Eliminar los miembros que contengan en el nombre 3 vocales
    public boolean validarVocal(char letra) {
        return letra == 'a' || letra == 'e' ||
               letra == 'i' || letra == 'o' || 
               letra == 'u';
    }
    
    public int contarVocales(String palabra) { 
        int contarVocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (validarVocal(letra)) {
                contarVocales++; 
            }
        }
        return contarVocales;
    }

    public void eliminarMiembros() {
        for (int i = 0; i < miembros.size(); i++) {
            Miembro miembro = miembros.get(i);
            String nombre = miembro.getNombre();
            if (contarVocales(nombre) >= 3) {
                miembros.remove(i); 
                i--; 
            }
        }
    }
    
    // 5. Obtener la edad más común
     public int obtenerEdadMasComun() {
        Map<Integer, Integer> frecuenciaEdades = new HashMap<>();
        for (Miembro miembro : miembros) {
            int edad = miembro.getEdad();
            frecuenciaEdades.put(edad, frecuenciaEdades.getOrDefault(edad, 0) + 1);
        }

        int edadMasComun = -1;
        int maxFrecuencia = 0;
        for (Map.Entry<Integer, Integer> entry : frecuenciaEdades.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                edadMasComun = entry.getKey();
            }
        }
        return edadMasComun;
    }

    // contar la cantidad de miembros con menbresia anual y mayores de edad
    public int contarCantidadMiembrosMembresiaAnualMaYoresEdad() {
        int cantidadMiembros = 0;
        for (Miembro miembro : miembros) {
            if (miembro.getTipoMembresia() == TipoMembresia.ANUAL && miembro.getEdad() >= 18) {
                cantidadMiembros++;
            }
        }
        return cantidadMiembros;
    }

    //lista de entrenadores cuya suma de Teléfono es igual a 30
    // Lista de entrenadores cuya suma de teléfono es igual a 30
public LinkedList<Entrenador> obtenerEntrenadoresSumaTelefonoIgual30() {
    LinkedList<Entrenador> listaEntrenadoresTelefono = new LinkedList<>();
    for (Entrenador entrenador : entrenadores) {
        int telefonoEntrenador = entrenador.getTelefono();
        int sumaTelefono = 0;
        
        // Calcular la suma de los dígitos del teléfono
        for (int i = telefonoEntrenador; i > 0; i /= 10) {
            sumaTelefono += i % 10;
        }
        
        // Si la suma es igual a 30, añadir el entrenador a la lista
        if (sumaTelefono == 30) {
            listaEntrenadoresTelefono.add(entrenador);
        }
    }
    return listaEntrenadoresTelefono;
}
   
// Método corregido para invertir nombres de miembros menores de edad
    public void invertirNombresMiembros() {
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                String nombreMiembro = miembro.getNombre();
                String nombreInvertido = "";

                // Invertir el nombre del miembro
                for (int i = nombreMiembro.length() - 1; i >= 0; i--) {
                    nombreInvertido += nombreMiembro.charAt(i);
                }
                miembro.setNombre(nombreInvertido);
            }
        }
    }
}

