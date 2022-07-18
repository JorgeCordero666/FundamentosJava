
package Teoria;

/**
 *
 * @author Jorge Cordero
 */
public class OperadoresUnarios {

  
    public static void main(String[] args) {
        //Los operadores Unarios son operadores aritmeticos que realizan acciones sobre otro operador aritmetico 
        int a = 3;
        int b = -a;
        //En este caso El signo menos(-) es un operador unario 
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //Boleanos 
        boolean c = true;
        boolean d = !c;
        //EL OPERADOR DE LA NEGACION ES (!)
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Operador unario de incremento
        //1. preincremento 
        int e = 3;
        int f = ++e; //primero incrementa la variable e en 1 y despues se asigna su valor a f 
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2. post incremento
        int g = 5;
        int h =g++; //primero se utiliza el valor de g y luego se incrementa en 1
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
    
}
