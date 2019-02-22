
package controlador;

import javax.swing.JPanel;
import vista.Menu;
import vista.MontoYFechaActual;
import vista.VentanaUsuario;

/**
 *
 * @author USER
 */
public class Controlador1 {
    
    private VentanaUsuario nuevaVentana;
    private Menu nuevoMenu = new Menu();
    private MontoYFechaActual nuevoMiniPanel = new MontoYFechaActual();
    
    public Controlador1(VentanaUsuario nuevaVentana) {
        
        this.nuevaVentana = nuevaVentana;
        
    }
    
    public void iniciarVentana(){
        
        this.nuevaVentana.setSize(1200, 700);
        this.nuevaVentana.setTitle("PRESTAMOS");
        this.nuevaVentana.setResizable(false);
        this.nuevaVentana.setLocationRelativeTo(null);
    }
    
    public void agregarPanelAVentana(JPanel nuevo){
        
        this.nuevaVentana.add(nuevo);
    }
    
    public void iniciarSistema(){
        
        this.iniciarVentana();
        this.agregarPanelAVentana(nuevoMenu);
        this.agregarPanelAVentana(nuevoMiniPanel);
    }
    
    
    
}
