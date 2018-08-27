
package semana.pkg3;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        int Digito = 997;
        int R = 0;

        for (int i = 1; i <= Digito; i++) {
            if (R > 2) {
                break;   
                
            } else {
                if(Digito % i == 0){
                    R += 1;
                }
            }
            
            }
        if (R == 2) {
            System.out.println("El Número Ingresado Es Primo.");
            
        } else {
            System.out.println("El Número Ingresado No Es Primo.");
        }
            
        }
        
    }

