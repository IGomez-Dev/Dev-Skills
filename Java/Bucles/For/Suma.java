
package For;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        int i;
        double n,s;
        Scanner entrada = new Scanner(System.in);
        s = 0;
        for (i = 1; i < 15 ; i += 1){
            System.out.println("Ingresar el número " + i);
            n = entrada.nextDouble();
            s += n;
            entrada.close();
        }
        System.out.println("La sumatoria es " + s);
    }
}
