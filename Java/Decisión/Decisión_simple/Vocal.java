
/*
 * 3. Dado un carácter determinar si es vocal.
 */

package Decisión_simple;
import java.util.Scanner;

public class Vocal {
    public static void main(String[] args) {
        // Variables
        char v;
        // Entrada
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar una letra o vocal: ");
        v = entrada.next().charAt(0);
        // Proceso
        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' 
        || v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U')
            // Salida
            System.out.println("Es vocal");
        if (v != 'a' && v != 'e' && v != 'i' && v != 'o' && v != 'u'
        && v != 'A' && v != 'E' && v != 'I' && v != 'O' && v != 'U')
            // Salida
            System.out.println("No es vocal");

        entrada.close();
    }
}