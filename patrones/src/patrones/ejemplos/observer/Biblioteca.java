/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.ejemplos.observer;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Biblioteca implements IObserver{
    
    public Biblioteca(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public void update(Evento e) {
        System.out.println("patrones.ejemplos.observer.Biblioteca.update() called");
    }

}
