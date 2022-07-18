package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author Jorge Cordero
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        /*
        Se solicita capturar la siguiente información de una tienda de libros:

        nombre (String)

        id (int)

        precio (double)

        envioGratuito (boolean)

        Tu tarea es imprimir un mensaje en el siguiente formato:

        Proporciona el nombre:
        Proporciona el id:
        Proporciona el precio:
        Proporciona el envio gratuito:
        <nombre> #<id>
        Precio: <simbolo><precio>
        Envio Gratuito: <envioGratuito>
        Por ejemplo:

        Proporciona el nombre:
        Programacion con Java
        Proporciona el id:
        1520
        Proporciona el precio:
        899
        Proporciona el envio gratuito:
        true
        Programacion con Java #1520
        Precio: $899.00
        Envio Gratuito: true 
         */
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Proporciona el nombre: \n");
        nombre = entrada.nextLine();
        System.out.println("Proporciona el id: ");
        id = entrada.nextInt();
        System.out.println("proporciona el precio: ");
        precio = entrada.nextDouble();
        System.out.println("Proporcionael envio gratuito (true o false): ");
        envioGratuito = entrada.nextBoolean();
        System.out.print("El nombre del libro es: " + nombre + " " + id);
        System.out.println("El precio es: " + precio);
        System.out.println("Envio Gratutito: " + envioGratuito);

    }

}
