package Arreglos;

public class ejercicio1 {
    public static void main(String[] args) {
        int[] num =  {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int suma = 0;
        int i;
        for (i = 0; i<num.length; i++){
            suma += num[i];
        }
        System.out.println("La suma de los números es " + suma);
    }
}
