
/*
 * 2. Dado como datos la categoría y el sueldo de un trabajador, calcule 
 *    el aumento correspondiente teniendo en cuenta la siguiente tabla. 
 *    Imprima la categoría del trabajador y su nuevo sueldo.
 */

package Decisión_multiple;

import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        // VARIABLES
        byte cat;
        double suel, au = 0;
        String r;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        suel = entrada.nextDouble();
        System.out.println("Ingrese su categoría");
        cat = entrada.nextByte();

        // PROCESO
        switch (cat) {
            case 1:
                au = 1.15 * suel;
                r = "hl 1";
                break;
            case 2:
                au = 1.1 * suel;
                r = "hola 2";
                break;
            case 3:
                au = 1.08 * suel;
                r = "hola 3";
                break;
            case 4:
                au = 1.07 * suel;
                r = "hola 4";
                break;
        
            default:
                r = "hola df";
        }
        // SALIDA
        System.out.println(r);
        System.out.println(au);

        entrada.close();

    }
}
