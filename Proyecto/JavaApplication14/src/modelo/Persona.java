
package modelo;

/**
 *
 * @author USER
 */
public class Persona {
    
    public int numeroDeIdentidad;
    public int primerNombre;
    public int apellidos;
    public int telefonoDeCasa;
    public int telefonoMovil;

    
    public Persona() {
        
    }

    public Persona(int numeroDeIdentidad, int primerNombre, int apellidos
            , int telefonoDeCasa, int telefonoMovil) {
        
        this.numeroDeIdentidad = numeroDeIdentidad;
        this.primerNombre = primerNombre;
        this.apellidos = apellidos;
        this.telefonoDeCasa = telefonoDeCasa;
        this.telefonoMovil = telefonoMovil;
    }
    
    
    
    public int getNumeroDeIdentidad() {
        return numeroDeIdentidad;
    }

    public int getPrimerNombre() {
        return primerNombre;
    }

    public int getApellidos() {
        return apellidos;
    }

    public int getTelefonoDeCasa() {
        return telefonoDeCasa;
    }

    public int getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setNumeroDeIdentidad(int numeroDeIdentidad) {
        this.numeroDeIdentidad = numeroDeIdentidad;
    }

    public void setPrimerNombre(int primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellidos(int apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefonoDeCasa(int telefonoDeCasa) {
        this.telefonoDeCasa = telefonoDeCasa;
    }

    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }
    
    
    
    
    
}
