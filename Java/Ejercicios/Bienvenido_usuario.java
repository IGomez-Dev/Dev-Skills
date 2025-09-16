
/*
 * 4. Pedir al usuario su nombre, y después mostrar un mensaje de bienvenida.
 */ 

import java.util.Scanner;

public class Bienvenido_usuario{
    public static void main(String[] args){
        // VARIABLES
        String nom, m;
        char G;

        // ENTRADA
        System.out.print("Ingresa tú nombre: ");
        Scanner entrada = new Scanner (System.in);
        nom = entrada.nextLine();
        System.out.println("Ingresar tú género. Si es varon escribir 'V', si es mujer 'M'");
        G = entrada.next().charAt(0);
        if (G != 'V' && G != 'M' && G != 'v' && G != 'm') {
            do{
                System.out.println("Ingresar correctamente el género: V=varon, M=mujer");
                G = entrada.next().charAt(0);
            } while (G != 'M' && G != 'V' && G != 'v' && G != 'm');
        }

        // PROCESO
        if (G == 'V' || G == 'v') {
            m = "Bienvenido " + nom;
        }else {
            m = "Bienvenida " + nom;
        }

        // SALIDA
        System.out.println(m);

        entrada.close();
    }
}