
/*
 * 1. Programa que recibe como dato de entrada un numero entero entre 1 y 7,
 *    y escribe el día de la semana correspondiente. Se sabe que la semana se inicia 
 *    el domingo.
 */

package Todo;

import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        // VARIABLES
        String r;
        Byte d;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar del 1 al 7");
        d = entrada.nextByte();

        // PROCESO
        switch (d) {
            case 1:
                r = "El día es domingo";
                break;
            case 2:
                r = "El día es lunes";
                break;
            case 3:
                r = "El día es martes";
                break;
            case 4:
                r = "El día es miércoles";
                break;
            case 5:
                r = "El día es jueves";
                break;
            case 6:
                r = "El día es viernes";
                break;
            case 7:
                r = "El día es sábado";
                break;
        
            default:
                r = "El día no existe";
                break;
        }

        // SALIDA
        System.out.println(r);
    
        entrada.close();
    }
}
