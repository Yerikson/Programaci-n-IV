
package vista;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Ficha;

/**
 *
 * @author USER
 */
public class PanelVistas extends JPanel{

    private JLabel espFicha1 = new JLabel();
    private JLabel espFicha2 = new JLabel();
    private JLabel espFicha3 = new JLabel();
    private JLabel espFicha4 = new JLabel();
    private JLabel espFicha5 = new JLabel();
    private JLabel espFicha6 = new JLabel();
    private JLabel espFicha7 = new JLabel();
    private JLabel espFicha8 = new JLabel();
    private JLabel espFicha9 = new JLabel();
    private JLabel espFicha10 = new JLabel();
    private JLabel espFicha11 = new JLabel();
    private JLabel espFicha12 = new JLabel();
    private JLabel espFicha13 = new JLabel();
    private JLabel espFicha14 = new JLabel();
    private JLabel espFicha15 = new JLabel();
    private JLabel espFicha16 = new JLabel();
    
    
    
    public PanelVistas() {
        this.setLayout(null);
        this.setBounds(0, 0, 645, 685);
        this.setBackground(Color.BLACK);
    }    
    
    public void crearEspaciosFichas(ArrayList<Ficha> fichasOrdenadas){
        
        //*** Fila 1 ***
        //Espacio Para La Ficha Número 1
        this.espFicha1.setBounds(fichasOrdenadas.get(0).getPosicionX()
                , fichasOrdenadas.get(0).getPosicionY(), 160, 170);        
        this.add(espFicha1);
        
        //Espacio Para La Ficha Número 2
        this.espFicha2.setBounds(fichasOrdenadas.get(1).getPosicionX()
                , fichasOrdenadas.get(1).getPosicionY(), 160, 170);        
        this.add(espFicha2);
        
        //Espacio Para La Ficha Número 3
        this.espFicha3.setBounds(fichasOrdenadas.get(2).getPosicionX()
                , fichasOrdenadas.get(2).getPosicionY(), 160, 170);        
        this.add(espFicha3);
        
        //Espacio Para La Ficha Número 4
        this.espFicha4.setBounds(fichasOrdenadas.get(3).getPosicionX()
                , fichasOrdenadas.get(3).getPosicionY(), 160, 170);        
        this.add(espFicha4);
        
        //*** Fila 2 ***
        //Espacio Para La Ficha Número 5
        this.espFicha5.setBounds(fichasOrdenadas.get(4).getPosicionX()
                , fichasOrdenadas.get(4).getPosicionY(), 160, 170);
        this.add(espFicha5);
        
        //Espacio Para La Ficha Número 6
        this.espFicha6.setBounds(fichasOrdenadas.get(5).getPosicionX()
                , fichasOrdenadas.get(5).getPosicionY(), 160, 170);
        this.add(espFicha6);
        
        //Espacio Para La Ficha Número 7
        this.espFicha7.setBounds(fichasOrdenadas.get(6).getPosicionX()
                , fichasOrdenadas.get(6).getPosicionY(), 160, 170);
        this.add(espFicha7);
        
        //Espacio Para La Ficha Número 8
        this.espFicha8.setBounds(fichasOrdenadas.get(7).getPosicionX()
                , fichasOrdenadas.get(7).getPosicionY(), 160, 170);
        this.add(espFicha8);
        
        //*** Fila 3 ***
        //Espacio Para La Ficha Número 9
        this.espFicha9.setBounds(fichasOrdenadas.get(8).getPosicionX()
                , fichasOrdenadas.get(8).getPosicionY(), 160, 170);
        this.add(espFicha9);
        
        //Espacio Para La Ficha Número 10
        this.espFicha10.setBounds(fichasOrdenadas.get(9).getPosicionX()
                , fichasOrdenadas.get(9).getPosicionY(), 160, 170);
        this.add(espFicha10);
        
        //Espacio Para La Ficha Número 11
        this.espFicha11.setBounds(fichasOrdenadas.get(10).getPosicionX()
                , fichasOrdenadas.get(10).getPosicionY(), 160, 170);
        this.add(espFicha11);
        
        //Espacio Para La Ficha Número 12
        this.espFicha12.setBounds(fichasOrdenadas.get(11).getPosicionX()
                , fichasOrdenadas.get(11).getPosicionY(), 160, 170);
        this.add(espFicha12);
        
        //*** Fila 4 ***
        //Espacio Para La Ficha Número 13
        this.espFicha13.setBounds(fichasOrdenadas.get(12).getPosicionX()
                , fichasOrdenadas.get(12).getPosicionY(), 160, 170);
        this.add(espFicha13);
        
        //Espacio Para La Ficha Número 14
        this.espFicha14.setBounds(fichasOrdenadas.get(13).getPosicionX()
                , fichasOrdenadas.get(13).getPosicionY(), 160, 170);
        this.add(espFicha14);
        
        //Espacio Para La Ficha Número 15
        this.espFicha15.setBounds(fichasOrdenadas.get(14).getPosicionX()
                , fichasOrdenadas.get(14).getPosicionY(), 160, 170);
        this.add(espFicha15);
        
        //Espacio Para La Ficha Número 16
        this.espFicha16.setBounds(fichasOrdenadas.get(15).getPosicionX()
                , fichasOrdenadas.get(15).getPosicionY(), 160, 170);
        this.add(espFicha16);
                
    }
    
    public void agregarImagenesEspaciosFichas(ArrayList<Ficha> fichasOrdenadas){
        
        //*** Fila 1 ***
        this.espFicha1.setIcon(new ImageIcon(fichasOrdenadas.get(0)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha2.setIcon(new ImageIcon(fichasOrdenadas.get(1)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha3.setIcon(new ImageIcon(fichasOrdenadas.get(2)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha4.setIcon(new ImageIcon(fichasOrdenadas.get(3)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        //*** Fila 2 ***
        this.espFicha5.setIcon(new ImageIcon(fichasOrdenadas.get(4)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha6.setIcon(new ImageIcon(fichasOrdenadas.get(5)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha7.setIcon(new ImageIcon(fichasOrdenadas.get(6)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha8.setIcon(new ImageIcon(fichasOrdenadas.get(7)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        //*** Fila 3 ***
        this.espFicha9.setIcon(new ImageIcon(fichasOrdenadas.get(8)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha10.setIcon(new ImageIcon(fichasOrdenadas.get(9)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha11.setIcon(new ImageIcon(fichasOrdenadas.get(10)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha12.setIcon(new ImageIcon(fichasOrdenadas.get(11)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        //*** Fila 4 ***
        this.espFicha13.setIcon(new ImageIcon(fichasOrdenadas.get(12)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha14.setIcon(new ImageIcon(fichasOrdenadas.get(13)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha15.setIcon(new ImageIcon(fichasOrdenadas.get(14)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
        
        this.espFicha16.setIcon(new ImageIcon(fichasOrdenadas.get(15)
                .getImagenFicha().getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                        
    }
    
}
