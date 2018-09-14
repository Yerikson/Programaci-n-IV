
package NumeralesCodigo;

/**
 *
 * @author Yerikson
 */
/* Proyecto1 Punto D.) y F.)*/
public class App {
    public static void main(String[] args){
        System.out.println("\nApp Punto D");
        
        ListaMultimedia Lista1 = new ListaMultimedia(10);
        
        Pelicula Pelicula1 = new Pelicula("Pitufos", "Papa Pitufo", "dvd", 102.3);
        Pelicula1.Actores("PitufiValiente", "");

        Pelicula Pelicula2 = new Pelicula("Avengers", "Pablo Neruda", "dvd", 114.20);
        Pelicula2.Actores("", "Viuda");

        Pelicula Pelicula3 = new Pelicula("NOMBRE3", "AUTOR3", "dvd", 55.25);
        Pelicula3.Actores("ACTOR3", "ACTRIZ3");

        Lista1.add(Pelicula1);
        Lista1.add(Pelicula2);
        Lista1.add(Pelicula3);

        System.out.println(Lista1.toString(Lista1));

        System.out.println("\nApp Punto F");
        
        ListaMultimedia Lista2=new ListaMultimedia(20);
        Disco Disco1 = new Disco("Amor Eterno", "Rocio", "mp3", 4.3);
       Disco1.AgregarGenero("Baldas");

        Disco Disco2 = new Disco("Te gateo", "Reykon", "mp3", 3.5);
        Disco2.AgregarGenero("Urbano");

        Disco Disco3 = new Disco("Maracas", "Jhon Sebastian", "mp3", 2.6);
        Disco3.AgregarGenero("Baladas");

        Lista2.add(Disco1);
        Lista2.add(Disco2);
        Lista2.add(Disco3);

        System.out.println(Lista2.toString(Lista2));

        Disco DiscoE1 = new Disco(Lista2.get(1).Titulo,Lista2.get(1).Autor, "mp3", 3.0);
        System.out.println("Objetop1: "+DiscoE1.toString());
        
    }
}
