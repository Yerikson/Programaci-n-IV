
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class PanelJugador extends JPanel{
    
    private ImageIcon nueImage = new ImageIcon("FondoAgua.jpg");
    
    public PanelJugador(int tipoJugador) {

        this.setLayout(new GridLayout(15, 15));
                
        if (tipoJugador == 0) {
            
            this.setBounds(10, 5, 630, 660);
            this.setBackground(Color.BLUE);
        
        }else{
            
            this.setBounds(655, 5, 630, 660);
            this.setBackground(Color.BLUE);
        }
                                  
    }

   /* public void paint(Graphics g){
        
        g.drawImage(nueImage.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
    }*/
    
    public void repintarPanel(){
        
        this.validate();
        this.repaint();
    }
    
    
    public void agregarMatriz1(){
        
        OyenteDeMouseCasillas oyenteMouse = new OyenteDeMouseCasillas();
        Casilla [] [] nuevaMatriz = new Casilla [15] [15];
        int ancho = 42;
        int alto = 44;
        
        for (int i = 0; i < 15; i++) {
            
            for (int j = 0; j < 15; j++) {
                //ImageIcon nueImage = new ImageIcon("FondoAgua.jpg");               
                Casilla auxCasilla = new Casilla();
                auxCasilla.setSize(ancho, alto);                
                nuevaMatriz[i][j] = auxCasilla; 
                //nuevaMatriz[i][j].setIcon(new ImageIcon(nueImage.getImage().getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                nuevaMatriz[i][j].addMouseListener(oyenteMouse);
                this.add(nuevaMatriz[i][j]);
                this.repintarPanel();

            }
            
        }
    }
}
