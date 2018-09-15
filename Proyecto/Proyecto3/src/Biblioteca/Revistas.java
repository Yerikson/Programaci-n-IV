
package Biblioteca;

/**
 *
 * @author Yerikson
 */
//Punto A.)
public class Revistas extends CaracteristicasComunes {
    
    public int NumeroRev;
    
    public Revistas(int Codigo, String Titulo, int AñoPublicacion, int NumeroR) {
        super(Codigo, Titulo, AñoPublicacion);
        NumeroRev = NumeroR;
    }

    @Override
    public String toString() {
        return Codigo + " " + Titulo + " " + AñoPublicacion + " " + NumeroRev;
    }    
    
}
