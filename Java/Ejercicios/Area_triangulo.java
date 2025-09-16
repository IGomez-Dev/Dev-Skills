
/*
 * 10. Dado los tres lados de un triángulo, determinar su área
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Area_triangulo{
    public static void main(String[] args){
        // VARIABLES
        double L1,L2,L3,S,A;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el primer lado del triángulo");
        L1 = entrada.nextDouble();
        if (L1 <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingresar un número mayor a 0");
                L1 = entrada.nextDouble();
            } while (L1 <= 0);
        }
        System.out.println("Ingresar el segundo lado del triángulo");
        L2 = entrada.nextDouble();
        if (L2 <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingresar un número mayor a 0");
                L2 = entrada.nextDouble();
            } while (L2 <= 0);
        }
        System.out.println("Ingresar el tercer lado del triángulo");
        L3 = entrada.nextDouble();
        if (L3 <= 0) {
            do{
                System.out.println("Valor incorrecto. Ingresar un número mayor a 0");
                L3 = entrada.nextDouble();
            } while (L3 <= 0);
        }

        // PROCESO
        DecimalFormat form = new DecimalFormat("#.00");
        S = (float) ((L1 + L2 + L3) / 2);
        A = Math.sqrt(S * (S - L1) * (S - L3) * (S - L3));

        // SALIDA
        System.out.println("El área del triángulo es " + form.format(A));

        entrada.close();
    }
}