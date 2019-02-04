/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import static agenda.ManejoArchivos.escribirSerializable;
import static agenda.ManejoArchivos.exportar;
import static agenda.ManejoArchivos.importar;
import static agenda.ManejoArchivos.lecturaSerializable;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */

public class AgendaContactos {

    /**
     * El metodo llamado unico se encarga de verificar
     * si un número teléfonico determinado es diferente
     * a todos y cada uno de los demás números teléfonicos
     * de la Agenda.
     * @param agenda
     * @param numeroAVerificar
     * @return 
     */
    public static boolean unico(ArrayList<Contacto> agenda
            , String numeroAVerificar){
        
        boolean flag = false;
        String aux;
        int cant;
        
        for (int i = 0; i < agenda.size(); i++) {
            
            if (flag != true) {
                
                cant = agenda.get(i).getCantidad_Telefonos();
                String[ ] auxTel = new String[cant];
                auxTel = agenda.get(i).getTelefonos();
                
                for (int j = 0; j < cant; j++) {
                    
                    aux = auxTel[j];
                    
                    if (numeroAVerificar.equals(aux)) {
                        
                        flag = true;
                        break;
                        
                    }                
                }
            }
            else{
                
                break;
                
            }            
        }
        
        return flag;
    }
    
    /**
     * Este método sencillamente verifica si un número
     * teléfonico dado es un número valido, es decir
     * conformado solo por símbolos númericos.
     * @param C
     * @return 
     */
    public static boolean esNumero(String numeroAVerificar){
        
        boolean result;
        
        try {
            
            Integer.parseInt(numeroAVerificar);
            result = true;
            
        } catch (NumberFormatException excepcion) {
            
            result = false;
            
        }

        return result;  
        
    }
    
    /**
     * El método busqueda se encarga de dado un
     * criterio de busqueda el cual puede ser
     * cualquiera de los campos de los contactos
     * busca y muestra todos los contactos que 
     * cumplan con dicho criterio.
     * @param A
     * @param Dato
     * @param OpDato
     * @return 
     */
    public static ArrayList<Contacto> busqueda(ArrayList<Contacto> agenda
            , String datoBusqueda,int criterioDato){
        
            ArrayList<Contacto> coincidencias = new ArrayList<Contacto>();
            String aux;
            boolean flag = false;
            int auxCantTel;
            
            switch (criterioDato){
                
                case 1:
                    
                    for (int i = 0; i < agenda.size(); i++) {
                        
                        aux = agenda.get(i).getNombre();
                        
                        if(datoBusqueda.equals(aux)){
                            
                            coincidencias.add(agenda.get(i));
                            flag = true;
                            
                        }   
                        
                    }
                    
                    if(flag == false){
                        
                        coincidencias = null;
                        
                    }
                    
                    break;
                    
                case 2:
                    
                    for (int i = 0; i < agenda.size(); i++) {
                        
                        auxCantTel = agenda.get(i).getCantidad_Telefonos();
                        String[ ] auxTel = new String[auxCantTel];
                        auxTel = agenda.get(i).getTelefonos();                        
                        
                        for (int j = 0; j < auxCantTel; j++) {
                            aux = auxTel[j];
                            
                            if(datoBusqueda.equals(aux)){
                                
                                coincidencias.add(agenda.get(i));
                                flag = true;
                                
                               break;
                            }   
                            
                        }   
                        
                    }
                    
                    if(flag == false){
                        
                        coincidencias = null;
                        
                    }
                    
                    break;
                    
                case 3:
                    
                    for (int i = 0; i < agenda.size(); i++) {
                        
                        aux = agenda.get(i).getCorreo();
                        
                        if(datoBusqueda.equals(aux)){                           
                            
                            coincidencias.add(agenda.get(i));
                            flag = true;
                            
                        }
                                                    
                    }
                    
                    if(flag == false){
                        
                        coincidencias = null;
                        
                    }
                    
                    break;
                    
                case 4:
                    
                    for (int i = 0; i < agenda.size(); i++) {
                        
                        aux = agenda.get(i).getDireccion();
                        
                        if(datoBusqueda.equals(aux)){
                            
                            coincidencias.add(agenda.get(i));
                            flag = true;
                            
                        }
                                                    
                    }
                    
                    if(flag == false){
                        
                        coincidencias = null;
                        
                    }
                    
                    break;
                    
                case 5:
                    
                    for (int i = 0; i < agenda.size(); i++) {
                        
                        aux = agenda.get(i).getAlias();
                        
                        if(datoBusqueda.equals(aux)){
                            
                            coincidencias.add(agenda.get(i));
                            flag = true;
                            
                        }
                                                    
                    }
                    
                    if(flag == false){
                        
                        coincidencias = null;
                        
                    }
                    
                    break;
                    
                default:
                    
                    System.out.println("Opción De Busqueda Invalida. Recuerde "
                            + "Que La Busqueda Solo Acepta Opciones Desde 1 A 5");
                    
                    coincidencias = null;
                        
            }
            
            return coincidencias;
    }
    
    /**
     * agregar es el método encargado de solicitar los datos
     * referentes a un nuevo contacto que se desea agregar, 
     * luego de tener todos los datos y hacer las verificaciones
     * determinadas para los números teléfonicos (que sea un 
     * número téfonico valido y que sea unico)
     * agrega el contacto a la Agenda.
     * @param A
     * @return 
     */
    public static ArrayList<Contacto> agregar(ArrayList<Contacto> agenda){           
           
            Contacto nuevoContacto;
            Scanner dato = new Scanner(System.in);
            
            System.out.println("\nPor Favor, A Continuación Ingrese Los "
                    + "Datos Del Contacto Que Desea Agregar");
            
            System.out.println("\nNombre: ");
            String nombre = dato.next();
            
            System.out.println("\nCantidad De Telefonos Que Ingresara Para "
                    + "El Presente Contacto");
            int cantidadTel = Integer.parseInt(dato.next());
            
            String[ ] telefonos1 = new String[cantidadTel];
            
            System.out.println("\nPor Favor Ingrese Los " + cantidadTel 
                    + " Números De Telefono");
            
            for (int i = 0; i < cantidadTel; i++) {
                
                System.out.println("\nPor Favor Ingrese El Telefono Numero: " 
                        + (i + 1));
                
                String numero = dato.next();
                
                if(numero.length() == 7){
                    
                    if (esNumero(numero) == true) {
                        
                        boolean flag1 = unico(agenda, numero);
                        
                        if (flag1 == true) {
                            
                            System.out.println("\nLo Sentimos El Número Ingresado"
                                    + " Ya Se Encuentra Dentro De La Agenda Por "
                                    + "Favor Ingrese De Nuevo Un Numero Distinto");
                            
                            i = i - 1;
                            
                        } else {
                            
                            telefonos1[i] = numero;
                        }
                        
                    } else {
                        System.out.println("\nLo Sentimos Lo Que Usted Acaba De "
                                + "Ingresar No Es Un Número, Por Favor Ingrese De "
                                + "Nuevo Un Número Valido");
                        i = i - 1;
                        
                    }
                    
                } else{
                    
                    System.out.println("\nLo Sentimos Lo Que Usted Acaba De Ingresar "
                            + "No Es Un Número Telefónico Valido. Por Favor Ingrese "
                            + "De Nuevo Un Número Telefónico (Recuerde Que Un Número "
                            + "Telefónico Esta Compuesto Solo Por 7 Números)");
                    i = i - 1;
                    
                }
                
            }
            
            System.out.println("\nCorreo: ");
            String correo = dato.next();
            
            System.out.println("\nDirección: ");
            String dirección = dato.next();
            
            System.out.println("\nAlias: ");
            String alias = dato.next();     
            
            nuevoContacto = new Contacto(nombre, cantidadTel, correo, dirección
                    , alias, telefonos1);
            
            agenda.add(nuevoContacto);
            
            System.out.println("\nFelicidades El Contacto A Sido Agregado A "
                    + "La Agenda Con Éxito.");
            
            return agenda;
    }
    
    /**
     * El método busquedaIndex se encarga de buscar la posición
     * de un determinado dato perteneciente a uno de los 
     * campos de algun contacto; en caso de hallar alguna
     * coincidencia retorna la posición de correspondiente al
     * contacto que posee el campo deseado, en caso de no 
     * hallar coincidencias este retornara un -1.
     * @param agenda
     * @param dato
     * @param criterio
     * @return 
     */
    public static int busquedaIndex(ArrayList<Contacto> agenda
            , String dato, int criterio){
        
        String aux;
        int index = -1;
        int auxCantTel;
        
        switch (criterio){
            
            case 1:
                
                for (int i = 0; i < agenda.size(); i++) {
                    
                    aux = agenda.get(i).getNombre();
                    
                    if(dato.equals(aux)){
                        
                        index = i;
                        
                        break;
                    }
                    
                }
                
            case 2:
                
                for (int i = 0; i < agenda.size(); i++) {
                    
                    auxCantTel = agenda.get(i).getCantidad_Telefonos();
                    String[ ] auxTel = new String[auxCantTel];
                    auxTel = agenda.get(i).getTelefonos();                        
                    
                    for (int j = 0; j < auxCantTel; j++) {
                        
                        aux = auxTel[j];
                        
                        if(dato.equals(aux)){
                            
                            index = i;
                            
                            break;
                            
                        }                            
                    }   
                    
                    if(index == i){
                        
                        break;
                        
                    }
                    
                }
                
            case 3:
                
                for (int i = 0; i < agenda.size(); i++) {
                    
                    aux = agenda.get(i).getCorreo();
                    
                    if(dato.equals(aux)){
                        
                        index = i;
                        
                        break;
                        
                    }
                    
                }

            case 4:
                
                for (int i = 0; i < agenda.size(); i++) {
                    
                    aux = agenda.get(i).getDireccion();
                    
                    if(dato.equals(aux)){
                        
                        index = i;
                        
                        break;
                        
                    }
                    
                }

            case 5:
                
                for (int i = 0; i < agenda.size(); i++) {
                    
                    aux = agenda.get(i).getAlias();
                    
                    if(dato.equals(aux)){
                        
                        index = i;
                        
                        break;
                        
                    }
                    
                }
                
        }
        
        return index;        
    }
    
    /**
     * El método modificar se encarga de dado un dato
     * buscar el contacto que lo contenga dentro de 
     * la agenda para luego cambiarlo por un nuevo
     * dato.
     * @param agenda
     * @param criterio
     * @param dato
     * @param datoNuevo
     * @return 
     */
    public static ArrayList<Contacto> modificar(ArrayList<Contacto> agenda
            , int criterio , String dato, String datoNuevo){
        
            int index2;
            index2 = busquedaIndex(agenda, dato, criterio);
            
            if (index2 != -1) {

                switch (criterio){
                    
                     case 1:
                         
                         agenda.get(index2).setNombre(datoNuevo);
                         
                         break;

                     case 2:                         
                         
                         int auxCanTel = agenda.get(index2).getCantidad_Telefonos();
                         String[ ] auxTel = new String[auxCanTel];
                         auxTel = agenda.get(index2).getTelefonos();
                         
                         for (int i = 0; i < auxCanTel; i++) {
                             
                             if (dato.equals(auxTel[i])) {
                                 
                                 auxTel[i] = datoNuevo;
                                 agenda.get(index2).setTelefonos(auxTel);
                                 
                                 break;
                             }                    
                         }

                     case 3:
                         
                         agenda.get(index2).setCorreo(datoNuevo);
                         
                         break;

                     case 4:
                         
                         agenda.get(index2).setDireccion(datoNuevo);
                         
                         break;

                     case 5:
                         
                         agenda.get(index2).setAlias(datoNuevo);
                         
                         break;
                 }

             }
            else{
                
                if (criterio <= 5 && criterio > 0) {
                    
                    System.out.println("Lo Sentimos El Dato Que Desea "
                            + "Modificar No Se Halla Dentro De La Agenda");
                    
                } else {
                    
                    System.out.println("Opción De Modificación Invalida. "
                            + "Recuerde Que La Modificación Solo Acepta "
                            + "Opciones Desde 1 A 5");
                }
                
            }
            
            return agenda;
    }
    
    /**
     *El método eliminar se encarga de dado un dato
     * buscar el contacto que lo contenga dentro de 
     * la agenda para luego eliminar dicho contacto.
     * @param agenda
     * @param criterio
     * @param dato
     * @return 
     */
    public static ArrayList<Contacto> eliminar(ArrayList<Contacto> agenda
            ,int criterio, String dato){
        
            int index2;
            index2 = busquedaIndex(agenda, dato, criterio);
            
            if(index2 != -1){
                               
                agenda.remove(index2);
                
            }
            
            else{
                
                if (criterio <= 5 && criterio > 0) {
                    
                    System.out.println("Lo Sentimos No Se Ha Encontrado "
                            + "Ningun Contacto Dentro De La Agenda"
                            + " Asociado Al Dato Ingresado");
                    
                } else {
                    
                    System.out.println("Opción De Eliminación Invalida. "
                            + "Recuerde Que La Eliminación Solo Acepta "
                            + "Opciones Desde 1 A 5");
                    
                }
            }
            
            return agenda;
            
    }
    
    
    
    /**
     * Este método dada un posición dentro
     * de la agenda se encarga de eliminar
     * el contacto correspondiente a dicha 
     * posición
     * @param agenda
     * @param posicion
     * @return 
     */
    public static ArrayList<Contacto> EliminarIndex(ArrayList<Contacto> agenda, int posicion){
        
        if(posicion < agenda.size() && posicion >= 0){
            
            agenda.remove(posicion);  
            
        }else{
            
            System.out.println("Lo Sentimos No Existo Ningún Contacto Con La Posición: " + posicion);
            
        }
        
        return agenda;
        
    }
    
    /**
     * Este método dada un posición dentro
     * de la agenda se encarga de reemplazar
     * el campo correspondiente al críterio
     * dado del contacto correspondiente a 
     * la posición dada por un nuevo dato
     * @param agenda
     * @param criterio
     * @param posicion
     * @param datoNuevo
     * @return 
     */
    public static ArrayList<Contacto> modificarIndex(ArrayList<Contacto> agenda
            ,int criterio ,int posicion, String datoNuevo){
        
        if(posicion < agenda.size() && posicion >= 0){
            
            switch (criterio){
                
                         case 1:
                             
                             agenda.get(posicion).setNombre(datoNuevo);
                             
                             break;

                         case 2:        
                             
                             int auxCanTel = agenda.get(posicion).getCantidad_Telefonos();
                             String[ ] auxTel = new String[auxCanTel];
                             auxTel = agenda.get(posicion).getTelefonos();
                             
                             System.out.println("Por Favor Ingrese El Telefono Del Contacto "
                                     + "Número " + posicion + " Que Desea Modificar");
                             
                             Scanner tel = new Scanner(System.in);  
                             String Dato = tel.next();
                             
                             for (int i = 0; i < auxCanTel; i++) {
                                 
                                 if (Dato.equals(auxTel[i])) {
                                     
                                     auxTel[i] = datoNuevo;
                                     agenda.get(posicion).setTelefonos(auxTel);
                                     
                                     break;
                                     
                                 }                    
                             }

                         case 3:
                             
                             agenda.get(posicion).setCorreo(datoNuevo);
                             
                             break;

                         case 4:
                             
                             agenda.get(posicion).setDireccion(datoNuevo);
                             
                             break;

                         case 5:
                             
                             agenda.get(posicion).setAlias(datoNuevo);
                             
                             break;
                     }

     }
            else{
            
                if (criterio <= 5 && criterio > 0) {
                    
                    System.out.println("Lo Sentimos El Dato Que Desea"
                            + " Modificar No Se Halla Dentro De La Agenda");
                    
                } else {
                    
                    System.out.println("Opción De Modificación Invalida. "
                            + "Recuerde Que La Modificación Solo Acepta "
                            + "Opciones Desde 1 A 5");
                    
                }
                
            }
        
        
        return agenda;
        
    }
    
    /**
     * Este método despliega una lista con las
     * operaciones aplicables a la agenda.
     */
    public static void desplegarMenu(){
        
        System.out.println("--------------------Bienvenido-----------------------");
        
        System.out.println("Opciones");
        
        System.out.println("1.Agregar Un Contacto Nuevo A La Agenda");
        
        System.out.println("2.Ver Agenda");
        
        System.out.println("3.Eliminar Contacto");
        
        System.out.println("4.Modificar Contacto");
        
        System.out.println("5.Buscar Contactos Que Cumplan Con Un Determinado "
                + "Criterio De Busqueda");
        
        System.out.println("6.Exportar La Agenda De Contactos");
        
        System.out.println("7.Importar La Agenda De Contactos");
        
        System.out.println("8.Salir");
        
        System.out.println("Por Favor Ingrese Una Opción: ");
        
    }
    
    /**
     * El método desplegarCriterios se 
     * encarga de mostrar todos los 
     * criterios aplicables con respecto
     * a las distintas operaciones aplicables
     * a la agenda.
     */
    public static void desplegarCriterios(){
        
        System.out.println("Criterios:");
        
        System.out.println("1.Por El Nombre");
        
        System.out.println("2.Por Un Número De Teléfono");
        
        System.out.println("3.Por El Correo");
        
        System.out.println("4.Por La Dirección");
        
        System.out.println("5.Por El Alias");        
    }
    
    /**
     * Este método muestra todos lo contactos y sus campos
     * almacenados dentro de la agenda
     */
    public static void mostrarAgenda(File archivoAgenda1) 
            throws ClassNotFoundException{
        
        ArrayList<Contacto> agendaAux1 = new ArrayList<Contacto>();
        
        System.out.println("A Continuación Se Muestran Todos Los "
                + "Datos De Los Contactos Almacenados En La Agenda Hasta El Momento");
        
        agendaAux1 = lecturaSerializable(archivoAgenda1);
        
        System.out.println("\n");
        
        int posContacto = 1;
        
        for (Contacto B : agendaAux1) {
            
            System.out.println("Contacto Número: " + posContacto);
            posContacto += 1;
            
            System.out.println("Nombre: " + B.getNombre());
            
            System.out.println("Cantidad De Teléfonos: " + B.getCantidad_Telefonos());
            
            System.out.print("Teléfonos: ");
            
            String[ ] telefonos2 = new String[B.getCantidad_Telefonos()];
            telefonos2 = B.getTelefonos();
            
            for (int i = 0; i < B.getCantidad_Telefonos(); i++) {
                
                System.out.print(telefonos2[i]);
                System.out.print(" ");
                
            }            
            
            System.out.println("\nCorreo: " + B.getCorreo());
            
            System.out.println("Dirección: " + B.getDireccion());
            
            System.out.println("Alias: " + B.getAlias());
            
            System.out.println("\n");
        }

    }
    
    /**
     * Este método recibe parametros directamente
     * del método main del programa, para luego
     * mediante el uso de los demás métodos 
     * pertenecientes al programa brindar la
     * posibilidad de aplcar algunas operaciones
     * a la Agenda y sus datos 
     * @param archivoAgenda
     * @param agenda
     * @throws ClassNotFoundException
     * @throws IOException 
     */
    public static void menu(File archivoAgenda, ArrayList<Contacto> agenda)
            throws ClassNotFoundException, IOException{
        
        int opcion;
        ArrayList<Contacto> agendaAux = new ArrayList<Contacto>();
        Scanner numOp = new Scanner(System.in);        
        
        desplegarMenu();
        
        while((opcion = Integer.parseInt(numOp.next()))!= 8){
            
           switch(opcion){
               
               case 1:
                   
                   agenda = agregar(agenda);                   
                   
                   escribirSerializable(archivoAgenda, agenda);
                   
                   desplegarMenu();
                   
                   break;
                   
               case 2:                   
                   
                   System.out.println("\n");
                   
                   if(((int) archivoAgenda.length()) != 0){
                       
                       agendaAux = lecturaSerializable(archivoAgenda);
                       
                       mostrarAgenda(archivoAgenda);
                   } else{
                       
                       System.out.println("\nActualmente La Agenda "
                               + "Se Halla Vacia.");
                   }
                   
                    desplegarMenu();
                    
                    break;
                    
               case 3:
                   
                   if (((int) archivoAgenda.length()) != 0) {
                       
                        mostrarAgenda(archivoAgenda);
                        
                        System.out.println("Por Favor Elija Un Método De Eliminación:");
                        
                        System.out.println("1. Eliminar El Primer Contacto Dentro De "
                                + "La Agenda Que Contenga Un Determinado Dato.\n"
                        + "2. Eliminar El Contacto Que Corresponda A Un Número Dado.\n");
                        
                        System.out.print("Por Favor Ingrese La Opción De Eliminación: ");
                        
                        int elimOp = Integer.parseInt(numOp.next());
                        
                        if(elimOp == 1){
                            
                            desplegarCriterios();
                            
                            System.out.println("Por Favor Ingrese Un Criterio Sobre El Cual "
                                    + " Se Aplicara El Proceso De Eliminación: ");
                            
                            int crit = Integer.parseInt(numOp.next());
                            
                            System.out.println("\nNOTA: Se Eliminara El Primer Contacto "
                                    + "Que Cumpla Con Dicho Criterio De Eliminación.");
                            
                            System.out.println("\nPor Favor Ingrese EL Dato Relacionado"
                                    + " Al Criterio Elegido: ");
                            
                            String Dato = numOp.next();
                            
                            agenda = eliminar(agenda, crit, Dato);
                            
                            escribirSerializable(archivoAgenda, agenda);
                            
                            System.out.println("El Contacto Ha Sido Eliminado Con Éxito.");
                            
                        }
                        
                        if(elimOp == 2){
                            
                            System.out.print("\nPor Favor Ingrese El Número Correspondiente"
                                    + " Al Contacto Que Desea Eliminar: ");
                             
                            int posicion = Integer.parseInt(numOp.next());
                            posicion -= 1;
                            
                            agenda = EliminarIndex(agenda, posicion);
                            
                            escribirSerializable(archivoAgenda, agenda);
                            
                            System.out.println("\nEl Contacto Ha Sido Eliminado Con Éxito.");
                           
                        }else{
                            
                            System.out.println("Opción De Eliminación Invalida.");
                            
                        }
                        
                   } else {
                       
                       System.out.println("\nActualmente La Agenda Se Halla Vacia.");
                   }

                   desplegarMenu();
                   
                   break;
                   
               case 4:
                   
                   if (((int) archivoAgenda.length()) != 0) {

                        mostrarAgenda(archivoAgenda);
                        
                        System.out.println("Por Favor Elija Un Método De Modificación:");
                        
                        System.out.println("1. Modificarar El Dato Del Primer Contacto "
                                + "Dentro De La Agenda Que Coincida.\n"
                        + "2. Modificar El Contacto Que Corresponda A Un Número Dado.\n");
                        
                        System.out.print("Por Favor Ingrese La Opción De Modificación: ");
                        
                        int modificarOp = Integer.parseInt(numOp.next());
                        
                        if(modificarOp == 1){   
                            
                            desplegarCriterios();
                            
                            System.out.println("Por Favor Ingrese Un Criterio Sobre El Cual "
                                    + " Se Aplicara El Proceso De Modificación: ");
                            
                            int crit1 = Integer.parseInt(numOp.next());
                            
                            System.out.println("\nNOTA: Se Modificara El Primer Contacto "
                                    + "Que Cumpla Con Dicho Criterio De Modificación.");
                            
                            System.out.println("\nPor Favor Ingrese EL Dato Relacionado "
                                    + "Al Criterio Elegido: ");
                            
                            String dato1 = numOp.next();
                            
                            System.out.println("\nPor Ingrese El Nuevo Dato Por El Que "
                                    + "Desea Reemplazar El Anteriormente Ingresado: ");
                            
                            String datoN = numOp.next();
                            
                            agenda = modificar(agenda, crit1, dato1, datoN);
                            
                            escribirSerializable(archivoAgenda, agenda);
                            
                            System.out.println("El Contacto Ha Sido Modificado Con Éxito.");
                            
                        }
                        
                        if(modificarOp == 2){
                            
                            desplegarCriterios();
                            
                            System.out.print("\nPor Favor Ingrese El Número Correspondiente"
                                    + " Al Contacto Que Desea Modificar: ");
                            
                            int posicion1 = Integer.parseInt(numOp.next());
                            posicion1 -= 1;
                            
                            System.out.println("\nPor Favor Ingrese Un Criterio Sobre El Cual "
                                    + " Se Aplicara El Proceso De Modificación: ");
                            
                            int crit3 = Integer.parseInt(numOp.next());
                            
                            System.out.println("\nPor Ingrese El Nuevo Dato Por El Que Desea"
                                    + " Reemplazar El Correspondiente Al Criterio: ");
                            
                            String datoNuev = numOp.next();
                            
                            agenda = modificarIndex(agenda, crit3, posicion1, datoNuev);
                            
                            escribirSerializable(archivoAgenda, agenda);
                            
                            System.out.println("El Contacto Ha Sido Modificado Con Éxito.");
                            
                        }else{
                            
                            System.out.println("Opción De Modificación Invalida.");
                            
                        }
                        
                   } else {
                       
                       System.out.println("\nActualmente La Agenda Se Halla Vacia.");
                       
                   }

                   desplegarMenu();
                   
                   break;
                   
               case 5:
                   
                   if (((int) archivoAgenda.length()) != 0) {
                       
                        desplegarCriterios();
                        
                        System.out.println("Por Favor Ingrese Un Criterio Sobre El Cual "
                                + " Se Aplicara El Proceso De Búsqueda: ");
                        
                        int crit2 = Integer.parseInt(numOp.next());
                        
                        System.out.println("\nNOTA: Se Buscaran Y Mostraran Todos Los "
                                + "Contactos Que Cumplan Con El Criterio De Búsqueda.");
                        
                        System.out.println("\nPor Favor Ingrese EL Dato Relacionado Al"
                                + " Criterio Elegido: ");
                        
                        String dato2 = numOp.next();
                        
                        agendaAux = busqueda(agenda, dato2, crit2);   
                        
                         if (agendaAux == null && crit2 <= 5) {
                             
                             System.out.println("No se hallaron coincidencias");
                             
                         } 
                         
                         if(agendaAux != null) {
                             
                             System.out.println("Contactos Que Cumplen Con El Criterio De Busqueda");
                             
                             for (Contacto B : agendaAux) {
                                 
                                 System.out.println(B);
                                 
                             }
                             
                         }
                       
                   } else {
                       
                        System.out.println("\nActualmente La Agenda Se Halla Vacia.");
                        
                   }
                    
                    desplegarMenu();
                    
                    break;
               
               case 6:
                   
                   if (((int) archivoAgenda.length()) != 0) {
                       
                       exportar(archivoAgenda);
                       
                       System.out.println("\nExportación Exitosa");                       
                       
                   } else {
                       
                       System.out.println("\nActualmente La Agenda Se Halla Vacia,"
                               + " Por Ende No Se Puede Exportar Ningún Contacto");
                   
                   }
                                      
                   desplegarMenu();
                   
                   break;
                   
               case 7:
                   
                    importar(archivoAgenda);
                   
                    agendaAux = lecturaSerializable(archivoAgenda);
                   
                    System.out.println("\nAgenda Con Los Datos Recién Importados: ");
                   
                    mostrarAgenda(archivoAgenda);
                   
                    System.out.println("\nImportación Éxitosa");
                    
                    desplegarMenu();
                    
                    break;

           } 
            
        }
        
        System.out.println("Adios");
        
    }
}
    
    

