/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.estructurales.adapter;

import java.util.Date;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class main {
    
    public static void main(String[] args){
        /*
         * prueba del adaptador de clase
         */
        GSAdapter gs = new GSAdapter();
        gs.crearIncidencia(1, 2);
        gs.setFechaModificado(new Date());
        
        /*
         * prueba del adaptador de objetos
         */
        GestionSistema ges = new GestionSistema();
        ges.crearIncidencia(1, 2);
        ges.setFechaModificado(new Date());
    }

}
