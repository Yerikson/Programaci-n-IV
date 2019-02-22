
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Menu extends JPanel{

    public JButton agregarPrestamo;
    public JButton verPrestamos;
    private  Image fond;
    public Menu() {
        
        this.setBounds(0, 0, 1200, 600);
        this.setLayout(null);        
        PreInit();
        initComponent();
    }
    
    private void PreInit() {
        
        fond = new ImageIcon("Fondo4.jpg").getImage();
    }

    private void initComponent() {

    }

    public void paintBorder (Graphics g){
        super.paintComponent(g);
        g.drawImage(fond,0,0, this.getWidth(), this.getHeight(), this);
    }
    
    
    
    
}
