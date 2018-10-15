package agenda_telefonica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import agenda_telefonica.Contacto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class ManejoArchivos {
    public static void EscribirSerializable(File A, ArrayList<Contacto> P){
         try{        
        FileOutputStream Fos = new FileOutputStream(A);
        ObjectOutputStream Oss = new ObjectOutputStream(Fos);
        Oss.writeObject(P);       
        }catch (FileNotFoundException e) {
            e.printStackTrace();            
        }catch (IOException e){
            e.printStackTrace();
        }

    }     
    public static ArrayList<Contacto> LecturaSerializable(File A) throws ClassNotFoundException{
        ArrayList<Contacto> N = new ArrayList<Contacto>();
        try{           
            FileInputStream Fis = new FileInputStream(A);
            ObjectInputStream Ois = new ObjectInputStream(Fis);
            N = (ArrayList<Contacto>)Ois.readObject();
               
        }catch (FileNotFoundException e) {
            e.printStackTrace();            
        }catch (IOException e){
            e.printStackTrace();
        }
        return N;
    }
  
    public static void Exportar(File B) throws ClassNotFoundException{
        ArrayList<Contacto> M = new ArrayList<Contacto>();
        M = LecturaSerializable(B);
         try {
            File ExportarAgenda = new File("ExportarAgenda.txt");
            FileWriter FW = new FileWriter(ExportarAgenda);
            BufferedWriter BW = new BufferedWriter(FW);                                    
            for(int i=0; i<M.size(); i++){                                
                BW.write(M.get(i).Exportar());
                BW.newLine();
            }
            BW.close();
            System.out.println("\nLa Ruta Donde Se Guardo El Archivo Es : " + ExportarAgenda.getAbsoluteFile().toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
    }
        
    
