/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author USER
 */
public class Juego {    

    public Juego() {
        
    }
    
    public ArrayList<Ficha> desordenarFichas(ArrayList<Ficha> fichasOrdenadas){
        
        ArrayList<Ficha> Aux = new ArrayList<Ficha>();
        Aux = fichasOrdenadas;
        Collections.shuffle(Aux);
        
        return Aux;
        
        
    }
    
    public int[] vectorOrdenCorrecto(){
        
        int [] ordenFichasVector = new int [16];
        
        for (int i = 0; i < ordenFichasVector.length; i++) {
            
            ordenFichasVector [i] = i+1;
                        
        }
        
        return ordenFichasVector;
        
        
    }
    
    public ArrayList<Ficha> crearFichas(){
        
        ArrayList<Ficha> fichas = new ArrayList<Ficha>();
       
        //Agregando las fichas
        
        Ficha nuevaFicha1 = new Ficha(1, new ImageIcon("Imagen1.png"), 1, 1);
        fichas.add(nuevaFicha1);
        
        Ficha nuevaFicha2 = new Ficha(2, new ImageIcon("Imagen2.png"), 162, 1);
        fichas.add(nuevaFicha2);
        
        Ficha nuevaFicha3 = new Ficha(3, new ImageIcon("Imagen3.png"), 323, 1);
        fichas.add(nuevaFicha3);
        
        Ficha nuevaFicha4 = new Ficha(4, new ImageIcon("Imagen4.png"), 484, 1);
        fichas.add(nuevaFicha4);
        
        Ficha nuevaFicha5 = new Ficha(5, new ImageIcon("Imagen5.png"), 1, 172);
        fichas.add(nuevaFicha5);
        
        Ficha nuevaFicha6 = new Ficha(6, new ImageIcon("Imagen6.png"), 162, 172);
        fichas.add(nuevaFicha6);
        
        Ficha nuevaFicha7 = new Ficha(7, new ImageIcon("Imagen7.png"), 323, 172);
        fichas.add(nuevaFicha7);
        
        Ficha nuevaFicha8 = new Ficha(8, new ImageIcon("Imagen8.png"), 484, 172);
        fichas.add(nuevaFicha8);
        
        Ficha nuevaFicha9 = new Ficha(9, new ImageIcon("Imagen9.png"), 1, 343);
        fichas.add(nuevaFicha9);
        
        Ficha nuevaFicha10 = new Ficha(10, new ImageIcon("Imagen10.png"), 162, 343);
        fichas.add(nuevaFicha10);
        
        Ficha nuevaFicha11 = new Ficha(11, new ImageIcon("Imagen11.png"), 323, 343);
        fichas.add(nuevaFicha11);
        
        Ficha nuevaFicha12 = new Ficha(12, new ImageIcon("Imagen12.png"), 484, 343);
        fichas.add(nuevaFicha12);
        
        Ficha nuevaFicha13 = new Ficha(13, new ImageIcon("Imagen13.png"), 1, 514);
        fichas.add(nuevaFicha13);
        
        Ficha nuevaFicha14 = new Ficha(14, new ImageIcon("Imagen14.png"), 162, 514);
        fichas.add(nuevaFicha14);
        
        Ficha nuevaFicha15 = new Ficha(15, new ImageIcon("Imagen15.png"), 323, 514);
        fichas.add(nuevaFicha15);
        
        Ficha nuevaFicha16 = new Ficha(16, new ImageIcon("Imagen16.png"), 484, 514);
        fichas.add(nuevaFicha16);
                
        return fichas;
        
    }
    
    public int buscarPosicionFicha16(ArrayList<Ficha> fichas2){
        
        int j = -1;
        
        for (int i = 0; i < fichas2.size(); i++) {
            
            if(fichas2.get(i).getNumeroFicha() == 16){
                j = i;
                break;
            }
                       
        }
        
        return j;
        
    }
    
}
