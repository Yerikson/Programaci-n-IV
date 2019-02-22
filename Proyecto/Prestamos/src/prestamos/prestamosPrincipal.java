
package prestamos;

import controlador.Controlador1;
import vista.VentanaUsuario;

/**
 *
 * @author USER
 */
public class prestamosPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VentanaUsuario ventana = new VentanaUsuario();
        Controlador1 nuevoComienzo = new Controlador1(ventana);
        nuevoComienzo.iniciarSistema();
        ventana.setVisible(true);
    }
    
}
