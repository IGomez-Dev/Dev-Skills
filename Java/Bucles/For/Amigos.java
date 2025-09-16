package For;

import java.util.Scanner;

public class Amigos {
    public static void main(String[] args) {
        long i, n, m, sn = 0, sm = 0;
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.println("Ingrese un número:");
        n = sc.nextLong();
        while (n <= 0) {
            System.out.println("Valor incorrecto, ingrese un número positivo:");
            n = sc.nextLong();
        }
        System.out.println("Ingrese otro número:");
        m = sc.nextLong();
        while (m <= 0) {
            System.out.println("Valor incorrecto, ingrese un número positivo:");
            m = sc.nextLong();
            sc.close();
        }

        // PROCESO: Calcular la suma de divisores propios de n
        System.out.print("Los números divisores de " + n + " son: ");
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                sn += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("= " + sn);

        // PROCESO: Calcular la suma de divisores propios de m
        System.out.print("Los números divisores de " + m + " son: ");
        for (i = 1; i < m; i++) {
            if (m % i == 0) {
                sm += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("= " + sm);

        // SALIDA: Verificar si son números amigos
        if (sn == m && sm == n) {
            System.out.println(n + " y " + m + " son amigos");
        } else {
            System.out.println(n + " y " + m + " no son amigos");
        }

        sc.close();
    }
}
