/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Mediator;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Cajero implements ICajero{
    
    public Cajero(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public void cobrarCantidad(int cantidad) {
        System.out.println("patrones.comportamiento.Mediator.Cajero.cobrarCantidad() called");
    }

}
