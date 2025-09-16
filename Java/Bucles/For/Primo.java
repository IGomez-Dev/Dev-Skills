package For;
import java.util.Scanner;

public class Primo {
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
            if (n % i == 0){
                c ++;
            }
        }
        if (c == 2){
            System.out.println("El número " + n + " es primo");
        }else{
            System.out.println("El número " + n + " no es primo");
        }
    }
}