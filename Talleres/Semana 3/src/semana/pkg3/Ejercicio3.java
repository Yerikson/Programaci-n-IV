
package semana.pkg3;

public class Ejercicio3 {
    
    /* Profesor, le recuerdo que este ejercicio esta basado en la secuencia que usted nos dio 
    donde f(0) = 1 y f(1) = 1 (esto se puede verificar en la imagen que usted subio a classroom); 
    tiene parecido con la serie Fibonacci pero no lo es ya que en la serie Fibonacci f(0) = 0.
    Hago está salveda para que usted no se confunda y piense que nos puso a hacer la serie Fibonacci.*/
    public static void main(String[] args) {
        long Num = 5;
        if (Num < 0) {
            System.out.println("Usted A Ingresado Un Número Negativo Y La Serie Fibonacci No Esta Definida Para Dichos Números).");
            System.out.println("Por Favor Ingrese Un Número Mayor O Igual A Cero (0). Para Continuar");            
            
        } else {            
            long F = Sec(Num);
            System.out.println(F);  
        }
      
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
