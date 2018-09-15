
package Biblioteca;
import java.util.ArrayList;
/**
 *
 * @author Yerikson
 */
//Punto B.)
public class Pila1 {
    ArrayList<Object> NuevaPila;
    
    public Pila1 (){
        NuevaPila = new ArrayList<>();
    }
    
    public int Tamaño(){
        return NuevaPila.size();
    }
    
    public Object get(int K){
        return NuevaPila.get(K);
    }
    
    public boolean estaVacia(){
        return NuevaPila.isEmpty();
    }
    
    public Object extraer() {
        Object ElemExtraido = NuevaPila.remove(0);
        return ElemExtraido;
    }
    
    public Object primero() {
        Object PrimerElem = NuevaPila.get(0);
        return PrimerElem;
    }
    
    public void añadir(Object K) {
        NuevaPila.add(K);
    }
    
}
