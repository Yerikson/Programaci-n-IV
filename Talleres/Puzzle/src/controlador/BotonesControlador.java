
package controlador;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.Ficha;

/**
 *
 * @author USER
 */
public class BotonesControlador extends JPanel{
    
    public JButton botonArriba = new JButton();
    public JButton botonAbajo = new JButton();
    public JButton botonIzquierda = new JButton();
    public JButton botonDerecha = new JButton();
    
    public BotonesControlador(){
        
        this.setLayout(null);
        this.setBounds(645, 0, 355, 685);
        this.setBackground(Color.darkGray);
        
    }
    
    public void colocarBotonesDireccionales(){
           
        ImageIcon iconArriba = new ImageIcon("ArribaB.png");
        ImageIcon iconAbajo = new ImageIcon("AbajoB.png");
        ImageIcon iconDerecha = new ImageIcon("DerechaB.png");
        ImageIcon iconIzquierda = new ImageIcon("IzquierdaB.png");
        
        this.botonArriba.setBounds(120, 400, 100, 55);       
        this.botonArriba.setIcon(new ImageIcon(iconArriba.getImage()
                .getScaledInstance(botonArriba.getWidth()
                        , botonArriba.getHeight(), Image.SCALE_SMOOTH)));        
        this.add(botonArriba);       
        
        this.botonAbajo.setBounds(120, 460, 100, 55);
        this.botonAbajo.setIcon(new ImageIcon(iconAbajo.getImage()
                .getScaledInstance(botonAbajo.getWidth()
                        , botonAbajo.getHeight(), Image.SCALE_SMOOTH)));
        this.add(botonAbajo);  
        
        this.botonIzquierda.setBounds(15, 460, 100, 55);
        this.botonIzquierda.setIcon(new ImageIcon(iconIzquierda.getImage()
                .getScaledInstance(botonIzquierda.getWidth()
                        , botonIzquierda.getHeight(), Image.SCALE_SMOOTH)));
        this.add(botonIzquierda);  
        
        this.botonDerecha.setBounds(225, 460, 100, 55);
        this.botonDerecha.setIcon(new ImageIcon(iconDerecha.getImage()
                .getScaledInstance(botonDerecha.getWidth()
                        , botonDerecha.getHeight(), Image.SCALE_SMOOTH)));
        this.add(botonDerecha);  
        
    }
    
}
