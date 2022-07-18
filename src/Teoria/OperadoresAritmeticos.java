package Teoria;

/**
 *
 * @author Jorge Cordero
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a=3, b=2 ; //Se pueden definir dos variables en una misma linea 
        int resultado = a + b; //Operador de suma (+)
        System.out.println("La suma es: "+ resultado);
        resultado = a - b; //Operador de resta (-)
        System.out.println("La resta es:" + resultado);
        resultado = a * b; //Operador de multiplicacion (*) 
        System.out.println("La multiplicacion es: "+ resultado);
        resultado = a / b; //Operador de division (/) 
        //***Si se quiere obtener un resultado con decial la variable debe ser double***//
        System.out.println("La division es: "+resultado);
        resultado = a % b ; //Operador de coeficiente (%)
        System.out.println("El residuo de la division es: "+resultado);
        
        }
        
    
}
