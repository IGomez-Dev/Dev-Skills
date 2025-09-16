
package For;

public class Impares {
    public static void main(String[] args) {
        long p;
        int i;
        p = 1;
        for (i = 1; i < 20; i += 2){
            p *= i;
        }
        System.out.println("El producto es " + p);
    }
}
