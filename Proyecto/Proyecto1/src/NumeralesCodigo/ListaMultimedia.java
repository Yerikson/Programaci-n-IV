
package NumeralesCodigo;

/**
 *
 * @author Yerikson
 */
/* Proyecto1 Punto C.)*/
public class ListaMultimedia {
    protected Multimedia Objetos [];
    protected int contador;
    protected int Cantidad_De_Datos;

    public ListaMultimedia(int Tamaño){
        Cantidad_De_Datos = Tamaño;
        Objetos = new Multimedia[Tamaño];
    }
    public int size(){
        return Objetos.length;
    }
    public boolean add(Multimedia Mult){
        if (Cantidad_De_Datos < Objetos.length){
            Objetos[Cantidad_De_Datos] = Mult;
            return true;
        }
        return false;
    }
    Multimedia get(int Pos){
        return Objetos[Pos+1];
    }

    public String toString(ListaMultimedia Lista){
        StringBuilder _List = new StringBuilder();
        for(int W = 0; W <= Lista.size(); W++){
            _List = _List.append(Lista.get(W));
        }
        return _List.toString();
    }

}
