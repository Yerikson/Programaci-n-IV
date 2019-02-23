
package vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Prestamo;

/**
 *
 * @author USER
 */
public class HistorialPrestamos extends JPanel{

    public JList listaP = new JList();
    
    public HistorialPrestamos() {
        
        this.setBounds(0, 0, 1200, 600);
        this.setLayout(null);        
        this.setBackground(Color.BLACK);        
    }
    
    public void ubicarElementos2(ArrayList<Prestamo> prestamos){
        DefaultListModel lista = new DefaultListModel();

        for (int i = 0; i < prestamos.size(); i++) {
            String aux;
            aux = String.valueOf(prestamos.get(i).numeroPrestamo) +"  "
                    + prestamos.get(i).valorDelPrestamo 
                    + "  "+ String.valueOf(prestamos.get(i).cuotas);
            
            lista.addElement(aux);
            lista.addElement(prestamos.get(i).fechasDePagoCuotas);
            lista.addElement(prestamos.get(i).fechaAutorizacionPrestamo);
            lista.addElement(prestamos.get(i).fechaTentativaDelPrestamo);
            lista.addElement(prestamos.get(i).solicitante);
            
            
        }

        this.listaP.setModel(lista);
        
        this.listaP.setBounds(50, 0, 1100, 600);
        
        this.add(this.listaP);
        
    }
    
    
    
    
    
}
