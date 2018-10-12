/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_telefonica;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
        Contacto PI;
        
        String[ ] Telefonos1 = new String[3];
        Telefonos1[0] = "321";
        Telefonos1[1] = "654";
        Telefonos1[2] = "987";
        PI= new Contacto("David",3,"Y","12A","PEPE", Telefonos1);
        System.out.println(PI.toString());
    }
}
