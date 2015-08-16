/*
 * El emisor de acciones podría ser, por ejemplo, un webservice que atienda
 * peticiones.
 * O simplemente peticiones HTTP de una web, o las acciones del usuario
 * frente a la interfaz...
 */

package patrones.comportamiento.Command;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class EmisorAcciones {
    
    public EmisorAcciones(){
        /*
        * TODO : constructor
        */
    }
    
    public void emitirAcciones(){
        AccionComposite acc = new AccionComposite(new Object());
        OrderManager om = new OrderManager();
        om.insertar(acc);
        om.run();
    }

}
