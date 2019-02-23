
package modelo;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Prestamo {
    
    public int numeroPrestamo;
    public double valorDelPrestamo;
    public int cuotas;
    public Date [] fechasDePagoCuotas;
    public Date fechaAutorizacionPrestamo;
    public Date fechaTentativaDelPrestamo;
    public String  solicitante;

    public Prestamo() {
        
    }

    public Prestamo(int numeroPrestamo, int valorDelPrestamo,
            Date[] fechasDePagoCuotas, Date fechaAutorizacionPrestamo,
            Date fechaTentativaDelPrestamo, String solicitante) {
        
        this.numeroPrestamo = numeroPrestamo;
        this.valorDelPrestamo = valorDelPrestamo;
        //this.fechasDePagoCuotas = fechasDePagoCuotas;
        this.fechaAutorizacionPrestamo = fechaAutorizacionPrestamo;
        this.fechaTentativaDelPrestamo = fechaTentativaDelPrestamo;
        this.solicitante = solicitante;
    }

    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public double getValorDelPrestamo() {
        return valorDelPrestamo;
    }

    public Date[] getFechasDePagoCuotas() {
        return fechasDePagoCuotas;
    }

    public Date getFechaAutorizacionPrestamo() {
        return fechaAutorizacionPrestamo;
    }

    public Date getFechaTentativaDelPrestamo() {
        return fechaTentativaDelPrestamo;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setNumeroPrestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public void setValorDelPrestamo(double valorDelPrestamo) {
        this.valorDelPrestamo = valorDelPrestamo;
    }

    ////
    public void setFechasDePagoCuotas(Date[] fechasDePagoCuotas) {
        this.fechasDePagoCuotas = fechasDePagoCuotas;
    }
    ///
    public void setFechaAutorizacionPrestamo(Date fechaAutorizacionPrestamo) {
        this.fechaAutorizacionPrestamo = fechaAutorizacionPrestamo;
    }

    public void setFechaTentativaDelPrestamo(Date fechaTentativaDelPrestamo) {
        this.fechaTentativaDelPrestamo = fechaTentativaDelPrestamo;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
                            
    
}
