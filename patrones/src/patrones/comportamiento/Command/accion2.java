/*
 * En la misma cadena de montajes, esta acción, podría ser la correspondiente
 * a insertar el motor y atornillarlo a la carrocería.
 */

package patrones.comportamiento.Command;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class accion2 implements Command{
    
    private Object ob;
    
    public accion2(Object o){
        ob = o;
        /*
        * TODO : constructor
        */
    }

    @Override
    public void execute() {
        System.out.println("patrones.comportamiento.Command.accion2.execute() called");
    }
    
    

}
