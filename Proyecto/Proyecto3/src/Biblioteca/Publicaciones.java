
package Biblioteca;

/**
 *
 * @author Yerikson
 */
//Punto B.)
public class Publicaciones extends CaracteristicasComunes implements Prestable {
    public boolean Prestar = false;
    public int Numero;

    //Libros
    public Publicaciones(int Codigo, String Titulo, int AñoPublicacion) {
        super(Codigo, Titulo, AñoPublicacion);
        
    }
    
    //Revistas
     public Publicaciones(int Codigo, String Titulo, int AñoPublicacion, int NumeroR) {
        super(Codigo, Titulo, AñoPublicacion);
        Numero = NumeroR;
    }

    @Override
    public String toString() {
        String Datos = "Código: " + Codigo + " " + "Titulo: " + Titulo + " "
                + "Año Publicacion: " + AñoPublicacion + " "
                + "Prestado: " + Prestar + " " + "NumeroR: " + Numero;
        return Datos;
    }

     

    @Override
    public void Prestar() {
        Prestar = true;
    }

    @Override
    public void Devolver() {
        Prestar = false;
    }

    @Override
    public void Prestado() {
        if (Prestar == true) {
            System.out.println("\nEl Libro Se Encuentra En Prestamo\n");
            
        }
    }
    
}
