package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author Jorge Cordero
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        /*
        El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
        El usuario proporcionará un valor entre 0 y 10.
        Si está entre 9 y 10: imprimir una A
        Si está entre 8 y menor a 9: imprimir una B
        Si está entre 7 y menor a 8: imprimir una C
        Si está entre 6 y menor a 7: imprimir una D
        Si está entre 0 y menor a 6: imprimir una F
        cualquier otro valor debe imprimir: Valor desconocido
        */
        Scanner entrada = new Scanner(System.in);
        int calf;
        System.out.println("El usuario proporciona un valor entre 0 y 10: ");
        calf = entrada.nextInt();
        
        switch (calf){
            case 9: case 10:
                System.out.println("Su nota es A");
                break;
            case 8:
                System.out.println("Su nota es B");
                break;
            case 7:
                System.out.println("Su nota es C");
                break;
            case 6:
                System.out.println("Su nota es D");
                break;
            case 5:
                System.out.println("Su nota es F");
                break;
        
        
        }
        
    }
    
}
