package While;

import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        int j;
        System.out.println("Ingresa un número");
        n = sc.nextDouble();
        j = (int) n;
        System.out.println("n: " + n);
        System.out.println("j: " + j);
        sc.close();
    }
}
