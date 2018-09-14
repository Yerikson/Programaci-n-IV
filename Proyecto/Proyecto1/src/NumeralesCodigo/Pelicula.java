
package NumeralesCodigo;

/**
 *
 * @author Yerikson
 */
/* Proyecto1 Punto B.)*/
public class Pelicula extends Multimedia{
   
    protected String Actor;
    protected String Actriz;

    public Pelicula(String _Titulo, String _Autor, String _Formato, double _Duracion) {
        super(_Titulo, _Autor, _Formato, _Duracion);
    }
    public void Actores(String _Actor, String _Actriz){
        if(_Actor.equals("") && _Actriz.equals("")){
            System.out.println("Debe añadir por lo menos un actor o actriz");
        }
        Actor = _Actor;
        Actriz = _Actriz;
    }
    @Override
    public String toString(){
        String message = "Titulo: "+ Titulo + ", Autor: "+ Autor + ", Formato: " + Formato + ", Duracion: " + Duracion 
                + ", Actor: " + Actor + ", Actriz: " + Actriz;
        return message;
    }
}
