
package agenda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static agenda.AgendaContactos.agregar;
import static agenda.AgendaContactos.esNumero;
import static agenda.AgendaContactos.unico;
import agenda.Contacto;
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
    
    /**
     * Este método se encarga de reescribir la Agenda en el archivo
     * serializable.
     * @param archivoAEscribir
     * @param listaAEscribir 
     */   
    public static void escribirSerializable(File archivoAEscribir
            , ArrayList<Contacto> listaAEscribir){
        
         try{        
        FileOutputStream fos = new FileOutputStream(archivoAEscribir);
        ObjectOutputStream oss = new ObjectOutputStream(fos);
        
        oss.writeObject(listaAEscribir);    
        oss.close();
        
        }catch (FileNotFoundException e) {
            
            e.printStackTrace();            
            
        }catch (IOException e){
            
            e.printStackTrace();
            
        }

    }  
    
    /**
     * Este método es el encargado de leer los contactos de la agenda que
     * se hallen almacenados en el archivo serializable.
     * @param archivoALeer
     * @return
     * @throws ClassNotFoundException 
     */    
    public static ArrayList<Contacto> lecturaSerializable(File archivoALeer) 
            throws ClassNotFoundException{
        
        ArrayList<Contacto> listaAuxiliar = new ArrayList<Contacto>();
        
        try{           
            FileInputStream fis = new FileInputStream(archivoALeer);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            listaAuxiliar = (ArrayList<Contacto>)ois.readObject();
               
        }catch (FileNotFoundException e) {
            
            e.printStackTrace();            
            
        }catch (IOException e){
           
            e.printStackTrace();
            
        }
        
        return listaAuxiliar;
    }
  
    /**
     * El método exportar es el que se encarga de escribir la
     * Agenda y sus contactos en un archivo de texto plano
     * además también retorna la ubicación exacta del 
     * archivo dentro del equipo.
     * @param B
     * @throws ClassNotFoundException 
     */    
    public static void exportar(File archivoSerializable) 
            throws ClassNotFoundException{
        
        ArrayList<Contacto> agendaAuxiliar = new ArrayList<Contacto>();
        agendaAuxiliar = lecturaSerializable(archivoSerializable);
        
        try {
            
            File exportarAgenda = new File("ExportarAgenda.txt");
            FileWriter fw = new FileWriter(exportarAgenda);
            BufferedWriter bw = new BufferedWriter(fw);                                    
            
            for(int i = 0; i < agendaAuxiliar.size(); i++){                                
                
                bw.write(agendaAuxiliar.get(i).Exportar());
                bw.newLine();
            }
            
            bw.close();
            
            System.out.println("\nLa Ruta Donde Se Guardo El Archivo Es : " 
                    + exportarAgenda.getAbsoluteFile().toString());
            
            } catch (FileNotFoundException e) {
                
                e.printStackTrace();
                
            } catch (IOException e) {
                
                e.printStackTrace();
                
            }
        
            }
    
    /**
     * El metodo importar trae los contactos validos
     * del archivo ImportarAgenta.txt, es decir 
     * comprueba que los números teléfonicos
     * de los contactos en el archivo cumplan
     * con las características que posee
     * un número de teléfono valido.
     * @param A
     * @throws ClassNotFoundException 
     */
    public static void importar(File archivoSerializable) 
            throws ClassNotFoundException{
        
        ArrayList<Contacto> listaAuxiliar = new ArrayList<Contacto>();
        
        if(((int) archivoSerializable.length()) != 0){
            
            listaAuxiliar = lecturaSerializable(archivoSerializable);                      
            
        }       
        
        try {
            
            File importarAgenda = new File("ImportarAgenda.txt");
            FileReader fr = new FileReader(importarAgenda);
            BufferedReader br = new BufferedReader(fr);
            
            String lineaArchivo;       
            
            while((lineaArchivo = br.readLine()) != null){  
                
                boolean flag = true;
                String [] contac = lineaArchivo.split(";");
                Contacto Importado;
                int canTel = Integer.parseInt(contac[1]);
                
                String tels = contac[2];
                tels = tels.replace("[", "");
                tels = tels.replace("]", "");
                tels = tels.replaceAll(" ", "");
                
                String [] telefonosContacto = tels.split(",");                
                
                Importado = new Contacto(contac[0], canTel, contac[3]
                        , contac[4], contac[5], telefonosContacto);                
                
                if(listaAuxiliar.isEmpty() != true){
                    
                    for (int i = 0; i < canTel; i++) {    
                        
                        if(telefonosContacto[i].length() == 7){
                            
                            if (esNumero(telefonosContacto[i]) == true) {
                                
                                boolean resultUnico = unico(listaAuxiliar, telefonosContacto[i]);
                                
                                if (resultUnico == true) {
                                
                                    System.out.println("\nLo Sentimos El Número Del Siguiente "
                                            + "Contacto Ya Se Encuentra Dentro De La Agenda Por "
                                            + "Ende No Puede Ser Importado A La Agenda");
                                    
                                    System.out.println(Importado.toString());
                                    
                                    flag = false;
                                    break;
                                } 
                                
                            } else {
                                
                                System.out.println("\nLo Sentimos Uno De Los Números Del "
                                        + "Siguiente Contacto Es Invalido Por Ende No "
                                        + "Puede Ser Importado");
                                
                                flag = false;
                                
                                System.out.println(Importado.toString());
                                break;

                               }
                            
                        } else{
                            
                            System.out.println("\nLo Sentimos Uno De Los Números Del "
                                    + "Siguiente Contacto No Es Un Número Telefónico Valido"
                                    + " (Recuerde Que Un Número Telefónico Esta Compuesto "
                                    + "Solo Por 7 Números)");
                            
                            flag = false;
                            
                            System.out.println(Importado.toString());
                            break;
                        } 
                        
                    }
                    
                } 
                
                if(flag == true){                    
                   
                    listaAuxiliar.add(Importado);
                    
                }
            }
            
            } catch (FileNotFoundException e) {
                
                e.printStackTrace();
                
            } catch (IOException e) {
                
                e.printStackTrace();
                
            }
        
        escribirSerializable(archivoSerializable, listaAuxiliar);
    }    
    
    }
    
        
    
