
package Teoria;

/**
 *
 * @author Jorge Cordero
 */
public class PrecedenciaOperadores {

   
    public static void main(String[] args) {
        // Precedencia de Operadores es el orden en que los operadores se evaluan 
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
    
}
