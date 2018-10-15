/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_telefonica;





import static agenda_telefonica.Agenda_Contactos.Agregar;
import static agenda_telefonica.Agenda_Contactos.Busqueda;
import static agenda_telefonica.Agenda_Contactos.Eliminar;
import static agenda_telefonica.Agenda_Contactos.Modificar;
import static agenda_telefonica.Agenda_Contactos.Unico;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Principal extends ManejoArchivos{
    
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        File AgendaArchivo;
        AgendaArchivo = new File("AgendaArchivo.txt");
        ArrayList<Contacto> AgendaContactos = new ArrayList<Contacto>();
        Contacto PI;
        String[ ] Telefonos1 = new String[3];
        Telefonos1[0] = "321";
        Telefonos1[1] = "654";
        Telefonos1[2] = "987";
        PI= new Contacto("David",3,"Y","12A","PEPE", Telefonos1);
        AgendaContactos.add(PI);       
        String[ ] Telefonos2 = new String[3];
        Telefonos2[0] = "102";
        Telefonos2[1] = "321";
        Telefonos2[2] = "345";
        PI= new Contacto("Jose",3,"","11A-B","Jacinta", Telefonos2);
        AgendaContactos.add(PI);
        
        //-----------Mostrar la lista------------------
        for (Contacto B : AgendaContactos) {
            System.out.println(B);
        }
        System.out.println("\n");
        String Z = "Jos";
        int Opcion;
        Opcion = 13;
        boolean T;
        ArrayList<Contacto> X1 = new ArrayList<Contacto>();
        Telefonos2[0]="1";
        PI = new Contacto("Pedro",2,"Correo","12-20A","Pedrito",Telefonos2);
        AgendaContactos.add(PI);
        EscribirSerializable(AgendaArchivo, AgendaContactos);
        X1 = LecturaSerializable(AgendaArchivo);
        for (Contacto B : X1) {
            System.out.println(B);
        }
        Exportar(AgendaArchivo);
        //-------------------UNICO-------------------
        /*T = Unico(AgendaContactos, Z);
        if (T == true) {
            System.out.println("El numero ya esta");
        } else {
            System.out.println("El numero no esta");
        }*/
        
        //X1 = null;
        //--------------BUSQUEDA-----------------
        /*X1 = Busqueda(AgendaContactos, Z, Opcion);
        
        if (X1 == null && Opcion <= 5) {
            System.out.println("No se hallaron coincidencias");
        } 
        if(X1 != null) {
            System.out.println("Contactos Que Cumplen Con El Criterio De Busqueda");
            for (Contacto B : X1) {
                System.out.println(B);
            }
        }*/
        //------------Agregar--------------
       
        /*Telefonos2[0] = "222";        
        Telefonos2[1] = "111";
        Telefonos2[2] = "333";
        PI= new Contacto("Danilo",3,"Sacatecas","Asino","Pepita", Telefonos2);
        AgendaContactos = Agregar(AgendaContactos, PI) ;
        //-------Mostrar La Lista Con El Contacto Agregado--------
        for (Contacto B : AgendaContactos) {
            System.out.println(B);
        }
        */
        
        //------Modificar------
        /*AgendaContactos = Modificar(AgendaContactos, 15, "PEPE", "PEDROPICAPIEDRA");
        for (Contacto B : AgendaContactos) {
            System.out.println(B);
        }*/
        
        //------ELiminar---------
        /*AgendaContactos = Eliminar(AgendaContactos, 0, "PEPE");
        for (Contacto B : AgendaContactos) {
            System.out.println(B);
        }*/
    }

 
        
    }

