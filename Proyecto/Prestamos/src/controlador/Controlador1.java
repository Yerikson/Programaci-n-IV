
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Persona;
import modelo.Prestamo;
import vista.Captacion;
import vista.DatosPrestamos;
import vista.HistorialPrestamos;
import vista.Menu;
import vista.MontoYFechaActual;
import vista.VentanaUsuario;

/**
 *
 * @author USER
 */
public class Controlador1{
    private int flag = 0;
    private double montoActualDisponible;
    private int numeroPres1 = 0;
    private boolean primeraVez = true;
    private ArrayList<Persona> solicitantes = new ArrayList<Persona>(); 
    private ArrayList<Prestamo> prestamosSolic = new ArrayList<Prestamo>(); 
    private DatosPrestamos nuevosDatos = new DatosPrestamos();
    private VentanaUsuario nuevaVentana;
    private HistorialPrestamos nuevoHistorial = new HistorialPrestamos();
    private String mensajeMonto;
    private Menu nuevoMenu = new Menu();
    private MontoYFechaActual nuevoMiniPanel = new MontoYFechaActual();
    private Captacion nuevaCaptacion = new Captacion();
   
    
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
        this.agregarPanelAVentana(this.nuevoHistorial);
        this.nuevaCaptacion.setVisible(false);
        this.nuevoHistorial.setVisible(false);
        this.eventosBotones();
        this.nuevoMiniPanel.volver.setEnabled(false);

    }
    
    public void eventosBotones(){
                
        //Agregar Prestamo
        ActionListener botonAgregarPrestamo = new ActionListener() {                                   
            
            
            @Override
            public void actionPerformed(ActionEvent ae) {                
                flag = 1;
                if (primeraVez == true) {
                    
                    solicitarMonto();
                    
                    primeraVez = false;
                    
                }
                
                try {
                        nuevosDatos.pedirDatos(montoActualDisponible);
                    } catch (ParseException ex) {
                        Logger.getLogger(Controlador1.class.getName())
                                .log(Level.SEVERE, null, ex);
                    }
                nuevoMenu.setVisible(false);
                nuevaCaptacion.setVisible(true);
                nuevoMiniPanel.volver.setEnabled(true);
               
            }
        };  
        this.nuevoMenu.agregarPrestamo.addActionListener(botonAgregarPrestamo);
        
        //Mostrar Prestamos
        ActionListener botonMostrarPrestamo = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {                
                flag = 2;
                nuevoMenu.setVisible(false);
                nuevoHistorial.setVisible(true);
                nuevoMiniPanel.volver.setEnabled(true);
                nuevoHistorial.ubicarElementos2(prestamosSolic);
            }
        };  
        this.nuevoMenu.verPrestamos.addActionListener(botonMostrarPrestamo);
        //Volver
        ActionListener botonVolver = new ActionListener() {                                   
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                if (flag == 1) {
                    
                    
                    nuevaCaptacion.limpiarCampos();
                    nuevaCaptacion.setVisible(false);
                    nuevoMenu.setVisible(true);
                    nuevoMiniPanel.volver.setEnabled(false);                    
                }
                
                if (flag == 2) {
                 
                    nuevoHistorial.setVisible(false);
                    nuevoMenu.setVisible(true);
                    nuevoMiniPanel.volver.setEnabled(false);   
                }

            }
        };  
        this.nuevoMiniPanel.volver.addActionListener(botonVolver);
       
        //Validar
        ActionListener botonValidar = new ActionListener() {                                   
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(estaUser(nuevaCaptacion
                .numeroIdentidad.getText()) == false) {
                    
                    agregarDatosPersona();
                }
                
                agregarDatosPrestamos(nuevosDatos.cantidadPres, nuevaCaptacion
                .numeroIdentidad.getText());
                imprimirListaSolicitantes();
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
        
    }
    
    public void imprimirListaSolicitantes(){
               
        
        for (Persona B : this.solicitantes){
            
            System.out.println(B.toString());
            
        }
           
    }
    
    public void agregarDatosPrestamos(int totalPres, String id){

        for (int i = 0; i < totalPres; i++) {
            this.numeroPres1 += 1;
            Prestamo nuevoPrestamo = new Prestamo();
            nuevoPrestamo.setCuotas(this.nuevosDatos.getCuotas1());
            nuevoPrestamo.setFechaAutorizacionPrestamo(this.nuevosDatos
                    .fechasAutorizacion[i]);
            nuevoPrestamo.setNumeroPrestamo(numeroPres1);
            nuevoPrestamo.setValorDelPrestamo(this.nuevosDatos.valorPres[i]);   
            nuevoPrestamo.setSolicitante(id);
            this.prestamosSolic.add(nuevoPrestamo);
        }   
        generarFechasPrestamos();
        imprimirListaPrestamos();
    }
    
    public void generarFechasPrestamos(){
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatoNuevo2 = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < this.prestamosSolic.size(); i++) {
            
            // Fecha Tentativa
            cal.setTime(this.prestamosSolic.get(i).fechaAutorizacionPrestamo);
            
            if (this.prestamosSolic.get(i).valorDelPrestamo < 1000000) {
                
                cal.add(Calendar.DAY_OF_YEAR, 7);
                
            }else{
                
                cal.add(Calendar.DAY_OF_YEAR, 10);
            }
            this.prestamosSolic.get(i).fechaTentativaDelPrestamo = cal.getTime();
            
            // Fechas Pago Cuotas

            Date [] fechasCuotasAux = new Date [6];
            for (int j = 0; j < this.prestamosSolic.get(i).cuotas; j++) {
                
                if (j == 0) {
                    Calendar cal1 = Calendar.getInstance();
                    cal1.setTime(this.prestamosSolic.get(i)
                            .fechaTentativaDelPrestamo);
                    cal1.add(Calendar.DAY_OF_YEAR, 30);
                    fechasCuotasAux[j] = cal1.getTime();
                    
                } else {
                    Calendar cal2 = Calendar.getInstance();
                    cal2.setTime(fechasCuotasAux[j - 1]);
                    cal2.add(Calendar.DAY_OF_YEAR, 30);
                    fechasCuotasAux[j] = cal2.getTime();
                   
                }

            }
            this.prestamosSolic.get(i).setFechasDePagoCuotas(fechasCuotasAux);
            
        }
    }
    
    public void imprimirListaPrestamos(){
               
        for (Prestamo a : this.prestamosSolic){
            
            System.out.println(a.toString());
            
        }
           
    }
    
    public boolean  estaUser(String id){
        
        boolean flag = false;
        
        for (int i = 0; i < this.solicitantes.size(); i++) {
            
            if (this.solicitantes.get(i).numeroDeIdentidad.equals(id) == true) {
                
                flag = true;
                break;
                
            }
            
        }
        return flag;
    }
            
}
