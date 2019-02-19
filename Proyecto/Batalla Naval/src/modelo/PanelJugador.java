
package modelo;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class PanelJugador extends JPanel{   
    
    private Image fond;
    private int numeroAleatorio;
    
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
        fond = new ImageIcon("FondoAgua1.jpg").getImage();
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
    
    ///
    public void crearMatrizYUbicarBarcos(int tipoUsuario){
        Casilla [] [] iconMarMatriz = new Casilla [15] [15];
        iconDefectoMar(tipoUsuario, iconMarMatriz);
    }
    
    public void iconDefectoMar(int tipeUser, Casilla [] [] iconMarMatriz ){
        
        int auxNumero = 1;
        
        for (int i = 0; i < 15; i++) {
            
            for (int j = 0; j < 15; j++) {
                
                Casilla auxCasilla1 = new Casilla();
                auxCasilla1.setSize(auxCasilla1.getAncho()
                        , auxCasilla1.getAlto());
                iconMarMatriz [i][j] = auxCasilla1;
                iconMarMatriz [i][j].setNumeroCasilla(auxNumero);                
                iconMarMatriz [i][j].setContenidoCasilla(0);
                iconMarMatriz [i][j].setNumeroFila(i);
                iconMarMatriz [i][j].setNumeroColumna(j);
                auxNumero = auxNumero + 1;
                if (tipeUser == 1) {
                                        
                    iconMarMatriz [i][j].agregarOyente();
                }
                
                
            }
            
        }
        ubicarYDistribuirBarcos(iconMarMatriz);
        //agregarMatriz(iconMarMatriz);
        
    }
    
    public void ubicarYDistribuirBarcos(Casilla [] [] barcosMatriz){
        
        Casilla auxCasilla2 = new Casilla();
        int fila;
        int columna;
        int direccion;
        Random fila1 = new Random();
        Random columna1 = new Random();
        Random direccion1 = new Random();
        
        //Ubicar Barcos Pequeños (Tamaño 1)
        for (int i = 0; i < 6; i++) {
            
            fila = fila1.nextInt(15);
            columna = columna1.nextInt(15);
            
            if (barcosMatriz[fila][columna].getContenidoCasilla() == 0) {
                
                barcosMatriz [fila][columna].setIcon(new ImageIcon(auxCasilla2
                        .getBarcoPequeño().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                barcosMatriz [fila][columna].setContenidoCasilla(1);
                
            } else {
                i = i - 1;
            }            
        }
        
        //Ubicar Barcos Grandes (Tamaño 2)
        for (int i = 0; i < 4; i++) {
            
            direccion = direccion1.nextInt(2);
            fila = fila1.nextInt(15);
            columna = columna1.nextInt(15);
            
            if (direccion == 0) {
                
            } else {
            }
            
            
            
        }
        
        
        
        agregarMatriz(barcosMatriz);
        
        
    }
    public void agregarMatriz(Casilla [] [] iconMarMatriz){
        
        for (int i = 0; i < 15; i++) {
            
            for (int j = 0; j < 15; j++) {
                this.add(iconMarMatriz[i][j]);
                this.repintarPanel();
            }
        }
        
    }
    
    /*
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
    }*/
}
