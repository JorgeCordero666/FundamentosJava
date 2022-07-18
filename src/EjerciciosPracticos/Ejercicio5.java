package EjerciciosPracticos;
import java.util.Scanner;

/**
 *
 * @author Jorge Cordero
 */
public class Ejercicio5 {

    //Calcular el area del rectangulo con su perimetro 
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la altura del rectangulo: ");
        double h = entrada.nextDouble();
        System.out.println("Ingrese la base del rectangulo: ");
        double b = entrada.nextDouble();
        double area = (b * h); 
        double perimetro = 2 * (h + b); 
        System.out.println("El area del rectangulo es: " + area + "\nEl perimetro es: "+ perimetro);
    }
    
}
