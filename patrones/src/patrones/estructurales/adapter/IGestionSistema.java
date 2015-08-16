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
public interface IGestionSistema {
    
    public String crearIncidencia(int a, int b);
    
    public void setFechaModificado(Date fecha);
    
}
