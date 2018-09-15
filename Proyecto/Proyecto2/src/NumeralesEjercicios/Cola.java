
package NumeralesEjercicios;
import java.util.LinkedList;
/**
 *
 * @author Yerikson
 */
//Punto D.)
public class Cola implements ColeccionInterfaz{
    LinkedList<Object> Cola1;

    public Cola(){
        Cola1 = new LinkedList<>();
    }
    @Override
    public boolean estaVacia() {
        return Cola1.isEmpty();
    }

    @Override
    public Object extraer() {
        Object ElemExtraido1 = Cola1.removeFirst();
        return ElemExtraido1;
    }

    @Override
    public Object primero() {
        Object PrimerElem1 = Cola1.getFirst();
        return PrimerElem1;
    }

    @Override
    public void añadir(Object K) {
        Cola1.addLast(K);
    }
    
    
}
