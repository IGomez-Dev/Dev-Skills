
/*
 * 1. Dado un numero entero de un digito (de 0 al 9), devolver el numero en letras.
 */

package Decisión_multiple;

import java.util.Scanner;

public class Numero {
     public static void main(String[] args) {
        // VARIABLES
        byte n;
        String r;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su categoría");
        n = entrada.nextByte();

        // PROCESO
        switch (n) {
            case 1:
                r = "uno";
                break;
            case 2:
                r = "dos";
                break;
            case 3:
                r = "tres";
                break;
            case 4:
                r = "cuatro";
                break;
            case 5:
                r = "cinco";
                break;
            case 6:
                r = "seis";
                break;
            case 7:
                r = "siete";
                break;
            case 8:
                r = "ocho";
                break;
            case 9:
                r = "nueve";
                break;
            case 0:
                r = "cero";
                break;
            default:
                r = "Valor incorrecto. Ingrese un número del 0 al 9";
        }
        // SALIDA
        System.out.println(r);

        entrada.close();
    }
}
