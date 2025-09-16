
/*
 * 24. Hallar el área de una circunferencia
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area_circunferencia {
    public static void main(String[] args){
        // VARIABLES
        double area, R;
        
        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        R = entrada.nextDouble();
        if (R <= 0){
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                R = entrada.nextDouble();
            } while (R <= 0);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        area = Math.pow(R,2) * Math.PI;

        // SALIDA
        System.out.println("El área de la circunferencia es " + form.format(area));

        entrada.close();
    }
}
