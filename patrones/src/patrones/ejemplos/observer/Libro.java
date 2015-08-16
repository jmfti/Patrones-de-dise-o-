/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.ejemplos.observer;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Libro extends Observable{
    
    public Libro(){
        /*
        * TODO : constructor
        */
        super();
    }

    public void prestar(int id){
        this.notify(new Prestacion());
    }
    
    public void devolver(int id){
        this.notify(new Devolucion());
    }
}
