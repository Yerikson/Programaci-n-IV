
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
    
    public double monto;
    public int cantidadPres;
    public int [] cuotas;
    public double [] valorPres;
    public Date [] fechasAutorizacion;
    
    public DatosPrestamos(){
        
        
        
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
            SimpleDateFormat formatoNuevo = new SimpleDateFormat("YYYY/MM/dd");
            Date fechaAutorizacion1;
            double valorPres1;
            int cuotas1;
            while((fechaAutorizacion1 = formatoNuevo.parse(JOptionPane
                    .showInputDialog("Por Favor Ingrese La Fecha De Autorización"
                            + " En Formato YYYY/MM/dd Que Desea Para Su Prestamo"
                            + " #" + (i + 1)))).after(fechaAct) == false){
                
            
                JOptionPane.showMessageDialog(null, "Por Favor Ingrese Una Fecha"
                        + " Para La Autorización Posterior A La Fecha Actual.");
            
            }
            
            if (fechaAutorizacion1.getDate() > 20) {
                
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
    /* String fechaComoTexto = JOptionPane.showInputDialog(null,"Fecha en la que necesita Autorizacion: dd/mm/aaaa");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaAut = sdf.parse(fechaComoTexto);
            
        if (fActual.after(fechaAut) || fechaAut.getDate() > 20) {
            
            fechaAut = fActual;
            
            if (fechaAut.getDate() > 20) {
                fechaAut.setDate(1);
                fechaAut.setMonth(fechaAut.getMonth()+1);
                JOptionPane.showMessageDialog(null, "Los prestamos solo se autorizan antes del 20 de cada mes,"
                        + "por lo que su nueva fecha de autorización es: " + fechaAut.toString());
            } else {
                fechaAut.setDate(fechaAut.getDate()+1);
                JOptionPane.showMessageDialog(null, "Usted ingresó una fecha anterior a la actual, por lo tanto"
                    + "se le autorizará el prestamo para el: " + fechaAut.toString());
            }
        }
        return fechaAut;*/
    
     /* while((this.cantidadPres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese El Número De Prestamos Que"))) <= 0){
                
            
                JOptionPane.showMessageDialog(null, "Por Favor Recuerde que Como "
                        + "Mínimo Tiene Que Ingresar Que Desea Realizar Solo "
                        + "Un Prestamo.");
            
            }
    */
}
