
package modelo;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class Casilla extends JLabel{
 
    private int contenidaCasilla;

    public Casilla() {
        
        this.setBackground(Color.yellow);
                
    }

    public int getContenidaCasilla() {
        
        return contenidaCasilla;
    }

    public void setContenidaCasilla(int contenidaCasilla) {
        this.contenidaCasilla = contenidaCasilla;
    }
    
    
    
}
