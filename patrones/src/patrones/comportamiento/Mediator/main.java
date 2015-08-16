/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Mediator;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class main {
    
    public static void main(String[] args){
        /*
        * TODO : constructor
        */
        Mediador med = new Mediador();
        med.comprarLibro(0);
        med.alquilarLibro(0);
    }

}
