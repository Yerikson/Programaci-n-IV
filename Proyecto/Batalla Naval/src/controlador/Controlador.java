
package controlador;

import java.awt.Dimension;
import modelo.Casilla;
import vista.VentanaPrincipal;

/**
 *
 * @author USER
 */
public class Controlador {
    
    private VentanaPrincipal ventanaJuego;
    private PanelJugador panelUsuario = new PanelJugador(0);
    private PanelJugador panelMaquina = new PanelJugador(1);
    private Casilla [] [] matrizCasillasUsuario = new Casilla [15] [15];
    
    public Controlador(VentanaPrincipal ventanaJuego) {
        
        this.ventanaJuego = ventanaJuego;
    }
    
    public void ajustesVentana(){
        
        this.ventanaJuego.setSize(1300, 700);
        this.ventanaJuego.setTitle("BATALLA NAVAL");
        this.ventanaJuego.setResizable(false);
        this.ventanaJuego.setLocationRelativeTo(null);
        this.ventanaJuego.agregarPanel(panelUsuario);
        this.ventanaJuego.agregarPanel(panelMaquina);
        /*
        ventanaPrincipal.setSize(1000, 728);
        ventanaPrincipal.setTitle("PUZZLE");
        ventanaPrincipal.agregarPanelFichas(fichasJuego);  
        ventanaPrincipal.setLocationRelativeTo(null);
        */
    }
    
    public void iniciarJuego(){
        
        ajustesVentana();
        
        
    }
    
}
