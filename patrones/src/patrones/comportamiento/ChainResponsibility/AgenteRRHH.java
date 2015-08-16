/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.ChainResponsibility;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class AgenteRRHH implements ChainResponsibility{
    
    public AgenteRRHH(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public int accion(String cadena) {
        System.out.println("patrones.comportamiento.ChainResponsibility.AgenteRRHH.accion() called");
        return -1;
    }

}
