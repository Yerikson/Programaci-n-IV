
package controlador;

import java.applet.AudioClip;
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
                .getResource("/controlador/SirenaAtaqueAereo.wav"));  
        sonidoMenu.loop();
        PreInit();
        initComponent();
        this.setLayout(null);        
        this.setBounds(0, 0, 1300, 680);
        definirBotones();
        
                                  
    }
        
    private void PreInit() {
        
        fond = new ImageIcon("FondoMenu.jpg").getImage()
                .getScaledInstance(1300, 680, Image.SCALE_SMOOTH);
    }

    private void initComponent() {

    }

    public void paintBorder (Graphics g){
        
        super.paintComponent(g);
        g.drawImage(fond,0,0, this.getWidth(), this.getHeight(), this);
    }
    
    private void definirBotones(){
        
        ImageIcon iconBotonesMenu = new ImageIcon("Misil.png");       
        
        this.jugarMensaje.setBounds(630, 143, 50, 25);             
        this.jugarMensaje.setText("Jugar");
        
        this.jugar.setBounds(600, 165, 100, 50);
        this.jugar.setOpaque(true);
        this.jugar.setContentAreaFilled(false);
        this.jugar.setIcon(new ImageIcon(iconBotonesMenu.getImage()
                .getScaledInstance(jugar.getWidth()
                        , jugar.getHeight(), Image.SCALE_SMOOTH))); 

        this.add(jugarMensaje);
        this.add(jugar);
        
        this.acercaDeMensaje.setBounds(620, 217, 100, 25);             
        this.acercaDeMensaje.setText("Acerca De");

        
        this.acercaDe.setBounds(600, 242, 100, 50);
        this.acercaDe.setOpaque(true);
        this.acercaDe.setContentAreaFilled(false);
        this.acercaDe.setIcon(new ImageIcon(iconBotonesMenu.getImage()
                .getScaledInstance(acercaDe.getWidth()
                        , acercaDe.getHeight(), Image.SCALE_SMOOTH))); 
        
        this.add(acercaDeMensaje);
        this.add(acercaDe);
        
        
        this.ayudaMensaje.setBounds(630, 294, 100, 25);             
        this.ayudaMensaje.setText("Ayuda");
        
        this.ayuda.setBounds(600, 321, 100, 50);
        this.ayuda.setOpaque(true);
        this.ayuda.setContentAreaFilled(false);
        this.ayuda.setIcon(new ImageIcon(iconBotonesMenu.getImage()
                .getScaledInstance(ayuda.getWidth()
                        , ayuda.getHeight(), Image.SCALE_SMOOTH))); 
        
        this.add(ayudaMensaje);
        this.add(ayuda);
        
        this.salir.setBounds(600, 340, 100, 50);
        this.salir.setText("Salir");
        this.add(salir);
    }
}
