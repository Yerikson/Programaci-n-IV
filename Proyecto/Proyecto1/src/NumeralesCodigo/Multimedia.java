
package NumeralesCodigo;

/**
 *
 * @author Yerikson
 */
/* Proyecto1 Punto A.)*/
public class Multimedia {
    protected String Titulo;
    protected String Autor;
    protected String Formato;
    protected double Duracion;


    public Multimedia(String _Titulo, String _Autor, String _Formato, double _Duracion){
        Titulo = _Titulo;
        Autor = _Autor;
        Formato = _Formato;
        Duracion = _Duracion;
    }
    public void datos(){
        System.out.println("Atributos: titulo, autor, formato, duracion.");
    }
    @Override
    public String toString(){
        String message = "\n\nTitulo: "+ Titulo + "\nAutor: "+ Autor + "\nFormato: " + Formato + "\nDuracion: " + Duracion;
        return message;
    }
    public boolean equals(String _Titulo, String _Autor){
        return Titulo.equals(Autor);
    }
}
