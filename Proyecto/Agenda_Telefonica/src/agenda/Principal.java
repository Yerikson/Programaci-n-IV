/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import static agenda.AgendaContactos.menu;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author USER
 */

public class Principal extends ManejoArchivos{
    
    /**
     * Método main que inicializa el archivo que contiene
     * o va acontener toda la información de la agenda,
     * además también llama a la función menu la cual
     * contenia con el proceso de ejecución del 
     * programa
     * @param args
     * @throws ClassNotFoundException
     * @throws IOException 
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        
        File agendaArchivo;
        agendaArchivo = new File("AgendaArchivo.txt");
        ArrayList<Contacto> agendaContactos = new ArrayList<Contacto>();
        menu(agendaArchivo, agendaContactos);
        
    }
   
    }

