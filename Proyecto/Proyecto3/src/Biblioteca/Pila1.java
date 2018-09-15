
package Biblioteca;
import java.util.ArrayList;
/**
 *
 * @author Yerikson
 */
//Punto B.)
public class Pila1 {
    ArrayList<Publicaciones> NuevaPila;
    
    public Pila1 (){
        NuevaPila = new ArrayList<>();
    }
    
    public int Tamaño(){
        return NuevaPila.size();
    }
    
    public Publicaciones get(int K){
        return NuevaPila.get(K);
    }
    
    public boolean estaVacia(){
        return NuevaPila.isEmpty();
    }
    
    public Publicaciones extraer() {
        Publicaciones ElemExtraido = NuevaPila.remove(0);
        return ElemExtraido;
    }
    
    public Publicaciones primero() {
        Publicaciones PrimerElem = NuevaPila.get(0);
        return PrimerElem;
    }
    
    public void añadir(Publicaciones K) {
        NuevaPila.add(K);
    }
    
}
