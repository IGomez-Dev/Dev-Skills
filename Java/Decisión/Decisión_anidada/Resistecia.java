
/*
 * Clasificar una especie forestal de acuerdo a su resistencia. 
 * El dato de entrada del programa es el porcentaje de pérdida de 
 * peso de la especie y la salida es uno de los siguientes mensajes.
 */

package Decisión_anidada;

import java.util.Scanner;

public class Resistecia {
    public static void main(String[] args) {
        // VARIABLES
        float p;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanto es el porcentaje de pérdida de peso");
        p = entrada.nextFloat();
        if (p < 0){
            do{
                System.out.println("Valor incorrecto. Ingrese un porcentaje de perdida de peso mayor o igal a 0");
                p = entrada.nextFloat();
            } while (p < 0);
        }
        // PROCESO
        if (p > 1){
            if (p > 5){
                if (p > 10){
                    if (p > 30){
                        System.out.println("No resistente");
                    }else{
                        System.out.println("Muy poco resistente");
                    }
                }else{
                    System.out.println("Moderadamente resistenre");
                }
            }else{
                System.out.println("Resistente");
            }
        }else{
            System.out.println("Altamente resistente");
        }

        entrada.close();
    }
}
