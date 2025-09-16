package While;

public class Divisible {
    public static void main(String[] args) {
        long i = 1;
        while(i <= 100){
            if(i % 2 == 0 && i % 3 == 0){
                System.out.println(i+ " es divisible entre 2 y 3");
            }
            i++;
        }   
    }
}
