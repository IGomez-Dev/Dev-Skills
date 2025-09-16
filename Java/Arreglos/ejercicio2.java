package Arreglos;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int n, i;
        double suma = 0;

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingresa la cantidad de números");
            n = sc.nextInt();
            double[] num =  new double[n];

            for (i = 0; i<n; i++){
                System.out.println("Ingrese el número " + (i+1));
                num[i] = sc.nextDouble();
                suma += num[i];
            }
            System.out.println("La suma de los números es " + suma);
        }        
    }
}
