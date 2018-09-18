
package tallerarchivoscap7;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Mascota Pet;
        Mascota Pet2;
        int Cantidad_Mascotas;
        Scanner Dato = new Scanner(System.in);
        try{
        File ArchivoEjercicio3 = new File("ArchivoEjercicio3.txt");
        FileOutputStream Fos = new FileOutputStream(ArchivoEjercicio3);
        ObjectOutputStream Oss = new ObjectOutputStream(Fos);
        System.out.println("\nPor favor ingrese el número de mascotas de las cuales quiere ingresar datos\n");
        Cantidad_Mascotas = Integer.parseInt(Dato.next());
            for (int i = 1; i <= Cantidad_Mascotas; i++) {
                System.out.println("\nA continuación ingrese los datos de las mascota número: " + i);
                System.out.println("\nEdad Mascota: ");
                int Edad = Integer.parseInt(Dato.next());
                System.out.println("\nNombre Mascota: ");
                String Nombre = Dato.next();
                System.out.println("\nRaza De La Mascota: ");
                String Raza = Dato.next();
                System.out.println("\nNombre del dueño de la mascota: ");
                String Nombre2 = Dato.next();
                Pet = new Mascota(Edad, Nombre, Raza, Nombre2);
                Oss.writeObject(Pet);                
            }
            
            System.out.println("\nDesea Observar los datos de las mascotas ingresadas, ingrese un 1 si lo desea"
                    + " y un 2 en caso contrario: ");
            int Op = Integer.parseInt(Dato.next());
            if(Op == 1){
                FileInputStream Fis = new FileInputStream(ArchivoEjercicio3);
                ObjectInputStream Ois = new ObjectInputStream(Fis);
                for (int i = 1; i <= Cantidad_Mascotas; i++) {
                    Pet2 = (Mascota)Ois.readObject();
                    System.out.println(Pet2.toString());
                    
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();            
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
