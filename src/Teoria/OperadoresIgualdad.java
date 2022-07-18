package Teoria;

/**
 *
 * @author Jorge Cordero
 */
public class OperadoresIgualdad {

    
    public static void main(String[] args) {
        //Operadores de igualdad (==)
        int a = 3;
        int b = 2;
        boolean c = (a==b); 
        System.out.println("c = " + c);
        //Operador  de diferenciab (!=)
        var d =(a !=b );
        System.out.println("d = " + d);
        
        //Cadena
        
        String cadena1 = "Hola";
        String cadena2 = "Hola";
        var comparacion = (cadena1==cadena2); //Compara la posision de la memoria de la cadena
        System.out.println("comparacion = " + comparacion);
        var f = cadena1.equals (cadena2); //Utilizando POO, se puede saber si el contenido es igual en ambas variables 
        System.out.println("f = " + f);
        
        //Operadores Relacionales --> Indican si un valor es mayor o menor o igual 
        
         boolean g = (a >= b);//Operador (>) tambien se puede utilizar (>=) (<)(<=)
         System.out.println("g = " + g);
         
         
        
        
    }
    
}
