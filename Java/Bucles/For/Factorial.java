
package For;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long f, n, i;
        String m;
        System.out.println("Ingresar un número");
        Scanner entrada = new Scanner(System.in);
        f = entrada.nextLong();
        entrada.close();
        if (f > 0){
            n = f;
            f = 1;
            for (i = 1; i <= n; i += 1){
                f *= i;
            }
            m = "El factorial es " + f;
        }else{
            if (f != 0){
                m = "No existe factorial de un número negativo";
            }else{
                m = "El factorial es 1";
            }
        }
        System.out.println(m);
    }
}
