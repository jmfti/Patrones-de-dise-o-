/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.methodfactory;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class main {
    
    public static void main(String[] args){
        IFabricaInformes factoria = new fabricaInformeDiario();
        factoria.fabricaInforme();
        
        factoria = new FabricaInformeMensual();
        factoria.fabricaInforme();
    }

}
