/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Command;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class AccionComposite implements Command{
    
    private Object ob;
    private accion1 ac1;
    private accion2 ac2;
    
    public AccionComposite(Object o){
        /*
        * TODO : constructor
        */
        ob = o;
    }

    @Override
    public void execute() {
        System.out.println("patrones.comportamiento.Command.AccionComposite.execute() called");
        ac1 = new accion1(ob);
        ac2 = new accion2(ob);
        ac1.execute();
        // aqui, nuestro objeto(el coche) quedaría pintado
        ac2.execute();
        // despues de esto, estaría montado el motor sobre la carrocería.
    }
    
    

}
