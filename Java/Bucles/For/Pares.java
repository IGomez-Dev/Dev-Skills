package For;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        long li, ls, c = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el límite inferior");
        li = sc.nextLong();
        System.out.println("Ingrese el límite superior");
        ls = sc.nextLong();
        sc.close();
        if (li % 2 == 0){
            for (i = li + 2; i < ls; i += 1){
                if (i % 2 == 0){
                    c ++;
                }
            }
        }else{
            for (i = li + 1; i < ls; i += 1){
                if (i % 2 == 0){
                    c ++;
                }
            }
        }
        System.out.println("Los números pares que contiene entre " + li + " y " + ls + " es " + c);

    }
}
