
/*
 * 12. Hallar la potencia de a^n, donde a y n pertenecen a Z+ (números enteros positivos)
 */

import java.util.Scanner; 

public class Potencia{
    public static void main(String[] args){
    // VARIABLES
    long n, a;
    double pot;
    // PROCESO
    Scanner entrada = new Scanner(System.in);
    System.out.print("La base de la potencia es: ");
    a = entrada.nextLong();
    if (a <= 0) {
        do{
            System.out.print("Valor incorrecto, ingrese un número mayor a 0: ");
            a = entrada.nextLong();
        } while (a <= 0);   
    }

    System.out.print("El exponente de la potencia es: ");
    n = entrada.nextLong();
    if (n <= 0) {
        do{
            System.out.print("Valor incorrecto, ingrese un número mayor a 0: ");
            n = entrada.nextLong();
        } while (n <= 0);
    }
    // PROCESO
    pot = Math.pow(a, n);
    // SALIDA
    System.out.println("La potencia es " + pot);

    entrada.close();
    }
}