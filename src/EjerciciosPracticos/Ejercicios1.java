package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author Jorge Cordero
 */
public class Ejercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de datos 
        /*Solicitar la información de un libro con el siguiente formato:
            -Titulo:
            -Autor:
            -Edicion: 
         */
        String titulo;
        String autor;
        int edicion;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del libro:");
        titulo = entrada.nextLine();
        System.out.print("Ingrese el autor: ");
        autor = entrada.nextLine();
        System.out.print("Ingrese la edicion: ");
        edicion = entrada.nextInt();
        System.out.println("El titulo es: " + titulo + "\nEl autor es: " + autor + "\nLa edicion es: " + edicion);

    }

}
