package While;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        long i=1, n, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        n = sc.nextLong();
        while(n < 0){
            System.out.println("Valor incorrecto. Ingrese un número mayor o igual a 0");
            n = sc.nextLong();
        }

        while (i<=n){
            if(i % 5==0){
                c++;
                // System.out.println(i); //Mostrar los múltiplos
            }
            i += 1;
        }
        System.out.println("Existe " + c + " múltiplos de 5 hasta " + n);

        sc.close();
    }
}
