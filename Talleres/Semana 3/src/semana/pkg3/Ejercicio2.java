
package semana.pkg3;


public class Ejercicio2 {
    public static void main(String[] args) {
        long Num = 20;
        long Facto = Factorial(Num);
        System.out.println(Facto);
   
    }
    public static long Factorial(long N) {
        if (N == 0) {
            return 1;
        } else {
            return Factorial(N - 1) * N;
        }
    }
}
