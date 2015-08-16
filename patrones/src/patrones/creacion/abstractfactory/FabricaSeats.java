/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.abstractfactory;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class FabricaSeats implements IFabricaCoches{
    
    public FabricaSeats(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public void fabricaCoche() {
        System.out.println("patrones.creacion.abstractfactory.FabricaSeats.fabricaCoche() called");
    }

    @Override
    public void fabricaPuerta() {
        System.out.println("patrones.creacion.abstractfactory.FabricaSeats.fabricaPuerta() called");
    }

    @Override
    public void fabricaVentana() {
        System.out.println("patrones.creacion.abstractfactory.FabricaSeats.fabricaVentana() called");
    }

    @Override
    public void fabricaMotor() {
        System.out.println("patrones.creacion.abstractfactory.FabricaSeats.fabricaMotor() called");
    }

}
