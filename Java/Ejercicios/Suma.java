
/*
 * 17. Determinar la suma de los primeros números enteros positivos
 */

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        // VARIABLES
        long N, sum;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar hasta que número se sumará");
        N = entrada.nextLong();
        if (N <= 0){
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                N = entrada.nextLong();
            } while(N <= 0);
        }

        // PROCESO
        sum = (N * (N + 1)) / 2;

        // SALIDA
        System.out.println("La suma de los primeros números enteros es " + sum);

        entrada.close();
    }
}
