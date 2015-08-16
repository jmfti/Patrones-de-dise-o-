/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.ChainResponsibility;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class AgenteEmisor {
    
    public AgenteEmisor(){
        /*
        * TODO : constructor
        */
    }
    
    public void emitirPeticion(){
        ResponsableAgente ra = new ResponsableAgente();
        ra.accion("horarios");
        ra.accion("sueldo");
        ra.accion("sancion");
    }

}
