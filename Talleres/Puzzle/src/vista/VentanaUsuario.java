
package vista;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.Ficha;

/**
 *
 * @author USER
 */
public class VentanaUsuario extends JFrame {

    private PanelVistas fichasP = new PanelVistas();
    
    public VentanaUsuario(){
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void agregarPanelFichas(ArrayList<Ficha> fichasOrdenadas){
        
        fichasP.crearEspaciosFichas(fichasOrdenadas);
        this.add(fichasP);
    }
    
    public void agregarImagenesPanelFichas(ArrayList<Ficha> fichasOrdenadas){
        
        fichasP.agregarImagenesEspaciosFichas(fichasOrdenadas);
    }
    
    public void moverFichaPanelFichas(int opcionMovimiento, int posF16){
        
        fichasP.moverFicha(opcionMovimiento, posF16);
                
    }
    public void agregarPanelExterno(JPanel nuevoPanel){
        this.add(nuevoPanel);
        
    }
}
