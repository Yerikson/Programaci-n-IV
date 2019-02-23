
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vista.Captacion;
import vista.Captacion1;
import vista.Menu;
import vista.MontoYFechaActual;
import vista.VentanaUsuario;

/**
 *
 * @author USER
 */
public class Controlador1{
    private int montoActualDisponible;
    private boolean primeraVez = true;
    private VentanaUsuario nuevaVentana;
    private String mensajeMonto;
    private Menu nuevoMenu = new Menu();
    private MontoYFechaActual nuevoMiniPanel = new MontoYFechaActual();
    private Captacion nuevaCaptacion = new Captacion();
    private Captacion1 nuevaCaptacion1 = new Captacion1();
    
    public Controlador1(VentanaUsuario nuevaVentana) {
        
        this.nuevaVentana = nuevaVentana;
        
    }
    
    public void iniciarVentana(){
        
        this.nuevaVentana.setSize(1200, 700);
        this.nuevaVentana.setTitle("PRESTAMOS");
        this.nuevaVentana.setResizable(false);
        this.nuevaVentana.setLocationRelativeTo(null);
    }
    
    public void agregarPanelAVentana(JPanel nuevo){
        
        this.nuevaVentana.add(nuevo);
    }
    
    public void iniciarSistema(){
        this.montoActualDisponible = 0;
        this.mensajeMonto = "Monto Total Disponible Para Prestamos: ";
        this.nuevoMiniPanel.monto.setVisible(false);
        this.iniciarVentana();
        this.agregarPanelAVentana(this.nuevoMenu);
        this.agregarPanelAVentana(this.nuevoMiniPanel);
        this.agregarPanelAVentana(this.nuevaCaptacion);
        this.nuevaCaptacion.setVisible(false);
        this.eventosBotones();
        this.nuevoMiniPanel.volver.setEnabled(false);

    }
    
    public void eventosBotones(){
        
        ActionListener botonAgregarPrestamo = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if (primeraVez == true) {
                    
                    solicitarMonto();
                    primeraVez = false;
                    
                }
               nuevoMenu.setVisible(false);
               nuevaCaptacion.setVisible(true);
               nuevoMiniPanel.volver.setEnabled(true);
                
            }
        };  
        this.nuevoMenu.agregarPrestamo.addActionListener(botonAgregarPrestamo);
        
        ActionListener botonVolver = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
               nuevaCaptacion.setVisible(false);
               nuevoMenu.setVisible(true);
               nuevoMiniPanel.volver.setEnabled(false);
            }
        };  
        this.nuevoMiniPanel.volver.addActionListener(botonVolver);
       
    }
    
    public void solicitarMonto(){
        
        while((this.montoActualDisponible = Integer.parseInt(JOptionPane
                .showInputDialog("Ingrese El Monto Total Disponible "
                        + "Para Prestar: "))) <= 0){
            
            JOptionPane.showMessageDialog(null, "Recuerde Que EL Monto "
                    + "Disponible Debe Ser Mayor Que Cero");
            
        }
        
        this.nuevoMiniPanel.setMontoActual(montoActualDisponible);
        System.out.println(this.nuevoMiniPanel.montoActual);
        this.nuevoMiniPanel.monto.setVisible(true);
        this.nuevoMiniPanel.monto.setText(this.mensajeMonto + this.montoActualDisponible);

    }
}
