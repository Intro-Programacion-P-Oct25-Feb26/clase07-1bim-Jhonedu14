/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        int contador = 1;
        System.out.println("Ingrese el Límite");  //6
        limite = entrada.nextInt(); 
        while (contador <= limite){
            
            if (contador%2!=0) {
                System.out.printf("Contador %d\n", 
                    contador);
            }
            
            contador = contador + 1;
        }
        
    }
}
/*
Primero te pide ingresar el limete, segundo el codigo explica contador esta 
una operacion con el mod y esto sale su residuo en el cual si es que contiene 
residuo se muestra en pantalla y hasta llegar a la condicon que sea falsa 
*/