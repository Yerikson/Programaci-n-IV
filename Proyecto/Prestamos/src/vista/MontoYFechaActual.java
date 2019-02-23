
package vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class MontoYFechaActual extends JPanel{

    public double montoActual;
    public JLabel monto = new JLabel();
    public JButton volver = new JButton();
    
    public MontoYFechaActual() {
        
        this.setBounds(0, 600, 1200, 100);
        this.setLayout(null); 
        this.setBackground(Color.darkGray);
        ubicarElementos();
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }
    
    
    public void ubicarElementos(){
       
        this.monto.setBounds(100, 10, 350, 50);        
        this.monto.setForeground(Color.yellow);
        this.add(monto);
        
        this.volver.setBounds(1000, 10, 100, 50);
        this.volver.setOpaque(true);
        this.volver.setContentAreaFilled(false);
        this.volver.setText("Atras");
        this.volver.setForeground(Color.yellow);
        this.add(volver);
        
    }
    
}
