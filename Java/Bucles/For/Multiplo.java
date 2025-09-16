package For;
import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        long i, n, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        n = sc.nextLong();
        while (n < 0){
            System.out.println("Valor incorrecto, ingrese un número positivo");
            n = sc.nextLong();
            sc.close();
        }
        for (i = 1; i <= n; i++){
            if (i % 5 == 0){
                c ++;
            }
        }
        System.out.println("Existe " + c + " múltiplos de 5 hasta " + n);

        sc.close();
    }
}
