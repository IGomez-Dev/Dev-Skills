
/*
 * 2. Dado como dato la calificación de un estudiante, escriba “aprobado” 
 *    en caso de que esa calificación sea mayor o igual a 10.5
 */

package Decisión_simple;
import java.util.Scanner;

public class Aprobado {
    public static void main(String[] args) {
        // VARIABLES
        float nota;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar tú nota: ");
        nota = entrada.nextFloat();
        if (nota > 20 || nota < 0){
            do{
                System.out.println("Valor incorrecto. La nota es menor o igual a 20 y mayor o igual a 0");
                nota = entrada.nextFloat();    
            } while (nota > 20 || nota < 0);
        }

        // PROCESOS
        if (nota >= 10.5 && nota <= 20)
            // SALIDA
            System.out.println("Aprobado");
        if (nota < 10.5 && nota >= 0)
            // SALIDA
            System.out.println("Desaprobado");

        entrada.close();
    }
}
