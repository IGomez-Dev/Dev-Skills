
/* 
 * 17. Resuelva el problema que tiene una gasolinera. Los surtidores de la misma registran 
 *     lo que surten en galones, pero el precio de la gasolina está fijado en litros. Debe 
 *     calcular e imprimir lo que hay que cobrarle al cliente.
 *     Cada galón tiene 3.785 litros
 *     El precio del litro es de $8.20
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        // VARIABLES
        double cant, gal, total;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de galones que desee comprar");
        gal = entrada.nextDouble();
        if (gal <= 0){
            do{
                System.out.println("Valor incorrecto. Ingrese un número a 0");
                gal = entrada.nextDouble();
            } while (gal <= 0);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        cant = 3.785 * gal;
        total = 8.2 * cant;

        // SALIDA
        System.out.println("El precio es " + form.format(total));

        entrada.close();
    }
}
