package For;
import java.util.Scanner;

public class Perfecto {
        public static void main(String[] args) {
        long i, n, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        n = sc.nextLong();
        while (n < 0){
            System.out.println("Valor incorrecto, ingrese un número positivo");
            n = sc.nextLong();
            sc.close();
        }
        for (i = 1; i < n; i++){
            if (n % i == 0){
                s += i;
                System.out.println("Sus divisores son: "+ i);

            }
        }
        if (s == n){
            System.out.println("La suma de sus divisores es: " + s);
            System.out.println("El número " + n + " es perfecto");
        }else{
            System.out.println("La suma de sus divisores es: " + s);
            System.out.println("El número " + n + " no es perfecto");
        }
    }
}
