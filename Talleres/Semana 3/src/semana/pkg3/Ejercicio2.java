
package semana.pkg3;


public class Ejercicio2 {
    public static void main(String[] args) {
        long Num = 12;
        if (Num < 0) {
            System.out.println("Usted A Ingresado Un Número Negativo Y El Factorial No Esta Definida Para Dichos Números).");
            System.out.println("Por Favor Ingrese Un Número Mayor O Igual A Cero (0). Para Continuar");
            
        } else {
            long Facto = Factorial(Num);
            System.out.println(Facto);
        }

   
    }
    public static long Factorial(long N) {
        if (N == 0) {
            return 1;
        } else {
            return Factorial(N - 1) * N;
        }
    }
}
