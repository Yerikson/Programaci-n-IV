package tallerarchivoscap7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            File ArchivoEjercicio1 = new File("ArchivoEjercicio1.txt");
            FileWriter FW = new FileWriter(ArchivoEjercicio1);
            BufferedWriter BW = new BufferedWriter(FW);
            Scanner Numero = new Scanner(System.in);
            String Num;
            System.out.println("\nPor favor a continuación ingrese 10 numeros, dando enter cada vez que ingrese uno de estos "
                    + "o dejando un espacio entre los mismos: \n");
            for(int i=1; i<=10; i++){                
                Num = Numero.next();
                BW.write(Num);
                BW.newLine();
            }
            BW.close();
            System.out.println("\nLa Ruta Donde Se Guardo El Archivo Es : " + ArchivoEjercicio1.getAbsoluteFile().toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
    }

