
package For;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double n, p, sp = 0, sn = 0, pp = 0, pn = 0;
        long i, cc = 0, cn = 0, cp = 0;
        for (i = 1; i <= 10; i ++){
            System.out.println("Escribir el número "+ i);
            Scanner entrada = new Scanner(System.in);
            n = entrada.nextDouble();
            entrada.close();
            if (n>0){
                p = n;
                cp ++;
                sp += p;
                pp = sp / cp;
            }else{
                if (n==0){
                    cc++;
                }else{
                    p = n;
                    cn ++;
                    sn +=p;
                    pn = sn / cn;
                }
            }
        }

        System.out.println("La media positiva es " + pp + " y la media negativa es " +
        pn + " y la cantidad de ceros es " + cc);

    }
}
