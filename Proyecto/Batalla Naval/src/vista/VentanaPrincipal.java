/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class VentanaPrincipal extends JFrame {
    
    public VentanaPrincipal(){
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);       
    }
    
    public void agregarPanel(JPanel nuevoPanel){
        
        this.add(nuevoPanel);
        
    }
    
   
    
}
