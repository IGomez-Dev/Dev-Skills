
/*
 * 1. Leer tres números y mostrar el mayor de ellos
 */

package Decisión_anidada;

import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        // VARIABLES
        double n1, n2, n3;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el primer número");
        n1 = entrada.nextDouble();
        System.out.println("Ingresar el segundo número");
        n2 = entrada.nextDouble();
        System.out.println("Ingresar el tercer número");
        n3 = entrada.nextDouble();

        // PROCESO
        if (n1 >= n2 && n1 >= n3) {
            // SALIDA
            System.out.println(n1);
        } else {
            if (n2 >= n1 && n2 >= n3){
                // SALIDA
                System.out.println(n2);
            } else {
                // SALIDA
                System.out.println(n3);
            }
        }
        
        entrada.close();
    }
}
