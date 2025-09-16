
/*
 * 20. Dado como datos el nombre de un dinosaurio, su peso y su longitud, expresados estos dos 
 *     últimoa wn libras y pies respectivamente.
 *     1 libra = 0.453592 y 1 pie = 0,3048
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Dinosaurio {
    public static void main(String[] args) {
        // VARIABLES
        String nom;
        Double m, kg, li, pi;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del dinosaurio");
        nom = entrada.nextLine();
        System.out.println("Ingrese el peso en libras");
        li = entrada.nextDouble();
        if (li <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                li = entrada.nextDouble();
            } while (li <= 0);
        }  
        System.out.println("Ingrese la longitud en pies");
        pi = entrada.nextDouble();
        if (pi <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                pi = entrada.nextDouble();
            } while (pi <= 0);
        }    
            
        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        m = 0.3048 * pi;
        kg = 0.453592 * li;

        // SALIDA
        System.out.println("El dinosaurio " + nom + " tiene un peso de " + form.format(kg) +
        "kg y tiene una longitud de " + form.format(m) +"m.");

        entrada.close();
    }
}