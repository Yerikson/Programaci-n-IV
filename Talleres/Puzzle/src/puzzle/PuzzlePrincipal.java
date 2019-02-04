
package puzzle;

import controlador.ControladorJ;
import vista.VentanaUsuario;

/**
 *
 * @author USER
 */
public class PuzzlePrincipal {
    
    public static void main(String[] args) {
        
        VentanaUsuario ventana = new VentanaUsuario();
        ControladorJ nuevoJuego = new ControladorJ(ventana);
        nuevoJuego.iniciar();
        ventana.setVisible(true);
    }
}
