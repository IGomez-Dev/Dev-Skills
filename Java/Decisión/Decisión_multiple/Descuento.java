
/*
 * 7. Una frutería ofrece las manzanas con descuento según la siguiente tabla, calcular el descuento
 */

package Decisión_multiple;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        // VARIABLES
        double kilo;
        String r;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresar los kilos de manzana");
        kilo = entrada.nextDouble();

        // PROCESO
        if (kilo > 0 && kilo <= 2){
            r = "El descuento es 0%";
        } else if (kilo > 2 && kilo <= 5){
            r = "El descuento es 10%";
        } else if (kilo > 5 && kilo <= 10){
            r = "El descuento es 20%";
        } else if (kilo > 10){
            r = "El descuento es 10%";
        } else {
            r = "No existe el peso";
        }

        // SALIDA
        System.out.println(r);

        entrada.close();
    }
}
