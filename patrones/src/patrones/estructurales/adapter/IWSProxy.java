/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.adapter;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public interface IWSProxy {
    
    public String createIncident(int a, int b, int c, int d, int e, int f, int g, int h);
    
    public void setDateModified(int a, int b, int c, int d, int e, int f, Date dt );
    
    
}
