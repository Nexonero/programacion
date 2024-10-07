package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int numero = ingresarEntero ("Ingrese el numero");
        int factorial = calcularFactorial (numero);
        String mensaje = generarMensaje (numero,factorial);
        mostrarMensaje (mensaje);
    }
    
    public static int ingresarEntero (String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static int calcularFactorial (int numero){
        int factorial = 1;
        for (int i = 1; i <= numero; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static String generarMensaje (int numero, int factorial){
        String mensaje = "El factorial de "+numero+" es "+factorial;
        return mensaje;
    }

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
}
