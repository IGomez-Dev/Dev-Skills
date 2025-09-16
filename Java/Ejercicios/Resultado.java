
/*
 * 11. Dado dos números enteros A y B, escriba el resultado de la siguiente expresión: (A + B)^2/3
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Resultado{
    public static void main(String[] args){
        // VARIABLES
        long A, B;
        Double resp;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe el primer número: ");
        A = entrada.nextLong();
        System.out.print("Escribe el segundo número: ");
        B = entrada.nextLong();

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        resp = Math.pow(A + B, 2) / 3;

        //SALIDA
        System.out.println("El resultado es " + form.format(resp));

        entrada.close();
    }

}