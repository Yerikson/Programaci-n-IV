
package modelo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author USER
 */
public class OyenteDeMouseCasillas extends MouseAdapter{
    
    
    public void mouseClicked(MouseEvent e){
        
        if (e.getClickCount() == 2) {
            
            System.out.println("Hola Mundo");
            
        }
    }
}
