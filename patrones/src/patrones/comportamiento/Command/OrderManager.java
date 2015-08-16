
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Command;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class OrderManager {
    
    private ConcurrentLinkedQueue<Command> cola;
    
    public OrderManager(){
        /*
        * TODO : constructor
        */
        cola = new ConcurrentLinkedQueue<Command>();
    }
    
    public void insertar(Command cmd){
        cola.add(cmd);
    }
    
    public void run(){
        while (!cola.isEmpty()){
            Command cmd = cola.poll();
            cmd.execute();
        }
    }

}
