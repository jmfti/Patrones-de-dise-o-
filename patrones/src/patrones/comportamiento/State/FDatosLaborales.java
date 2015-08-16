/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.State;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class FDatosLaborales implements FormularioState{
    
    public FDatosLaborales(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public void mostrarFormulario() {
        System.out.println("patrones.comportamiento.State.FDatosLaborales.mostrarFormulario() called");
    }

    @Override
    public void enviarFormulario() {
        System.out.println("patrones.comportamiento.State.FDatosLaborales.enviarFormulario() called");
    }

    @Override
    public FormularioState nextState() {
        System.out.println("patrones.comportamiento.State.FDatosLaborales.nextState() called");
        return new FDatosSanitarios();
    }

    @Override
    public FormularioState lastState() {
        System.out.println("patrones.comportamiento.State.FDatosLaborales.lastState() called");
        return new FDatosPersonales();
    }

}
