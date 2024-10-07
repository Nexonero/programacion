package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Tablas {
    public static void main(String[] args) {
        int inicio=ingresarEntero("Ingrese el primer dato del rango: ");
        int fin=ingresarEntero("Ingrese el segundo dato del rango: ");
        String tablas=calcularTabla(inicio, fin);
        mostrarMensaje(tablas);

    }
    public static int ingresarEntero(String mensaje){
        Scanner scanner= new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static String calcularTabla(int inicio, int fin){
        String tablas="Las tablas de multiplicar del "+inicio+" hasta "+fin+"son:\n";
        for(int i=inicio; i<=fin; i++) {
            tablas+="La tabla de multiplicar de "+i+" es: \n";
            for(int j=0; j<=10; j+=2){
                int operacion = i*j;
                tablas+= +i+" x "+j+" = "+operacion+"\n";  
            }
        } 
        return tablas;
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);

    }
}
