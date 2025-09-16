
/*
 * 15. Dado como datos la base y la altura de un rectángulo, calcule el perímetro y la superficie del mismo.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Rectangulo{
    public static void main(String[] arg){
        // VARIABLES
        double b, al, ar, p;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar la base");
        b = entrada.nextDouble();
        if (b <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                b = entrada.nextDouble();
            } while (b <= 0);
        }
        System.out.println("Ingresar la altura");
        al = entrada.nextDouble();
        if (al <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                al = entrada.nextDouble();
            } while (al <= 0);
        }
        
        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        p = 2 * (b + al);
        ar = b * al;

        // SALIDA
        System.out.println("El perímetro es " + form.format(p) + " el área es " + form.format(ar));

        entrada.close();
    }
}