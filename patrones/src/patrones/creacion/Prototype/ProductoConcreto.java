/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.Prototype;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class ProductoConcreto implements Cloneable {
    
    protected String cadena;
    
    public ProductoConcreto(){
        /*
        * TODO : constructor
        */
    }
    
    @Override
    public ProductoConcreto clone(){
        ProductoConcreto p = new ProductoConcreto();
        p.cadena = this.cadena;
        return p;
    }

}
