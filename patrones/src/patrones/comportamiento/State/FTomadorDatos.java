/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.State;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class FTomadorDatos implements FormularioState{
    
    private FormularioState fs;
    
    public FTomadorDatos(){
        /*
        * TODO : constructor
        */
        fs = new FDatosPersonales();
    }

    @Override
    public void mostrarFormulario() {
        System.out.println("patrones.comportamiento.State.FTomadorDatos.mostrarFormulario() called");
        fs.mostrarFormulario();
    }

    @Override
    public void enviarFormulario() {
        System.out.println("patrones.comportamiento.State.FTomadorDatos.enviarFormulario() called");
        fs.enviarFormulario();
    }

    @Override
    public FormularioState nextState() {
        System.out.println("patrones.comportamiento.State.FTomadorDatos.nextState() called");
        fs = fs.nextState();
        return fs;
    }

    @Override
    public FormularioState lastState() {
        System.out.println("patrones.comportamiento.State.FTomadorDatos.lastState() called");
        fs = fs.lastState();
        return fs;
    }

}
