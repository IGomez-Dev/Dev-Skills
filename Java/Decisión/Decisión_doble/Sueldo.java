
/*
 * Dado como dato el sueldo de un trabajador, se le aplique un aumento 
 * del 15% si su sueldo es inferior a S/. 1000 y 12 % en caso contrario. 
 * Imprime el nuevo sueldo del trabajador.
 */

package Decisión_doble;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sueldo {
        public static void main(String[] args) {
        // VARIABLES
        double s, c;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        s = entrada.nextDouble();
        if (s <= 0){
            do{
                System.out.println("Valor incorrecto. Ingrese un sueldo mayor a 0");
                s = entrada.nextDouble();
            } while (s <= 0);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        if (s > 1000){
            c = 1.12 * s;

        }else{
            c = 1.15 * s;
        }     

        // SALIDA   
        System.out.println("El nuevo número es " + form.format(c));   

        entrada.close();
        
    }
}
