/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.ChainResponsibility;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class ResponsableAgente implements ChainResponsibility {
    
    public ResponsableAgente(){
        /*
        * TODO : constructor
        */
    }
    
    @Override
    public int accion(String cadena){
        switch(cadena){
            case "horarios":
                Supervisor sup = new Supervisor();
                return sup.accion(cadena);
            case "sueldo":
                AgenteRRHH ag = new AgenteRRHH();
                return ag.accion(cadena);        
            case "sancion":
                DirectorRRHH dir = new DirectorRRHH();
                return dir.accion(cadena);
            default:
                return 0;
        }
        
    }

}
