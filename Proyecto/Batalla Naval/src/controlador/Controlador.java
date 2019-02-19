
package controlador;




import modelo.PanelMenu;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import modelo.PanelJugador;
import modelo.PanelRetorno;
import vista.VentanaPrincipal;

/**
 *
 * @author USER
 */
public class Controlador {
    
    private VentanaPrincipal ventanaJuego;
    public PanelJugador panelUsuario = new PanelJugador(0);
    public PanelJugador panelMaquina = new PanelJugador(1);
    public PanelRetorno nuevoPanelR = new PanelRetorno();
    private PanelMenu menuNuevo = new PanelMenu();
    
    public Controlador(VentanaPrincipal ventanaJuego) {
        
        this.ventanaJuego = ventanaJuego;
    }
    
    public void ajustesVentana(){
        
        this.ventanaJuego.setSize(1350, 700);
        this.ventanaJuego.setTitle("BATALLA NAVAL");
        this.ventanaJuego.setResizable(false);
        this.ventanaJuego.setLocationRelativeTo(null);              

    }
    
    public void iniciarJuego(){
        
        ajustesVentana();
        eventosBotonesMenu();
        this.ventanaJuego.agregarPanel(menuNuevo);
        
    }
    
    public void agregarPanelesConSusMatrices(){
        
        this.panelUsuario.crearMatrizYUbicarBarcos(0, panelUsuario);
        this.ventanaJuego.agregarPanel(panelUsuario);
        this.panelMaquina.crearMatrizYUbicarBarcos(1, panelUsuario);          
        this.ventanaJuego.agregarPanel(panelMaquina);
        this.ventanaJuego.agregarPanel(nuevoPanelR);
        this.panelMaquina.mostrarNumeroBarcosOcultos();
        
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
        
        ActionListener botonAcercaDe = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showMessageDialog(null,"\nAutor: Yerikson Stanly"
                + " Clavijo Martinez\n" + "Realizado: Febrero 2019\n"
                + "Persona A Cargo Del Diseño De Los Iconos De Los Barcos: "
                + "Daniel Serna");
                                
            }
        };    
        this.menuNuevo.acercaDe.addActionListener(botonAcercaDe);
        
        ActionListener botonAyuda = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showMessageDialog(null,"Batalla naval es un juego"
                +" para el cual se dispondran de dos tableros de los"
                + " cuales el izquierdo contendra los barcos del usuario, "
                + "visibles para este nada más;\ny el de la derecha contiene"
                + " los barcos de la máquina totalmente ocultos para el"
                + " usuario, la máquina tampoco puede observar los barcos "
                + "del usuario." + "\n1.El juego consiste en dado un número" +
                  " determinado e igual de disparos tanto para el usuario"
                + " como para la maquina estos intentaran hundir el mayor"
                + " número \nposible de barcos del rival y al agotarsen"
                + " los disparos para los dos jugadores ganara quien más"
                + " barcos haya logrado hundir." + "\n2.Tanto para el"
                + " usuario como para la máquina hay igual número de"
                + " barcos pequeños (es decir de una sola casilla) e"
                + " igual número de barcos grandes (de dos "
                + "casillas)"
                + " estos ");
                                
            }
        };    
        this.menuNuevo.ayuda.addActionListener(botonAyuda);
        
        ActionListener botonSalir = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
                
            }
        };
        this.menuNuevo.salir.addActionListener(botonSalir);
        
    }
    
    

    
}
