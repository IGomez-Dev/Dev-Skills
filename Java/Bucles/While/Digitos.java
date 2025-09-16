package While;

import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        long i=0, n, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        n = sc.nextLong();
        i = n;
        if(n!=0){
        while (i!=0){
            c++;
            i/=10;
        }
        System.out.println("El número de dígitos de "+ n + " es " + c);
        }else{
            System.out.println("El número de dígitos de 0 es 1");        
        }

        sc.close();
    }
}
