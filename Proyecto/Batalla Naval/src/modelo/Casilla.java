
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;


/**
 *
 * @author USER
 */
public class Casilla extends JButton{
 
    private int contenidoCasilla;

    public Casilla() {
        
        
        this.setBackground(Color.yellow);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(true);       
                
    }

    public int getContenidoCasilla() {
        
        return contenidoCasilla;
    }

    public void setContenidoCasilla(int contenidaCasilla) {
        
        this.contenidoCasilla = contenidaCasilla;
    }
    
    
    
}
