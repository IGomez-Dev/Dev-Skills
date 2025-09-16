
package While;
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        long c = 0, s = 0;
        float n;
        double p;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese sus notas");
            n = sc.nextFloat();
            if (n < 0 || n > 10) {
                do {
                    System.out.println("Valor incorrecto. Ingrese un número entre 0 y 10");
                    n = sc.nextLong();
                } while (n < 0 || n > 10);
            }

            if (n != 0) {
                c++;
                s += n;
            }
        } while (n != 0);

        if (c != 0) {
            p = (double) s / c;
            System.out.println("Suma de notas: " + s);
            System.out.println("Cantidad de notas: " + c);
            System.out.println("Promedio: " + p);
        } else {
            System.out.println("No se ingresaron notas válidas");
        }

        sc.close();
    }
}