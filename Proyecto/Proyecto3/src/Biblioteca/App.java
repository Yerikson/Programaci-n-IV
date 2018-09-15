
package Biblioteca;

/**
 *
 * @author Yerikson
 */
//Punto B.)
public class App {
    
    public static int publicacionesAnterioresA(Pila1 Biblioteca, int año){
        int Cont = 0;
        for (int i=0; i< Biblioteca.size();i++){
            Libros Publicaciones = Biblioteca.get(i);
            if(Publicaciones.AñoPublicacion < año)
                Cont++;
        }
        return Cont;
    }
}
