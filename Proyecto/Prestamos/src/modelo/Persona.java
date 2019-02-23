
package modelo;

/**
 *
 * @author USER
 */
public class Persona {
    
    public String numeroDeIdentidad;
    public String primerNombre;
    public String primerApellido;
    public String segundoApellido;
    public String telefonoDeCasa;
    public String telefonoMovil;

    
    public Persona() {
        
    }

    public Persona(String numeroDeIdentidad, String primerNombre
            , String primerapellido, String segundoApellido
            , String telefonoDeCasa, String telefonoMovil) {
        
        this.numeroDeIdentidad = numeroDeIdentidad;
        this.primerNombre = primerNombre;
        this.primerApellido = primerapellido;
        this.segundoApellido = segundoApellido;
        this.telefonoDeCasa = telefonoDeCasa;
        this.telefonoMovil = telefonoMovil;
    }

    public String getNumeroDeIdentidad() {
        return numeroDeIdentidad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getTelefonoDeCasa() {
        return telefonoDeCasa;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setNumeroDeIdentidad(String numeroDeIdentidad) {
        this.numeroDeIdentidad = numeroDeIdentidad;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setTelefonoDeCasa(String telefonoDeCasa) {
        this.telefonoDeCasa = telefonoDeCasa;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @Override
    public String toString() {
        return "Persona{" + "numeroDeIdentidad=" + numeroDeIdentidad 
                + ", primerNombre=" + primerNombre + ", primerApellido=" 
                + primerApellido + ", segundoApellido=" + segundoApellido 
                + ", telefonoDeCasa=" + telefonoDeCasa + ", telefonoMovil=" 
                + telefonoMovil + '}';
    }
                
            
    
}
