/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.methodfactory;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class fabricaInformeDiario implements IFabricaInformes {
    
    public fabricaInformeDiario(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public Informe fabricaInforme() {
        System.out.println("patrones.creacion.methodfactory.fabricaInformeDiario.fabricaInforme() called");
        Informe inf = new InformeDiario();
        inf.getInforme();
        return inf;
    }

}
