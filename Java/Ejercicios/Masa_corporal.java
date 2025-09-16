
/*
 * 9. Calcular el índice de masa corporal de uan persona (IMC = peso/ estatura * estatura)
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Masa_corporal{

    public static void main(String[] arg){
        // VARIABLES
        float IMC, p, e;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el peso en kilogramos");
        p = entrada.nextFloat();
        if (p <= 0){
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                p = entrada.nextFloat();
            } while (p <= 0);
        }
        System.out.println("Ingresar la estatura en metros");
        e = entrada.nextFloat();
        if (e <= 0){
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                e = entrada.nextFloat();
            } while (e <= 0);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        IMC =(float) (p / Math.pow(e, 2));

        // SALIDA
        System.out.println("EL IMC es " + form.format(IMC));

        entrada.close();
    }
}