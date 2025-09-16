
/*
 * 1. Determinar si un número es par o impar
 */

package Decisión_doble;
import java.util.Scanner;


public class Par {
    public static void main(String[] args) {
        // VARIABLES
        double num;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar un número");
        num = entrada.nextDouble();

        // PROCESO
        if (num % 2 == 0){
            // SALIDA   
            System.out.println("Es par");
        }else{
            // SALIDA   
            System.out.println("Es impar");
        }
        
        entrada.close();
        
    }
}
