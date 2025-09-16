
/*
 * 4. Dado como dato el sueldo de un trabajador, aplíquele un aumento del 15% si su 
 *    sueldo es inferior a S/. 1000. Imprima en este caso el nuevo sueldo del trabajador.
 */

package Decisión_simple;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args){
        // VARIABLES
        double s, au;
        
        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        s = entrada.nextDouble();
        if (s <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingreso su sueldo mayor a 0");
                s = entrada.nextDouble();
            } while (s <= 0);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        if (s < 1000) {
            au = 1.15 * s;
            // SALIDA
            System.out.println("Su sueldo es " + form.format(au));
        }
        if (s >= 1000) {
            // SALIDA
            System.out.println("Su sueldo es " + s);
        }

        entrada.close();
    }
}
