
package controlador;

import java.awt.Dimension;
import modelo.Casilla;
import modelo.Juego1;
import modelo.PanelJugador;
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
    private Juego1 nuevoJuego1 = new Juego1();
    
    public Controlador(VentanaPrincipal ventanaJuego) {
        
        this.ventanaJuego = ventanaJuego;
    }
    
    public void ajustesVentana(){
        
        this.ventanaJuego.setSize(1300, 700);
        this.ventanaJuego.setTitle("BATALLA NAVAL");
        this.ventanaJuego.setResizable(false);
        this.ventanaJuego.setLocationRelativeTo(null);              

    }
    
    public void iniciarJuego(){
        
        ajustesVentana();
        agregarPanelesConSusMatrices();
        
        
    }
    
    public void agregarPanelesConSusMatrices(){
        
        this.panelUsuario.agregarMatriz1();
        this.ventanaJuego.agregarPanel(panelUsuario);
        this.panelMaquina.agregarMatriz1();
        this.ventanaJuego.agregarPanel(panelMaquina);
    }
    
}
