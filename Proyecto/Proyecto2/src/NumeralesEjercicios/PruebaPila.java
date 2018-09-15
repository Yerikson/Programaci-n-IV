
package NumeralesEjercicios;

/**
 *
 * @author Yerikson
 */
//Punto C.)
public class PruebaPila {
    public static void main(String[] args) {
        Pila NPila = new Pila();
        Rellenar(NPila);
        ImprimirYVaciar(NPila);
        
    }
    
    public static void Rellenar(Pila Nueva) {
        for (int i = 1; i <= 10; i++) {
            Nueva.añadir(i);
        }
    }
    
    public static void ImprimirYVaciar(Pila Nueva) {
        while (Nueva.estaVacia()!= true) {
            System.out.println("\n" + Nueva.extraer());
        }
        System.out.println("\nLa Lista Ahora Se Encuentra Vacia\n");
    }

}
