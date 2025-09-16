
/*
 * Una empresa ofrece casas de interés social bajo las siguientes 
 * condiciones: si el ingreso mensual del comprador es menor o igual 
 * a us$1000 la cuota inicial será el 15% del costo de la casa y el 
 * resto se distribuirá en 120 cuotas mensuales sin intereses; pero 
 * si el ingreso mensual del comprador es mayor a us$1000 la cuota 
 * inicial será el 30% del costo de la casa y el resto se distribuirá 
 * en 75 cuotas mensuales. Diseñe un programa que determine cuánto 
 * deberá pagar un comprador por cuota inicial, cuánto por cada cuota 
 * y cuántas cuotas le corresponden pagar. Verificar que el ingreso 
 * mensual no sea inferior a us$300; de lo contrario emitir un mensaje 
 * “ingreso mensual insuficiente”.
 */

package Decisión_anidada;

import java.util.Scanner;

public class Interes {
    public static void main(String[] args) {
        // VARIABLES
        double I, CI, NC;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("El ingreso mensual es");
        I = entrada.nextDouble();
        if (I <= 0) {
            do{
                System.out.println("Valor incorrecto. Escribir un número mayor a 0");
                I = entrada.nextDouble();
            } while (I <= 0);
        }

        // PROCESOS
        if (I > 300) {
            if (I > 1000) {
                NC = 75;
                CI = 30;
            }else{
                NC = 120;
                CI = 15;
            }
            System.out.println("La cuota inicial es " + CI + "% del costo de la casa y el neto se distribuirá en "+
            NC + " cuotas mensuales");
        }else{
            System.out.println("Ingreso mensual insuficiente");
        }
        
        entrada.close();
    }
}
