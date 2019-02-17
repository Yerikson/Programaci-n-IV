
package modelo;

import java.applet.AudioClip;
import java.awt.Color;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author USER
 */
public class Casilla extends JButton{    
    
    private AudioClip disparoCañon;
    private AudioClip explosion;
    private int ancho;
    private int alto;
    private int contenidoCasilla;
    private ImageIcon barcoPequeño = new ImageIcon("BarcoPequeñoVertical.png");
    private ImageIcon barcoPequeñoDestruido = new ImageIcon("BarcoPequeñoVerticalDestruido.png");

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public ImageIcon getBarcoPequeño() {
        return barcoPequeño;
    }
        
    public Casilla() {
        
        this.setBackground(Color.yellow);
        this.ancho = 42;
        this.alto = 44;
        this.setOpaque(false);        
        this.setContentAreaFilled(false);
        this.setBorderPainted(true);       
    }

    public void cambiarIcono(int contenido){
                
        disparoCañon = java.applet.Applet.newAudioClip(getClass().getResource("/controlador/Cañones.wav"));
        disparoCañon.play();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Casilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (contenido == 1) {
            
            this.setIcon(new ImageIcon(barcoPequeñoDestruido.getImage().getScaledInstance(42, 44, Image.SCALE_SMOOTH))); 
            explosion = java.applet.Applet.newAudioClip(getClass().getResource("/controlador/Explosion.wav"));
            explosion.play();
            
        }
        
    }
    
    public void agregarOyente(){
        
        MouseAdapter oyenteRaton = new MouseAdapter() {
        
            public void mouseClicked(MouseEvent e){
        
                
                if (e.getClickCount() == 2) {
                                        
                    cambiarIcono(1);                    
                    System.out.println("Hola Mundo");
                    
                }
            }

        };
        this.addMouseListener(oyenteRaton);                
        
    }
    
    
    public int getContenidoCasilla() {
        
        return contenidoCasilla;
    }

    public void setContenidoCasilla(int contenidaCasilla) {
        
        this.contenidoCasilla = contenidaCasilla;
    }
    
    
    
}
