
package While;

import java.util.Scanner;

public class Invertido {
    public static void main(String[] args) {
        int c=0, i,k, r, in=0, ni, nd = 0;
        double n, j, ind;
        String m = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        n = sc.nextDouble();

        // Evaluando si el número es 0
        if (n!=0){

            // Conteo de decimales
            j = n;
            i = (int) j;
            while (j != i) {
                j *= 10;
                nd++;
                i = (int) j;
            }

            // Números enteros
            if (nd==0) {
                // Números enteros terminado en 0
                if(n%10 == 0){

                    // Agregando ceros 
                    ni = (int) n;
                    k = ni;
                    while(k%10 == 0){
                        m += "0";
                        k /= 10;
                    }

                    // Invirtiendo el número
                    k = (int) n;
                    i = k;
                    if (k>0){
                        while (i!=0){
                            r = i %10;
                            in = in*10 + r;
                            i/=10;  
                        }
                        m+= String.valueOf(in);
                        System.out.println("El número invertido de "+ ni + " es " + m);
                    }else{
                        i *= -1;
                        while (i!=0){
                            r = i %10;
                            in = in*10 + r;
                            i/=10;  
                        }
                        m+= String.valueOf(in);
                        System.out.println("El número invertido de "+ ni + " es " + "-"+m);
                    }

                // Números enteros no terminado en 0
                }else{
                    k = (int) n;
                    i = k;

                    // Invirtiendo los números
                    while (i!=0){
                        r = i %10;
                        in = in*10 + r;
                        i/=10;  
                    }
                    System.out.println("El número invertido de "+ k + " es " + in);
                }
                
            // Números decimales
            }else{
                j = n;
                k = (int) j;
                
                // Conteo de números enteros
                while(k!=0){
                    c++;
                    k/=10;
                }

                // Conteo de números decimales
                i = (int) j;
                while(j!=i){
                    j*=10;
                    i = (int) j;
                }

                // Invirtiendo el número
                while (i!=0){
                    r = i %10;
                    in = in*10 + r;
                    i/=10;  
                }

                // Posición de la coma
                ind = (double) (in / Math.pow(10,c));

                System.out.println("El número invertido de "+ n + " es " + ind);
            }
        }else{
            System.out.println("El número invertido de 0 es 0");
        }

        sc.close();
    }
}