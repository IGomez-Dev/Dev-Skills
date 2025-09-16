
/*
 * 19. Calcular el interés compuesto generado por un capital durante cierta cantidad de tiempo
 *     a una tasa de interés determinada.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Interes {
    public static void main(String[] args) {
        // Variables
        double M, C, I;
        float t, r;

        // Entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el capital");
        C = entrada.nextDouble();
        if (C <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingresar un número mayor a 0");
                C = entrada.nextDouble();
            } while (C <= 0);
        }
        System.out.println("Ingresar el tiempo");
        t = entrada.nextFloat();
        if (t <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingresar un número mayor a 0");
                t = entrada.nextFloat();
            } while (t <= 0);
        }
        System.out.println("Ingresar la tasa de interes");
        r = entrada.nextFloat();
        if (r <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingresar un número mayor a 0");
                r = entrada.nextFloat();
            } while (r <= 0);
        }

        // Proceso
        DecimalFormat form = new DecimalFormat("#.00");
        M = (float) (Math.pow( 1 + r / 100, t) * C);
        I = M - C;

        // Salida
        System.out.println("El interés es: " + form.format(I));

        entrada.close();
    }
}
