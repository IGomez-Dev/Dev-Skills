package While;
import java.util.Scanner;

public class Acumulado {
    public static void main(String[] args) {
        long i=1, j=1, n1, n2, s1=0, s2=0;
        Scanner sc = new Scanner(System.in);
        while (i <= 15){
            System.out.println("Ingresa el número " + i + " de la primera lista:");
            n1 = sc.nextLong();
            s1 += n1;
            i+=1;
        }

        while (j <= 15){
            System.out.println("Ingresa el número " + j + " de la segunda lista:");
            n2 = sc.nextLong();
            s2 += n2;
            j+=1;
        }

        if (s1!=s2){
            if(s1>s2){
                System.out.println("La lista 1 es mayor");
            }else{
                System.out.println("La lista 2 es mayor");
            }
        }else{
            System.out.println("Las 2 listas son iguales");
        }
        
        sc.close();
    }
}
