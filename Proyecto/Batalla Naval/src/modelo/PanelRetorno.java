
package modelo;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class PanelRetorno extends JPanel{
    
    public JButton nuevoJuego = new JButton();
    
    public PanelRetorno(){
        
        this.setBounds(1201, 1, 149, 665);
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        agregarBoton();
    }
    
    public void agregarBoton(){
        
        nuevoJuego.setBounds(15, 50, 120, 50);
        nuevoJuego.setText("Nuevo Juego");
        this.add(nuevoJuego);
    }
    
}
