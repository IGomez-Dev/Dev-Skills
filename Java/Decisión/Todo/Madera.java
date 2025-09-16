/*
 * 10. Calcular el precio a pagar por la compra de madera. Los datos de entrada son 
 *     la cantidad de metros cúbicos a comprar, el precio por metro cubico y el tipo 
 *     de madera. La madera está clasificada en tres tipos (A, B y C). Si la cantidad 
 *     a comprar es superior a 30 metros cúbicos, se aplica el siguiente esquema de descuento:       
 *     Si la cantidad comprada es inferior a 30 metros cúbicos el descuento es del 2% 
 *     independientemente del tipo de madera
 */

package Todo;
import java.util.Scanner;
 
public class Madera {

    public static void main(String[] args) {
        // VARIABLES
        char t;
        double C, P, TP, F, d = 0;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de metros cubicos");
        C = entrada.nextDouble();
        if (C <= 0){
            do{
                System.out.println("Valor incorrecto. Ingrese la cantidad mayor a 0");
                C = entrada.nextDouble();
            } while(C <= 0);
        }
        
        System.out.println("Ingresar el precio por metros cubico");
        P = entrada.nextDouble();
        if (P <= 0){
            do{
                System.out.println("Valor incorrecto. Ingrese la cantidad mayor a 0");
                P = entrada.nextDouble();
            } while(P <= 0);
        }

        System.out.println("Ingresar el tipo de madera A, B o C");
        t = entrada.next().charAt(0);
        if (t != 'A' && t != 'B' && t != 'C'){
            do{
                System.out.println("Ingresar correctamente el tipo A, B o C en mayúscula");
                t = entrada.next().charAt(0);
            } while(t != 'A' && t != 'B' && t != 'C');
        }

        // PROCESO
        
        TP = C * P;

        if (C > 30){
            switch (t) {
                case 'A':
                    d = 0.04 * TP;
                    break;
                case 'B':
                    d = 0.08 * TP;
                    break;
                case 'C':
                    d = 0.1 * TP;
                    break;
                default:
                    break;
            }
        }else{
            d = 0.02 * TP;
        }

        F = TP - d;

        // SALIDA
        System.out.println("El precio a pagar es " + F);

        entrada.close();
    }    
}