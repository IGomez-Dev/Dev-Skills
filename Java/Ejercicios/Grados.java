
/*
 * 6. Leer una cantidad de grados centígrados y la pase a grados Fahrenheit
 */

import java.util.Scanner;

 public class Grados{
    public static void main(String[] args){
        // VARIABLES
        Float C,F;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.print("El grado en Celcius es: ");
        C = entrada.nextFloat();
        if (C <= -273) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                C = entrada.nextFloat();
            } while (C <= -273);
        }

        // PROCESO
        F = 32 + (9 * C) / 5;

        //SALIDA
        System.out.println("El grdo en Fahrenheit es " + F);

        entrada.close();
    }
}