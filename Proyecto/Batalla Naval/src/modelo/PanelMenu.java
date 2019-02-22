
package modelo;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */

public class PanelMenu extends JPanel{
    public AudioClip sonidoMenu;
    private Image fond;
    public JButton jugar = new JButton();
    public JButton acercaDe = new JButton();
    public JButton salir = new JButton();
    public JButton ayuda = new JButton();
    private JLabel jugarMensaje = new JLabel();
    private JLabel ayudaMensaje = new JLabel();
    private JLabel acercaDeMensaje = new JLabel();
    private JLabel salirMensaje = new JLabel();
    
    public PanelMenu() {        
        
        sonidoMenu = java.applet.Applet.newAudioClip(getClass()
                .getResource("/controlador/PiratasDelCaribe.wav"));  
        sonidoMenu.loop();
        PreInit();
        initComponent();
        this.setLayout(null);        
        this.setBounds(0, 0, 1350, 680);
        definirBotones();
        
                                  
    }
        
    private void PreInit() {
        
        fond = new ImageIcon("FondoMenu1.jpeg").getImage()
                .getScaledInstance(1350, 680, Image.SCALE_SMOOTH);
    }

    private void initComponent() {

    }

    public void paintBorder (Graphics g){
        
        super.paintComponent(g);
        g.drawImage(fond,0,0, this.getWidth(), this.getHeight(), this);
    }
    
    private void definirBotones(){
        
        ImageIcon iconBotonesMenu = new ImageIcon("Misil.png");       
        
        this.jugarMensaje.setBounds(660, 143, 50, 25);             
        this.jugarMensaje.setText("Jugar");
        this.jugarMensaje.setForeground(Color.yellow);
        
        this.jugar.setBounds(630, 165, 100, 50);
        this.jugar.setOpaque(true);
        this.jugar.setContentAreaFilled(false);
        this.jugar.setIcon(new ImageIcon(iconBotonesMenu.getImage()
                .getScaledInstance(jugar.getWidth()
                        , jugar.getHeight(), Image.SCALE_SMOOTH))); 

        this.add(jugarMensaje);
        this.add(jugar);
        
        this.acercaDeMensaje.setBounds(650, 217, 100, 25);             
        this.acercaDeMensaje.setText("Acerca De");
        this.acercaDeMensaje.setForeground(Color.yellow);

        
        this.acercaDe.setBounds(630, 242, 100, 50);
        this.acercaDe.setOpaque(true);
        this.acercaDe.setContentAreaFilled(false);
        this.acercaDe.setIcon(new ImageIcon(iconBotonesMenu.getImage()
                .getScaledInstance(acercaDe.getWidth()
                        , acercaDe.getHeight(), Image.SCALE_SMOOTH))); 
        
        this.add(acercaDeMensaje);
        this.add(acercaDe);
        
        
        this.ayudaMensaje.setBounds(660, 294, 100, 25);             
        this.ayudaMensaje.setText("Ayuda");
        this.ayudaMensaje.setForeground(Color.yellow);
        
        this.ayuda.setBounds(630, 321, 100, 50);
        this.ayuda.setOpaque(true);
        this.ayuda.setContentAreaFilled(false);
        this.ayuda.setIcon(new ImageIcon(iconBotonesMenu.getImage()
                .getScaledInstance(ayuda.getWidth()
                        , ayuda.getHeight(), Image.SCALE_SMOOTH))); 
        
        this.add(ayudaMensaje);
        this.add(ayuda);
        
        this.salirMensaje.setBounds(665, 373, 100, 25);             
        this.salirMensaje.setText("Salir");
        this.salirMensaje.setForeground(Color.yellow);
        
        this.salir.setBounds(630, 398, 100, 50);
        this.salir.setOpaque(true);
        this.salir.setContentAreaFilled(false);
        this.salir.setIcon(new ImageIcon(iconBotonesMenu.getImage()
                .getScaledInstance(salir.getWidth()
                        , salir.getHeight(), Image.SCALE_SMOOTH))); 
        
        this.add(salirMensaje);
        this.add(salir);
    }
}
