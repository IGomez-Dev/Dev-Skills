
/*
 * 3. Dado dos números enteros y un operador +, -, x, /, devolver la operación de los dos números 
 *    según el operador ingresado, considere que si el segundo número es cero y el operador es /, 
 *    no es divisible con el primer número, entonces devolver como resultado cero.
 */

package Todo;
import java.util.Scanner;

public class Operacion {
    public static void main(String[] args) {
        // VARIABLES
        char op;
        double r, n1, n2;
        String msj;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un número");
        n1 = entrada.nextDouble();
        System.out.println("Ingresa otro número");
        n2 = entrada.nextDouble();
        System.out.println("Ingresa la operación");
        op = entrada.next().charAt(0);

        // PROCESO
        if (op == '+'){
            r = n1 + n2;
            msj = "La suma es " + r;
        }else{
            if (op == '-'){
                r = n1 - n2;
                msj = "La resta es " + r;
            }else{
                if (op == '*'){
                    r = n1 * n2;
                    msj = "La multiplicación es " + r;
                }else{
                    if (op == '/'){
                        if (n2 == 0){
                            msj = "Es indefinido";
                        }else{
                            r = n1 / n2;
                            msj = "La división es " + r;
                        }
                    }else{
                        msj = "La operación no existe";
                    }
                }
            }
        }

        // SALIDA
        System.out.println(msj);

        entrada.close();
    }
}