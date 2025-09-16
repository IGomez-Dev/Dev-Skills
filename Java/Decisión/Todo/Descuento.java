
/*
 * 8. Diseñe un programa que calcule, los descuentos a un trabajador, sabiendo que, 
 *    son aplicables, un 6.25% del salario en AFP, solo si este es superior a $300.00; 
 *    Además que, si es un trabajador hombre, se le descuenta, aparte del AFP, el 3% 
 *    sobre el sueldo en conceptos de ISSS y 10% por concepto de RENTA. 
 */

package Todo;
import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        // VARIABLES
        double S, DA, DI, DR, T;
        char G;
        String m;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el salario");
        S = entrada.nextDouble();
        System.out.println("Escribir H si es hombre o M si es mujer");
        G = entrada.next().charAt(0);

        // PROCESO
        if (G != 'M' && G != 'H' && G != 'm' && G != 'h'){
            m = "Introducir correctamente el género";
        }else{
            if (S > 300){
                if (G == 'H' || G == 'h'){
                    DA = 0.0625 * S;
                    DI = 0.03 * S;
                    DR = 0.1 * S;
                }else{
                    DA = 0.0625 * S;
                    DI = 0;
                    DR = 0;
                }
            }else{
                if (G == 'H' || G == 'h'){
                    DA = 0;
                    DI = 0.03 * S;
                    DR = 0.1 * S;
                }else{
                    DA = 0;
                    DI = 0;
                    DR = 0;
                }
            }
            T = S - DA - DI - DR;
            m = "Su nuevo salario es " + T;
        }

        // SALIDA
        System.out.println(m);

        entrada.close();
    }
}
