
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class MontoYFechaActual extends JPanel{

    private int montoActual;
    private JLabel monto = new JLabel();
    
    public MontoYFechaActual() {
        
        this.setBounds(0, 600, 1200, 100);
        this.setLayout(null); 
        this.setBackground(Color.darkGray);
        ubicarElementos();
    }

    public int getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(int montoActual) {
        this.montoActual = montoActual;
    }
    
    
    public void ubicarElementos(){
        this.montoActual = 1111111111;
        this.monto.setBounds(10, 10, 350, 50);        
        this.monto.setText("Monto Total Disponible Para Prestamos: " + this.montoActual);
        this.monto.setForeground(Color.yellow);
        this.add(monto);
        
    }
    
}
