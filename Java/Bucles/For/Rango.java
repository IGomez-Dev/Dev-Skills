package For;

import java.util.Scanner;

public class Rango {
    public static void main(String[] args) {
        long n, li, ls, c = 0, i, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        n = sc.nextLong();
        while (n < 0){
            System.out.println("Valor incorrecto, ingrese un número positivo");
            n = sc.nextLong();
        }
        System.out.println("Ingresa el límite inferior");
        li = sc.nextLong();
        while (li < 0){
            System.out.println("Valor incorrecto, ingrese un número positivo");
            li = sc.nextLong();
        }
        System.out.println("Ingresa el límite superior");
        ls = sc.nextLong();
        while (ls < 0){
            System.out.println("Valor incorrecto, ingrese un número positivo");
            ls = sc.nextLong();
            sc.close();
        }

        for (i = 1; i < ls; i++){
            m = n * i;
            if (m > li && m < ls){
                c ++;
            }
        }
        if (c == 1){
            System.out.println("Existe un múltiplo de " + n + " entre " + li + " y " + ls);
        }else{
            System.out.println("Existe " + c + " múltiplos de " + n + " entre " + li + " y " + ls);
        }
    }
}