/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.ejemplos.observer;

import java.util.ArrayList;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Observable {
    
    private ArrayList<IObserver> observadores;
    
    public Observable(){
        /*
        * TODO : constructor
        */
        observadores = new ArrayList<IObserver>();
    }
    
    public void add(IObserver o){
        observadores.add(o);
    }
    
    public void del(IObserver o){
        observadores.remove(o);
    }
    
    public void notify(Evento e){
        for(IObserver o : observadores){
            o.update(e);
        }
    }

}
