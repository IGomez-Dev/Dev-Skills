package While;
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        long n, c =0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 999");
        n = sc.nextLong();
        if (n < 0 || n > 999){
            do{
                System.out.println("Valor incorrecto. Ingrese un número entre 0 y 999");
                n = sc.nextLong();
            }while(n < 0 || n > 999);
        }
        i = n;
        if(i!=0){
            do {
                i/=10;
                c++;
            } while (i!=0);
            System.out.println("El número " + n + " tiene " + c + " dígitos");
        }
        
        sc.close();
    }
}
