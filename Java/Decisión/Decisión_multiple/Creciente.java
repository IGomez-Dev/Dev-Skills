
/*
 * 4. Dado como datos de entrada tres números enteros, determine si los mismos están en orden creciente.
 */

package Decisión_multiple;

import java.util.Scanner;


public class Creciente{
    public static void main(String[] args){
        // VARIABLES
        String msj;
        Byte mes;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el mes en números");
        mes = entrada.nextByte();

        // PROCESO
        if(mes == 1 || mes == 2 || mes == 3){
            msj = "La estación es verano";
        }else if(mes == 4 || mes == 5 || mes == 6){
            msj = "La estación es otoño";
        }else if(mes == 7 || mes == 8 || mes == 9){
            msj = "La estación es invierno";
        }else if(mes == 10 || mes == 11 || mes == 12){
            msj = "La estación es primavera";
        }else{
            msj = "Mes no definido";
        }

        // SALIDA
        System.out.println(msj);
        
        entrada.close();
    }
}