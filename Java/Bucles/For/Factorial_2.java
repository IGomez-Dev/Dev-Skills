
package For;
import java.util.Scanner;

public class Factorial_2 {
    public static void main(String[] args) {
        long n, i, f=1;
        String m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        n = sc.nextLong();
        if (n<0){
            do{
                System.out.println("El factorial de un número negativo no existe. Ingrese un número positivo");
                n = sc.nextLong();
                sc.close();
            } while (n<0);
        }
        if (n!=0){
            for (i = 1; i <= n; i ++){
                f *= i;
                m ="El factorial de " + i + " es " + f;
                System.out.println(m);
            } 
        }else{
            m = "El factorial de 0 es 1";
            System.out.println(m);
        }

    }
}
