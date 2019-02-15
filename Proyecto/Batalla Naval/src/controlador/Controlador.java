
package controlador;




import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private PanelMenu menuNuevo = new PanelMenu();
    
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
        //agregarPanelesConSusMatrices();
        eventosBotonesMenu();
        this.ventanaJuego.agregarPanel(menuNuevo);
        
    }
    
    public void agregarPanelesConSusMatrices(){
        
        this.panelUsuario.agregarMatriz1();
        this.ventanaJuego.agregarPanel(panelUsuario);
        this.panelMaquina.agregarMatriz1();
        this.ventanaJuego.agregarPanel(panelMaquina);
    }
    
    public void eventosBotonesMenu(){
        ActionListener botonJugar = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                menuNuevo.sonidoMenu.stop();
                menuNuevo.setVisible(false);
                agregarPanelesConSusMatrices();
                
            }
        };
        this.menuNuevo.jugar.addActionListener(botonJugar);
    }
}
