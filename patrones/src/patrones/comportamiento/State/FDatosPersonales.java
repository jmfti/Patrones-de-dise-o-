/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.State;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class FDatosPersonales implements FormularioState{
    
    public FDatosPersonales(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public void mostrarFormulario() {
        System.out.println("patrones.comportamiento.State.FDatosPersonales.mostrarFormulario() called");
    }

    @Override
    public void enviarFormulario() {
        System.out.println("patrones.comportamiento.State.FDatosPersonales.enviarFormulario() called");
    }

    @Override
    public FormularioState nextState() {
        System.out.println("patrones.comportamiento.State.FDatosPersonales.nextState() called");
        return new FDatosLaborales();
    }

    @Override
    public FormularioState lastState() {
        System.out.println("patrones.comportamiento.State.FDatosPersonales.lastState() called");
        return new FDatosPersonales();
    }

}
