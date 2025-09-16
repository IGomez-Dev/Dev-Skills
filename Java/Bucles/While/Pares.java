package While;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, ni, nf, li, ls, i;
        System.out.println("Límite inferior");
        li = sc.nextInt();
        System.out.println("Límite superior");
        ls = sc.nextInt();
        if(li<ls){
            ni=li;
            nf=ls;
        }else{
            ni=ls;
            nf=li;
        }
        i = ni;
        i+=1;
        while(i<nf){
            if(i%2==0){
                c++;
                //System.out.println("Los números pares son: " + ni); // Mostrar los números pares
            }
            i += 1;
        }
        System.out.println("Existe "+ c + " números pares desde " + ni + " hasta "+nf);

        sc.close();
    }
}
