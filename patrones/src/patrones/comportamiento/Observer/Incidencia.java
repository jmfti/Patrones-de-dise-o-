/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Modelo push : notificamos a los observadores información sobre el cambio
 *      es el modelo que usamos aquí, ya que estamos notificando el cambio
 * modelo pull : simplemente notificamos que el estado ha cambiado sin enviar información
 *      aquí la responsabilidad de informarse sobre el cambio es del Observer
 *      
 */

package patrones.comportamiento.Observer;

import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author Xavier Mira Fernandez
 */
public class Incidencia extends Observable{
    
    private String cadena;
    private int estado;
    
    public Incidencia(){
        /*
        * TODO : constructor
        */
        cadena = "ola k ase";
        estado = 0;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.setChanged();
        this.cadena = cadena;
        this.notifyObservers(cadena);
    }

    public int getEstado() {
        
        return estado;
    }

    public void setEstado(int estado) {
        this.setChanged();
        this.estado = estado;
        this.notifyObservers(estado);
    }

}
