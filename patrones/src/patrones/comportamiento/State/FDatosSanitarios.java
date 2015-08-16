/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.State;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class FDatosSanitarios implements FormularioState{
    
    public FDatosSanitarios(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public void mostrarFormulario() {
        System.out.println("patrones.comportamiento.State.FDatosSanitarios.mostrarFormulario() called");
    }

    @Override
    public void enviarFormulario() {
        System.out.println("patrones.comportamiento.State.FDatosSanitarios.enviarFormulario() called");
    }

    @Override
    public FormularioState nextState() {
        System.out.println("patrones.comportamiento.State.FDatosSanitarios.nextState() called");
        return new FDatosPersonales();
    }

    @Override
    public FormularioState lastState() {
        System.out.println("patrones.comportamiento.State.FDatosSanitarios.lastState() called");
        return new FDatosLaborales();
    }

}
