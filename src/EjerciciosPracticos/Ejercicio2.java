package EjerciciosPracticos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Cordero
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //Entrada y Salida por ventana
        /*Solicitar la información de un libro con el siguiente formato:
            -Titulo:
            -Autor:
            -Edicion: 
         */
        
        String titulo;
        String autor;
        int edicion;
        
        titulo = JOptionPane.showInputDialog("Ingrese el nombre del libro");
        autor = JOptionPane.showInputDialog("Ingrese el autor del libro: ");
        edicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edicion del libro: ")); 
        
        JOptionPane.showMessageDialog(null, "El nombre del libro es: "+titulo);
        JOptionPane.showMessageDialog(null, "El autor es: "+autor);
        JOptionPane.showMessageDialog(null, "El numero de edicion es: "+edicion);
        
        
    }
    
}
