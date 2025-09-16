package For;

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        long i, n,in, r, li, ls, c = 0, ni, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el límite inferior");
        li = sc.nextLong();
        while (li < 0) {
            System.out.println("Valor incorrecto, ingrese un número positivo");
            li = sc.nextLong();
        }
        System.out.println("Ingrese  el límite superior");
        ls = sc.nextLong();
        while (ls < 0) {
            System.out.println("Valor incorrecto, ingrese un número positivo");
            ls = sc.nextLong();
        }
        System.out.print("Los números capicúa son: ");
        for (i = li ; i <= ls; i++) {
            n = i;
            in = 0;
            ni = (long) Math.log10(n);
            for(j = 0; j <= ni; j++){
                r = n % 10;
                in = in * 10 + r; 
                n /= 10; 
            }
            if (i == in) {
                c++;
                System.out.print(i+",");
            }
        }
        System.out.println("");
        System.out.println("La cantidad de números capicúa desde " + li + " hasta " + ls + " es " + c);
    }
}