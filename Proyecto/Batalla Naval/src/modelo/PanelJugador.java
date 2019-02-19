
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
       // Casilla [] [] iconMarMatriz = new Casilla [15] [15];
        //iconDefectoMar(tipoUsuario, iconMarMatriz);
        iconDefectoMar(tipoUsuario);
    }
    
    //public void iconDefectoMar(int tipeUser, Casilla [] [] iconMarMatriz )
    public void iconDefectoMar(int tipeUser){
        
        int auxNumero = 1;
        
        for (int i = 0; i < 15; i++) {
            
            for (int j = 0; j < 15; j++) {
                
                Casilla auxCasilla1 = new Casilla();
                auxCasilla1.setSize(auxCasilla1.getAncho()
                        , auxCasilla1.getAlto());
                /*
                iconMarMatriz [i][j] = auxCasilla1;
                iconMarMatriz [i][j].setNumeroCasilla(auxNumero);                
                iconMarMatriz [i][j].setContenidoCasilla(0);
                iconMarMatriz [i][j].setNumeroFila(i);
                iconMarMatriz [i][j].setNumeroColumna(j);*/
                
                barcosMatriz [i][j] = auxCasilla1;
                barcosMatriz [i][j].setNumeroCasilla(auxNumero);                
                barcosMatriz [i][j].setContenidoCasilla(0);
                barcosMatriz [i][j].setNumeroFila(i);
                barcosMatriz [i][j].setNumeroColumna(j);
                
                
                auxNumero = auxNumero + 1;
                if (tipeUser == 1) {
                    
                    agregarOyente1(i,j);     
                    //barcosMatriz [i][j].agregarOyente();
                    //iconMarMatriz [i][j].agregarOyente();
                }
                
                
            }
            
        }
        ubicarYDistribuirBarcos();
        //ubicarYDistribuirBarcos(iconMarMatriz);
        
    }
    //public void ubicarYDistribuirBarcos(Casilla [] [] barcosMatriz)
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
                    
                    barcosMatriz [fila][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoGrandeHA().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                   
                    barcosMatriz [fila][columna].setContenidoCasilla(3);
                    
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
                    
                    barcosMatriz [fila][columna]
                            .setIcon(new ImageIcon(auxCasilla2
                        .getBarcoGrandeVA().getImage()
                        .getScaledInstance(42, 44, Image.SCALE_SMOOTH)));
                    
                    barcosMatriz [fila][columna].setContenidoCasilla(9);
                    
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
                        
        //agregarMatriz(barcosMatriz);
        agregarMatriz();
        
    }
    //public void agregarMatriz(Casilla [] [] iconMarMatriz)
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
                        
                        barcosMatriz[fila][columna].cambiarIcono(0);
                        //cambiarIcono(0); 
                        System.out.println("Soy La Casilla Número: " + barcosMatriz[fila][columna].getNumeroCasilla());
                    }
                    //Dispararle a una casilla con barco pequeño
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 1){
                        
                        barcosMatriz[fila][columna].cambiarIcono(1);              
                        System.out.println("Soy La Casilla Número: " + barcosMatriz[fila][columna].getNumeroCasilla());
                        
                    }
                    //Dispararle a una casilla con la parte trasera barco grande horizontal
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 3){
                        
                        if (barcosMatriz[fila][columna + 1].getContenidoCasilla() == 6) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(5);  
                            barcosMatriz[fila][columna + 1].cambiarIcono(6);
                            System.out.println("Soy La Casilla Número: " + barcosMatriz[fila][columna].getNumeroCasilla());
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(3);
                        }                        
                    }
                    //Dispararle a una casilla con la parte delantera barco grande horizontal
                    if (barcosMatriz[fila][columna].getContenidoCasilla() == 4){
                        
                        if (barcosMatriz[fila][columna - 1].getContenidoCasilla() == 5) {
                            
                            barcosMatriz[fila][columna].cambiarIcono(6);  
                            barcosMatriz[fila][columna - 1].cambiarIcono(5);
                            System.out.println("Soy La Casilla Número: " + barcosMatriz[fila][columna].getNumeroCasilla());
                        } else {
                            barcosMatriz[fila][columna].cambiarIcono(4);
                        }                        
                    }
                    
                }
            }

        };
        barcosMatriz[fila][columna].addMouseListener(oyenteRaton);                
        
    }
}
