/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_telefonica;

import java.util.Arrays;

/**
 *
 * @author USER
 */
public class Contacto {
    public String Nombre;
    public int Cantidad_Telefonos;
    public String[ ] Telefonos = new String[Cantidad_Telefonos];
    public String Correo;
    public String Direccion;
    public String Alias;

    public Contacto(String Nombre, int Cantidad_Telefonos, String Correo, String Direccion, String Alias, String[] Telefonos) {
        this.Nombre = Nombre;
        this.Cantidad_Telefonos = Cantidad_Telefonos;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Alias = Alias;
        this.Telefonos = Telefonos;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCantidad_Telefonos() {
        return Cantidad_Telefonos;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String[] getTelefonos() {
        return Telefonos;
    }

    public String getAlias() {
        return Alias;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCantidad_Telefonos(int Cantidad_Telefonos) {
        this.Cantidad_Telefonos = Cantidad_Telefonos;
    }

    public void setTelefonos(String[] Telefonos) {
        this.Telefonos = Telefonos;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    @Override
    public String toString() {
        return Nombre + "; " + Cantidad_Telefonos + "; " + Arrays.toString(Telefonos) + "; " + Correo + "; " + Direccion + "; " 
                + Alias;
    }
    
    
}
