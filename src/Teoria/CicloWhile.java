
package Teoria;

public class CicloWhile {

    public static void main(String[] args) {
        int contador =0;
        int numero = 0;
        //Definicion Ciclo While
        System.out.println("***Ciclo While***");
        while(contador <= 3){
            System.out.println("El contador esta en: " + contador);
            contador ++;
 
        }
        //Definicion ciclo do-while
        System.out.println("***Ciclo Do-While***");
        do{
            System.out.println("El contador esta en: " + numero);
            numero ++;  
        }while(numero < 3 );
    }
}
