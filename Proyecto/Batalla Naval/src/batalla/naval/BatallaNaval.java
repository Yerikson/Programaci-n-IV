
package batalla.naval;

import controlador.Controlador;
import vista.VentanaPrincipal;

/**
 *
 * @author USER
 */
public class BatallaNaval {

    public static void main(String[] args) {
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        Controlador nuevoJuego = new Controlador(ventana);
        nuevoJuego.iniciarJuego();
        ventana.setVisible(true);
    }
    
}
