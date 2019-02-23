
package vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Menu extends JPanel{

    public JButton agregarPrestamo = new JButton();
    public JButton verPrestamos = new JButton();
    
    public Menu() {
        
        this.setBounds(0, 0, 1200, 600);
        this.setLayout(null);        
        this.setBackground(Color.BLACK);
        ubicarBotones();
    }
    
    
    public void ubicarBotones(){
        
        this.agregarPrestamo.setBounds(480, 200, 250, 50);
        this.agregarPrestamo.setOpaque(true);
        this.agregarPrestamo.setContentAreaFilled(false);
        this.agregarPrestamo.setText("Realizar Un Nuevo Prestamo(s)");
        this.agregarPrestamo.setForeground(Color.WHITE);
        this.verPrestamos.setBounds(480, 300, 250, 50);
        this.verPrestamos.setOpaque(true);
        this.verPrestamos.setContentAreaFilled(false);
        this.verPrestamos.setText("Ver Los Prestamos Realizados");
        this.verPrestamos.setForeground(Color.WHITE);
        this.add(this.agregarPrestamo);
        this.add(this.verPrestamos);
        
    }
    
    
}
