package Teoria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Cordero
 */
public class ClaseScanner {
    public static void main(String[] args) {
        //Ingresar Datos por consola 
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Escribe tu nombre: ");
        String usuario = entrada.nextLine();
        System.out.println("Es tu titulo: ");
        String titulo = entrada.nextLine();
        
        System.out.println("El usuario ingresado es: "+ usuario + "Su titulo es: " + titulo);
        
        //Entrada y salida por ventanas
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        //Entrada
        cadena = JOptionPane.showInputDialog("Digite una cadena: "); 
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal:"));
        
        //Salida
        JOptionPane.showMessageDialog(null, "La cadena es:\t"+cadena);
        JOptionPane.showMessageDialog(null,"El numero es:\t"+ entero);
        JOptionPane.showMessageDialog(null,"La letra es:\t"+ letra);
        JOptionPane.showMessageDialog(null,"El numero decimal es:\t"+ decimal);
        
        
        
        
        
    }
    
}
