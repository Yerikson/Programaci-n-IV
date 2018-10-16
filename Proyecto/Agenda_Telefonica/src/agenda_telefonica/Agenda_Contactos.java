/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_telefonica;

import static agenda_telefonica.ManejoArchivos.EscribirSerializable;
import static agenda_telefonica.ManejoArchivos.Exportar;
import static agenda_telefonica.ManejoArchivos.Importar;
import static agenda_telefonica.ManejoArchivos.LecturaSerializable;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Agenda_Contactos {

    public static boolean Unico(ArrayList<Contacto> A, String N){
        boolean Boy = false;
        String Aux;
        int Cant;
        for (int i = 0; i < A.size(); i++) {
            if (Boy != true) {
                Cant = A.get(i).getCantidad_Telefonos();
                String[ ] AuxTel = new String[Cant];
                AuxTel = A.get(i).getTelefonos();
                for (int j = 0; j < Cant; j++) {
                    Aux = AuxTel[j];
                    if (N.equals(Aux)) {
                        Boy = true;
                        break;
                    }                
                }
            }
            else{
                break;
            }            
        }
        return Boy;
    }
    
    public static boolean EsNumero(String C){
        boolean Result;
        try {
            Integer.parseInt(C);
            Result = true;
        } catch (NumberFormatException excepcion) {
            Result = false;
        }

        return Result;                
    }
    public static ArrayList<Contacto> Busqueda(ArrayList<Contacto> A, String Dato,int OpDato){
            ArrayList<Contacto> Coincidencias = new ArrayList<Contacto>();
            String Aux;
            boolean Flag = false;
            int AuxCantTel;
            switch (OpDato){
                case 1:
                    for (int i = 0; i < A.size(); i++) {
                        Aux = A.get(i).getNombre();
                        if(Dato.equals(Aux)){
                            Coincidencias.add(A.get(i));
                            Flag = true;
                        }                                                    
                    }
                    if(Flag == false){
                        Coincidencias = null;
                    }
                    break;
                case 2:
                    for (int i = 0; i < A.size(); i++) {
                        AuxCantTel = A.get(i).getCantidad_Telefonos();
                        String[ ] AuxTel = new String[AuxCantTel];
                        AuxTel = A.get(i).getTelefonos();                        
                        for (int j = 0; j < AuxCantTel; j++) {
                            Aux = AuxTel[j];
                            if(Dato.equals(Aux)){
                                Coincidencias.add(A.get(i));
                                Flag = true;
                               break;
                            }                            
                        }                                                                                                  
                    }
                    if(Flag == false){
                        Coincidencias = null;
                    }
                    break;
                case 3:
                    for (int i = 0; i < A.size(); i++) {
                        Aux = A.get(i).getCorreo();
                        if(Dato.equals(Aux)){                           
                            Coincidencias.add(A.get(i));
                            Flag = true;
                        }
                                                    
                    }
                    if(Flag == false){
                        Coincidencias = null;
                    }
                    break;
                case 4:
                    for (int i = 0; i < A.size(); i++) {
                        Aux = A.get(i).getDireccion();
                        if(Dato.equals(Aux)){
                            Coincidencias.add(A.get(i));
                            Flag = true;
                        }
                                                    
                    }
                    if(Flag == false){
                        Coincidencias = null;
                    }
                    break;
                case 5:
                    for (int i = 0; i < A.size(); i++) {
                        Aux = A.get(i).getAlias();
                        if(Dato.equals(Aux)){
                            Coincidencias.add(A.get(i));
                            Flag = true;
                        }
                                                    
                    }
                    if(Flag == false){
                        Coincidencias = null;
                    }
                    break;
                default:
                    System.out.println("Opción De Busqueda Invalida. Recuerde Que La Busqueda"
                            + " Solo Acepta Opciones Desde 1 A 5");
                    Coincidencias = null;
                        
            }
            return Coincidencias;
    }
    
    public static ArrayList<Contacto> Agregar(ArrayList<Contacto> A){           
           Contacto Nuevo;
            Scanner Dato = new Scanner(System.in);
            System.out.println("\nPor Favor, A Continuación Ingrese Los Datos Del Contacto Que Desea Agregar");
            System.out.println("\nNombre: ");
            String Nombre = Dato.next();
            System.out.println("\nCantidad De Telefonos Que Ingresara Para El Presente Contacto");
            int CantidadTel = Integer.parseInt(Dato.next());
            String[ ] Telefonos1 = new String[CantidadTel];
            System.out.println("\nPor Favor Ingrese Los " + CantidadTel + " Números De Telefono");
            
            for (int i = 0; i < CantidadTel; i++) {
                System.out.println("\nPor Favor Ingrese El Telefono Numero: " + (i + 1));
                String Numero = Dato.next();
                if(Numero.length() == 7){
                    if (EsNumero(Numero) == true) {
                        boolean T = Unico(A, Numero);
                        if (T == true) {
                            System.out.println("\nLo Sentimos El Número Ingresado Ya Se Encuentra Dentro De La Agenda Por Favor Ingrese"
                                    + " De Nuevo Un Numero Distinto");
                            i = i - 1;
                        } else {
                            
                            Telefonos1[i] = Numero;
                        }
                        
                    } else {
                        System.out.println("\nLo Sentimos Lo Que Usted Acaba De Ingresar No Es Un"
                                + " Número, Por Favor Ingrese De Nuevo Un Número Valido");
                        i = i - 1;
                        
                    }
                } else{
                    System.out.println("\nLo Sentimos Lo Que Usted Acaba De Ingresar No Es Un Número Telefónico Valido"
                            + " .Por Favor Ingrese De Nuevo Un Número Telefónico (Recuerde Que Un Número Telefónico Esta Compuesto Solo Por 7 Números)");
                    i = i - 1;
                }
                
            }
            System.out.println("\nCorreo: ");
            String Correo = Dato.next();
            System.out.println("\nDirección: ");
            String Dirección = Dato.next();
            System.out.println("\nALias: ");
            String Alias = Dato.next();          
            Nuevo = new Contacto(Nombre, CantidadTel, Correo, Dirección, Alias, Telefonos1);
            A.add(Nuevo);
            System.out.println("\nFelicidades El Contacto A Sido Agregado A La Agenda Con Éxito.");
            
            return A;
    }
    
    public static int BusquedaIndex(ArrayList<Contacto> A, String Dato, int Op){
        String Aux;
        int Index = -1;
        int AuxCantTel;
        switch (Op){
            case 1:
                for (int i = 0; i < A.size(); i++) {
                    Aux = A.get(i).getNombre();
                    if(Dato.equals(Aux)){
                        Index = i;
                        break;
                    }
                }
                
            case 2:
                for (int i = 0; i < A.size(); i++) {
                    AuxCantTel = A.get(i).getCantidad_Telefonos();
                    String[ ] AuxTel = new String[AuxCantTel];
                    AuxTel = A.get(i).getTelefonos();                        
                    for (int j = 0; j < AuxCantTel; j++) {
                        Aux = AuxTel[j];
                        if(Dato.equals(Aux)){
                            Index = i;
                            break;
                        }                            
                    }   
                    if(Index == i){
                        break;
                    }
                }
                
            case 3:
                for (int i = 0; i < A.size(); i++) {
                    Aux = A.get(i).getCorreo();
                    if(Dato.equals(Aux)){
                        Index = i;
                        break;
                    }
                }

            case 4:
                for (int i = 0; i < A.size(); i++) {
                    Aux = A.get(i).getDireccion();
                    if(Dato.equals(Aux)){
                        Index = i;
                        break;
                    }
                }

            case 5:
                for (int i = 0; i < A.size(); i++) {
                    Aux = A.get(i).getAlias();
                    if(Dato.equals(Aux)){
                        Index = i;
                        break;
                    }
                }
        }
        return Index;        
    }
    
    public static ArrayList<Contacto> Modificar(ArrayList<Contacto> A,int Opcion ,String Dato, String DatoNuevo){
            int Index2;
            Index2 = BusquedaIndex(A,Dato,Opcion);
            if (Index2 != -1) {

                switch (Opcion){
                     case 1:
                         A.get(Index2).setNombre(DatoNuevo);
                         break;

                     case 2:                         
                         int AuxCanTel = A.get(Index2).getCantidad_Telefonos();
                         String[ ] AuxTel = new String[AuxCanTel];
                         AuxTel = A.get(Index2).getTelefonos();
                         for (int i = 0; i < AuxCanTel; i++) {
                             if (Dato.equals(AuxTel[i])) {
                                 AuxTel[i] = DatoNuevo;
                                 A.get(Index2).setTelefonos(AuxTel);
                                 break;
                             }                    
                         }

                     case 3:
                         A.get(Index2).setCorreo(DatoNuevo);
                         break;

                     case 4:
                         A.get(Index2).setDireccion(DatoNuevo);
                         break;

                     case 5:
                         A.get(Index2).setAlias(DatoNuevo);
                         break;
                 }

             }
            else{
                if (Opcion <= 5 && Opcion > 0) {
                    System.out.println("Lo Sentimos El Dato Que Desea Modificar No Se Halla Dentro De La Agenda");
                } else {
                    System.out.println("Opción De Modificación Invalida. Recuerde Que La Modificación"
                                + " Solo Acepta Opciones Desde 1 A 5");
                }
                
            }
            
            return A;
    }
    
    public static ArrayList<Contacto> Eliminar(ArrayList<Contacto> A,int Opcion, String Dato){
            int Index2;
            Index2 = BusquedaIndex(A,Dato,Opcion);
            if(Index2 != -1){
                A.remove(Index2);
            }
            else{
                if (Opcion <= 5 && Opcion > 0) {
                    System.out.println("Lo Sentimos No Se Ha Encontrado Ningun Contacto Dentro De La Agenda"
                            + " Asociado Al Dato Ingresado");
                } else {
                    System.out.println("Opción De Eliminación Invalida. Recuerde Que La Eliminación"
                                + " Solo Acepta Opciones Desde 1 A 5");
                }
            }
            
            return A;
    }
    public static void DesplegarMenu(){
        System.out.println("--------------------Bienvenido-----------------------");
        System.out.println("Opciones");
        System.out.println("1.Agregar Un Contacto Nuevo A La Agenda");
        System.out.println("2.Ver Agenda");
        System.out.println("3.Eliminar Contacto");
        System.out.println("4.Modificar Contacto");
        System.out.println("5.Buscar Contactos Que Cumplan Con Un Determinado Criterio De Busqueda");
        System.out.println("6.Exportar La Agenda De Contactos");
        System.out.println("7.Importar La Agenda De Contactos");
        System.out.println("8.Salir");
        System.out.println("Por Favor Ingrese Una Opción: ");
    }
    public static void DesplegarCriterios(){
        System.out.println("Criterios:");
        System.out.println("1.Por El Nombre");
        System.out.println("2.Por Un Número De Teléfono");
        System.out.println("3.Por El Correo");
        System.out.println("4.Por La Dirección");
        System.out.println("5.Por El Alias");        
    }
    
    public static void Menu(File A, ArrayList<Contacto> P)throws ClassNotFoundException, IOException{
        int Opcion;
        ArrayList<Contacto> X1 = new ArrayList<Contacto>();
        Scanner NumOp = new Scanner(System.in);        
        DesplegarMenu();
        while((Opcion = Integer.parseInt(NumOp.next()))!= 8){
           switch(Opcion){
               case 1:
                   P = Agregar(P);                   
                   EscribirSerializable(A, P);
                   DesplegarMenu();
                   
                   break;
               case 2:                   
                   System.out.println("\n");
                   
                   if(((int) A.length()) != 0){
                       X1 = LecturaSerializable(A);
                       for (Contacto B : X1) {                        
                        System.out.println(B);
                        }
                   } else{
                       System.out.println("\nActualmente La Agenda Se Halla Vacia.");
                   }
                   
                    DesplegarMenu();
                    
                    break;
               case 3:
                   System.out.println("Estos Son Todos Los Contactos Almcenados Hasta El Momento En La Agenda: ");
                   X1 = LecturaSerializable(A);
                   System.out.println("\n");
                    for (Contacto B : X1) {                        
                        System.out.println(B);
                    }
                   DesplegarCriterios();
                   System.out.println("Por Favor Ingrese Un Criterio Sobre El Cual "
                           + " Se Aplicara El Proceso De Eliminación: ");
                   int Crit = Integer.parseInt(NumOp.next());
                   System.out.println("\nNOTA: Se Eliminara El Primer Contacto Que Cumpla Con Dicho Criterio De Eliminación.");
                   System.out.println("\nPor Favor Ingrese EL Dato Relacionado Al Criterio Elegido: ");
                   String Dato = NumOp.next();
                   P = Eliminar(P, Crit, Dato);
                   EscribirSerializable(A, P);
                   System.out.println("El Contacto Ha Sido Eliminado Con Éxito.");
                   DesplegarMenu();
                   
                   break;
               case 4:
                   System.out.println("Estos Son Todos Los Contactos Almcenados Hasta El Momento En La Agenda: ");
                   X1 = LecturaSerializable(A);
                   System.out.println("\n");
                    for (Contacto B : X1) {                        
                        System.out.println(B);
                    }
                   DesplegarCriterios();
                   System.out.println("Por Favor Ingrese Un Criterio Sobre El Cual "
                           + " Se Aplicara El Proceso De Modificación: ");
                   int Crit1 = Integer.parseInt(NumOp.next());
                   System.out.println("\nNOTA: Se Modificara El Primer Contacto Que Cumpla Con Dicho Criterio De Modificación.");
                   System.out.println("\nPor Favor Ingrese EL Dato Relacionado Al Criterio Elegido: ");
                   String Dato1 = NumOp.next();
                   System.out.println("\nPor Ingrese El Nuevo Dato Por El Que Desea Remplazar El Anteriormente Ingresado: ");
                   String DatoN = NumOp.next();
                   P = Modificar(P, Crit1, Dato1, DatoN);
                   EscribirSerializable(A, P);
                   System.out.println("El Contacto Ha Sido Modificado Con Éxito.");
                   DesplegarMenu();
                   
                   break;
               case 5:
                   DesplegarCriterios();
                   System.out.println("Por Favor Ingrese Un Criterio Sobre El Cual "
                           + " Se Aplicara El Proceso De Búsqueda: ");
                   int Crit2 = Integer.parseInt(NumOp.next());
                   System.out.println("\nNOTA: Se Buscaran Y Mostraran Todos Los Contactos Que Cumplan Con El Criterio De Búsqueda.");
                   System.out.println("\nPor Favor Ingrese EL Dato Relacionado Al Criterio Elegido: ");
                   String Dato2 = NumOp.next();
                   X1 = Busqueda(P, Dato2, Crit2);      
                    if (X1 == null && Crit2 <= 5) {
                        System.out.println("No se hallaron coincidencias");
                    } 
                    if(X1 != null) {
                        System.out.println("Contactos Que Cumplen Con El Criterio De Busqueda");
                        for (Contacto B : X1) {
                            System.out.println(B);
                        }
                    }
                    DesplegarMenu();
                    
                    break;
               case 6:
                   Exportar(A);
                   System.out.println("\nExportación Exitosa");
                   DesplegarMenu();
                   
                   break;
               case 7:
                   Importar(A);
                   X1 = LecturaSerializable(A);
                   System.out.println("\nAgenda Con Los Datos Recién Exportados: ");
                    for (Contacto B : X1) {
                        System.out.println(B);
                    }
                    System.out.println("\nExportación Éxitosa");
                    DesplegarMenu();
                    
                    break;

           } 
            
        }
        
        System.out.println("Adios");
        
    }
}
    
    

