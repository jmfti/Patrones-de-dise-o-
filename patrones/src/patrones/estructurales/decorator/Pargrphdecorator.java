/*
 * El patron decorator sirve para AÑADIR funcionalidad y se suele usar 
 * con composite.
 */

package patrones.estructurales.decorator;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Pargrphdecorator extends Pargrph{
    
    public Pargrphdecorator(){
        super();
        sttag = sttag.replace(">", " style=\"font-weight: bold;\">");
        //System.out.println(sttag);
    }

    

}
