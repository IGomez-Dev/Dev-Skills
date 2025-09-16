package Arreglos;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        double m, suma = 0, prom;
        System.out.println("Ingrese la cantidad de temperaturas");
        n = sc.nextInt();
        double num[] = new double[n];
        sc.close();
        m = num[0];

        for (i = 0; i < n; i++){
            System.out.println("Ingrese la temperatura " + (i +1));
            num[i] = sc.nextDouble();
            while(num[i]<-273){
                System.out.println("Valor incorrecto. La temperatura debe ser mayor a -273");
                num[i] = sc.nextDouble();
            }
        }


        for (i = 1; i < n; i++){
            if (num[i] > m){
                m = num[i];
            }
        }
        
        for (i = 0; i < n; i++){
            suma += num[i];
        }

        prom = suma / n;    
        System.out.println("La temperatura máxima es " + m);
        System.out.println("El promedio de las temperaturas es " + prom);
    }
}