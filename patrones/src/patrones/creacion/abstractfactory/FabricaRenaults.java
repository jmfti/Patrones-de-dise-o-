/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacion.abstractfactory;

/**
 *
 * @author Administrador
 */
public class FabricaRenaults implements IFabricaCoches {

    @Override
    public void fabricaCoche() {
        System.out.println("patrones.creacion.abstractfactory.FabricaRenaults.fabricaCoche() called");
    }

    @Override
    public void fabricaPuerta() {
        System.out.println("patrones.creacion.abstractfactory.FabricaRenaults.fabricaPuerta() called");
    }

    @Override
    public void fabricaVentana() {
        System.out.println("patrones.creacion.abstractfactory.FabricaRenaults.fabricaVentana() called");
    }

    @Override
    public void fabricaMotor() {
        System.out.println("patrones.creacion.abstractfactory.FabricaRenaults.fabricaMotor() called");
    }
    
}
