
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
        this.espFicha1.setName("L1");
        this.add(espFicha1);
        
        //System.out.println("\n Posicion X Espacio uno: " + this.espFicha1.getX());  
        
        //System.out.println(this.espFicha1.getName());
        
        //Espacio Para La Ficha Número 2
        this.espFicha2.setBounds(fichasOrdenadas.get(1).getPosicionX()
                , fichasOrdenadas.get(1).getPosicionY(), 160, 170);  
        this.espFicha2.setName("L2");
        this.add(espFicha2);              
        
        //Espacio Para La Ficha Número 3
        this.espFicha3.setBounds(fichasOrdenadas.get(2).getPosicionX()
                , fichasOrdenadas.get(2).getPosicionY(), 160, 170);    
        this.espFicha3.setName("L3");
        this.add(espFicha3);
        
        //Espacio Para La Ficha Número 4
        this.espFicha4.setBounds(fichasOrdenadas.get(3).getPosicionX()
                , fichasOrdenadas.get(3).getPosicionY(), 160, 170);   
        this.espFicha4.setName("L4");
        this.add(espFicha4);
        
        //*** Fila 2 ***
        //Espacio Para La Ficha Número 5
        this.espFicha5.setBounds(fichasOrdenadas.get(4).getPosicionX()
                , fichasOrdenadas.get(4).getPosicionY(), 160, 170);
        this.espFicha5.setName("L5");
        this.add(espFicha5);
        
        //Espacio Para La Ficha Número 6
        this.espFicha6.setBounds(fichasOrdenadas.get(5).getPosicionX()
                , fichasOrdenadas.get(5).getPosicionY(), 160, 170);
        this.espFicha6.setName("L6");
        this.add(espFicha6);
        
        //Espacio Para La Ficha Número 7
        this.espFicha7.setBounds(fichasOrdenadas.get(6).getPosicionX()
                , fichasOrdenadas.get(6).getPosicionY(), 160, 170);
        this.espFicha7.setName("L7");
        this.add(espFicha7);
        
        //Espacio Para La Ficha Número 8
        this.espFicha8.setBounds(fichasOrdenadas.get(7).getPosicionX()
                , fichasOrdenadas.get(7).getPosicionY(), 160, 170);
        this.espFicha8.setName("L8");
        this.add(espFicha8);
        
        //*** Fila 3 ***
        //Espacio Para La Ficha Número 9
        this.espFicha9.setBounds(fichasOrdenadas.get(8).getPosicionX()
                , fichasOrdenadas.get(8).getPosicionY(), 160, 170);
        this.espFicha9.setName("L9");
        this.add(espFicha9);
        
        //Espacio Para La Ficha Número 10
        this.espFicha10.setBounds(fichasOrdenadas.get(9).getPosicionX()
                , fichasOrdenadas.get(9).getPosicionY(), 160, 170);
        this.espFicha10.setName("L10");
        this.add(espFicha10);
        
        //Espacio Para La Ficha Número 11
        this.espFicha11.setBounds(fichasOrdenadas.get(10).getPosicionX()
                , fichasOrdenadas.get(10).getPosicionY(), 160, 170);
        this.espFicha11.setName("L11");
        this.add(espFicha11);
        
        //Espacio Para La Ficha Número 12
        this.espFicha12.setBounds(fichasOrdenadas.get(11).getPosicionX()
                , fichasOrdenadas.get(11).getPosicionY(), 160, 170);
        this.espFicha12.setName("L12");
        this.add(espFicha12);
        
        //*** Fila 4 ***
        //Espacio Para La Ficha Número 13
        this.espFicha13.setBounds(fichasOrdenadas.get(12).getPosicionX()
                , fichasOrdenadas.get(12).getPosicionY(), 160, 170);
        this.espFicha13.setName("L13");
        this.add(espFicha13);
        
        //Espacio Para La Ficha Número 14
        this.espFicha14.setBounds(fichasOrdenadas.get(13).getPosicionX()
                , fichasOrdenadas.get(13).getPosicionY(), 160, 170);
        this.espFicha14.setName("L14");
        this.add(espFicha14);
        
        //Espacio Para La Ficha Número 15
        this.espFicha15.setBounds(fichasOrdenadas.get(14).getPosicionX()
                , fichasOrdenadas.get(14).getPosicionY(), 160, 170);
        this.espFicha15.setName("L15");
        this.add(espFicha15);
        
        //Espacio Para La Ficha Número 16
        this.espFicha16.setBounds(fichasOrdenadas.get(15).getPosicionX()
                , fichasOrdenadas.get(15).getPosicionY(), 160, 170);
        this.espFicha16.setName("L16");
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
    
    public void moverFicha(int opcionMovimiento, int poscionFicha16){
        
        ImageIcon auxIcon = new ImageIcon();
        ImageIcon auxIcon1 = new ImageIcon();
        
        switch(opcionMovimiento){
            
            case 1:
                
                //Movimiento Hacia Arriba
                
                //De Derecha a Izquierda
                //** Columna 1 **//
                if(poscionFicha16 == 16){
                    
                    auxIcon = (ImageIcon) this.espFicha16.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha12.getIcon();
                    
                    this.espFicha16.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha12.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 12){
                    
                    auxIcon = (ImageIcon) this.espFicha12.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha8.getIcon();
                    
                    this.espFicha12.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha8.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 8){
                    
                    auxIcon = (ImageIcon) this.espFicha8.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha4.getIcon();
                    
                    this.espFicha8.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha4.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                //** Columna 2 **//
                if(poscionFicha16 == 15){
                    
                    auxIcon = (ImageIcon) this.espFicha15.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha11.getIcon();
                    
                    this.espFicha15.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha11.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 11){
                    
                    auxIcon = (ImageIcon) this.espFicha11.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha7.getIcon();
                    
                    this.espFicha11.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha7.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 7){
                    
                    auxIcon = (ImageIcon) this.espFicha7.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha3.getIcon();
                    
                    this.espFicha7.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha3.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                
                //** Columna 3 **//
                if(poscionFicha16 == 14){
                    
                    auxIcon = (ImageIcon) this.espFicha14.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha10.getIcon();
                    
                    this.espFicha14.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha10.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 10){
                    
                    auxIcon = (ImageIcon) this.espFicha10.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha6.getIcon();
                    
                    this.espFicha10.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha6.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 6){
                    
                    auxIcon = (ImageIcon) this.espFicha6.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha2.getIcon();
                    
                    this.espFicha6.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha2.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                //** Columna 4 **//
                if(poscionFicha16 == 13){
                    
                    auxIcon = (ImageIcon) this.espFicha13.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha9.getIcon();
                    
                    this.espFicha13.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha9.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 9){
                    
                    auxIcon = (ImageIcon) this.espFicha9.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha5.getIcon();
                    
                    this.espFicha9.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha5.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 5){
                    
                    auxIcon = (ImageIcon) this.espFicha5.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha1.getIcon();
                    
                    this.espFicha5.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha1.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                break;
                
            case 2:
                
                //Movimiento Hacia Abajo
                
                //De Derecha a Izquierda
                //** Columna 1 **//
                if(poscionFicha16 == 4){
                    
                    auxIcon = (ImageIcon) this.espFicha4.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha8.getIcon();
                    
                    this.espFicha4.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha8.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 8){
                    
                    auxIcon = (ImageIcon) this.espFicha8.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha12.getIcon();
                    
                    this.espFicha8.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha12.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 12){
                    
                    auxIcon = (ImageIcon) this.espFicha12.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha16.getIcon();
                    
                    this.espFicha12.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha16.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                //** Columna 2 **//
                if(poscionFicha16 == 3){
                    
                    auxIcon = (ImageIcon) this.espFicha3.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha7.getIcon();
                    
                    this.espFicha3.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha7.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 7){
                    
                    auxIcon = (ImageIcon) this.espFicha7.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha11.getIcon();
                    
                    this.espFicha7.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha11.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 11){
                    
                    auxIcon = (ImageIcon) this.espFicha11.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha15.getIcon();
                    
                    this.espFicha11.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha15.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                
                //** Columna 3 **//
                if(poscionFicha16 == 2){
                    
                    auxIcon = (ImageIcon) this.espFicha2.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha6.getIcon();
                    
                    this.espFicha2.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha6.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 6){
                    
                    auxIcon = (ImageIcon) this.espFicha6.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha10.getIcon();
                    
                    this.espFicha6.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha10.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 10){
                    
                    auxIcon = (ImageIcon) this.espFicha10.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha14.getIcon();
                    
                    this.espFicha10.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha14.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                //** Columna 4 **//
                if(poscionFicha16 == 1){
                    
                    auxIcon = (ImageIcon) this.espFicha1.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha5.getIcon();
                    
                    this.espFicha1.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha5.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 5){
                    
                    auxIcon = (ImageIcon) this.espFicha5.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha9.getIcon();
                    
                    this.espFicha5.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha9.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 9){
                    
                    auxIcon = (ImageIcon) this.espFicha9.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha13.getIcon();
                    
                    this.espFicha9.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha13.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                break;
                
            case 3:
                
                //Movimiento Hacia La Izquierda
                
                //De Abajo Hacia Arriba
                //** Fila 1 **//
                if(poscionFicha16 == 16){
                    
                    auxIcon = (ImageIcon) this.espFicha16.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha15.getIcon();
                    
                    this.espFicha16.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha15.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 15){
                    
                    auxIcon = (ImageIcon) this.espFicha15.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha14.getIcon();
                    
                    this.espFicha15.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha14.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 14){
                    
                    auxIcon = (ImageIcon) this.espFicha14.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha13.getIcon();
                    
                    this.espFicha14.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha13.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                //** Fila 2 **//
                if(poscionFicha16 == 12){
                    
                    auxIcon = (ImageIcon) this.espFicha12.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha11.getIcon();
                    
                    this.espFicha12.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha11.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 11){
                    
                    auxIcon = (ImageIcon) this.espFicha11.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha10.getIcon();
                    
                    this.espFicha11.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha10.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 10){
                    
                    auxIcon = (ImageIcon) this.espFicha10.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha9.getIcon();
                    
                    this.espFicha10.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha9.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                
                //** Fila 3 **//
                if(poscionFicha16 == 8){
                    
                    auxIcon = (ImageIcon) this.espFicha8.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha7.getIcon();
                    
                    this.espFicha8.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha7.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 7){
                    
                    auxIcon = (ImageIcon) this.espFicha7.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha6.getIcon();
                    
                    this.espFicha7.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha6.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 6){
                    
                    auxIcon = (ImageIcon) this.espFicha6.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha5.getIcon();
                    
                    this.espFicha6.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha5.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                //** Fila 4 **//
                if(poscionFicha16 == 4){
                    
                    auxIcon = (ImageIcon) this.espFicha4.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha3.getIcon();
                    
                    this.espFicha4.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha3.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 3){
                    
                    auxIcon = (ImageIcon) this.espFicha3.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha2.getIcon();
                    
                    this.espFicha3.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha2.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 2){
                    
                    auxIcon = (ImageIcon) this.espFicha2.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha1.getIcon();
                    
                    this.espFicha2.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha1.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                break;
                
            case 4:
                
                //Movimiento Hacia La Derecha
                
                //De Abajo Hacia Arriba
                //** Fila 1 **//
                if(poscionFicha16 == 13){
                    
                    auxIcon = (ImageIcon) this.espFicha13.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha14.getIcon();
                    
                    this.espFicha13.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha14.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 14){
                    
                    auxIcon = (ImageIcon) this.espFicha14.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha15.getIcon();
                    
                    this.espFicha14.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha15.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 15){
                    
                    auxIcon = (ImageIcon) this.espFicha15.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha16.getIcon();
                    
                    this.espFicha15.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha16.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                //** Fila 2 **//
                if(poscionFicha16 == 9){
                    
                    auxIcon = (ImageIcon) this.espFicha9.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha10.getIcon();
                    
                    this.espFicha9.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha10.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 10){
                    
                    auxIcon = (ImageIcon) this.espFicha10.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha11.getIcon();
                    
                    this.espFicha10.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha11.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 11){
                    
                    auxIcon = (ImageIcon) this.espFicha11.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha12.getIcon();
                    
                    this.espFicha11.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha12.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                
                //** Fila 3 **//
                if(poscionFicha16 == 5){
                    
                    auxIcon = (ImageIcon) this.espFicha5.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha6.getIcon();
                    
                    this.espFicha5.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha6.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 6){
                    
                    auxIcon = (ImageIcon) this.espFicha6.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha7.getIcon();
                    
                    this.espFicha6.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha7.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 7){
                    
                    auxIcon = (ImageIcon) this.espFicha7.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha8.getIcon();
                    
                    this.espFicha7.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha8.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                //** Fila 4 **//
                if(poscionFicha16 == 1){
                    
                    auxIcon = (ImageIcon) this.espFicha1.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha2.getIcon();
                    
                    this.espFicha1.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha2.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 2){
                    
                    auxIcon = (ImageIcon) this.espFicha2.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha3.getIcon();
                    
                    this.espFicha2.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha3.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                if(poscionFicha16 == 3){
                    
                    auxIcon = (ImageIcon) this.espFicha3.getIcon();
                    auxIcon1 = (ImageIcon) this.espFicha4.getIcon();
                    
                    this.espFicha3.setIcon(new ImageIcon(auxIcon1.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                    this.espFicha4.setIcon(new ImageIcon(auxIcon.getImage().getScaledInstance(160, 170
                        , Image.SCALE_SMOOTH)));
                
                }
                
                break;
                
                
                
                
                
        }
                             
    }
    
    
    
}
