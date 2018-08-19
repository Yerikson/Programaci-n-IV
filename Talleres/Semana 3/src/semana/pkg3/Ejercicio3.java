
package semana.pkg3;

public class Ejercicio3 {
    
    /* Profesor, le recuerdo que este ejercicio esta basado en la secuencia que usted nos dio 
    donde f(0) = 1 y f(1) = 1 (esto se puede verificar en la imagen que usted subio a classroom); 
    tiene parecido con la serie Fibonacci pero no lo es ya que en la serie Fibonacci f(0) = 0.
    Hago está salveda para que usted no se confunda y piense que nos puso a hacer la serie Fibonacci.*/
    public static void main(String[] args) {
        long Num = 5;
        long F = Sec(Num);
        System.out.println(F);
   
    }
    public static long Sec(long N) {
        if (N == 0) {
            return 1;
        }
        if (N == 1){
           return 1; 
        }
        
        else {
            return Sec(N - 2) + Sec(N - 1);
        }
    }

}
