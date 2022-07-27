package Teoria;

/**
 *
 * @author Jorge Cordero
 */
public class SetenciasControl {

    public static void main(String[] args) {
       //Sentencia if () - else 
        boolean condicion = true;
       if(condicion){
           System.out.println("Condicion verdadera");
       
       }
       else
            System.out.println("Condicion falsa");
       
        //Sentencia switch ()
        int numero = 2;
        String numeroTexto = "Valor desconocido";
        
        switch (numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default: 
                numeroTexto = "Caso desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
    }
    
}
