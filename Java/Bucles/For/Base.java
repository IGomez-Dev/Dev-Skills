
package For;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        long i, m, r, b, s, n, ni, ss = 0;
        boolean boo = true;
        String msj;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese la base");
            b = sc.nextLong();
            while(b > 10 || b<2){
                System.out.println("Valor incorrecto. Ingrese una base menor a 10 y mayor a 1");
                b = sc.nextShort();
            }
            System.out.println("Ingrese un número");
            n = sc.nextLong();
                    
        if(n!=0){
            if(n<0){
                s = -1;
            }else{
                s = +1;
            }
            n = Math.abs(n);
            m = n;
            ni = (long) Math.log10(n);
            for (i = 0; i <= n; i++) {
                r = m % 10;
                if (r >= b) {
                    boo = false;
                    break;
                }else{
                m /= 10;
                }
            }
            if (boo) {
                m = n;
                for(i = 0; i <= ni; i++){
                    r = m % 10;
                    ss += r * Math.pow(b, i);
                    m /= 10; 
                }
                msj = "El número " + s*n + " en base " + b + " es igual a" + s*ss + " en base 10"; 
            }else {
                msj = "Número incorrecto. Los dígitos del número deben ser menor a la base";
            }
        }else{
            msj = "El número 0 en base " + b + " es igual a 0 en base 10";
        }
        System.out.println(msj);
        }catch(InputMismatchException e){
            System.out.println("Palabara mala");
        }
    }
}