
/*
 * Dada la edad de una persona, determinar si es mayor de edad o menor de edad.
 * Considere que alguien es mayor de edad si tiene 18 o más.
 */

package Decisión_doble;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        // VARIABLES
        byte e;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar su edad");
        e = entrada.nextByte();
        if (e <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese una edad mayor a 0");
                e = entrada.nextByte();
            } while (e <= 0);
        }

        // PROCESO
        if (e >= 18){
            // SALIDA
            System.out.println("Es mayor de edad");
        } else {
            // SALIDA
            System.out.println("Es menor de edad");
        }
        
        entrada.close();
    }
}
