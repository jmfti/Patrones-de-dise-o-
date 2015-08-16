/*
 * Si nuestro sistema es un sistema de gestión de una cadena de montaje, 
 * por ejemplo, de vehículos, podríamos considerar que esta acción
 * es la correspondiente a pintar la carrocería.
 */

package patrones.comportamiento.Command;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class accion1 implements Command{
    private Object ob;
    
    public accion1(Object o){
        ob = o;
        /*
        * TODO : constructor
        */
    }

    @Override
    public void execute() {
        System.out.println("patrones.comportamiento.Command.accion1.execute() called");
    }

}
