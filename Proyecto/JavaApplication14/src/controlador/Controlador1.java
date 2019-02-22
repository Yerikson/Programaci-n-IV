
package controlador;

import vista.VentanaUsuario;

/**
 *
 * @author USER
 */
public class Controlador1 {
    
    private VentanaUsuario nuevaVentana;

    public Controlador1(VentanaUsuario nuevaVentana) {
        
        this.nuevaVentana = nuevaVentana;
        
    }
    
    public void iniciarVentana(){
        
        this.nuevaVentana.setSize(1200, 700);
        this.nuevaVentana.setTitle("PRESTAMOS");
        this.nuevaVentana.setResizable(false);
        this.nuevaVentana.setLocationRelativeTo(null);
    }
    
    public void iniciarSistema(){
        
        this.iniciarVentana();
        
    }
    
    
    
}
