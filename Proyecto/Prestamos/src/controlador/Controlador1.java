
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Persona;
import modelo.Prestamo;
import vista.Captacion;
import vista.Captacion1;
import vista.DatosPrestamos;
import vista.Menu;
import vista.MontoYFechaActual;
import vista.VentanaUsuario;

/**
 *
 * @author USER
 */
public class Controlador1{
    private double montoActualDisponible;
    private boolean primeraVez = true;
    private ArrayList<Persona> solicitantes = new ArrayList<Persona>(); 
    private ArrayList<Prestamo> prestamosSolic = new ArrayList<Prestamo>(); 
    private DatosPrestamos nuevosDatos = new DatosPrestamos();
    private VentanaUsuario nuevaVentana;
    private String mensajeMonto;
    private Menu nuevoMenu = new Menu();
    private MontoYFechaActual nuevoMiniPanel = new MontoYFechaActual();
    private Captacion nuevaCaptacion = new Captacion();
    //private Captacion1 nuevaCaptacion1 = new Captacion1();
    
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
        
        //Agregar Prestamo
        ActionListener botonAgregarPrestamo = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if (primeraVez == true) {
                    
                    solicitarMonto();
                    try {
                        nuevosDatos.pedirDatos(montoActualDisponible);
                    } catch (ParseException ex) {
                        Logger.getLogger(Controlador1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    primeraVez = false;
                    
                }
               nuevoMenu.setVisible(false);
               nuevaCaptacion.setVisible(true);
               nuevoMiniPanel.volver.setEnabled(true);
                
            }
        };  
        this.nuevoMenu.agregarPrestamo.addActionListener(botonAgregarPrestamo);
        
        //Volver
        ActionListener botonVolver = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               
               nuevaCaptacion.limpiarCampos();
               nuevaCaptacion.setVisible(false);
               nuevoMenu.setVisible(true);
               nuevoMiniPanel.volver.setEnabled(false);
            }
        };  
        this.nuevoMiniPanel.volver.addActionListener(botonVolver);
       
        //Validar
        ActionListener botonValidar = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                agregarDatosPersona();
               
            }
        };  
        this.nuevaCaptacion.validar.addActionListener(botonValidar);
    }
    
    public void solicitarMonto(){
        
        while((this.montoActualDisponible = Double.parseDouble(JOptionPane
                .showInputDialog("Ingrese El Monto Total Disponible "
                        + "Para Prestar: "))) <= 0){
            
            JOptionPane.showMessageDialog(null, "Recuerde Que EL Monto "
                    + "Disponible Debe Ser Mayor Que Cero");
            
        }
        
        this.nuevoMiniPanel.setMontoActual(montoActualDisponible);
        this.nuevoMiniPanel.monto.setVisible(true);
        this.nuevoMiniPanel.monto.setText(this.mensajeMonto + this.montoActualDisponible);

    }
    
    public void agregarDatosPersona(){
        
        Persona nuevoSolicitante = new Persona();
        
        nuevoSolicitante.setNumeroDeIdentidad(this.nuevaCaptacion
                .numeroIdentidad.getText());
        nuevoSolicitante.setPrimerNombre(this.nuevaCaptacion
                .primerNombre.getText());
        nuevoSolicitante.setPrimerApellido(this.nuevaCaptacion
                .primerApellido.getText());
        nuevoSolicitante.setSegundoApellido(this.nuevaCaptacion
                .segundoApellido.getText());
        nuevoSolicitante.setTelefonoDeCasa(this.nuevaCaptacion
                .telefonoDeCasa.getText());
        nuevoSolicitante.setTelefonoMovil(this.nuevaCaptacion
                .telefonoMovil.getText());
        
        this.solicitantes.add(nuevoSolicitante);
        imprimirListaSolicitantes();
        
    }
    
    public void imprimirListaSolicitantes(){
               
        
        for (Persona B : this.solicitantes){
            
            System.out.println(B.toString());
            
        }
        
        
        
        
    }
}
