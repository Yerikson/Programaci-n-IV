/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_telefonica;


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
    
    public static ArrayList<Contacto> Agregar(ArrayList<Contacto> A, Contacto P){
            A.add(P);
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
    
}
    
    

