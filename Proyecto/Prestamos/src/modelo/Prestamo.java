
package modelo;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Prestamo {
    
    public int numeroPrestamo;
    public int valorDelPrestamo;
    public Date [] fechasDePagoCuotas;
    public Date fechaAutorizacionPrestamo;
    public Date fechaTentativaDelPrestamo;
    public int  solicitante;

    public Prestamo() {
        
    }

    public Prestamo(int numeroPrestamo, int valorDelPrestamo,
            Date[] fechasDePagoCuotas, Date fechaAutorizacionPrestamo,
            Date fechaTentativaDelPrestamo, int solicitante) {
        
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

    public int getValorDelPrestamo() {
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

    public int getSolicitante() {
        return solicitante;
    }

    public void setNumeroPrestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public void setValorDelPrestamo(int valorDelPrestamo) {
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

    public void setSolicitante(int solicitante) {
        this.solicitante = solicitante;
    }
    
    
    
    
    
    
    
    
}
