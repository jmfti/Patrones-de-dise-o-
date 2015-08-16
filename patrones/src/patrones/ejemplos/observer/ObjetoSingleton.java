/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.ejemplos.observer;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class ObjetoSingleton {
    
    private static ObjetoSingleton instancia;
    
    private ObjetoSingleton(){
        /*
        * TODO : constructor
        */
    }
    
    public static ObjetoSingleton getInstance(){
        create();
        return instancia;
    }
    
    private static void create(){
        if (instancia == null)
            instancia = new ObjetoSingleton();
        
    } 

}
