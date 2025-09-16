
/*
 * 23. Crear un programa que permita convertir una cantidad de segundos en horas, minutos y segundos.
 */

import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        // VARIABLES
        long t, hor, min, seg, hor_rest;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en segundos");
        t = entrada.nextLong();
        if (t <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                t= entrada.nextLong();
            } while (t <= 0);
        }

        // PROCESO
        hor = t / 3600;
        hor_rest = t % 3600;
        min = hor_rest / 60;
        seg = hor_rest % 60;

        // SALIDA
        System.out.println("El tiempo es " + hor + " horas " + min + " minutos " + seg + " segundos.");

        entrada.close();
    }
}
