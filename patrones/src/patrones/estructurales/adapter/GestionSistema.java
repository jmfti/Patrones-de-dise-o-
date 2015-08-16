/*
 * Este es un adaptador de objetos. En vez de heredar de la clase a adaptar
 * lo que hacemos es usar un objeto de la clase a adaptar
 */

package patrones.estructurales.adapter;

import java.util.Date;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class GestionSistema implements IGestionSistema{
    
    private WSProxy proxy;
    
    public GestionSistema(){
        proxy = new WSProxy();
    }

    @Override
    public String crearIncidencia(int a, int b) {
        System.out.println("patrones.estructurales.adapter.GestionSistema.crearIncidencia() called");
        proxy.createIncident(a, b, 0, 0, 0, 0, 0, 0);
        return "";
    }

    @Override
    public void setFechaModificado(Date fecha) {
        System.out.println("patrones.estructurales.adapter.GestionSistema.setFechaModificado() called");
        proxy.setDateModified(0, 0, 0, 0, 0, 0, fecha);
    }

}
