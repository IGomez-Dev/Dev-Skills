
/*
 * 8. Hallar el peso de un cuerpo
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Peso{
    public static void main(String[] args){
        // VARIABLES
        double p, m;
        final float g = 9.8f;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la masa");
        m = entrada.nextDouble();
        if (m <= 0) {
            do{
            System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
            m = entrada.nextDouble();   
            } while (m <= 0);
        }

        // PROCESO
        DecimalFormat formato = new DecimalFormat("#.00");
        p = m * g;

        // SALIDA
        System.out.println("El peso es " + formato.format(p));

        entrada.close();
    }
}