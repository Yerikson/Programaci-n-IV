
package NumeralesEjercicios;
import java.util.ArrayList;
/**
 *
 * @author Yerikson
 */
//Punto B.)
public class Pila implements ColeccionInterfaz {
    ArrayList<Object> Pila1;
    private static int Cont = 0;

    public Pila() {
        Pila1 = new ArrayList<>();
    }
    

    @Override
    public boolean estaVacia() {
        return Pila1.isEmpty(); 
    }

    @Override
    public Object extraer() {
        Object ElemExtraido = Pila1.remove(0);
        return ElemExtraido;
    }

    @Override
    public Object primero() {
        Object PrimerElem = Pila1.get(0);
        return PrimerElem;
    }

    @Override
    public void añadir(Object K) {
        Pila1.add(K);
    }
    
}
