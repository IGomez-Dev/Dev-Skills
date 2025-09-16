package While;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Alturas {
    public static void main(String[] args) {
        float n, c = 0, s = 0;
        double p;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese sus alturas. Escribe 0 para terminar la ejecución");
            n = sc.nextFloat();
            if (n < 0.5 && n>2.7) {
                do {
                    System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                    n = sc.nextFloat();
                } while (n < 0.5 && n>2.7);
            }

            if (n != 0) {
                c++;
                s += n;
            }
        } while (n != 0);

        if (c != 0) {
            p = (double) s / c;
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("El promedio de alturas es " + df.format(p));
        } else {
            System.out.println("No se ingresaron ninguna altura");
        }

        sc.close();
    }
}
