
package modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author USER
 */
public class Ficha {
    
    private int numeroFicha;
    private ImageIcon imagenFicha;
    private int posicionX;
    private int posicionY;

    
    public Ficha(int numeroFicha, ImageIcon imagenFicha, int posicionX, int posicionY) {
        this.numeroFicha = numeroFicha;
        this.imagenFicha = imagenFicha;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public int getNumeroFicha() {
        return numeroFicha;
    }

    public ImageIcon getImagenFicha() {
        return imagenFicha;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setNumeroFicha(int numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public void setImagenFicha(ImageIcon imagenFicha) {
        this.imagenFicha = imagenFicha;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }
    
    
    
        
    
}
