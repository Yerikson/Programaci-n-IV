
package vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class DatosPrestamos {
    
    public int cuotas1;
    public double monto;
    public int cantidadPres;
    public int [] cuotas = new int [6];
    public double [] valorPres = new double [6];
    public Date [] fechasAutorizacion = new Date [6];
    public int cantCuotas;
    public DatosPrestamos(){
                        
    }

    public int getCantidadPres() {
        return cantidadPres;
    }

    public int[] getCuotas() {
        return cuotas;
    }

    public double[] getValorPres() {
        return valorPres;
    }

    public Date[] getFechasAutorizacion() {
        return fechasAutorizacion;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public int getCuotas1() {
        return cuotas1;
    }
    
    
    
    public void pedirDatos(double monto1) throws ParseException{
        
        this.monto = monto1;
        datosPrestamos();
 
    }
    
    public void datosPrestamos() throws ParseException{
        
        while((this.cantidadPres = Integer.parseInt(JOptionPane
                .showInputDialog("Ingrese El Número De Prestamos Que "
                        + "Desea Realizar: "))) <= 0){
            
            JOptionPane.showMessageDialog(null, "Por Favor Recuerde que Como "
                    + "Mínimo Tiene Que Ingresar Que Desea Realizar Solo "
                    + "Un Prestamo.");
            
        }
        
        for (int i = 0; i < this.cantidadPres; i++) {
            
            Calendar calendario1 = Calendar.getInstance();
            Date fechaAct = calendario1.getTime();
            SimpleDateFormat formatoNuevo = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaAutorizacion1;
            double valorPres1;
            
            while((fechaAutorizacion1 = formatoNuevo.parse(JOptionPane
                    .showInputDialog("Por Favor Ingrese La Fecha De Autorización"
                            + " En Formato dd/MM/YYYY Que Desea Para Su Prestamo"
                            + " #" + (i + 1)))).after(fechaAct) == false){                              
            
                JOptionPane.showMessageDialog(null, "Por Favor Ingrese Una Fecha"
                        + " Para La Autorización Posterior A La Fecha Actual.");
            
            }
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(fechaAutorizacion1);
            
            if (cal.get(Calendar.DAY_OF_MONTH) > 20) {
                
                JOptionPane.showMessageDialog(null, "Los Prestamos Solo Se "
                        + "Autorizan Los Primeros 20 Dias De Cada Mes, Por Ende"
                        + " Su Fecha De Autorizacion Sera Agendada Para El "
                        + "Primero Del Mes Posterior Al Que Ingreso.");
                fechaAutorizacion1.setDate(1);
                fechaAutorizacion1.setMonth(fechaAutorizacion1.getMonth() + 1);                                
                                
            } 
            this.fechasAutorizacion [i] = fechaAutorizacion1;
            
            while((valorPres1 = Double.parseDouble(JOptionPane
                    .showInputDialog("Ingrese EL Valor Por El Que Desea Realizar"
                            + " Su Prestamo #" + (i + 1)))) > this.monto){
                
            
                JOptionPane.showMessageDialog(null, "Por Favor Ingrese Un Valor"
                        + " Que No Sobrepase El Monto Total Disponible Para "
                        + "Los Prestamos");
            
            }
            
            this.valorPres [i] = valorPres1;
            
            while((cuotas1 = Integer.parseInt(JOptionPane
                    .showInputDialog("Ingrese El Número De Cuotas Mensuales Al "
                            + "Que Desea Remunerar El Prestamo: "))) > 6){
            
                JOptionPane.showMessageDialog(null, "El Número Máximo De Cuotas"
                        + " Aceptado Son 6; Por Favor Ingrese Nuevamente Un "
                        + "Valor Que No Sobrepase El Límite De Cuotas");
            
            }
            
            this.cuotas [i] = cuotas1;

            
        }
        
    }  
    
}
