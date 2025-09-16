package For;
import java.util.Scanner;


public class Ejercicio {
    public static void main(String[] args) {
        int i, ni, nf, c=0, li, ls;
        Scanner sc=new Scanner(System.in);
        System.out.println("Límite inferior");
        li = sc.nextInt();
        System.out.println("Límite superior");
        ls = sc.nextInt();
        sc.close();
        if (li<ls){
            ni = li;
            nf = ls;
        }else{
            ni = ls;
            nf = li;
        }
        for (i = ni+1;i<nf;i++){
            c++;
        }
        System.out.println("En el intervalo de "+  ni + " y " + nf +" hay " + c + " números");
    }
}
