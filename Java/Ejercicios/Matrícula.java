
/*
 * 13. Dada la matrícula y 5 calificaciones de un alumno obtenidos a lo largo del semestre; construya un diagrama
 *     de flujo que imprima la matrícula del alumno y el promedio de sus calificaciones.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Matrícula{
    public static void main(String[] args){
        // VARIABLES
        byte n1, n2, n3, n4, n5;
        float prom;
        String matriAlu;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el código del estudiante");
        matriAlu = entrada.nextLine();
        System.out.println("Ingrese la primera nota");
        n1 = entrada.nextByte();
        if (n1 < 0 || n1 > 20){
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor o igual a 0 y menor o igual a 20");
                n1 = entrada.nextByte();
            } while (n1 < 0 || n1 > 20);
        }
        System.out.println("Ingrese la segunda nota");
        n2 = entrada.nextByte();
        if (n2 < 0 || n2 > 20){
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor o igual a 0 y menor o igual a 20");
                n2 = entrada.nextByte();
            } while (n2 < 0 || n2 > 20);
        }
        System.out.println("Ingrese la tercera nota");
        n3 = entrada.nextByte();
        if (n3 < 0 || n3 > 20){
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor o igual a 0 y menor o igual a 20");
                n3 = entrada.nextByte();
            } while (n3 < 0 || n3 > 20);
        }
        System.out.println("Ingrese la cuarta nota");
        n4 = entrada.nextByte();
        if (n4 < 0 || n4 > 20){
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor o igual a 0 y menor o igual a 20");
                n4 = entrada.nextByte();
            } while (n4 < 0 || n4 > 20);
        }
        System.out.println("Ingrese la quinta nota");
        n5 = entrada.nextByte();
        if (n5 < 0 || n5 > 20){
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor o igual a 0 y menor o igual a 20");
                n5 = entrada.nextByte();
            } while (n5 < 0 || n5 > 20);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        prom = ((float) (n1 + n2 + n3 + n4 + n5) / 5);

        //SALIDA
        System.out.println("La nota del alumno " + matriAlu + " es " + form.format(prom));

        entrada.close();
    }
}
