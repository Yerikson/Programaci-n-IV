
package Biblioteca;

/**
 *
 * @author Yerikson
 */
//Punto A.)
public class CaracteristicasComunes {
    public int Codigo;
    public String Titulo;
    public int AñoPublicacion;

    public CaracteristicasComunes(int Codigo, String Titulo, int AñoPublicacion) {
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.AñoPublicacion = AñoPublicacion;
    }

    public int getCodigo() {
        return Codigo;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }
    
    
}
