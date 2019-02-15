
package controlador;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Casilla;

/**
 *
 * @author USER
 */
public class PanelJugador extends JPanel {

    private JLabel n = new JLabel();   
    
    public PanelJugador(int tipoJugador) {
                
        this.setLayout(null);
        
        if (tipoJugador == 0) {
            
            this.setBounds(10, 5, 630, 660);
            this.setBackground(Color.darkGray);
        
        }else{
            
            this.setBounds(655, 5, 630, 660);
            this.setBackground(Color.BLUE);
        }
                                  
    }
    
    public void agregarMatriz(Casilla [] [] nuevaMatriz){
        
        
        
    }
    
    
    
}
