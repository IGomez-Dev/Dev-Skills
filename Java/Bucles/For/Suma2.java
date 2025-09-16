package For;
import java.util.Scanner;

public class Suma2 {
    public static void main(String[] args) {
        long i, n, sp = 0, si = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        n = sc.nextLong();
        while (n < 0){
            System.out.println("Valor incorrecto, ingrese un número positivo");
            n = sc.nextLong();
            sc.close();
        }
        for (i = 1; i <= n; i++){
            if (i % 2 == 0){
                sp += i;
            }else{
                si += i;
            }
        }
        System.out.println("La suma de números pares hasta " + n + " es " + sp + " y la suma de números impares es " + si );

        sc.close();
    }
}
