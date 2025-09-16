
/*
 * 14. Hallar la radicación de a^1/n, donde a y n pertenecen a z+ (números positivos enteros)
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Raiz{
    public static void main(String[] args){
        // VARIABLES
        double r, n; 
        long a;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el radicando");
        a = entrada.nextLong();
        if (a <= 0) { 
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                a = entrada.nextLong();
            } while (a <= 0);
        }
        System.out.println("Ingresar el radical");
        n = entrada.nextLong();
        if (n <= 0) { 
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                n = entrada.nextLong();
            } while (n <= 0);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        r = Math.pow(a, 1/n);

        // SALIDA
        System.out.println("La raíz es " + form.format(r));

        entrada.close();
    }
}