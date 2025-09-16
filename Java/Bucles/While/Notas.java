package While;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cb = 0, cm = 0, n, i=1;
        while(i<=10){
            System.out.println("Ingrese la nota número " + i);
            n = sc.nextInt();
            while(n<0 || n >20){
                System.out.println("Valor incorrecto, ingrese la nota número " + i + " mayor a 0 y menor a 20");
                n = sc.nextInt();
            }

            if(n>=10){
                cb++;
            }else{
                cm++;
            }
            i+=1;
        }
        System.out.println("La cantidad de notas mayor a 10 es " + cb + " y la cantidad menor a 10 es " + cm);

        sc.close();
    }
}
