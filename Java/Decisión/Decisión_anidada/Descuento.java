
/*
 * En un supermercado se hace una promoción mediante la cual el cliente 
 * obtiene un descuento dependiendo del número entero que ingrese. Si el
 * número ingresado es múltiplo de 5 y de 3 el descuento es del 25% sobre 
 * el monto de compra; si el número ingresado es múltiplo de 5 pero no de 
 * 3 el descuento es del 20%; si el número ingresado no es múltiplo de 5 
 * pero sí de 3 el descuento es del 15%; y si el número ingresado no es 
 * múltiplo de 5 ni de 3 el descuento es del 10%. Diseñe un programa que 
 * permita saber el monto del descuento y el monto neto que debe pagar un 
 * cliente por toda su compra.
 */


package Decisión_anidada;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        // VARIABLES
        long nu, dp;
        double d, ne, p;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el pago");
        p = entrada.nextDouble();
        if (p <= 0){
            do{
                System.out.println("Valor incorrecto. Ingresar una pago mayor a 0");
                p = entrada.nextDouble();
            } while (p <= 0);
        }
        System.out.println("Ingrese un número");
        nu = entrada.nextLong();

        // PROCESO
        if(nu % 5 == 0 && nu % 3 == 0){
            d = 0.25;
            ne = 0.75 * p;
        }else{
            if(nu % 5 == 0 && nu % 3 != 0){
                d = 0.2;
                ne = 0.8 * p;
            }else{
                if(nu % 5 != 0 && nu % 3 == 0){
                    d = 0.15;
                    ne = 0.85 * p;      
                }else{
                    d = 0.1;
                    ne = 0.9 * p;    
                }
            }
        }
        dp = (long) (100 * d);

        // SALIDA
        System.out.println("El monto del descuento es " + dp + "% y el monto neto es " + ne);

        entrada.close();
    }
}
