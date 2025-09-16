
/*
 * 3. Pedir el radio de una circunderencia y calcular su longitud
 */

import java.util.Scanner;

public class Longitud_circulo{
    public static void main(String[] args){
        // VARIABLES
        double R, lon;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        R = entrada.nextDouble();
        if (R <= 0) {
            do{
                System.out.println("Valor incorrecto, ingrese un número mayor a 0");
                R = entrada.nextDouble(); 
            } while (R <= 0);
        }
        // PROCESO
        lon = 2 * R * Math.PI;

        // SALIDA
        System.out.println("La longitud del círculo es " + lon);

        entrada.close();
    }
}
