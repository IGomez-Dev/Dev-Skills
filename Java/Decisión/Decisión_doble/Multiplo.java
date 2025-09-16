
/*
 * 2. Determinar si un número es múltiplo de 3 y 5
 */

package Decisión_doble;

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        // VARIABLES
        double num;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar un número");
        num = entrada.nextDouble();

        // PROCESO
        if (num % 3 == 0 && num % 5 == 0){
            // SALIDA   
            System.out.println("Es múltiplo de 3 y 5");
        }else{
            // SALIDA   
            System.out.println("No es múltiplo de 3 y 5");
        }        

        entrada.close();

    }
}
