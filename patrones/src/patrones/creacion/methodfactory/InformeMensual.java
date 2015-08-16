/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.methodfactory;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class InformeMensual implements Informe {
    
    public InformeMensual(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public String getInforme() {
        System.out.println("patrones.creacion.methodfactory.InformeMensual.getInforme() called");
        return "";
    }

}
