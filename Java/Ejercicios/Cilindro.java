
/*
 * 25. Dado como datos el radio y la altura de un cilindro, calcule e imprima el área y su volumen.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cilindro {
    public static void main(String[] args){
        // VARIABLES
        double area, R, vol, H;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número del radio");
        R = entrada.nextDouble();
        if (R <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                R = entrada.nextDouble();
            } while (R <= 0);
        }
        System.out.println("Ingrese la altura");
        H = entrada.nextDouble();
        if (H <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
                H = entrada.nextDouble();
            } while (H <= 0);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        area = 2 * Math.PI * R *(R + H);
        vol = Math.PI * Math.pow(R, 2) * H;

        // SALIDA
        System.out.println("El área del cilindro es " + form.format(area) + " y el volumnen " + form.format(vol));

        entrada.close();
    }
}
