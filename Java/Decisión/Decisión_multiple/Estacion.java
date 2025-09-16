
/*
 * 5. Al ingresar el día y el número del mes, devolver la estación del año de acuerdo a la siguiente tabla
 */

package Decisión_multiple;

import java.util.Scanner;

public class Estacion {
    public static void main(String[] args) {
        // VARIABLES
        String p;
        Byte d, m;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el día");
        d = entrada.nextByte();
        System.out.println("Ingrese el mes");
        m = entrada.nextByte();

        // PROCESO
        if (m == 1 && d <= 31 && d > 0){
            p = "Verano";
        } else if (m == 2 && d <= 29 && d > 0){
            p = "Verano";
        } else if (m == 3 && d <= 20 && d > 0){
            p = "Verano";
        } else if (m == 3 && d > 20 && d <= 31){
            p = "Otoño";
        } else if (m == 4 && d <= 30 && d > 0){
            p = "Otoño";
        } else if (m == 5 && d <= 31 && d > 0){
            p = "Otoño";
        } else if (m == 6 && d <= 21 && d > 0){
            p = "Otoño";
        } else if (m == 6 && d > 21 && d <= 31){
            p = "Invierno";
        } else if (m == 7 && d <= 31 && d > 0){
            p = "Invierno";
        } else if (m == 8 && d <= 30 && d > 0){
            p = "Invierno";
        } else if (m == 9 && d <= 22 && d > 0){
            p = "Invierno";
        } else if (m == 9 && d > 22 && d <= 31){
            p = "Primavera";
        } else if (m == 10 && d <= 31 && d > 0){
            p = "Primavera";
        } else if (m == 11 && d <= 30 && d > 0){
            p = "Primavera";
        } else if (m == 12 && d <= 20 && d > 0){
            p = "Primavera";
        } else if (m == 12 && d > 20 && d <= 31){
            p = "Verano";
        } else {
            p = "No existe la fecha";
        }
        // SALIDA
        System.out.println(p);

        entrada.close();
    }
}
