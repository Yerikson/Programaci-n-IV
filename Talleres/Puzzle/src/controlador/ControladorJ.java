
package controlador;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import modelo.Ficha;
import modelo.Juego;
import vista.VentanaUsuario;

/**
 *
 * @author USER
 */
public class ControladorJ {
    
    private VentanaUsuario ventanaPrincipal;
    private Juego nuevoJuego = new Juego();
    private ArrayList<Ficha> fichasOrdenCorrecto = new ArrayList<Ficha>();
    
    public ControladorJ( VentanaUsuario ventana){
        
        this.ventanaPrincipal = ventana;        
        
    }
    
    public void iniciar(){
                
        obtenerFichas();  
        iniciarVentana(); 
        ubicarFichasDesordenadas();
        ventanaPrincipal.agregarImagenesPanelFichas(fichasOrdenCorrecto);
       
       
    }
    
    public void iniciarVentana(){
        
        ventanaPrincipal.setSize(1000, 728);
        ventanaPrincipal.setTitle("PUZZLE");
        ventanaPrincipal.agregarPanelFichas(fichasOrdenCorrecto);  
        ventanaPrincipal.setLocationRelativeTo(null);
        
    }
    public void obtenerFichas(){
        
        this.fichasOrdenCorrecto = nuevoJuego.crearFichas(); 
    }
    
    public void ubicarFichasDesordenadas(){
        ArrayList<Ficha> Aux1 = new ArrayList<Ficha>();
        Aux1 = fichasOrdenCorrecto;
        Aux1.remove(15);
        this.fichasOrdenCorrecto = nuevoJuego.desordenarFichas(Aux1);
        Ficha nuevaFicha16 = new Ficha(16, new ImageIcon("Imagen16.png"), 484, 514);
        fichasOrdenCorrecto.add(nuevaFicha16);

    }
}
