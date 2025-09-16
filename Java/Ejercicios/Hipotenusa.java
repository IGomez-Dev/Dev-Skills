
/*
 * 5. Un program que lea la longitud de los catetos de un triángulo rectánculo y calcule la longitud de la hipotenusa
 *    según el teorema de Pitágoras.
 */

import java.util.Scanner;

public class Hipotenusa{
    public static void main(String[] args){
        // VARIABLES
        double a,b,c;

        //ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer cateto");
        a = entrada.nextDouble();
        if (a <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                a = entrada.nextDouble();
            } while (a <= 0);
        }
        System.out.println("Ingrese el segundo cateto");
        b = entrada.nextDouble();
        if (b <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                b = entrada.nextDouble();
            } while (b <= 0);
        }
        
        // PROCESO
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        // SALIDA
        System.out.println("La hipotenusa es " + c);

        entrada.close();
    }
}