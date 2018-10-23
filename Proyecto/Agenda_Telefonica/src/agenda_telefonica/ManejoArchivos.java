package agenda_telefonica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static agenda_telefonica.Agenda_Contactos.Agregar;
import static agenda_telefonica.Agenda_Contactos.EsNumero;
import static agenda_telefonica.Agenda_Contactos.Unico;
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
import java.util.Arrays;
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
    public static void Importar(File A) throws ClassNotFoundException{
        ArrayList<Contacto> M = new ArrayList<Contacto>();
        if(((int) A.length()) != 0){
            
            M = LecturaSerializable(A);                      
        }       
        try {
            File ImportarAgenda = new File("ImportarAgenda.txt");
            FileReader FR = new FileReader(ImportarAgenda);
            BufferedReader BR = new BufferedReader(FR);
            String Linea;                        
            while((Linea = BR.readLine()) != null){  
                boolean Flag = true;
                String [] Contac = Linea.split(";");
                Contacto Importado;
                int CanTel = Integer.parseInt(Contac[1]);
                String Tels = Contac[2];
                Tels = Tels.replace("[", "");
                Tels = Tels.replace("]", "");
                Tels = Tels.replaceAll(" ", "");
                String [] TelefonosContacto = Tels.split(",");                
                Importado = new Contacto(Contac[0], CanTel, Contac[3], Contac[4], Contac[5], TelefonosContacto);                
                if(M.isEmpty() != true){
                    for (int i = 0; i < CanTel; i++) {                     
                        if(TelefonosContacto[i].length() == 7){
                            if (EsNumero(TelefonosContacto[i]) == true) {
                                boolean T = Unico(M, TelefonosContacto[i]);
                                if (T == true) {
                                    System.out.println("\nLo Sentimos El Número Del Siguiente Contacto Ya Se Encuentra Dentro De La Agenda Por Ende No Puede Ser Importado"
                                            + " A La Agenda");                                    
                                    System.out.println(Importado.toString());
                                    Flag = false;
                                    break;
                                } 
                            } else {
                                System.out.println("\nLo Sentimos Uno De Los Números Del Siguiente Contacto Es Invalido"
                                        + " Por Ende No Puede Ser Importado");
                                Flag = false;
                                System.out.println(Importado.toString());
                                break;

                               }
                        } else{
                            System.out.println("\nLo Sentimos Uno De Los Números Del Siguiente Contacto No Es Un Número Telefónico Valido"
                                    + " (Recuerde Que Un Número Telefónico Esta Compuesto Solo Por 7 Números)");
                            Flag = false;
                            System.out.println(Importado.toString());
                            break;
                        }                
                    }
                } 
                
                if(Flag == true){                    
                    M.add(Importado);
                }
            }
            
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        EscribirSerializable(A, M);
    }                       
    }
    
        
    
