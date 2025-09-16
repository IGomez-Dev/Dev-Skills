
package For;
import java.util.Scanner;

public class Serie {
    public static void main(String[] args) {
        long n, i, f=1;
        float s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        n = sc.nextLong();
        while (n <= 0){
            System.out.println("Valor incorrecto. Ingrese un número mayor a 0");
            n = sc.nextLong();
            sc.close();
        }
        for (i = 1; i <= n; i++){
            f *= i;
            s += (float) (Math.pow(-1, i+1)* i / f);
        }
        System.out.println(s);
    }
}
