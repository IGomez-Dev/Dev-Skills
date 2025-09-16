
/*
 * Construir un programa que calcule el Indice de masa corporal 
 * IMC= peso/(altura*altura), e indique el estado en el que se 
 * encuentra en base al calculo del IMC
 */

package Decisión_anidada;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        // VARIABLES
        String m;
        double a, p, I;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su peso");
        p = entrada.nextDouble();
        if (p <= 0){
            do{
                System.out.println("Valor incorrecto. Ingresar una altura mayor a 0");
                p = entrada.nextDouble();
            } while (p <= 0);
        }
        System.out.println("Ingrese su altura");
        a = entrada.nextDouble();
        if (a <= 0){
            do{
                System.out.println("Valor incorrecto. Ingresar una altura mayor a 0");
                a = entrada.nextDouble();
            } while (a <= 0);
        }

        // PROCESO
        I = p / Math.pow(a, 2);
        if (I > 16){
            if (I > 17){
                if (I > 18){
                    if (I > 25){
                        if (I > 30){
                            if (I > 35){
                                if (I > 40){
                                    m = "Obesidad morbida";
                                }else{
                                    m = "Obesidad premorbida";
                                }
                            }else {
                                m = "Sobrepeso crónico";
                            }
                        }else{
                            m = "Sobrepeso";
                        }
                    }else{
                        m ="Saludable";
                    }
                }else{
                    m = "Bajo peso";
                }
            }else{
                m = "Infrapeso";
            }
        }else{
            m = "Criterio de ingreso en hospital";
        }


        // SALIDA
        DecimalFormat form = new DecimalFormat("#.00");
        System.out.println(("Su IMC es " + form.format(I) +" el diagnóstico es " + m));

        entrada.close();
    }
}
