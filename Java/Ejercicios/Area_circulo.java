
/*
 * 1. Calcular el área de un círculo. El radio se pedirá por teclado. Usa la constante PI y el método pow de Math.
 */

import java.util.Scanner;

public class Area_circulo {
    public static void main(String[] args){
        // VARIABLES
        double area, R;
        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número del radio");
        R = entrada.nextDouble();
        if (R <= 0) {
            do{
            System.out.println("Valor incorrecto, ingrese un número mayor a 0");
            R = entrada.nextDouble();
            } while (R <= 0);
        }
        // PROCESO
        area = Math.pow(R,2) * Math.PI;
        // SALIDA
        System.out.println("El área de la circulo es " +area);

        entrada.close();
    }
}