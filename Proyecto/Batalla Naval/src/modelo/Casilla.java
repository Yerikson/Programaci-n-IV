
package modelo;

import java.applet.AudioClip;
import java.awt.Color;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author USER
 */
public class Casilla extends JButton{    

    private AudioClip disparoCañon;
    private AudioClip explosion;
    private AudioClip splash;
    private AudioClip disparoAcertado;
    private int numeroCasilla;
    private int numeroFila;
    private int numeroColumna;
    private int ancho;
    private int alto;
    private int contenidoCasilla;
    private ImageIcon barcoPequeño = new ImageIcon("1.png");
    private ImageIcon barcoPequeñoDestruido = new ImageIcon("2.png");
    //(Tamaño 2)Horizontal
    private ImageIcon barcoGrandeHA = new ImageIcon("3.png");
    private ImageIcon barcoGrandeHD = new ImageIcon("4.png");
    private ImageIcon barcoGrandeHAG = new ImageIcon("5.png");
    private ImageIcon barcoGrandeHDG = new ImageIcon("6.png");
    private ImageIcon barcoGrandeHAD = new ImageIcon("7.png");
    private ImageIcon barcoGrandeHDD = new ImageIcon("8.png");
    //(Tamaño 2)Vertical
    private ImageIcon barcoGrandeVA = new ImageIcon("9.png");
    private ImageIcon barcoGrandeVD = new ImageIcon("10.png");
    private ImageIcon barcoGrandeVAG = new ImageIcon("11.png");
    private ImageIcon barcoGrandeVDG = new ImageIcon("12.png");
    private ImageIcon barcoGrandeVAD = new ImageIcon("13.png");
    private ImageIcon barcoGrandeVDD = new ImageIcon("14.png");
    //(Tamaño 3)Horizontal
    private ImageIcon barcoMuyGrandeHA = new ImageIcon("15.png");
    private ImageIcon barcoMuyGrandeHC = new ImageIcon("16.png");
    private ImageIcon barcoMuyGrandeHD = new ImageIcon("17.png");
    private ImageIcon barcoMuyGrandeHAG = new ImageIcon("18.png");
    private ImageIcon barcoMuyGrandeHCG = new ImageIcon("19.png");
    private ImageIcon barcoMuyGrandeHDG = new ImageIcon("20.png");
    private ImageIcon barcoMuyGrandeHAD = new ImageIcon("21.png");
    private ImageIcon barcoMuyGrandeHCD = new ImageIcon("22.png");
    private ImageIcon barcoMuyGrandeHDD = new ImageIcon("23.png");
    //(Tamaño 3)Vertical
    private ImageIcon barcoMuyGrandeVA = new ImageIcon("24.png");
    private ImageIcon barcoMuyGrandeVC = new ImageIcon("25.png");
    private ImageIcon barcoMuyGrandeVD = new ImageIcon("26.png");
    private ImageIcon barcoMuyGrandeVAG = new ImageIcon("27.png");
    private ImageIcon barcoMuyGrandeVCG = new ImageIcon("28.png");
    private ImageIcon barcoMuyGrandeVDG = new ImageIcon("29.png");
    private ImageIcon barcoMuyGrandeVAD = new ImageIcon("30.png");
    private ImageIcon barcoMuyGrandeVCD = new ImageIcon("31.png");
    private ImageIcon barcoMuyGrandeVDD = new ImageIcon("32.png");
    //(Tamaño 4)Horizontal
    private ImageIcon barcoEnormeHA = new ImageIcon("33.png");
    private ImageIcon barcoEnormeHC1 = new ImageIcon("34.png");
    private ImageIcon barcoEnormeHC2 = new ImageIcon("35.png");
    private ImageIcon barcoEnormeHD = new ImageIcon("36.png");
    private ImageIcon barcoEnormeHAG = new ImageIcon("37.png");
    private ImageIcon barcoEnormeHC1G = new ImageIcon("38.png");
    private ImageIcon barcoEnormeHC2G = new ImageIcon("39.png");
    private ImageIcon barcoEnormeHDG = new ImageIcon("40.png");
    private ImageIcon barcoEnormeHAD = new ImageIcon("41.png");
    private ImageIcon barcoEnormeHC1D = new ImageIcon("42.png");
    private ImageIcon barcoEnormeHC2D = new ImageIcon("43.png");
    private ImageIcon barcoEnormeHDD = new ImageIcon("44.png");
    //(Tamaño 4)Vertical
    private ImageIcon barcoEnormeVA = new ImageIcon("45.png");
    private ImageIcon barcoEnormeVC1 = new ImageIcon("46.png");
    private ImageIcon barcoEnormeVC2 = new ImageIcon("47.png");
    private ImageIcon barcoEnormeVD = new ImageIcon("48.png");
    private ImageIcon barcoEnormeVAG = new ImageIcon("49.png");
    private ImageIcon barcoEnormeVC1G = new ImageIcon("50.png");
    private ImageIcon barcoEnormeVC2G = new ImageIcon("51.png");
    private ImageIcon barcoEnormeVDG = new ImageIcon("52.png");
    private ImageIcon barcoEnormeVAD = new ImageIcon("53.png");
    private ImageIcon barcoEnormeVC1D = new ImageIcon("54.png");
    private ImageIcon barcoEnormeVC2D = new ImageIcon("55.png");
    private ImageIcon barcoEnormeVDD = new ImageIcon("56.png");
    //Imagen Fallo
    private ImageIcon fallo = new ImageIcon("BalaGolpeAgua.jpg");

    public int getNumeroFila() {
        return numeroFila;
    }

    public int getNumeroColumna() {
        return numeroColumna;
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }

    public void setNumeroColumna(int numeroColumna) {
        this.numeroColumna = numeroColumna;
    }
    
    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public ImageIcon getBarcoGrandeHA() {
        return barcoGrandeHA;
    }

    public ImageIcon getBarcoGrandeHD() {
        return barcoGrandeHD;
    }

    public ImageIcon getBarcoGrandeVA() {
        return barcoGrandeVA;
    }

    public ImageIcon getBarcoGrandeVD() {
        return barcoGrandeVD;
    }

    public ImageIcon getBarcoMuyGrandeHA() {
        return barcoMuyGrandeHA;
    }

    public ImageIcon getBarcoMuyGrandeHC() {
        return barcoMuyGrandeHC;
    }

    public ImageIcon getBarcoMuyGrandeHD() {
        return barcoMuyGrandeHD;
    }

    public ImageIcon getBarcoMuyGrandeVA() {
        return barcoMuyGrandeVA;
    }

    public ImageIcon getBarcoMuyGrandeVC() {
        return barcoMuyGrandeVC;
    }

    public ImageIcon getBarcoMuyGrandeVD() {
        return barcoMuyGrandeVD;
    }

    public ImageIcon getBarcoEnormeHA() {
        return barcoEnormeHA;
    }

    public ImageIcon getBarcoEnormeHC1() {
        return barcoEnormeHC1;
    }

    public ImageIcon getBarcoEnormeHC2() {
        return barcoEnormeHC2;
    }

    public ImageIcon getBarcoEnormeHD() {
        return barcoEnormeHD;
    }

    public ImageIcon getBarcoEnormeVA() {
        return barcoEnormeVA;
    }

    public ImageIcon getBarcoEnormeVC1() {
        return barcoEnormeVC1;
    }

    public ImageIcon getBarcoEnormeVC2() {
        return barcoEnormeVC2;
    }

    public ImageIcon getBarcoEnormeVD() {
        return barcoEnormeVD;
    }

    public void setNumeroCasilla(int numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }
       
    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public ImageIcon getBarcoPequeño() {
        return barcoPequeño;
    }
    
    public int getContenidoCasilla() {
        
        return contenidoCasilla;
    }

    public void setContenidoCasilla(int contenidaCasilla) {
        
        this.contenidoCasilla = contenidaCasilla;
    }
        
    public Casilla() {
        
        this.setBackground(Color.yellow);
        this.ancho = 42;
        this.alto = 44;
        this.setOpaque(false);        
        this.setContentAreaFilled(false);
        this.setBorderPainted(true);       
    }

    public void cambiarIcono(int contenido){
                
        disparoCañon = java.applet.Applet.newAudioClip(getClass()
                .getResource("/controlador/Cañones.wav"));
        disparoCañon.play();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Casilla.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        //Dispararo a una casilla con agua
        if (contenido == 0) {
            
            splash = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/controlador/SplashAgua.wav"));
            splash.play();
            
            try {
            Thread.sleep(2000);
            } catch (InterruptedException ex) {
            Logger.getLogger(Casilla.class.getName())
                    .log(Level.SEVERE, null, ex);
            }
            
            this.setIcon(new ImageIcon(fallo.getImage()
                    .getScaledInstance(42, 44, Image.SCALE_SMOOTH))); 
            this.setContenidoCasilla(-1);
            
        }
         //Disparo a una casilla con barco pequeño
        if (contenido == 1) {
            this.setIcon(new ImageIcon(barcoPequeñoDestruido.getImage()
                    .getScaledInstance(42, 44, Image.SCALE_SMOOTH))); 
            this.setContenidoCasilla(2);
            explosion = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/controlador/Explosion.wav"));
            explosion.play();
            
        }
        //Disparo a una casilla con parte trasera barco grande 
        if (contenido == 3) {
            this.setIcon(new ImageIcon(barcoGrandeHAG.getImage()
                    .getScaledInstance(42, 44, Image.SCALE_SMOOTH))); 
            this.setContenidoCasilla(5);
            disparoAcertado = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/controlador/GolpeMetalico.wav"));
            disparoAcertado.play();
            
        }
        //Disparo a una casilla con parte trasera golpeada barco grande 
        if (contenido == 5) {
            this.setIcon(new ImageIcon(barcoGrandeHAD.getImage()
                    .getScaledInstance(42, 44, Image.SCALE_SMOOTH))); 
            this.setContenidoCasilla(7);
            
            try {
            Thread.sleep(2000);
            } catch (InterruptedException ex) {
            Logger.getLogger(Casilla.class.getName())
                    .log(Level.SEVERE, null, ex);
            }
            
            explosion = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/controlador/Explosion.wav"));
            explosion.play();
            
        }
         //Disparo a una casilla con parte delantera barco grande 
        if (contenido == 4) {
            this.setIcon(new ImageIcon(barcoGrandeHDG.getImage()
                    .getScaledInstance(42, 44, Image.SCALE_SMOOTH))); 
            this.setContenidoCasilla(6);
            disparoAcertado = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/controlador/GolpeMetalico.wav"));
            disparoAcertado.play();
            
        }
        //Disparo a una casilla con parte Delantera golpeada barco grande 
        if (contenido == 6) {
            this.setIcon(new ImageIcon(barcoGrandeHDD.getImage()
                    .getScaledInstance(42, 44, Image.SCALE_SMOOTH))); 
            this.setContenidoCasilla(8);
            
            try {
            Thread.sleep(2000);
            } catch (InterruptedException ex) {
            Logger.getLogger(Casilla.class.getName())
                    .log(Level.SEVERE, null, ex);
            }
            
            explosion = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/controlador/Explosion.wav"));
            explosion.play();
            
        }
        
        
        
        
        
        
        
    }
    
   /* public void agregarOyente(){
        
        MouseAdapter oyenteRaton = new MouseAdapter() {
        
            public void mouseClicked(MouseEvent e){
        
                
                if (e.getClickCount() == 2) {
                     
                    if (contenidoCasilla == 0) {
                        
                        cambiarIcono(0); 
                        System.out.println("Soy La Casilla Número: " + numeroCasilla);
                    }
                    if (contenidoCasilla == 1) {
                        
                        cambiarIcono(1);                    
                        System.out.println("Soy La Casilla Número: " + numeroCasilla);
                        
                    }
                    
                    
                }
            }

        };
        this.addMouseListener(oyenteRaton);                
        
    }*/
    
    

    
    
    
}
