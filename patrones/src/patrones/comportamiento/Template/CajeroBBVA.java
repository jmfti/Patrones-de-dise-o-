/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Template;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class CajeroBBVA extends CajeroTemplate implements java.io.Serializable{
    
    public CajeroBBVA(){
        /*
        * TODO : constructor
        */
    }
    
    @Override
    public void conectarCentral(){
        System.out.println("conectarCentral de BBVA");
    }

}
