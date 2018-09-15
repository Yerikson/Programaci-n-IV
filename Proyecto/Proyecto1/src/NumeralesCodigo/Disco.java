
package NumeralesCodigo;

/**
 *
 * @author Yerikson
 */
/* Proyecto1 Punto E.)*/
public class Disco extends Multimedia{
    public String Genero;
    public Disco(String _Titulo, String _Autor, String _Formato, double _Duracion) {
        super(_Titulo, _Autor, _Formato, _Duracion);
    }
    public void AgregarGenero(String _Genero){
        Genero = _Genero;
    }
    @Override
    public String toString(){
        
        String message = "\n\nTitulo: "+ Titulo + "\nAutor: "+ Autor + "\nFormato: "+ Formato + "\nDuracion: "+ Duracion
                      + "\nGenero: "+ Genero + "\n";
        return message;
    }
}

