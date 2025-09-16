
/*
 * 3. Dado una letra determinar si es vocal.
 */

package Decisión_multiple;

import java.util.Scanner;

public class Vocal {
         public static void main(String[] args) {
        // VARIABLES
        char let;
        String r;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribir una letra");
        let = entrada.next().charAt(0);

        // PROCESO
        switch (let) {
            case 'a':
                r = "Es vocal";
                break;
            case 'e':
                r = "Es vocal";
                break;
            case 'i':
                r = "Es vocal";
                break;
            case 'o':
                r = "Es vocal";
                break;
            case 'u':
                r = "Es vocal";
                break;
            case 'A':
                r = "Es vocal";
                break;
            case 'E':
                r = "Es vocal";
                break;
            case 'I':
                r = "Es vocal";
                break;
            case 'O':
                r = "Es vocal";
                break;
            case 'U':
                r = "Es vocal";
                break;
            default:
                r = "No es vocal";
        }
        // SALIDA
        System.out.println(r);

        entrada.close();
    }
}
