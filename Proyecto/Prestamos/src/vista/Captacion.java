
package vista;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Captacion extends JPanel{
    
    JTextField numeroIdentidad = new JTextField();
    JTextField primerNombre = new JTextField();
    JTextField primerApellido = new JTextField();
    JTextField segundoApellido = new JTextField();
    JTextField telefonoDeCasa = new JTextField();
    JTextField telefonoMovil = new JTextField();
    
    JLabel label0 = new JLabel("Número De Identidad: ");
    JLabel label1 = new JLabel("Primer Nombre: ");
    JLabel label2 = new JLabel("Primer Apellido: ");
    JLabel label3 = new JLabel("Segundo Apellido: ");
    JLabel label4 = new JLabel("Telefono Fijo: ");
    JLabel label5 = new JLabel("Telefono Movil: ");
    
    public Captacion() {
        
        this.setBounds(0, 0, 1200, 600);
        this.setLayout(null);        
        //this.setBackground(Color.BLACK);        
        ubicarElementos1();
    }
    
    public void ubicarElementos1(){
        
        this.label0.setBounds(10, 10, 150, 50);
        //this.label0.setForeground(Color.WHITE);
        this.add(this.label0);
        this.numeroIdentidad.setBounds(155, 10, 100, 50);
        this.add(this.numeroIdentidad);
        
        
    }
    
    
    
    
}
