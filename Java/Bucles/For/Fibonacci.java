package For;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long i, n, ss = 1, s = 0, a = 0, b = 1, c = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        n = sc.nextLong();
        while (n < 0){
            System.out.println("Valor incorrecto, ingrese un número positivo");
            n = sc.nextLong();
            sc.close();
        }
        for (i = 1; i <= n; i += a) {
            s = a + b;
            a = b;
            b = s;
            ss += s;
            c++;
        }
        System.out.println("La cantidad de números de la serie de Fibonacci menores a " + n + " es " + c + " y la suma " +
         "de esos números es " +ss);
    }
}
