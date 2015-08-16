/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacion.singleton;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public interface DB {
    public ArrayList<ArrayList<Object>> query(String query);
    
    public void insertCmd(String insert);
}
