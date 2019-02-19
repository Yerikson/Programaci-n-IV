
package modelo;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class PanelJugador extends JPanel{   
    
    private Image fond;
    public Casilla [] [] barcosMatriz = new Casilla [15] [15];
    
    public PanelJugador(int tipoJugador) {        
        
        PreInit();
        initComponent();
        this.setLayout(new GridLayout(15, 15));
                
        if (tipoJugador == 0) {
            
            this.setBounds(0, 1, 600, 665);

        
        }else{
            
            this.setBounds(601, 1, 600, 665);

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
    

    public void crearMatrizYUbicarBarcos(int tipoUsuario){
        iconDefectoMar(tipoUsuario);
    }
    
    public void iconDefectoMar(int tipeUser){
        
        int auxNumero = 1;
        
        for (int i = 0; i < 15; i++) {
            
            for (int j = 0; j < 15; j++) {
                
                Casilla auxCasilla1 = new Casilla();
                auxCasilla1.setSize(auxCasilla1.getAncho()
                        , auxCasilla1.getAlto());
                
                barcosMatriz [i][j] = auxCasilla1;
                barcosMatriz [i][j].setNumeroCasilla(auxNumero);                
                barcosMatriz [i][j].setContenidoCasilla(0);
                barcosMatriz [i][j].setNumeroFila(i);
                barcosMatriz [i][j].setNumeroColumna(j);
                                
                auxNumero = auxNumero + 1;
                if (tipeUser == 1) {
                    
                    agregarOyente1(i,j);     

                }
                                
            }
            
        }
        ubicarYDistribuirBarcos();
        
    }

    public void ubicarYDistribuirBarcos(){
        
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
            
            //Dirección Horizontal
            if (direccion == 0) {
                
                if (barcosMatriz[fila][columna].getContenidoCasilla() == 0 
                        && columna <= 13 && barcosMatriz[fila][columna + 1]
                                .getContenidoCasilla() == 0) {
                    
                    //Parte Trasera
                    barcosMatriz [fila][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoGrandeHA().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                   
                    barcosMatriz [fila][columna].setContenidoCasilla(3);
                    
                    //Parte Delantera
                    barcosMatriz [fila][columna + 1]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoGrandeHD().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila][columna + 1].setContenidoCasilla(4);
                    
                    
                } else {
                    i = i - 1;
                }
                               
            } else {
                //Dirección Vertical
                if (barcosMatriz[fila][columna].getContenidoCasilla() == 0 
                        && fila <= 13 && barcosMatriz[fila + 1][columna]
                                .getContenidoCasilla() == 0) {
                    
                    //Parte Trasera
                    barcosMatriz [fila][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoGrandeVA().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila][columna].setContenidoCasilla(9);
                    //Parte Delantera
                    barcosMatriz [fila + 1][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoGrandeVD().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila + 1][columna].setContenidoCasilla(10);
                    
                    
                } else {
                    i = i - 1;
                }
                
            }                        
            
        }
        
        //Ubicar Barcos Muy Grandes (Tamaño 3)
        for (int i = 0; i < 2; i++) {
            
            direccion = direccion1.nextInt(2);
            fila = fila1.nextInt(15);
            columna = columna1.nextInt(15);
            
            //Dirección Horizontal
            if (direccion == 0) {
                
                if (barcosMatriz[fila][columna].getContenidoCasilla() == 0 
                        && columna <= 12 && barcosMatriz[fila][columna + 1]
                                .getContenidoCasilla() == 0 
                        && barcosMatriz[fila][columna + 2]
                                .getContenidoCasilla() == 0 ) {
                    
                    //Parte Trasera
                    barcosMatriz [fila][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoMuyGrandeHA().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                   
                    barcosMatriz [fila][columna].setContenidoCasilla(15);
                    
                    //Parte Media
                    barcosMatriz [fila][columna + 1]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoMuyGrandeHC().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila][columna + 1].setContenidoCasilla(16);
                    
                    //Parte Delantera
                    barcosMatriz [fila][columna + 2]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoMuyGrandeHD().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila][columna + 2].setContenidoCasilla(17);
                    
                    
                } else {
                    i = i - 1;
                }
                               
            } else {
                //Dirección Vertical
                if (barcosMatriz[fila][columna].getContenidoCasilla() == 0 
                        && fila <= 12 && barcosMatriz[fila + 1][columna]
                                .getContenidoCasilla() == 0 
                        && barcosMatriz[fila + 2][columna]
                                .getContenidoCasilla() == 0) {
                    
                    //Parte Trasera
                    barcosMatriz [fila][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoMuyGrandeVA().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                   
                    barcosMatriz [fila][columna].setContenidoCasilla(24);
                    
                    //Parte Media
                    barcosMatriz [fila + 1][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoMuyGrandeVC().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila + 1][columna].setContenidoCasilla(25);
                    
                    //Parte Delantera
                    barcosMatriz [fila + 2][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoMuyGrandeVD().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila + 2][columna].setContenidoCasilla(26);
                    
                    
                } else {
                    i = i - 1;
                }
                
            }   
            
        }
        
        //Ubicar Barcos Enormes (Tamaño 4)
        for (int i = 0; i < 1; i++) {
            
            direccion = direccion1.nextInt(2);
            fila = fila1.nextInt(15);
            columna = columna1.nextInt(15);
            
            //Dirección Horizontal
            if (direccion == 0) {
                
                if (barcosMatriz[fila][columna].getContenidoCasilla() == 0 
                        && columna <= 11 && barcosMatriz[fila][columna + 1]
                                .getContenidoCasilla() == 0 
                        && barcosMatriz[fila][columna + 2]
                                .getContenidoCasilla() == 0 
                        && barcosMatriz[fila][columna + 3]
                                .getContenidoCasilla() == 0) {
                    
                    //Parte Trasera
                    barcosMatriz [fila][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoEnormeHA().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                   
                    barcosMatriz [fila][columna].setContenidoCasilla(33);
                    
                    //Parte Media
                    barcosMatriz [fila][columna + 1]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoEnormeHC1().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila][columna + 1].setContenidoCasilla(34);
                    
                    //Parte Media2
                    barcosMatriz [fila][columna + 2]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoEnormeHC2().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila][columna + 2].setContenidoCasilla(35);
                    
                    //Parte Delantera
                    barcosMatriz [fila][columna + 3]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoEnormeHD().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila][columna + 3].setContenidoCasilla(36);
                    
                    
                } else {
                    i = i - 1;
                }
                               
            } else {
                //Dirección Vertical
                if (barcosMatriz[fila][columna].getContenidoCasilla() == 0 
                        && fila <= 11 && barcosMatriz[fila + 1][columna]
                                .getContenidoCasilla() == 0 
                        && barcosMatriz[fila + 2][columna]
                                .getContenidoCasilla() == 0 
                        && barcosMatriz[fila + 3][columna]
                                .getContenidoCasilla() == 0) {
                    
                    //Parte Trasera
                    barcosMatriz [fila][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoEnormeVA().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                   
                    barcosMatriz [fila][columna].setContenidoCasilla(45);
                    
                    //Parte Media
                    barcosMatriz [fila + 1][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoEnormeVC1().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila + 1][columna].setContenidoCasilla(46);
                    
                    //Parte Media2
                    barcosMatriz [fila + 2][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoEnormeVC2().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila + 2][columna].setContenidoCasilla(47);
                    
                    //Parte Delantera
                    barcosMatriz [fila + 3][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoEnormeVD().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila + 3][columna].setContenidoCasilla(48);
                    
                    
                } else {
                    i = i - 1;
                }
                
            }   
            
        }
        
        agregarMatriz();
        
    }

    public void agregarMatriz(){
        
        for (int i = 0; i < 15; i++) {
            
            for (int j = 0; j < 15; j++) {
                this.add(barcosMatriz[i][j]);
                this.repintarPanel();
            }
        }
        
    }
    
       public void agregarOyente1(int fila, int columna){
        
        MouseAdapter oyenteRaton = new MouseAdapter() {
        
            public void mouseClicked(MouseEvent e){
        
                
                if (e.getClickCount() == 2) {
                    //Dispararle a una casilla con agua
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 0){                        
                       
                        barcosMatriz[fila][columna].cambiarIcono(0, 1);
                       
                       
                    }
                    //Dispararle a una casilla con barco pequeño
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 1){
                        
                        barcosMatriz[fila][columna].cambiarIcono(1, 1);              
                       
                        
                    }
                    //Dispararle a una casilla con la parte trasera barco grande horizontal
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 3){
                        
                        if (barcosMatriz[fila][columna + 1].getContenidoCasilla() == 6) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(5, 1);  
                            barcosMatriz[fila][columna + 1].cambiarIcono(6, 2);
                           
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(3, 1);
                        }                        
                    }
                    //Dispararle a una casilla con la parte delantera barco grande horizontal
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 4){
                        
                        if (barcosMatriz[fila][columna - 1].getContenidoCasilla() == 5) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(6, 1);  
                            barcosMatriz[fila][columna - 1].cambiarIcono(5, 2);
                            
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(4, 1);
                        }                        
                    }
                    
    
                    //Dispararle a una casilla con la parte trasera barco grande vertical
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 9){
                        
                        if (barcosMatriz[fila + 1][columna].getContenidoCasilla() == 12) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(11, 1);  
                            barcosMatriz[fila + 1][columna].cambiarIcono(12, 2);
                           
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(9, 1);
                        }                        
                    }
                    //Dispararle a una casilla con la parte delantera barco grande vertical
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 10){
                        
                        if (barcosMatriz[fila - 1][columna].getContenidoCasilla() == 11) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(12, 1);  
                            barcosMatriz[fila - 1][columna].cambiarIcono(11, 2);
                            
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(10, 1);
                        }                        
                    }
                    
                    //Dispararle a una casilla con la parte trasera barco muy grande horizontal
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 15){
                        
                        if (barcosMatriz[fila][columna + 1]
                                .getContenidoCasilla() == 19
                                && barcosMatriz[fila][columna + 2]
                                        .getContenidoCasilla() == 20) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(18, 1);  
                            barcosMatriz[fila][columna + 1].cambiarIcono(19, 2);
                            barcosMatriz[fila][columna + 2].cambiarIcono(20, 2);
                           
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(15, 1);
                        }                        
                    }
                    //Dispararle a una casilla con la parte media barco muy grande horizontal
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 16){
                        
                        if (barcosMatriz[fila][columna - 1]
                                .getContenidoCasilla() == 18
                                && barcosMatriz[fila][columna + 1]
                                        .getContenidoCasilla() == 20) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(19, 1);  
                            barcosMatriz[fila][columna - 1].cambiarIcono(18, 2);
                            barcosMatriz[fila][columna + 1].cambiarIcono(20, 2);
                            
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(16, 1);
                        }                        
                    }
                    //Dispararle a una casilla con la parte delantera barco muy grande horizontal
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 17){
                        
                        if (barcosMatriz[fila][columna - 1]
                                .getContenidoCasilla() == 19
                                && barcosMatriz[fila][columna - 2]
                                        .getContenidoCasilla() == 18) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(20, 1);  
                            barcosMatriz[fila][columna - 1].cambiarIcono(19, 2);
                            barcosMatriz[fila][columna - 2].cambiarIcono(18, 2);
                            
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(17, 1);
                        }                        
                    }
                     
                    //Dispararle a una casilla con la parte trasera barco muy grande vertical
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 24){
                        
                        if (barcosMatriz[fila + 1][columna]
                                .getContenidoCasilla() == 28
                                && barcosMatriz[fila + 2][columna]
                                        .getContenidoCasilla() == 29) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(27, 1);  
                            barcosMatriz[fila + 1][columna].cambiarIcono(28, 2);
                            barcosMatriz[fila + 2][columna].cambiarIcono(29, 2);
                           
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(24, 1);
                        }                        
                    }
                    //Dispararle a una casilla con la parte media barco muy grande horizontal
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 25){
                        
                        if (barcosMatriz[fila - 1][columna]
                                .getContenidoCasilla() == 27
                                && barcosMatriz[fila + 1][columna]
                                        .getContenidoCasilla() == 29) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(28, 1);  
                            barcosMatriz[fila - 1][columna].cambiarIcono(27, 2);
                            barcosMatriz[fila + 1][columna].cambiarIcono(29, 2);
                            
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(25, 1);
                        }                        
                    }
                    //Dispararle a una casilla con la parte delantera barco muy grande vertical
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 26){
                        
                        if (barcosMatriz[fila - 1][columna]
                                .getContenidoCasilla() == 28
                                && barcosMatriz[fila - 2][columna]
                                        .getContenidoCasilla() == 27) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(29, 1);  
                            barcosMatriz[fila - 1][columna].cambiarIcono(28, 2);
                            barcosMatriz[fila - 2][columna].cambiarIcono(27, 2);
                            
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(26, 1);
                        }                        
                    }
                    
                    
                }
            }

        };
        barcosMatriz[fila][columna].addMouseListener(oyenteRaton);                
        
    }
}
