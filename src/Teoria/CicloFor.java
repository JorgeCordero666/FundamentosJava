package Teoria;
/**
 *
 * @author Jorge Cordero
 */
public class CicloFor {

    public static void main(String[] args) {
        
        System.out.println("Ciclo For");
        //Definicion ciclo for 
        for(int i=0;i<8;i++){
            System.out.println("Tu iterador esta en: " + i);
        }
        
        //Palabra reservada break
        System.out.println("Palabra reservada break");
        //Se usa siempre dentro de un condicional
        for(int i=0;i<8;i++){
            if(i % 2 == 0){
                System.out.println("Tu iterador esta en: " + i);
                break; //Termina la ejecucion con la primera condicion encontrada 
            }
        }
        //Palabra reservada continue 
        System.out.println("Palabra reservada continue");
        //Se usa siempre dentro de un condicional
        for(int i=0;i<8;i++){
            if(i %2 == 0){
                continue; //Omite la condicion y pasa a la siguiente iteracion
            }
            System.out.println("Tu iterador esta en: " + i);
        }
        //Etiquetas --> ayudan a gestionar las palabras reservadas  break y continue 
        //no es recomendable trabajar con etiquetas 
        //Definicion
        //<nombre_etiqueta>:
        
    }
    
}
