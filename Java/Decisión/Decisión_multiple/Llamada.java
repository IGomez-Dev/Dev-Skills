
/*
 * El costo de las llamadas telefónicas internacionales depende de la 
 * zona geográfica en la que se encuentre el país de destino y del 
 * número de minutos hablados. En la siguiente tabla se presenta el 
 * costo de minuto por zona. A cada zona se la ha asociado una clave. 
 * Calcula e imprima el costo de una llamada.
 */

package Decisión_multiple;
import java.util.Scanner;

public class Llamada {
    public static void main(String[] args) {
        // VARIABLES
        String r;
        long min;
        int cl;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la clase de la zona");
        cl = entrada.nextInt();
        System.out.println("ingrese los minutos llamados");
        min = entrada.nextLong();

        // PROCESO
        switch (cl) {
            case 12:
                r = "El costo de la llamada es " + 2 * min;
                break;
            case 15:
                r = "El costo de la llamada es " + 2.2 * min;
                break;
            case 18:
                r = "El costo de la llamada es " + 4.5 * min;
                break;
            case 19:
                r = "El costo de la llamada es " + 3.5 * min;
                break;
            case 23:
                r = "El costo de la llamada es " + 6 * min;
                break;
            case 25:
                r = "El costo de la llamada es " + 6 * min;
                break;
            case 29:
                r = "El costo de la llamada es " + 5 * min;
                break;
            default:
                r = "No existe la zona";
                break;
        }

        // SALIDA
        System.out.println(r);

        entrada.close();
    }
}
