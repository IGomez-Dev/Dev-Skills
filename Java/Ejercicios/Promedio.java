
/*
 * 7. Hallar el promedio de 3 notas
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Promedio{
    public static void main(String[] args){
        // VARIABLES
        float prom, n1, n2, n3;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la primera nota");
        n1 = entrada.nextFloat();
        if (n1 < 0 || n1 > 20) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor o igual a 0");
                n1 = entrada.nextFloat();
            } while (n1 < 0 || n1 > 20);
        }
        System.out.println("Ingrese la segunda nota");
        n2 = entrada.nextFloat();
        if (n2 < 0 || n2 > 20) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor o igual a 0");
                n2 = entrada.nextFloat();
            } while (n2 < 0 || n2 > 20);
        }
        System.out.println("Ingrese la tercera nota");
        n3 = entrada.nextFloat();
        if (n3 < 0 || n3 > 20) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor o igual a 0");
                n3 = entrada.nextFloat();
            } while (n3 < 0 || n3 > 20);
        }

        // PROCESO
        DecimalFormat formato = new DecimalFormat("#.00");
        prom = (float) (n1 + n2 + n3) / 3;

        // SALIDA
        System.out.println("El promedio de las 3 notas es " + formato.format(prom));

        entrada.close();
    }
}