
/*
 * 3. Dado un número, devolver el doble si el número no es par; caso contrario, el triple.
 */

package Decisión_doble;

import java.util.Scanner;

public class Doble_Triple {
    public static void main(String[] args) {
        // VARIABLES
        double num, mult;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar un número");
        num = entrada.nextDouble();

        // PROCESO
        if (num % 2 == 0){
            mult = 3 * num;

        }else{
            mult = 2 * num;
        }     

        // SALIDA   
        System.out.println("El nuevo número es " + mult);
        
        entrada.close();
    }
}
