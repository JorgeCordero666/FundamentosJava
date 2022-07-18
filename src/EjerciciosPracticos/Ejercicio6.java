package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author Jorge Cordero
 */
public class Ejercicio6 {

    
    public static void main(String[] args) {
        //Solicita al usuario dos valores, y determina cual es el mayor de ellos. 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para saber cual de los numeros es mayor");
        System.out.println("Ingrese el primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = entrada.nextInt();
        String comparacion = (numero1 > numero2) ? "El primer numero es mayor" : "El segundo numero es mayor";  
        System.out.println(comparacion);
        
    }
    
}
