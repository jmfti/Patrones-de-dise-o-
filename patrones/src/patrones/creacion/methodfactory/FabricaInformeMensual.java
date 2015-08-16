/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.methodfactory;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class FabricaInformeMensual implements IFabricaInformes{
    
    public FabricaInformeMensual(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public Informe fabricaInforme() {
        System.out.println("patrones.creacion.methodfactory.FabricaInformeMensual.fabricaInforme() called");
        Informe inf = new InformeMensual();
        inf.getInforme();
        return inf;
    }

    

}
