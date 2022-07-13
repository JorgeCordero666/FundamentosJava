package Teoria;

/**
 * @author Jorge Cordero
 */
public class TiposVariables {

    public static void main(String[] args) {
        //Variable Entera
        int miVariableEntera = 10;
        System.out.println("mi variable entera es: " + miVariableEntera);
        miVariableEntera = 5;
        System.out.println("mi variable entera modificada es: " + miVariableEntera);
        //Variable String 
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        //Variable Var --Inferencia de tipos en Java 
        var miVariableEntera2 = 10;
        System.out.println("Mi variable entera 2 es: " + miVariableEntera2);

        //Reglas para definir una variable 
        /*
       1. El nombre de la variable se comienza en minuscula
       2. La variable no debe tener caracteres especiales
         */
        //Concatenación de variables
        String usuario = "Juan";
        String titulo = "Ingeniero";
        String union = titulo + " " + usuario;
        System.out.println("union= " + union);
        
        //Caracteres especiales en Java 
        String nombre = "Jorge";
        System.out.println("Salto de linea: \n"+ nombre);
        System.out.println("Tabulador: \t"+ nombre); //Espacios 
        System.out.println("Retroceso: \b" + nombre); //Elimina los espacios en blanco
        System.out.println("Comillas simples: \'"+nombre+"\'"); //Imprimir comillaas simples 
        System.out.println("Comillas dobles: \""+ nombre +"\"" );
        
        
       

    }

}
