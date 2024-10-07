package co.edu.uniquindio.poo;
import javax.swing.JOptionPane;

public class numeroParImpar {
    
    public static void main(String[] args) {
        int numero= ingresarEntero ("Ingrese un número: ");
        String mensaje = generarMensaje (numero);
        mostrarMensaje(mensaje);
    }

    public static int ingresarEntero (String mensaje){
        String dialogo= JOptionPane.showInputDialog(null, mensaje);
        return Integer.parseInt(dialogo);
    }
    public static String generarMensaje (int numero){
        String tipo;
        if (numero%2==0){
            tipo = "El "+numero+" es par";
        }else{
            tipo = "El "+numero+" es impar";
        }
        return tipo;
    }
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
