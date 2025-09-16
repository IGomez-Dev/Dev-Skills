
/*
 * 6. Clasificar una especie forestal de acuerdo a su resistencia. El dato de entrada 
 * del programa es el porcentaje de pérdida de peso de la especie y la salida es uno de 
 * los siguientes mensajes.
 */

package Todo;
import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        // VARIABLES
        String msj;
        double ppp;

        // ENTRADA
        System.out.println("Ingresar el porcentaje de la pérdida de peso");
        Scanner entrada = new Scanner(System.in);
        ppp = entrada.nextDouble();

        // PROCESO
        if (ppp > 30){
            msj = "Altamente resistente";
        } else if (ppp > 10){
            msj = "Resistente";
        } else if (ppp > 5){
            msj = "Moderadamente resistente";
        } else if (ppp > 1){
            msj = "Muy poco resistente";
        } else if (ppp > 0){
            msj = "No resistente";
        } else{
            msj = "No se puede clasificar su resistencia";
        }

        // SALIDA
        System.out.println(msj);
        
        entrada.close();
    }
}
