
/*
 * 11. Telefónica del Perú ha diseñado los siguientes planes para sus usuarios de telefonía fija. 
 *     Diseñe un programa que permita determinar la cantidad de minutos libres que le corresponden 
 *     según el plan que elija, el pago por los minutos adicionales, el monto de descuento y el 
 *     monto que debe pagar un usuario. Considere la posibilidad que el usuario no tenga que pagar 
 *     nada porque sus minutos consumidos ya estén cubiertos por sus minutos libres.
 */

package Todo;
import java.util.Scanner;

public class Plan {
    public static void main(String[] args) {
        // VARIABLES
        short min, mlib;
        float d, pa, t;
        char p;
        
        // ENTRADA
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el plan");
        p = entrada.next().charAt(0);
        if (p != 'A' && p != 'B' && p != 'C' && p != 'a' && p != 'b' && p != 'c'){
            System.out.println("Ingresa corrextamente el plan: A, B o C");
            p = entrada.next().charAt(0);
        } while (p != 'A' && p != 'B' && p != 'C' && p != 'a' && p != 'b' && p != 'c');

        System.out.println("Ingrese los minutos usados");
        min = entrada.nextShort();
        if (min < 0){
            System.out.println("Valor incorrecto. Ingrese minutos mayor a 0");
            min = entrada.nextShort();
        } while (min < 0);

        // PROCESO
        if (p == 'a' || p == 'A'){
            p = 'A';
            mlib = 300;
            if (min > 300){
                pa = (float) ((min - 300) * 0.1);
                d = 0;
            }else{
                pa = 0;
                d = 0;
            }
        }else{
            if (p == 'b' || p == 'B'){
                p = 'B';
                mlib = 200;
                if (min > 200){
                    pa = (float) ((min - 200) * 0.08);
                    d = (float) (pa * 0.05);
                }else{
                    pa = 0;
                    d = 0;
                }
            }else{
                p = 'C';
                mlib = 100;
                if (min > 100){
                    pa = (float) ((min - 100) * 0.05);
                    d = (float) (pa * 0.1);
                }else{
                    pa = 0;
                    d = 0;
                }
            }
        }
        t = pa - d;

        // SALIDA
        System.out.println("Cantidad de minutos libres " + mlib);
        System.out.println("Pago adicional "+ pa);
        System.out.println("Descuento " + d);
        System.out.println("Monto a pagar " + t);
        
        entrada.close();
    }
}
