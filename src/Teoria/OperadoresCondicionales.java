package Teoria;

/**
 *
 * @author Jorge Cordero
 */
public class OperadoresCondicionales {

    public static void main(String[] args) {
        // Operadores Condicionales AND(&&) y OR (||)
        int a = 10;
        int valorMin = 0;
        int valorMax = 10;

        //OPERADOR AND 
        boolean resultado = (a >= valorMin && a <= valorMax);

        if (resultado) { //Como resultado es una variable boolean el condicional lo compara con el valor true automaticamente
            System.out.println("El valor esta en el rango");
        } else {
            System.out.println("El valor no esta en el rango de 1 a 10");
        }
        //OPERADOR OR 
        var vacaciones = true;
        var diaDescanso = false;
        if (vacaciones || diaDescanso )
            System.out.println("Padre puede asistir al juego del hijo");
        else 
            System.out.println("El padre esta ocupado");
        
        
    }

}
