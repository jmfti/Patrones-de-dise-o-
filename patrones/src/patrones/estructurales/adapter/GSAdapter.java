/*
 * Adaptador DE CLASE
 */

package patrones.estructurales.adapter;

import java.util.Date;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class GSAdapter extends WSProxy implements IGestionSistema{
    
    public GSAdapter(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public String crearIncidencia(int a, int b) {
        System.out.println("patrones.estructurales.adapter.GSAdapter.crearIncidencia() called");
        this.createIncident(a, b, 0, 0, 0, 0, 0, 0);
        return "";
    }

    @Override
    public void setFechaModificado(Date fecha) {
        System.out.println("patrones.estructurales.adapter.GSAdapter.setFechaModificado() called");
        this.setDateModified(0, 0, 0, 0, 0, 0, fecha);
    }

}
