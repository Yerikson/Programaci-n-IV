
package modelo;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Juego1 {

    public Juego1() {
        
    }
    
    
    public Casilla [] [] agregarAtributosCasillas(){
        
        Casilla auxCasilla = new Casilla();
        Casilla [] [] nuevaMatriz = new Casilla [15] [15];
        int ancho = 42;
        int alto = 44;
        int posicionX = 0;
        int posicionY = 0;
        
        for (int i = 0; i < 15; i++) {
            
            for (int j = 0; j < 15; j++) {
                
                auxCasilla.setBounds(posicionX, posicionY, ancho, alto);
                nuevaMatriz[i][j] = auxCasilla;
                //nuevaMatriz[i][j].setBounds(posicionX, posicionY, ancho, alto);
                posicionX = posicionX + ancho;              
                
                //panelJugador.add(nuevaMatriz[i][j]);
                //panelJugador.repintarPanel();
            }
            
            posicionX = 0;
            posicionY = posicionY + alto;
        }
        
        
        return nuevaMatriz;
                
        
    }
}
