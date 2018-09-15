
package NumeralesCodigo;

/**
 *
 * @author Yerikson
 */
/* Proyecto1 Punto C.)*/
public class ListaMultimedia {
    protected Multimedia Objetos [];
    protected int Contador = 0;

    public ListaMultimedia(int Tamaño){
        Objetos = new Multimedia[Tamaño];
    }
    public int size(){
        return Objetos.length;
    }
    public boolean add(Multimedia Mult){
        if (Contador < Objetos.length){
            Objetos[Contador] = Mult;
            Contador += 1;
            return true;
        }
        else{
            return false;
    }
    }
    Multimedia get(int Pos){
        return Objetos[Pos];
    }

    public String toString(ListaMultimedia Lista){
        StringBuilder List = new StringBuilder();
        for(int W = 0; W < Lista.size(); W++){
            List = List.append(Lista.get(W));
        }
        return List.toString();
    }

 
    

}
