
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class MontoYFechaActual extends JPanel{

    private Image fond;
    
    public MontoYFechaActual() {
        
        this.setBounds(0, 600, 1200, 700);
        this.setLayout(null);        
        PreInit();
        initComponent();
    }
    
    private void PreInit() {
        
        fond = new ImageIcon("Fondo6.jpg").getImage();
    }

    private void initComponent() {

    }

    public void paintBorder (Graphics g){
        super.paintComponent(g);
        g.drawImage(fond,0,0, this.getWidth(), this.getHeight(), this);
    }
    
    
    
}
