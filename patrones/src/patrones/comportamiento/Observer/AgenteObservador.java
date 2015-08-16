/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class AgenteObservador implements Observer{
    
    public AgenteObservador(){
        /*
        * TODO : constructor
        */
        //objetoobservable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("patrones.comportamiento.Observer.AgenteObservador.update() called");
        System.out.println(o.getClass().getName());
        System.out.println(arg.getClass().getName() + arg.toString());
        
    }

}
