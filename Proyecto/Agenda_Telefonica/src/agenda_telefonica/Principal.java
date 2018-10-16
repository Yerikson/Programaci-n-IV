/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_telefonica;

import static agenda_telefonica.Agenda_Contactos.Menu;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author USER
 */
public class Principal extends ManejoArchivos{
    
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        File AgendaArchivo;
        AgendaArchivo = new File("AgendaArchivo.txt");
        ArrayList<Contacto> AgendaContactos = new ArrayList<Contacto>();
        Menu(AgendaArchivo, AgendaContactos);
    }
   
    }

