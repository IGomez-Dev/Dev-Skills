/*
 * 9. Dado el día, mes y año, determinar si es una fecha correcta, considera años bisiestos.
 */

package Todo;
import java.util.Scanner;

public class Fecha{
    public static void main(String[] args) {
        // VARIABLES
        byte M, D;
        double A;
        String r, t;
        final String C = "correcta", I = "incorrecta";

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el año");
        A = entrada.nextDouble();
        System.out.println("Ingresar el mes");
        M = entrada.nextByte();
        System.out.println("Ingresar el día");
        D = entrada.nextByte();

        // PROCESO
        if (M <= 12 && M >0){
            if (M == 1 || M == 3 || M == 5 || M == 8 || M == 10 || M == 12){
                if (D <= 31 && D > 0){
                    r = C;
                }else{
                    r = I;
                }
            }else{
                if (M == 2){
                    if (A % 4 == 0){
                        if (A % 100 == 0){
                            if (A % 400 == 0){
                                t = "b";
                            }else{
                                t = "n";
                            }
                        }else{
                            t = "b";
                        }
                    }else{
                        t = "n";
                    }
                    if (t == "b"){
                        if (D <= 29 && D > 0){
                            r = C;
                        }else{
                            r = I;
                        }
                    }else{
                        if (D <= 28 && D > 0){
                            r = C;
                        }else{
                            r = I;
                        }
                    }
                }else{
                    if (D <= 30){
                        r = C;
                    }else{
                        r = I;
                    }
                }
            }
        }else{
            r = I;
        }

        // SALIDA  
        System.out.println("La fecha es " + r);

        entrada.close();
    }
}