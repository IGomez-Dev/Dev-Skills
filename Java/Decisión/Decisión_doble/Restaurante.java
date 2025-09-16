
/*
 * Un restaurante ofrece un descuento del 10% para consumos hasta S/. 100 000, 
 * y un descuento del 20% para consumos mayores. En ambos casos se aplica un 
 * impuesto del 19%. Determinar el monto de descuento, el impuesto y el importe a pagar.
 */

package Decisión_doble;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        // VARIABLES
        double C, D, I, P;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto de consumo");
        C = entrada.nextDouble();
        if (C <= 0){
            do{
                System.out.println("Valor incorrecto. Ingresar un monto de consumo mayor a 0");
                C = entrada.nextDouble();
            } while (C <= 0);
        }

        // PROCESO
        I = 0.01 * C;
        DecimalFormat form = new DecimalFormat("#.00");
        if (C > 1000){
            D = 0.01 * C;

        }else{
            D = 0.02 * C;
        }    
        P = C - D + I; 

        // SALIDA   
        System.out.println("El descuento es " + form.format(D) + " el impuesto es " + form.format(I)+ 
        " y el importe a pagar es " + form.format(P));   

        entrada.close();

    }
}
