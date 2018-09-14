
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
        
        String[] Formatos = {"wav", "mp3", "midi", "avi", "mov", "mpg", "cdAudio", "dvd"};
        
        for(int W = 0; W <= Formatos.length; W++){
            if (Formatos[W].equals(_Formato)){
                Formato = _Formato;
                break;
            }else{
                System.out.print("El Formato Ingresado No Es Correcto");
            }
        }
        Duracion = _Duracion;
    }
    public void datos(){
        System.out.println("Atributos: titulo, autor, formato, duracion.");
    }
    @Override
    public String toString(){
        String message = "Titulo: "+ Titulo + ", Autor: "+ Autor + ", Formato: " + Formato + ", Duracion: " + Duracion;
        return message;
    }
    public boolean equals(String _Titulo, String _Autor){
        return Titulo.equals(Autor);
    }
}
