/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Observer;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class main {
    
    public static void main(String[] args){
        /*
        * TODO : constructor
        */
        Incidencia inc = new Incidencia();
        AgenteObservador agente = new AgenteObservador();
        inc.addObserver(agente);
        inc.setCadena("trukutruku");
        inc.setEstado(1);
    }

}
