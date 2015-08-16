/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.State;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class main {
    
    public static void main(String[] args){
        /*
        * TODO : constructor
        */
        FTomadorDatos tomador = new FTomadorDatos();
        tomador.mostrarFormulario();
        tomador.enviarFormulario();
        
        tomador.nextState();
        tomador.mostrarFormulario();
        tomador.enviarFormulario();
        
        tomador.nextState();
        tomador.mostrarFormulario();
        tomador.enviarFormulario();
    }

}
