
package Biblioteca;

/**
 *
 * @author Yerikson
 */
//Punto B.)
public class App {
    
    public static int PublicacionesAnterioresA(Pila1 Biblioteca, int Año){
        int Cont = 0;
        for (int i=0; i< Biblioteca.Tamaño();i++){
            Publicaciones Pu = Biblioteca.get(i);
            if(Pu.AñoPublicacion < Año)
                Cont += 1;
        }
        return Cont;
    }
    
    public static int CuentaPrestados(Pila1 Biblioteca){
        int Cont1 = 0;
        for (int i = 0; i < Biblioteca.Tamaño(); i++){
            Publicaciones Pu = Biblioteca.get(i);
            if(Pu.Prestar == true){
                Cont1 += 1;
            }

        }
        return Cont1;
    }
    
    public static void main(String[] args) {
        
        Pila1 Biblioteca1 = new Pila1();
        
        Publicaciones Libro1 = new Publicaciones(8907889, "Eragon", 2006);
        Publicaciones Libro2 = new Publicaciones(5606009, "Ready Player One", 2000);
        
        Publicaciones Revista1 = new Publicaciones(7061071, "Economy", 1900, 16);
        Publicaciones Revista2 = new Publicaciones(5647893, "Tress", 1925, 30);
        
        Biblioteca1.añadir(Libro1);
        Biblioteca1.añadir(Libro2);
        Biblioteca1.añadir(Revista1);
        Biblioteca1.añadir(Revista2);
        
        Libro2.Prestar();
        
        for (int i = 0; i < Biblioteca1.Tamaño(); i++) {
            System.out.println(Biblioteca1.get(i));            
        }
        int PAnteriores = PublicacionesAnterioresA(Biblioteca1, 1940);
        int PPrestados = CuentaPrestados(Biblioteca1);
        System.out.println("\nSe Hallaron: " + PAnteriores + " Publicaciones Anteriores A 1940");
        System.out.println("\n" + PPrestados + " Se ENcuentran En Prestamo");
        
    }
}

