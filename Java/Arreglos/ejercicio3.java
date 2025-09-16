package Arreglos;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n, i, j;
            double m;
            System.out.println("Ingresar la cantidad de números");
            n = sc.nextInt();
            double num[] = new double[n];
            for (i = 0; i < n; i++) {
                System.out.println("Ingrese el número " + (i + 1));
                num[i] = sc.nextDouble();

                for (i = 0; i < n - 1; i++) {
                    for (j = 0; j < n - 1 - i; j++) {
                        if (num[j] < num[j + 1]) {
                            m = num[j];
                            num[j] = num[j + 1];
                            num[j + 1] = m;
                        }
                    }
                }
                
                System.out.println("Números del mayor al menor:");
                for (i = 0; i < n; i++) {
                    System.out.println(num[i]);
                }
            }
        }
    }
}