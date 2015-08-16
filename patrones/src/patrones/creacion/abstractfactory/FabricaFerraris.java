/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacion.abstractfactory;

/**
 *
 * @author Administrador
 */
public class FabricaFerraris implements IFabricaCoches {

    @Override
    public void fabricaCoche() {
        System.out.println("fabricaCoche() called");
    }

    @Override
    public void fabricaPuerta() {
        System.out.println("fabricaPuerta() called");
    }

    @Override
    public void fabricaVentana() {
        System.out.println("fabricaVentana() called");
    }

    @Override
    public void fabricaMotor() {
        System.out.println("fabricaMotor() called");
    }

}
