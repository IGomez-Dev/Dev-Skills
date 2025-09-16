
/*
 * 7. Dado el número d5el mes y el año (cuatro dígitos) de una fecha, determinar que mes 
 *    es en letras y cuantos días tiene, considerar que febrero tiene 28 o 29 días si el 
 *    año es bisiesto, un año es bisiesto si es múltiplo de 4, pero no de 100 y si de 400.
 */

package Todo;
import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        // VARIABLES
        String msj;
        byte M, D;
        short A;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("El año en 4 dígitos");
        A = entrada.nextShort();
        System.out.println("El mes en número");
        M = entrada.nextByte();

        // PROCESO
        switch (M) {
            case 1:
                msj = "El mes de Enero tiene 31 días";
                break;
            case 2:
                if (A % 4 == 0){
                    if (A % 100 == 0){
                        if (A % 400 == 0){
                            D = 29;
                        }else{
                            D = 28;
                        }
                    }else{
                        D = 29;
                    }
                }else{
                    D = 28;
                }
                msj = "El mes de Febrero tiene " + D + " días";
                break;
            case 3:
                msj = "El mes de Marzo tiene 31 días";
                break;
            case 4:
                msj = "El mes de Abril tiene 30 días";
                break;
            case 5:
                msj = "El mes de Mayo tiene 31 días";
                break;
            case 6:
                msj = "El mes de Junio tiene 30 días";
                break;
            case 7:
                msj = "El mes de Julio tiene 31 días";
                break;
            case 8:
                msj = "El mes de Agosto tiene 31 días";
                break;
            case 9:
                msj = "El mes de Setiembre tiene 30 días";
                break;
            case 10:
                msj = "El mes de Octubre tiene 31 días";
                break;
            case 11:
                msj = "El mes de Noviembre tiene 30 días";
                break;
            case 12:
                msj = "El mes de Diciembre tiene 31 días";
                break;

            default:
                msj = "Indicar correctamente el mes";
                break;
        }

        // SALIDA
        System.out.println(msj);

        entrada.close();
    }
}
