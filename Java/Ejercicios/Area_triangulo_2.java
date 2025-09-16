
/*
 * 18. Dada la base y la altura de un triángulo, calcule e imprima su superficie.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area_triangulo_2 {
    public static void main(String[] args) {
        // VARIABLES
        double b, al, ar;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar la altura");
        al = entrada.nextDouble();
        if (al <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                al = entrada.nextDouble();
            } while (al <= 0);
        }
        System.out.println("Ingresar la base");
        b = entrada.nextDouble();
        if (b <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                b = entrada.nextDouble();
            } while (b <= 0);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        ar = (b * al) / 2;
        
        // SALIDA
        System.out.println("El área del triángulo es " + form.format(ar));

        entrada.close();
    }
}
