
package modelo;

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
    
    private Image fond;
    
    public PanelJugador(int tipoJugador) {        
        
        PreInit();
        initComponent();
        this.setLayout(new GridLayout(15, 15));
                
        if (tipoJugador == 0) {
            
            this.setBounds(10, 5, 630, 660);

        
        }else{
            
            this.setBounds(655, 5, 630, 660);

        }
                                  
    }
        
    private void PreInit() {
        fond = new ImageIcon("FondoAgua.jpg").getImage();
    }

    private void initComponent() {

    }

    public void paintBorder (Graphics g){
        super.paintComponent(g);
        g.drawImage(fond,0,0, this.getWidth(), this.getHeight(), this);
    }

    
    public void repintarPanel(){
        
        this.validate();
        this.repaint();
    }
    
    
    public void agregarMatriz1(){
        
        Casilla [] [] nuevaMatriz = new Casilla [15] [15];
        int ancho = 42;
        int alto = 44;
        
        for (int i = 0; i < 15; i++) {
            
            for (int j = 0; j < 15; j++) {                    
                Casilla auxCasilla = new Casilla();               
                auxCasilla.setSize(ancho, alto);                
                nuevaMatriz[i][j] = auxCasilla; 
                nuevaMatriz[i][j].setIcon(new ImageIcon(auxCasilla.getBarcoPequeño().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));              
                this.add(nuevaMatriz[i][j]);
                this.repintarPanel();

            }
            
        }
    }
}
