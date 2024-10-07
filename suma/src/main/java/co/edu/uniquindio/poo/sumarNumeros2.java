package co.edu.uniquindio.poo;

public class sumarNumeros2 {
    
    public static void main(String[] args) {
        int numero1=7;
        int numero2=8;
        int suma= sumaNumeros (numero1, numero2);
        mostrarMensaje (generarMensaje (numero1, numero2, suma));
    }

    public static int sumaNumeros(int numero1, int numero2){
        int suma= numero1+numero2;
        return suma;
    }

    public static String generarMensaje (int numero1, int numero2, int suma){
        String mensaje= "La suma de "+numero1+" y "+numero2+ " es igual a "+suma;
        return mensaje;
    }

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

}
