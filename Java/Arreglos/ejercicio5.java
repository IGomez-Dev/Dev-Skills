package Arreglos;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n, i;
            double menor;
            System.out.println("Ingrese la cantidad de alumnos");
            n = sc.nextInt();
            sc.nextLine();
            double nota[] = new double[n];
            String nombre[] = new String[n];
            for (i = 0; i < n; i++){
                System.out.println("Ingrese el nombre del alumno " + (i+1));
                nombre[i] = sc.nextLine();
                System.out.println("Ingrese la nota de " + nombre [i]);
                nota[i] = sc.nextDouble();
                sc.nextLine();
                while (nota[i] < 0 || nota[i] > 20){
                    System.out.println("La nota debe ser menor a 20 y mayor a 0");
                    nota[i] = sc.nextDouble();
                    sc.nextLine();
                }
            }

            menor = nota[0];

            for (i = 1; i < n; i++){
                if(nota[i] < menor){
                    menor = nota[i];
                }
            }

            for(i = 0; i < n; i++){
                if (menor==nota[i])
                    System.out.println("La menor nota es " + menor + " y el alumno(a) se llama " + nombre[i]);
            }
        }
    }
}