
package semana.pkg3;

public class Ejercicio4 {
    public static void main(String[] args) {
        long N = 9;
        long P = 12;
        long R = Potencia(N,P);
        System.out.println(R);
    }
    public static long Potencia(long Base,long Potencia) {
        long Resultado = 1;
        if (Potencia == 0) {
            return 1;
            
        } else {
            for (int i = 1; i <= Potencia; i++) {
                Resultado *= Base;
            }
        }
        return Resultado;
    }
}
