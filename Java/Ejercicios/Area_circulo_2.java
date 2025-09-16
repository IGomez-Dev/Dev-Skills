
/*
 * 21. Crear un programa para encontrar el área del circulo.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area_circulo_2 {
        public static void main(String[] args){
        // VARIABLES
        double area, r;
        
        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        r = entrada.nextDouble();
        if (r <= 0) {
            do{
            System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
            r = entrada.nextDouble();
            } while (r <= 0);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        area = Math.pow(r,2) * Math.PI;

        // SALIDA
        System.out.println("El área de la circunferencia es " + form.format(area));

        entrada.close();
    }
}