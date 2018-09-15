
package Biblioteca;

/**
 *
 * @author Yerikson
 */
//Punto A.)
public class Libros extends CaracteristicasComunes implements Prestable {

    public boolean Prestar = false;
    
    public Libros(int Codigo, String Titulo, int AñoPublicacion) {
        super(Codigo, Titulo, AñoPublicacion);
    }

    @Override
    public String toString() {
        return Codigo + " " + Titulo + " " + AñoPublicacion + " " + Prestar;
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
