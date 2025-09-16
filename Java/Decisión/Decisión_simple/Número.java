
/*
 * 1. Determinar si un numero entero es positivo, negativo o neutro.
 */

package Decisión_simple;
import java.util.Scanner;

public class Número {

    public static void main(String[] args) {
        // VARIABLES
        double n;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese cualquier número: ");
        n = entrada.nextDouble();

        // PROCESO
        if (n != 0) {
            if (n > 0)
                // SALIDA
                System.out.println("Positivo");
            if (n < 0)
                // SALIDA
                System.out.println("Negativo");
        }
        if (n == 0) {
            // Salida
            System.out.println("Neutro");
        }

        entrada.close();
    }
}
