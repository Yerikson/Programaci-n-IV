
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.event.MouseEvent.MOUSE_CLICKED;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author USER
 */
public class Casilla extends JButton{    
    
    private int ancho;
    private int alto;
    private int contenidoCasilla;
    private ImageIcon barcoPequeño = new ImageIcon("BarcoPequeñoVertical.png");

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
        //agregarOyente();
    }

    public void agregarOyente(){
        
        MouseAdapter oyenteRaton = new MouseAdapter() {
        
            public void mouseClicked(MouseEvent e){
        
                
                if (e.getClickCount() == 2) {
                    
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
