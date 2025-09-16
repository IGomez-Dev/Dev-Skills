
/*
 * 5. Determine el importe a pagar para el examen de admisión de una universidad, 
 *    cuyo valor depende del nivel socioeconómico y el colegio de procedencia
 */

package Todo;
import java.util.Scanner;

public class Nivel{
    public static void main(String[] args) {
        // VARIABLES
        String msj;
        char col, clas;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribir P si es colegio particula o E si es colegio estatal");
        col = entrada.next().charAt(0);

        // PROCESO
        if (col == 'P' || col == 'E' || col == 'p' || col == 'e'){
            System.out.println("La clase es A, B o C");
            clas = entrada.next().charAt(0);
            if (clas == 'A' || clas == 'a' || clas == 'B' || clas == 'b' || clas == 'C' || clas == 'c'){
                if(col == 'P' || col == 'p'){
                    if (clas == 'a' || clas == 'A'){
                        msj = "El pago es 500";
                    }else{
                        if (clas == 'b' || clas == 'B'){
                            msj = "El pago es 300";
                        }else{
                            msj = "El pago es 150";
                        }
                    }
                }else{
                    if (clas == 'a' || clas == 'A'){
                        msj = "El pago es 300";
                    }else{
                        if (clas == 'b' || clas == 'B'){
                            msj = "El pago es 200";
                        }else{
                            msj = "El pago es 100";
                        }
                    }
                }
            }else{
                msj = "La clase no existe";
            }
        }else{
            msj = "El tipo de colegio no existe";
        }

        // SALIDA
        System.out.println(msj);

        entrada.close();
    }
}