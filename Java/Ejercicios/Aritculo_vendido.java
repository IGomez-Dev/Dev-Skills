
/*
 * 16. Dado el costo de un artículo vendido y lo cantidad de dinero
 *     entregada por el cliente, calcule e imprima el cambio que se debe entregar
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aritculo_vendido {
    public static void main(String[] args) {
        // VARIABLES
        double c, d, v;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar su dinero");
        d = entrada.nextDouble();
        if (d <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingresar un número mayor a 0");
                d = entrada.nextDouble();
            } while (d <= 0);
        }
        System.out.println("Ingresar el costo");
        c = entrada.nextDouble();
        if (c <= 0 || c >= d) {
            do{
                System.out.println("Valor incorrecto. Ingresar un número mayor a 0 y menor a su dinero");
                c = entrada.nextDouble();
            } while (c <= 0 || c >= d);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        v = d - c;
        
        // SALIDA
        System.out.println("El vuelto es: " + form.format(v));
        
        entrada.close();
    }
}