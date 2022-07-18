
package Teoria;

/**
 *
 * @author Jorge Cordero
 */
public class OperadoresAsignacion {

    
    public static void main(String[] args) {
        //Operador de asignacion (=)
        int a = 3, b=2;
        int c = a + 5 - b;
        System.out.println("El de la asignacion es igual a "+ c);
        //Operador de asignación por composicion (+=)
        a += 1;  //Es igual que (a=a+1)
        System.out.println("La variable a incrementada es: "+a);
        a -= 2; //Es igual que (a=a-1)
        System.out.println("La variable a disminuida es: "+a);
        
        
        
    }
    
}
