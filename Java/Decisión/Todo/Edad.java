
/*
 * 2. Programa que clasifica a una persona de acuerdo a su edad. 
 *    Las posibles clasificaciones son: bebe, niño, adolescente, 
 *    adulto y anciano. (Asume datos que sean necesarios)
 */



package Todo;
import java.util.Scanner;


public class Edad {
    public static void main(String[] args) {
        // VARIABLES
        String msj;
        Byte edad;

        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar tu edad");
        edad = entrada.nextByte();

        // PROCESO
        if (edad > 0 && edad <= 3)
            msj = "bebé";
        else if (edad > 3 && edad <= 11)
            msj = "niño";
        else if (edad > 11 && edad <= 19)
            msj = "adolescente";
        else if (edad > 19 && edad <= 59)
            msj = "adulto";
        else if (edad > 59 && edad < 128)
            msj = "adulto";  
        else
            msj = "Edad incorrecta";

        // SALIDA
        System.out.println(msj);

        entrada.close();
    }
    
}
